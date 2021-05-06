package com.test.scala

/**
 * @Author tqx
 * @CreateDate 2021/4/26
 * @Description 隐式转换函数
 */

class Bird(name: String) {
  def fly(): Unit = {
    println(name + " is flying")
  }
}

class Pig(xname: String) {
  val name = xname
}

object TestImplicit2 {
  /*隐式转换函数
  * 只需要关心类型
  * */
  implicit def pigToBird(pig: Pig): Bird = {
    new Bird(pig.name)
  }

  def main(args: Array[String]): Unit = {
    val mengji = new Bird("mengji")
    mengji.fly()
    val peiqi: Pig = new Pig("peiqi")
    peiqi.fly()
  }
}
