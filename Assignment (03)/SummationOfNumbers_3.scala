object SummationOfNumbers_3 extends App {
	def sum(n:Int): Int = n match {
		case 0 => 0
		case 1 => 1
		case _ => n+sum(n-1)
	}
	print("Enter any number that you want to get the summation upto: ");
	var number: Int = scala.io.StdIn.readInt();
	println(sum(number));
}