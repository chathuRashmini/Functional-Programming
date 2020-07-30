object substractRational_Q2 extends App {
	val x = new Rational(2,3)
	val y = new Rational(1,2)
	val z = new Rational(1,8)
	
	val r1:Rational = y.sub(z)
	val r2:Rational = x.sub(r1)
	println(r2)
}

class Rational(numer:Int, denom:Int) {
	def numerator = numer
	def denominator = denom

	def sub(r:Rational) = new Rational(this.numerator*r.denominator-r.numerator*this.denominator, this.denominator*r.denominator)

	override def toString = s"$numerator" + "/" + s"$denominator"
}