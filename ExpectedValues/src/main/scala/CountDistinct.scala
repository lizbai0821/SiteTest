/**
  * Created by lizbai on 14/9/16.
  */

import org.apache.spark.sql.SparkSession

object CountDistinct {
  def main(args:Array[String])
  {
    val spark: SparkSession = SparkSession.builder
      //.master("local[*]")
      .appName("Expected Values Testing")
      .getOrCreate

    //Parquet location
    /* BELOW NEEDS MODIFYING*/
    val Path: String = "hdfs://dbg11:8020/user/root/test/voice_call_parquet"

    //read parquet file
    val parquetFileDF = spark.read.parquet(Path)

    //parquetFileDF.printSchema()

    //create temp view
    parquetFileDF.createOrReplaceTempView("VOICE_CALL")
    /* BELOW NEEDS MODIFYING*/
    val Num = spark.sql("SELECT COUNT(DISTINCT FORMATCALLERNO), COUNT(DISTINCT CALLERNO), COUNT(DISTINCT ORGCALLEDNO), COUNT(DISTINCT CALLEDNO), COUNT(DISTINCT FORMATCALLEDNO)  FROM VOICE_CALL")
    Num.show()
  }
}
