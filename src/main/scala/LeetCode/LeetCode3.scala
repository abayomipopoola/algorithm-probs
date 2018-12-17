package LeetCode

import scala.collection.mutable
import scala.util.control.Breaks._

object LeetCode3 extends App {

  println(lengthOfLongestSubstring("au"))

  def lengthOfLongestSubstring(s: String): Int = {
    if (s.equals(""))
      return 0

    var map: mutable.Map[Char, Int] = mutable.Map()
    var count = 1; var max = 1

    for (i <- 0 until s.length){
      val c = s.charAt(i)
      breakable {
        for (j <- i + 1 until s.length){
          val _c = s.charAt(j)
          if (c != _c && !map.contains(_c)){
            map.put(_c, 1)
            count += 1
            max = scala.math.max(max, count)
          } else {
            count = 1
            map = mutable.Map()
            break
          }
        }
      }
    }

    return max
  }
}