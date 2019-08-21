package HackerRank

object Problem6 extends App {

  staircase(5)

  // Complete the staircase function below.
  def staircase(n: Int) : Unit = {
    val space = " "
    val hash = "#"
    for (i <- 1 until n){
      printChar(space, n - i); printChar(hash, i)
      if (i < n - 1) println()
    }
  }

  def printChar(s: String, n: Int ): Unit = {
    for (i <- 0 until n)
      print(s)
  }
}
