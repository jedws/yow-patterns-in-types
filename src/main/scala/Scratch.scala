
import scalaz._, Scalaz._, Tags.Conjunction

object Scratch extends App {

  val b: Boolean @@ Conjunction = List(true, false, true).map(Conjunction.apply).suml

  println(b)

}
