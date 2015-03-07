package code

import scalaz._, Scalaz._
import argonaut._, Argonaut._, Shapeless._

object Main extends App {

  sealed trait Shape
  case class Circle(radius: Int) extends Shape
  case class Square(side: Int) extends Shape

  implicitly[EncodeJson[Shape]]
  implicitly[DecodeJson[Shape]]

  // Must annotate as the type you want to serialize as
  // otherwise you'll get the encoding for a Circle or
  // Square only.
  val circle: Shape = Circle(100)
  val square: Shape = Square(50)

  println(s"The circle in JSON: ${circle.asJson}")
  println(s"The JSON encoded as a Shape: ${(circle.asJson).as[Shape]}")

  def area(shape: Shape): Double = shape match {
    case Circle(r) => math.Pi * (r * r)
    case Square(s) => 1d * s * s
  }

  println(s"Square area: ${(square.asJson).as[Shape].map(area)}")
  println(s"Circle area: ${(circle.asJson).as[Shape].map(area)}")

  // API for DecodeResult:
  // https://github.com/argonaut-io/argonaut/blob/master/src/main/scala/argonaut/DecodeResult.scala
  val sumOfAreas: DecodeResult[Double] = for {
    s <- square.asJson.as[Shape].map(area)
    c <- circle.asJson.as[Shape].map(area)
  } yield c + s

}