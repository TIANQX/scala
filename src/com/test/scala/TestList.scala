package com.test.scala

import scala.collection.mutable.ListBuffer

/**
 * @Author tqx
 * @CreateDate 2021/4/25
 * @Description TODO
 */
object TestList {
  def main(args: Array[String]): Unit = {
    /*创建list*/
    val list = List(1, 3, 2)
    /*遍历*/
    list.foreach(println)
    for (i <- list) {
      println(i)
    }
    println("--------方法举例--------------")
    /*过滤,过滤后类型不会发生改变
    * 1、取符合条件的元素ele=>Boolean
    * 2、
    * */
    val result: List[Int] = list.filter(i => {
      if (i > 2) {
        true
      } else {
        false
      }

    })
    result.foreach(println)
    val i1 = result.count(i => true)
    println(i1)

    /*map & flatMap
    * map映射：将一个东西变成另一个,一进一出
    * */
    val list2: List[String] = list.map(i => {
      i + "2"
    })
    list2.foreach(println)

    val list3 = List("hello beijing", "hello shanghai", "hello guangzhou")
    val stringses: List[Array[String]] = list3.map(line => {
      line.split(" ")
    })

    stringses.foreach(x => {
      x.foreach(println)
    })

    println("----------flatMap------------")
    list3.flatMap(i => {
      i.split(" ")
    }).foreach(println)

    println("-------------可变长list-->listBuffer-------------")
    val listBuffer = ListBuffer(1, 2, 3)
    listBuffer.append(4)
    listBuffer.+=:(0)
    listBuffer.+=(5)
    listBuffer.foreach(println)
  }
}
