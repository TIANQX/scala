package com.test.scala

import scala.collection.mutable
import scala.collection.mutable.Map

/**
 * @Author tqx
 * @CreateDate 2021/4/26
 * @Description TODO
 */
object TestMap {
  def main(args: Array[String]): Unit = {
    val map: Map[String, Any] = Map("name" -> "tina",
      "age" -> 23,
      "gender" -> "woman"
    )
    map.foreach(println)
    val unit = map.foreach(x => {
      println(x._1 + ":" + x._2)
    })
    //scala推荐使用option对象来作为可能返回空的行数的值的返回类型
    val option: Option[Any] = map.get("name")
    println(option) //Some(tina)
    val option1: Option[Any] = map.get("name1")
    println(option1) //None
    val option2: Option[Any] = map.get("name1")
    println(option2.getOrElse("nihao")) //nihao

    /*一步到位*/
    val option3: Any = map.getOrElse("name1", 222)
    println(option3)
    /*遍历方法
    *
    * */
    println("keys迭代遍历")
    val keys: Iterable[String] = map.keys
    keys.foreach(println)
    println("keySet迭代遍历")


    val keySet: collection.Set[String] = map.keySet
    //    keySet.foreach(println)
    for (x <- keySet) {
      println(map.get(x))
      println(map.get(x).get) //从some中获取value
    }
    /*获取value*/
    val values: Iterable[Any] = map.values
    values.foreach(println)

    println("--------map合并--------")
    /*map合并*/
    val map1: Map[String, Any] = Map("name" -> "susan",
      "age" -> 43,
      "gender" -> "woman"
    )
    val map2: Map[String, Any] = Map("name" -> "jenny",
      "age" -> 33,
      "gender" -> "woman"
    )


    val map3 = map1.++(map2)
    map3.foreach(println)

    println("--------过滤--------")
    val map4: Map[String, Any] = Map("name" -> "jenny",
      "age" -> 33,
      "gender" -> "woman"
    )
    val mapResult = map4.filter(x => {
      if (x._2 == 33) {
        true
      } else {
        false
      }
    })
    mapResult.foreach(println)

    val countResult = map4.filter(x => {
      if (x._2 == 33) {
        true
      } else {
        false
      }
    })
    println(countResult)

    println("--------contains-------")
    val bool1: Boolean = map4.contains("name")
    if (map4.contains("name")) {
      println(map4.get("name"))
    }

    println("--------exists-------")
    val bool2 = map4.exists(x => {
      if (x._2 == 33) {
        true
      } else {
        false
      }
    })
    println(bool2)
    /*可变map*/
    println("-----可变map-------")
    val map5: mutable.Map[String, Any] = Map("name1" -> "tom", "name2" -> "jack")
    map5 += ("name3" -> "jerry")
    map5.foreach(println)
  }


}
