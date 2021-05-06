package com.test.scala

/**
 * @Author tqx
 * @CreateDate 2021/4/26
 * @Description TODO
 */
object TestTuple {
  def main(args: Array[String]): Unit = {
    /*创建*/
    val tuple2: (Int, Int) = Tuple2(1, 2)
    val tuple3: (Int, Int, Int) = Tuple3(1, 2, 3)
    val tuple4: (Int, String, Double) = Tuple3(1, "werw", 2.3)
    //    创建二元组的特殊方式
    val tuple5: (String, String) = "name" -> "tina"
    val tuple6: (String, Int) = Tuple2("age", 3)
    val list: List[Any] = List(1, "we", 2.0f)

    println("------遍历-------")
    /*遍历
    * 获取迭代器（因为tuple元组本质上不是集合，遍历时可以当做集合使用迭代器）
    *
    * */

    val iterator: Iterator[Any] = tuple6.productIterator
    while (iterator.hasNext) {
      println(iterator.next())
    }
    /*
    * 元组的方法（二元组）
    * */
    println("------二元组swap-------")
    val swap: (Int, String) = tuple6.swap
    val productIterator: Iterator[Any] = swap.productIterator
    while (productIterator.hasNext) {
      println(productIterator.next())
    }
    println("------toString-------")
    println(tuple6.toString())

  }
}
