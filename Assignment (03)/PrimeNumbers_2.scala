object PrimeNumbers_2 extends App {
	def checkGCD(num1:Int,num2:Int):Int=num2 match{ 
		case 0 => num1 
		case x if x>num1 => checkGCD(x,num1) 
		case _ => checkGCD(num2,num1%num2) 
	} 

	def isPrime(p:Int,n:Int=2):Boolean= n match { 
		case x if(x==p) => true
		case x if checkGCD(p,x)>1 => false
		case x => isPrime(p,x+1) 
	}
	
	def primeNumbers(n:Int):Unit={ 
		if (isPrime(n)) 
			println(n) 
		if(n>2) 
			primeNumbers(n-1) 
	}

	print("Enter any number: ");
	var number: Int = scala.io.StdIn.readInt();
	println(primeNumbers(number));
}