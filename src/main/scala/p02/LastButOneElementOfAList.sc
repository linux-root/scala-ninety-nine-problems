import scala.annotation.tailrec

@tailrec
def penultimate[A](list: List[A]): A  = list match {
  case Nil => throw new NoSuchElementException("empty list")
  case lastButOne :: _ :: Nil => lastButOne
  case _ :: tail => penultimate(tail)
}

val l = List(3,4,5,6,7,8)

l.init // without last element :D

assert(penultimate(l) == 7)