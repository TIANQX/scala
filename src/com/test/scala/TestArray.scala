package com.test.scala

import scala.collection.mutable.ArrayBuffer

/**
 * @Author tqx
 * @CreateDate 2021/4/25
 * @Description TODO
 */
object TestArray {


  def main(args: Array[String]): Unit = {
    /*创建方式
    * 对象object和类class ?
    * */
    val array: Array[Int] = Array(1, 2, 3, 4)
    val array1 = new Array[Int](3)
    array1(0) = 1

    /*二维数组
    *
    * */

    val array2 = new Array[Array[Int]](3)
    array2(0) = Array(1, 1)
    array2(1) = Array(2, 2)
    array2(2) = Array(3, 3)
    array2.foreach(println(_)) //输出每一条记录，_占位符
    array2.foreach(println) //输出每一条记录

    /*遍历方式*/
    for (i <- array) {
      println(i)
    }

    /*增强foreach,操作的是array中的每一个元素*/
    array.foreach(i => {
      println("增强foreach")
      println(i + 100)
    })
    println("----------方法举例1---------------")
    /*array的方法举例*/
    val arr1 = Array(1, 2, 3)
    val arr2 = Array(1, 2, 3)
    val arr = Array.concat(arr1, arr2)
    arr.foreach(println)

    println("----------方法举例2---------------")

    val strings: Array[String] = Array.fill(3)("123")
    strings.foreach(println)

    println("----------方法举例3---------------")
    /*可变长度数组
    * 包scala.collection.mutable.ArrayBuffer
    * */666
    val arraybf = ArrayBuffer[String]("a", "b", "c")
    arraybf.append("d", "e", "f")
    arraybf.+=("1") //在数组尾部加
    arraybf.+=:("2") //在数组头部加
    arraybf.foreach(println)
  }
}
