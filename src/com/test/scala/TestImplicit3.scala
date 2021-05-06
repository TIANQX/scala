package com.test.scala

/**
 * @Author tqx
 * @CreateDate 2021/4/26
 * @Description 隐式类(写在)
 */
class Rabbit(xname: String) {
  val name = xname
}

class Cat(xname: String) {
  val name = xname
}


object TestImplicit3 {

  /*隐式类：赋予传进来的类的新的功能*/
  implicit class Anmial(rat: Rabbit) {
    def eat(): Unit = {
      println(rat.name + " eating")
    }
  }

  def main(args: Array[String]): Unit = {
    val rabbit: Rabbit = new Rabbit("xiaotuzi")
    rabbit.eat();

    val cat: Cat = new Cat("cat")
    //   cat.eat();
  }

}
