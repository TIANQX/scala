package com.test.scala

import scala.collection.mutable.Set

/**
 * @Author tqx
 * @CreateDate 2021/4/26
 * @Description TODO
 */
object TestSet {
  def main(args: Array[String]): Unit = {
    val set1 = Set(1, 2, 3)

    set1.foreach(println)
    for (i <- set1) {
      println(i)
    }
    /*交并差
    * 特殊符号
    * */
    println("------并-------")
    val set2 = Set(3, 4, 5)
    val set3 = set2.union(set1) //并集
    set3.foreach(println)

    println("------差-------")
    val set4 = set2.diff(set1) //差集 &~
    set4.foreach(println)
    val set7: Set[Int] = set1 &~ set2

    println("------交-------")
    val set5 = set2.intersect(set1) //交集 &
    set5.foreach(println)
    val set6: Set[Int] = set2 & set1

    val max = set1.max
    val min = set1.min

    /*set转为list*/
    val list: List[Int] = set1.toList

    println("----------mkstring-----------")
    val string = set1.mkString
    println(string)


    val str = set1.mkString("&")
    println(str)

    println("------可变set-------")
    /*
    *可变set
    * */
    val set = Set(7, 8, 9)
    set.add(100)
    set.+=(22,44)
    set.+=(200)
   // set.+=:(300)  因为无序
    set.foreach(println)
  }

}
