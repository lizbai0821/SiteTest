/**
  * Created by lizbai on 16/10/16.
  */
import org.apache.spark.{SparkConf, SparkContext}
import org.apache.spark.sql.SparkSession
import org.slf4j.LoggerFactory

object DataLoad {
  val logger = LoggerFactory.getLogger(getClass)

  def main(args: Array[String]) {

    val spark: SparkSession = SparkSession.builder
      .config("spark.sql.parquet.enable.bloom.filter","true")
      .config("spark.sql.parquet.bloom.filter.expected.entries","4225088,4225088,20000,155468,82200")
      .config("spark.sql.parquet.bloom.filter.col.name","MSISDN,IMSI,IMEI,SID,BEGIN_TIME")
      .appName("Load raw Parquet with BF")
      .getOrCreate

    val inputSource:String = args(0)
    val outputPath: String = args(1)

    //save as parquets
    saveDataAsParquet(spark, inputSource, outputPath)

    logger.info("the Loading phase is finished and a test query is issued next")
    //spark.sparkContext.stop()


    //read parquet file
    val parquetFileDF = spark.read.parquet(outputPath)

    parquetFileDF.printSchema()

    //create temp view
    parquetFileDF.createOrReplaceTempView("STREAMING_LIST")

    //execute sql
    val result1 = spark.sql("select MSISDN, IMSI,IMEI from STREAMING_LIST where last_msisdn = '0'")

    result1.show()
    logger.info("suicide")
    spark.sparkContext.stop()

  }

  def saveDataAsParquet(spark: SparkSession, input: String, output: String): Unit = {
    import spark.implicits._

    //read data
    val dataDF = spark.sparkContext
      .textFile(input)
      .map(_.split("\\|"))
      .map(attributes => new Streaming(attributes))
      .toDF()

    //save as parquet
    dataDF.write.partitionBy("last_msisdn").parquet(output)

    logger.info("SparkSession write task is completed")

  }


}
