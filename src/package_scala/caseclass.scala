package package_scala

object caseclass extends App {

  case class Person(name: String, age : Int)

  val guna = new Person("guna",28)

  println(guna.name)
}
