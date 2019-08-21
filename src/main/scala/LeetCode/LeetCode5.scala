package LeetCode


object LeetCode5 extends App {

  println(isPalindrome("baab"))

  // max length of s is 1000
  def longestPalindrome(s: String): String = {

    return ""
  }

  def palindromeCount(s: String): Int = {

    return 0
  }

  def isPalindrome(s: String): Boolean = {
    var i = 0; var j = s.length -1
    while (i < j) {
      if (s.charAt(i) != s.charAt(j))
        return false
      i += 1; j -= 1
    }
    return true
  }
}