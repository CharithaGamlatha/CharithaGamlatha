object HelloWorld {
   def main(args: Array[String]) {
      val stringList = List("charitha" , "tharanga" , "vimansani" , "ron" , "ben")
      val i = 0;
      var x = 0;
      for ( i <- 1 to 5 ) {
          if(stringList(x).length >= 5 ) {
            println(stringList(x))
            x = x + 1
          }
          
      }
   }
}