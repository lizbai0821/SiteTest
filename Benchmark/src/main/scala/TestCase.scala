/**
  * Created by lizbai on 16/10/16.
  */
import org.apache.spark.{SparkConf, SparkContext}
import org.apache.spark.sql.SparkSession

object TestCase {
  def main(args: Array[String]) {

    val spark: SparkSession = SparkSession.builder
      .appName("Benchmarking")
      .getOrCreate

    //Parquet location
    /*Below needs modifying*/
    val Path: String = "hdfs://dbg11:8020/user/root/test/voice_call_parquet_new"

    //read parquet file
    val parquetFileDF = spark.read.parquet(Path)

    //parquetFileDF.printSchema()

    //create temp view
    parquetFileDF.createOrReplaceTempView("VOICE_CALL")

    val option: Int = args(0).toInt

    /*Below needs modifying*/
    val result = option match {
      case 1 => spark.sql("")
      case 2 => spark.sql("")
      case 3 => spark.sql("")
      case 4 => spark.sql("")
      case 5 => spark.sql("")
      case 6 => spark.sql("")
      }
    /*Below needs modifying*/
    val resultPath: String = "hdfs://dbg11:8020/user/root/test/result_"
    result.write.parquet(resultPath)
    spark.sparkContext.stop()
  }
}
