package io.wcygan.math

import org.scalatest.funsuite.AnyFunSuite

class MathUtilsTests extends AnyFunSuite:

  test("'double' should handle 0") {
    val result = Utilities.double(0)
    assert(result == 0)
  }

  test("'double' should handle 1") {
    val result = Utilities.double(1)
    assert(result == 2)
  }

  test("'double' should handle 2") {
    val result = Utilities.double(2)
    assert(result == 4)
  }


end MathUtilsTests