package HackerRank

object Problem2 extends App {

  println(compareTriplets(Array(17, 28, 30), Array(99, 16, 8)).toList)

  // Complete the compareTriplets function below.
  def compareTriplets(a: Array[Int], b: Array[Int]): Array[Int] = {
    var _a = 0
    var _b = 0
    for (i <- 0 to 2){
      if (a(i) > b(i)) _a += 1
      else if (a(i) < b(i)) _b += 1
    }
    Array(_a, _b)
  }
}
