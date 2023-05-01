package practice.functions

object MapFlatMapFilterFor extends App{

  val list = List(1,2,3)
  println(list)

  println(list.head)
  println(list.tail)

  println(list.map( _ + 1))

  println(list.filter(_ % 2 == 0))

  val numbers = List(1,2,3,4)
  val chars = List("a","b","c","d")
  val color = List("white","black")

  val comb = numbers.flatMap(n => chars.map( c => c + n))
  println(comb)

  val forComb = for {
    n <- numbers // if n % 2 == 0
    c <- chars
    co <- color
  } yield c + n + "_" + co

  println(forComb)
}
