package LeetCode

object LeetCode4 extends App {

  println(findMedianSortedArrays(Array(1, 2), Array(3, 4)))

  def findMedianSortedArrays(nums1: Array[Int], nums2: Array[Int]): Double = {
    val sortedList = mergeSort(nums1.toList++nums2.toList)
    if (sortedList.length % 2 == 0)
      (sortedList(sortedList.length/2 - 1) + sortedList(sortedList.length/2)) / 2.0
    else
      sortedList(sortedList.length/2)
  }

  def mergeSort(xs: List[Int]): List[Int] = {
    val n = xs.length / 2
    if (n == 0) xs
    else {
      def merge(xs: List[Int], ys: List[Int]): List[Int] = (xs, ys)
        match {
          case(Nil, ys) => ys
          case(xs, Nil) => xs
          case(x :: xs1, y :: ys1) => //x - meaning the top element in the left list; xs1 - the rest of the left list
            if (x < y) x :: merge(xs1, ys)
            else y :: merge(xs, ys1)
        }
      val (left, right) = xs.splitAt(n)
      merge(mergeSort(left), mergeSort(right))
    }
  }

}
