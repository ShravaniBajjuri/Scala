package com.sparksql

import org.apache.spark.SparkConf
//import org.apache.spark.SparkContext
import org.apache.spark.sql.SQLContext
import org.apache.spark.SparkContext
case class Student0066(id: String, stream: String, name: String, grade:Double)
object student {
  def main(args: Array[String]): Unit = {
    val conf = new SparkConf().setAppName("SparkSQL").setMaster("local[*]")
    val sc = new SparkContext(conf)
    val sqlContext = new SQLContext(sc)
    import sqlContext.implicits._
    val input = args(0)
   val output = args(1)
    val text = sc.textFile(input)
    //val text = sc.textFile("E:/HadoopGUSTO/datasets/student0066.csv")
    val res1 = text.map(_.split(",")).map(x=>Student0066(x(0),x(1),x(2),x(3).toDouble))
    val res2 = res1.toDF
    val res3 =res2.registerTempTable("Student0099")
    val s1 = sqlContext.sql("select * from Student0099 where grade<=72.0 OR name='Rithwik'")
    s1.show()
    s1.saveAsTable("Student0099",output)
    sc.stop()
    
  }
}