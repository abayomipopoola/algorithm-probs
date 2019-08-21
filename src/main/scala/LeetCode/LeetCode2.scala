package LeetCode


object LeetCode2 extends App  {

  // 342 + 465 = 807
  println(linkListIntValue(addTwoNumbers(intToLinkList(BigInt(342)), intToLinkList(BigInt(465)))));

  def linkListIntValue(l: ListNode): BigInt= {
    var sb = new StringBuilder
    var currentNode = l
    while (currentNode.next != null){
      sb ++= currentNode.x.toString
      currentNode = currentNode.next
    }
    sb ++= currentNode.x.toString

    return BigInt(sb.reverse.toString())
  }

  def intToLinkList(i: BigInt): ListNode = {
    var lastInt = i.mod(BigInt(10)).toInt
    var remInt = i./(BigInt(10))
    // LinkList head
    var listNode = new ListNode(lastInt)
    var res = remInt.compare(BigInt(0))
    while (res != 0){
      lastInt = remInt.mod(BigInt(10)).toInt
      var tmpNode = listNode
      while (tmpNode.next != null) {
        tmpNode = tmpNode.next;
      }
      tmpNode.next = new ListNode(lastInt)
      remInt = remInt./(BigInt(10))
      res = remInt.compare(BigInt(0))
    }

    return listNode
  }

  def addTwoNumbers(l1: ListNode, l2: ListNode): ListNode = {
    val intVal1 = linkListIntValue(l1)
    val intVal2 = linkListIntValue(l2)
    val sum = intVal1.+(intVal2)

    return intToLinkList(sum)
  }
}

class ListNode(var _x: Int = 0) {
  var next: ListNode = null
  var x: Int = _x
}
