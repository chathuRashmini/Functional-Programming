object interest_Q4_3 extends App {
	var l1 = new Account("976180873v", 1234567890, -230000.00)
	val l2 = new Account("988991424v", 0987654321, 95050.00)
	val l3 = new Account("976480679v", 0987654321, -10000.00)
	val l4 = new Account("921234567v", 0199956789, -5550.00)
	val l5 = new Account("976180873v", 0976482746, 200000.00)
	val l6 = new Account("988991424v", 0123456789, 305000.00)

	var accountList: List[Account] = List(l1, l2, l3, l4, l5)

	println("\nAccounts with added interests into balances:")
	val it =Iterator(l1)
	while (it.hasNext) {
		println(accountList (if (accountList.filter(it.next().overDraft)) it.next().overdraftInterest() else it.next().depositeInterest))
	}
}

class Account (id:String, acNum:Long, acBal:Double) {
	val nic = id
	val acNumber = acNum
	var acBalance = acBal

	def overDraft = (x:Account) => x.acBalance<0

	def overdraftInterest : Double = acBalance*100.1/100.00

	def depositeInterest : Double = acBalance*100.05/100.00 

	override def toString = "[" + s"$nic" + " : " + s"$acNumber" + " : " + s"$acBalance" + "]"
		
}