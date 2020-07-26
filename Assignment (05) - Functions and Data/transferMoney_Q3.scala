object transferMoney_Q3 extends App {
	var l1 = new Account("976180873v", 1234567890, 230000.00)
	val l2 = new Account("988991424v", 0987654321, 95050.00)

	val myList: List[Account] = List(l1, l2)

	l1.trasnfer(l2, 10000.00)

	println(myList)
}

class Account (id:String, acNum:Long, acBal:Double) {
	val nic = id
	val acNumber = acNum
	var acBalance = acBal

	def trasnfer(a:Account, b:Double) {
		this.acBalance = this.acBalance - b
		a.acBalance = a.acBalance + b
	}

	override def toString = "[" + s"$nic" + " : " + s"$acNumber" + " : " + s"$acBalance" + "]"
}