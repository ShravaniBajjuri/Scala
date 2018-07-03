package com.scala_traits

trait Hadoop {
  def Hdfs()
  {
    println(" Hdfs Used for storage")
  }
  def Mapreduce()
  {
    println(" MR Used for processing")
  }
}
trait Spark {
def sparkCore 
{
  println(" Spark Core: RDD creation ") 
  }
def sparkSql {
  println(" Spark-SQL :Dataframes creation") 
  }
}
trait Hive {
def structured
def tables
{
  println(" Hive has external and mananged tables")
}
}

class Bigdata extends Hadoop with Spark with Hive {
// implementation code here ...
 def structured()
{
  println(" Hive used for structured data, doesnot support real time process")
}
}
object Datascience 
{//
def main(args: Array[String]): Unit = {
  val hr =  new Bigdata()
  hr.structured
  hr.tables
  hr.sparkSql
  hr.sparkCore
}
}