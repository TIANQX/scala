package com.test.scala


class Person {
  val name = "zd";
  val age = 23;
  private val money = 23;
  println(Person.myHeight)
}

class Person2(myname: String, myage: String) {
  val name = myname;
  val age = myage;
}

class Person3(myname: String, myage: String) {
  val name = myname;
  val age = myage;
  var money = 1000;

  //  能否写构造器
  def this(myname: String, myage: String, mymoney: Int) {
    this(myname, myage)
    money = mymoney
  }
}

class Person4(myname: String, myage: String) {
  val name = myname;
  val age = myage;
  var money = 1000;
  println(1111)

  class Person5 {
    val name = "zd";
    val age = 23;
    /*
    * 代码块
    * 在scala中，没有类似于java中static关键字的功能，
    * 不能通过关键字修饰静态属性、静态方法、静态代码块
    * 通过object来实现响应功能
    * 可以理解为object中所有的东西都是静态的
    * */

  }

  class Person6 {
    val name = "zd";
    val age = 23;

    //    class中的main方法就是一个普通的方法，而不是函数的主入口
    /*    def main(args: Array[String]): Unit = {

        }*/

  }

  //  能否写构造器
  def this(myname: String, myage: String, mymoney: Int) {
    this(myname, myage)
    money = mymoney
  }

  println(2222)

  /*对象在被实例化的过程中，除了方法内部的代码会全部执行*/
  def test(): Unit = {
    println("能打印出来吗")
  }

  println(3333)

}

/**
 * @Author tqx
 * @CreateDate 2021/4/23
 * @Description
 */
object Person {
  /*object对象和class类的名称相同，则这个对象就是这个类的伴生对象，可以互相访问私有变量*/
  private var myHeight = 160

  /*静态方法：表示不需要实例化就能使用，main方法作为程序的主入口
  *静态方法属于类
  * */
  def main(args: Array[String]): Unit = {
    /*定义常量变量*/
    var a = 1;
    val b = 333;
    println(a)

    /*
    * 快捷键
    * ctrl+alt+v 变量名自动补全
    * alt+enter补全变量的类型
    * */
    var person: Person = new Person
    /*如何获取class类中的私有属性,伴生类、伴生对象*/
    println(person.name + person.age + person.money);

    val person1: Person2 = new Person2("zs", "23")
    println(person1.name, person1.age)

    val person3: Person3 = new Person3("zs", "23", 100)
    println(person3.money)

    val person4: Person4 = new Person4("zs", "23", 100)
    println(person4.money)

  }
}
