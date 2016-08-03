package roman

import org.scalatest.FunSuite

class RomanSuite extends FunSuite {
	def romTest(rom: String, res: Int) = assert(Roman(rom).toInt === res)

	test("one") {
		romTest("i", 1)
	}
	test("four") {
		romTest("iv", 4)
	}
	test("8") {
		romTest("viii", 8)
	}
	test("1984") {
		romTest("MCMLXXXIV", 1984)
	}
}