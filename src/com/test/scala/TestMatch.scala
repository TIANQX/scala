package com.test.scala

/**
 * @Author tqx
 * @CreateDate 2021/4/26
 * @Description TODO
 */
object TestMatch {
  def main(args: Array[String]): Unit = {
    val tuple: (Int, String, Float, Char) = (11, "www", 2.0f, 'd')
    val productIterator: Iterator[Any] = tuple.productIterator
    while (productIterator.hasNext) {
      test_Match(productIterator.next())
    }

    def test_Match(x: Any) = {
      x match {
        /*匹配值*/
        case 11 => println(11)
        case 2.0f => println(2.0f)
        case d => println(d)
        /*匹配类型*/
        case x: String => println("string")
        /*no match*/
        case _ => println("no match")
      }
    }
  }
}
