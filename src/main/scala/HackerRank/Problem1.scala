package HackerRank

object Problem1 extends App {

  println(simpleArraySum(Array(1,2,3,4,10,11)))

  def simpleArraySum(ar: Array[Int]): Int = {
    var sum = 0
    for (i<- 0 until ar.length)
      sum += ar(i)
    sum
  }
}
