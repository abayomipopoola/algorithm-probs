package LeetCode


object LeetCode1 extends App {

  println(twoSum(Array(3,2,4), 6).mkString(" , "))

  def twoSum(nums: Array[Int], target: Int): Array[Int] = {
    for (i <- 0 to nums.length-1)
      if (nums.indexOf(target - nums(i)) >= 0 && (i != nums.indexOf(target - nums(i))))
        return Array(i, nums.indexOf(target - nums(i))).sortWith(_<_)
    return Array(0,0)
  }
}