package com.test.scala

import java.util.Date

/**
 * @Author tqx
 * @CreateDate 2021/4/23
 * @Description TODO
 */
object Test3 {
  /*
  * 函数的定义
  * scala自动将函数的最后一行的值作为返回值，可以省略return
  * {}中只有一行语句也可以省略{}
  * 隐式推断：因为scala具有类型自动推断的特征，可以省略返回类型，如果有return关键字必须跟上返回类型
  * */
  def getMax(a: Int, b: Int): Int = {
    if (a > b) {
      a
    } else {
      b
    }
    33 //返回33
  }

  def getMax2(a: Int, b: Int): Int = {
    if (a > b)
      a
    else
      b
    33 //返回33
  }


  def main(args: Array[String]): Unit = {
    val result = getMax(2, 5)
    print(result)
  }

  /*
  *递归函数：关键点在于递归的定义和终止条件
  *
  *  */
  def fun2(num: Int): Int = {
    if (num == 1) {
      1
    } else {
      num * fun2(num - 1)
    }

  }

  def fun3(num: Int): Int = {
    if (num == 1)
      1
    else
      num * fun2(num - 1)

  }

  print(fun2(4))

  /*包含默认参数的函数*/
  def fun4(a: Int = 3, b: Int = 5): Int = {
    a + b
  }

  println(fun4())
  println(fun4(100))
  println(fun4(1, 100))
  println(fun4(b = 100))
  //println(fun4(,100))//报错


  /*可变参数个数的函数 scala int*
  * 对比java的可变参数int ...
  * */
  def sum(a: Int*) = {
    var sum = 0
    for (i <- a) { //遍历数组
      sum += i
    }
    sum
  }

  println(sum(1, 2, 3, 4, 5, 6, 7, 8, 9))

  /*
  *匿名函数需要使用val变量进行接收
  *(形参列表)=>{函数体}
  * */
  //  有参
  private val intToUnit: Int => Unit = (a: Int) => {
    println(a)
  }
  intToUnit(33)
  //  无参
  private val function: () => Unit = () => {
    println("lalal")
  }
  function()
  //  有返回值
  private val function1: (Int, Int) => Int = (a: Int, b: Int) => {
    a + b
  }
  println(function1(3, 8))


  /*
  *嵌套函数（函数内部还有函数）
  * */

  def fun3(a: Int, b: Int) = {
    def fun33(c: Int) = {
      (a + b) * c
    }

    fun33(3)
  }

  fun3(1, 3)

  /*
  *普通函数
  * */
  def log(date:Date,s:String)={
    println("date is "+date+",log is "+s)
  }
  val date=new Date();
  log(date,"log1")
  log(date,"log2")
  log(date,"log3")

//想要条用log，以上变化的是第二个参数，可以用偏应用函数处理
//  偏应用函数时一种表达式，你不需要提供函数所需的完整参数，只需提供部分
//  绑定第一个date参数
private val logWithDate: String => Unit = log(date, _: String)
  logWithDate("log11")
  logWithDate("log22")
  logWithDate("log33")
}
