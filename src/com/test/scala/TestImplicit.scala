package com.test.scala

/**
 * @Author tqx
 * @CreateDate 2021/4/26
 * @Description 隐式参数、隐式值
 *             隐式转换是在scala编译器进行类型匹配时，如果找不到合适的类型，
 *             那么隐式转换会让编译器在作用范围内自动推导出合适的类型
 */
object TestImplicit {
  implicit var address = "shaihai"
  implicit var age = 11
  /*
  * 隐式参数和隐式值
  * scala会自动在作用域内寻找隐式值传参（类型一致）
  * */
  def test(implicit x:String)={
    println(x)
  }
  def test1( x:String)={
    println(x)
  }

  /*
  *多参数情况下，隐式参数写在最后（柯里化）
  * */
  def test2( x:String)(implicit age:Int)={
    println(x,age)
  }
  def main(args: Array[String]): Unit = {
    test  //shaihai
    test1("lisi")
    test2("sdf")
  }
}
