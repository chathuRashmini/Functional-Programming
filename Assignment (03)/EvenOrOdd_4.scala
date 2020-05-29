object EvenOrOdd_4 extends App {
	def isEven(n:Int): Boolean = n match {
		case 0 => true
		case _ => isOdd(n-1)
	}

	def isOdd(n:Int): Boolean = !(isEven(n))

	print("Enter any number to check whether it is even: ");
	var number: Int = scala.io.StdIn.readInt();
	println(isEven(number));
}