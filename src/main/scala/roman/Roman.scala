package roman

class Roman(rom: String) {	
	import roman.Roman.RomToIntFoundation

  def toInt = {
		def loop(rem: String): Int = {
			def next(n: Int) = loop(rem.substring(n)) + RomToIntFoundation(rem.substring(0, n))
			
			if (rem.isEmpty) 0
			else if (rem.size == 1 || !RomToIntFoundation.contains(rem.substring(0, 2))) next(1)
			else next(2)
		}
		
		loop(rom)
  }
}

object Roman {
	val RomToIntFoundation = Map[String, Int]("i" -> 1, "iv" -> 4, "v" -> 5, "ix" -> 9, "x" -> 10, "xl" -> 40, "l" -> 50, "xc" -> 90, "c" -> 100, "cd" -> 400, "c" -> 500, "cm" -> 900, "m" -> 1000)
	def apply(rom: String) = new Roman(rom.toLowerCase)
}