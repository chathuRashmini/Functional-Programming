object CheckPrime_1 extends App {
	def checkGCD(num1:Int,num2:Int):Int=num2 match{ 
		case 0 => num1 
		case x if x>num1 => checkGCD(x,num1) 
		case _ => checkGCD(num2,num1%num2) 
	} 

	def isPrime(number1:Int,number2:Int=2):Boolean= number2 match {
		case x if(x==number1) => true 
		case x if checkGCD(number1,x)>1 => false 
		case x => isPrime(number1,x+1)
	}
	print("Enter any number to check whether it is prime: ");
	var number: Int = scala.io.StdIn.readInt();
	println(isPrime(number));
}