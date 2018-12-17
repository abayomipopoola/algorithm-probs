package HackerRank

object HackerRank1 extends App {

  println(rearrangeWord("afedcbdcba"))

  def rearrangeWord(word: String): String = {
    for (i <- 0 until word.length) {
      if (word.length == 1)
        return "no answer"

      var firstCondition = 0;  // The max lexicographical according to condition 1
      var secondCondition = 0; // The max lexicographical according to condition 2
      // Find the largest index char that is weakly increasing such as g in hefg
      for (j <- 1 until word.length) {
        if (word.charAt(j) > word.charAt(j-1))
          firstCondition = Math.max(j, firstCondition)
      }
      // If our only increasing is at point 0 then we are in the last permutation of our string
      if (firstCondition == 0)
        return "no answer"
      // Determine the right most char greater than the pivot in index and in lexo
      for (j <- firstCondition until word.length){
        if (word.charAt(j) > word.charAt(firstCondition-1))
          secondCondition = j
      }

      val buildString = new StringBuilder(word)
      var temp = buildString.charAt(firstCondition-1)

      buildString.setCharAt(firstCondition-1, buildString.charAt(secondCondition))
      buildString.setCharAt(secondCondition, temp)

      var leftEnd = firstCondition
      var rightEnd = buildString.length - 1

      while (leftEnd < rightEnd) {
        // left to right swap
        temp = buildString.charAt(leftEnd)
        buildString.setCharAt(leftEnd, buildString.charAt(rightEnd))
        buildString.setCharAt(rightEnd, temp)
        leftEnd += 1
        rightEnd -= 1
      }
      return buildString.toString()
    }
    "no answer"
  }
}
