package com.scala_traits

trait Netflix {
  def shows()
  def movies()
  
}
class Movies extends  Netflix
{
  def shows()
  {
    println("Stranger things")
    println("Cooking on high")
    println("West World")
  }
  def movies()
  {
    println("Banking on Bitcoin")
   println("incredibles")
  }
}
object Demo
{
  def main(args: Array[String]): Unit = 
  {
   var i1 = new Movies()
  i1.shows
  i1.movies
}
}

