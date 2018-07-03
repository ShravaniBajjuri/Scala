package com.scala_traits
import scala.io.Source
object wordcount {
  def main(args: Array[String]): Unit = {
    val w1= Source.fromFile("E:/Hadoop-GUSTO/datasets/wordcount.txt").mkString;
    val count = w1.split(" ").groupBy(x=>x).mapValues(x=>x.length)
    println(count)
  }
}