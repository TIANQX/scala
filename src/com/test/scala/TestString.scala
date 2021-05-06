package com.test.scala

/**
 * @Author tqx
 * @CreateDate 2021/4/25
 * @Description 字符串
 *
 */
object TestString {
  def main(args: Array[String]): Unit = {
    val str = "abcd"
    val str2 = "ABCD"

    str.indexOf("a")
    str.indexOf(97)

    val strBuilder = new StringBuilder
    strBuilder.append("efg")

  }
}
