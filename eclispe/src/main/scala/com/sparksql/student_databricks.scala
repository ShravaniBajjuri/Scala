package com.sparksql

import org.apache.spark.SparkConf
import org.apache.spark.SparkContext
import org.apache.spark.sql.SQLContext
import org.apache.spark.rdd
import org.apache.spark.rdd.RDD.rddToPairRDDFunctions
import com.databricks.spark
object student_databricks {
  def main(args: Array[String]): Unit = {
    val conf = new SparkConf().setAppName("SparkSQL-databricks").setMaster("local[*]")
    val sc = new SparkContext(conf)
    import sqlContext.implicits
    val sqlContext = new SQLContext(sc)
    val input= args(0)
    val output = args(1)
    val text = sqlContext.read.format("com.databricks.spark.csv").option("header","true").option("inferSchema","true").load(input)
   // val text = sqlContext.read.load('input',format='com.databricks.spark.csv', header='true', inferSchema='true')
    val s1 = text.printSchema()
    val s2= text.registerTempTable("students_det")
    //val s3 = sqlContext.sql("select * from studentscsv1")//("select * from studentscsv")
    val s4 = sqlContext.sql("select NAME, ROLL_ID from students_det where PERCENTAGE>=73.5")
    s4.show()
    s4.saveAsTable("students_det",output)
    sc.stop()
        
  }
}