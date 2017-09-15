package io.terrafino.kata.diamond

class DiamondBuilder() {

  val A = 'A'

  def build(letter: Char): String = {
    val diff = letter - A
    val lines = for {i <- 0 to diff
                     buf1 = " " * (diff - i)
                     buf2 = " " * (i*2-1)
                     char = (A + i).toChar
    } yield if (i == 0) s"$buf1$char$buf1" else s"$buf1$char$buf2$char$buf1"
    (lines ++ lines.take(diff).reverse).mkString("", "\n", "\n")
  }

}
