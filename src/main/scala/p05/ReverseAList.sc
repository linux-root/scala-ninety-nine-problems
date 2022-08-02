

def reverse[A](xs: List[A]): List[A] = xs.foldLeft(List.empty[A])((ys, e) => e :: ys)


assert(reverse(List(1,2,3,4)) == List(4,3,2,1))