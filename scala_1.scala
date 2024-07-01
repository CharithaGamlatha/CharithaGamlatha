import scala.io.StdIn.readLine

object HelloWorld {

    def revers(word: String, lenth: Int){
        
        var lenth2: Int = lenth
        lenth2 = lenth2 - 1
        print(s"${word(lenth2)}")
        if( lenth2 > 0 ){
            revers(word , lenth2)
        }
    }
   def main(args: Array[String]): Unit = {
    println("Enter String")
    val word: String= "abcd"
    val lenth: Int = word.length
    println(s"word is $word!")
    println("lenth is " +lenth)
    revers(word , lenth)
   }

}
