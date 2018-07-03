package scala_pro1

trait netflix {
  def shows
  {
    println("Stranger things")
    println("Cooking on high")
    println("West World")
  }
  def movies
  {
    println("Banking on Bitcoin")
   println("incredibles")
  }
}

/*abstract class NetflixIndia extends netflix
{
  def show()
  {
    println("Stranger things")
    /*println("Cooking on high")
    println("West World")
    println("Riverdale")
    println("Chef's table")*/
  }
  def movies()
  {
    println("Banking on Bitcoin")
   /* println("incredibles")
    println("Brain on fire")*/
  }
}*/
class Movies extends  netflix
{
  println("Hello WOrld.............")
}
