import scala.io.StdIn.readLine

object HelloWorld {

    def revers(word: String, lenth: Int){
        
        var lenth2: Int = lenth
        for( i <- 1 to 4){
            lenth2 = lenth2 - 1
            print(s"${word(lenth2)}")
            
        }

    }
    
    
   def main(args: Array[String]): Unit = {
    println("Enter String")
    val word: String= "abcd"
    val lenth: Int = word.length
    println(s"word is $word!")
    println("lenth is " +lenth)
    
    println(s"The first character is: ${word(0)}")
    
    revers(word , lenth)
    
       
   }

}