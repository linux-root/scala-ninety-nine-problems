import scala.annotation.tailrec

/***
 * Find the last element of a list
 */
@tailrec
def last[A](list: List[A]): A = list match {
  case Nil => throw new NoSuchElementException("last element of empty list")
  case last :: Nil => last
  case _ :: tail => last(tail)
}

assert(last(List(123,12,2,8,445435,99)) == 99)