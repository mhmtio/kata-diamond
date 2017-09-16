package io.terrafino.kata.diamond

class DiamondBuilder() {

  val A = 'A'

  def build(letter: Char): String = {
    val diff = letter - A
    val topLeftHalf = for {i <- 0 to diff
                     buf1 = " " * (diff - i)
                     buf2 = " " * i
    } yield s"$buf1${(A+i).toChar}$buf2"
    val topHalf = topLeftHalf.map(l => l + l.reverse.tail)
    (topHalf ++ topHalf.init.reverse).mkString("", "\n", "\n")
  }
}
