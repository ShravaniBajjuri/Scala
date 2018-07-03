package com.scala_traits

trait Algebra {
  def even()
}
abstract class Archimedes extends Algebra
{
  def statistics()
  {
    println("Pie chart")
    println("graphs")
  }
}
class Mathematics extends Algebra
{
   def odd()
   {
     println("numbers are odd")
   }
   def even()
   {
    for(i<- 1 to 10)
    {
      if(i%2==0)
      {
        printf("even")
        println(i)
      }
      
    }
  }
   
}
object Result1
{
  def main(args: Array[String]): Unit = {
   val i1 = new Mathematics()
   i1.odd()
   i1.even()
  }
}