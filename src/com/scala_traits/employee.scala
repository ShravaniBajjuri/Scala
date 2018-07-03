package com.scala_traits
import scala.io.Source
case  class Employee(emp_id:Int,name: String, mob: Double, dob:String, desig:String, sal:Double, address:String, ot: String, ot_hrs:Int) 
object employee {
  def main(args: Array[String]): Unit = {
    val s1 = Source.fromFile("E:/Hadoop-GUSTO/Material/UseCases/emp12.csv").mkString;
    val s2 = s1.split(",").filter(_.charAt(1)=="Sheethal")
    println(s2)
  }
}