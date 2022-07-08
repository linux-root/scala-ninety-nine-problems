import scala.annotation.tailrec

def length[A](xs: List[A]): Int = xs.foldLeft(0)((length, _) => length + 1)


def lengthV2[A](xs: List[A]): Int = {
  @tailrec
  def loop(as: List[A], count: Int): Int = as match {
    case Nil => count
    case _ :: tail => loop(tail, count + 1)
  }
  loop(xs, 0)
}

assert(length(List(3,4,5,6,7)) == 5)

assert(lengthV2(List(3,4,5,6,7)) == 5)
