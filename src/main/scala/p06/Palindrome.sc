import scala.annotation.tailrec

/*
 * checking whether a list is a palindrome
 */

@tailrec
def isPalindrome[A](xs: List[A]): Boolean = xs match {
  case Nil | _ :: Nil => true
  case ys =>
    ys.head == ys.last && isPalindrome(ys.tail.init)
}

assert(isPalindrome(List(1, 2, 3, 2, 1)))