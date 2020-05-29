object  FibonacciSequence_6 extends App {
	def fibonacci(n:Int):Int= n match{ 
		case 0 => 0 
		case x if x==1 => 1 
		case _ => fibonacci(n-1)+fibonacci(n-2) 
	} 

	def printFibonacciSequence(n:Int):Unit= { 
		if (n > 0)  
			printFibonacciSequence(n-1) 
		println(fibonacci(n)) 
	} 
	print("Enter any number: ");
	//will display the first 'n' fibonacci numbers
	var n: Int = scala.io.StdIn.readInt();
	println(printFibonacciSequence(n));
}