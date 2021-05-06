package com.test.scala

/**
 * @Author tqx
 * @CreateDate 2021/4/23
 * @Description 高阶函数
 */
object Test4 {

  def main(args: Array[String]): Unit = {
    /*
    * 高阶函数
    * 函数的参数是函数
    * */
    def fun1(a: Int, f: (Int, Int) => Int): Int = {
      var result = f(4, 4)
      a * result
    }

    def sum(a: Int, b: Int) = {
      a + b
    }

    println(fun1(5, sum))
    //    匿名函数写法
    println(fun1(5, (a: Int, b: Int) => {
      a - b
    }))

    /*
     * 函数的返回是函数
     * */

    def fun3(a: Int, b: Int): (String, String) => String = {
      def fun4(c: String, d: String): String = {
        a + b + c + d
      }

      fun4
    }

    val function: (String, String) => String = fun3(2, 3)
    println(function("3", "4"))
    println(fun3(2, 3)("3", "4")) //一行写完
    /*
     * 函数的参数和返回都是函数
     * */

    def fun5(f: (Int, Int) => Int): (Int, Int) => Int = {
      f
    }

    println(fun5((a: Int, b: Int) => {
      a + b
    })(1, 2))
    println(fun5(_ + _)(1, 2))

  }

  /*柯里化函数*/

}
