class TailRecursionIsBack {
    def Length(n: List[Int], acc: Int = 0): Int = {
      if (n == Nil) acc
      else {
        Length(n.tail, acc = acc + 1)
      }
    }
}
