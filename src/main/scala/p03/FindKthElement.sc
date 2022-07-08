import scala.annotation.tailrec

def findKThElementInList[A](k: Int, l: List[A]): A = {
  @tailrec
  def loop(list: List[A], n: Int): A = list match {
      case head :: tail =>
        if (n == k){
          head
        } else {
          loop(tail, n + 1)
        }
      case _ =>
        throw new NoSuchElementException("empty")
    }
  loop(l, 1)
}

assert(findKThElementInList(3, List(1,2,4,5,6,7,8)) == 4)

assert(findKThElementInList(7, List(1,2,4,5,6,7,8)) == 8)

assert(findKThElementInList(1, List(1,2,4,5,6,7,8)) == 1)
