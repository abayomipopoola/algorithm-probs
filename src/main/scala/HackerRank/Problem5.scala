package HackerRank

import java.text.DecimalFormat

object Problem5 extends App {

  plusMinus(Array(-4, 3, -9, 0, 4, 1))

  // Complete the plusMinus function below.
  def plusMinus(arr: Array[Int]) : Unit = {
    var pos = 0.0
    var neg = 0.0
    var zer = 0.0
    val l = arr.length
    for (i <- 0 until l){
      if (arr(i) > 0) pos += 1
      else if (arr(i) < 0) neg += 1
      else zer += 1
    }
    val df = new DecimalFormat("#0.000000")
    println(df.format(roundAt(6)(pos / l)))
    println(df.format(roundAt(6)(neg / l)))
    println(df.format(roundAt(6)(zer / l)))
  }

  def roundAt(p : Int)(n : Double) : Double = {
    val s = math.pow(10, p)
    math.round(n * s) / s
  }
}
