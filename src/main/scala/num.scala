object num {
  def main (args: Array[String]): Unit = {
    val vatsal = "Vatsal"
    println(vatsal)

    def add(x: Int, y: Int) = x + y

    val result = add(10, 100)
    println(result)
    Mohit.main(args)
  }
    object Mohit {
      def main (args: Array[String]): Unit = {
        val mohit = "Mohit"
        println(mohit)
        def subtract(c: Double) = c - 1
        val result = subtract(10)
        println(result)
        print("Enter a number: ")
        val input = scala.io.StdIn.readDouble()
        println(s"You Entered $input")

        def getAaplInfo(): (String, BigDecimal, Long) = {
          // get the stock symbol, price, and volume
          ("AAPL", BigDecimal(123.45), 101202303L)
        }
        val apple = getAaplInfo()
        val price = apple._2
        println(price)
      }
    }
}