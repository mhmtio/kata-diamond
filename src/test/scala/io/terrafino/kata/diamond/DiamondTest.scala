package io.terrafino.kata.diamond

import org.scalatest.{FunSuite, Matchers}

class DiamondTest extends FunSuite with Matchers {

  private val DiamondA = "A\n"
  private val DiamondB = " A \n"+
                         "B B\n"+
                         " A \n"
  private val DiamondC = "  A  \n"+
                         " B B \n"+
                         "C   C\n"+
                         " B B \n"+
                         "  A  \n"
  private val DiamondD = "   A   \n"+
                         "  B B  \n"+
                         " C   C \n"+
                         "D     D\n"+
                         " C   C \n"+
                         "  B B  \n"+
                         "   A   \n"

  test("Constructs a diamond for A") {
    val d = new DiamondBuilder()
    d.build('A') shouldBe DiamondA
  }

  test("Constructs a diamond for B") {
    val d = new DiamondBuilder()
    d.build('B') shouldBe DiamondB
  }

  test("Constructs a diamond for C") {
    val d = new DiamondBuilder()
    d.build('C') shouldBe DiamondC
  }

  test("Constructs a diamond for D") {
    val d = new DiamondBuilder()
    d.build('D') shouldBe DiamondD
  }

}

