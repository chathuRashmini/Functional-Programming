object AdditionOfEvenNumbers_5 extends App {
	def checkEven(n:Int): Int = {
		if (n%2==0) {
			return n-2;
			//since addition is taking upto a given number, the entered number is ignored.
		}
		else {
			return n-1;
		}
	}

	def getAddition(m:Int): Int = m match {
		case 0 => 0
		case 1 => 1
		case _ => m + getAddition(m-2)
	}

	print("Enter any number upto which you want to take the addition of the EVEN numbrs: ");
	var number: Int = scala.io.StdIn.readInt();
	println(getAddition(checkEven(number)));
}