import scala.io.StdIn.readLine

object HelloWorld {
  def main(args: Array[String]): Unit = {
   val mylist = List(1,2,3,4,5,6,7,8,9,10)
   var sum = 0
   var x = 0
   var a = 0
   for(a <- 1 to 10){
       if(mylist(x)%2 == 0){
           sum = sum + mylist(x)
       }
       x = x + 1
       
   }
   println( "sum of all the even numbers in the list = " + sum)
   
   
  }
}
