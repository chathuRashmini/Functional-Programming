object returnNegative_Q1 extends App {
	val r1 = new Rational(4,5)
	val negR:Rational = r1.neg
	println(negR)
}

class Rational(numer:Int, denom:Int) {
	def numerator = numer
	def denominator = denom

	def neg = new Rational(- this.numerator, this.denominator)

	override def toString = s"$numerator" + "/" + s"$denominator"
}