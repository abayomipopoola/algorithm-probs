package HackerRank

object Problem4 extends App {

  def sieve(s: Stream[Int]): Stream[Int] =
    s.head #:: sieve(s.tail filter(_ % s.head != 0))

  val primes = sieve(Stream.from(2))

  println(primes.take(50).toList)

//  println(diagonalDifference(Array(Array(1,2,3), Array(4,5,6), Array(9,8,9))))
  // Complete the diagonalDifference function below.
//  def diagonalDifference(arr: Array[Array[Int]]): Int = {
//    var d1 = 0
//    var d2 = 0
//    for (i <- 0 until arr.length) {
//      d1 += arr(i)(i)
//      d2 += arr(arr.length-1 - i)(i)
//    }
//
//    Math.abs(d1 - d2)
//  }
}
