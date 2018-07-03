package com.scala_traits
case class Cricket(overs: Int, balls:Int)
object Ipl {
   def main(args: Array[String]): Unit = {
     var a = Cricket(20,30)
     println("overs:"+a.overs)
     println("balls:"+a.balls)
     
   }
}