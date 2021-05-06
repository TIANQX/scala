package com.test.scala

import scala.io.StdIn

/**
 * @Author tqx
 * @CreateDate 2021/4/23
 * @Description TODO
 */
object Test2 {
  def main(args: Array[String]): Unit = {
    //    println("请输入年龄")
    //    val age = StdIn.readInt()
    //    if (age == 23) {
    //
    //    }

    //    for (i <- 1 to 10) {
    //      if (i > 2)
    //      //        println(i)
    //    }

    //    scale中没有自增、自减运算符
    //    for (i <- 1 to 9) {
    //      for (j <- 1 to i) {
    //        print(i + "*" + j + "=" + i * j+" ")
    //        if(i==j){
    //          println()
    //        }
    //      }
    //    }

    /**/
    for (i <- 1 to 9; j <- 1 to i) {
      print(i + "*" + j + "=" + i * j + " ")
      if (i == j) {
        println()
      }
    }



  }

}
