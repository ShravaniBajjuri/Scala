package com.scala_traits

trait Calculator {//trait 1
  def add()
  def mul()
}
trait Calculator2//trait 2
{
  def sub()
  def div()
}
class Operations extends Calculator with Calculator2
{//implementation of all the methods used in traits
  def add()
  {
    var i = 10
    while(i<=10)
    {
    i=i+1;
    println("New result is",i)
    }
  }
  def mul()
  {
       var y=10
      for(i<-1 to 10)
      {
        println(i*y)
      }
    
  }
  def sub()
  {
    var x=19
    var y =25
    println("subtraction is",y-x)
  }
  def div()
  {
    var u =15;
    if(u<=20)
    {
      u=u/2;
      println("Result is", u)
    }
    else
    {
      println("error")
    }
  }
}
object Result
{
def main(args: Array[String]): Unit = {
  
  var plan = new Operations()
  plan.add()
  plan.mul()
  plan.sub()
  plan.div()
}
}
