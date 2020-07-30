object accounts_Q4
{
	def main(args:Array[String])
	{
		var l1 = new Account("976180873v", 1234567890, 230000.00)
		val l2 = new Account("988991424v", 0987654321, 95050.00)
		val l3 = new Account("976480679v", 0987654321, -10000.00)
		val l4 = new Account("921234567v", 0199956789, -5550.00)
		val l5 = new Account("976180873v", 0976482746, 200000.00)
		val l6 = new Account("988991424v", 0123456789, 305000.00)
		var accountList: List[Account] = List(l1, l2, l3, l4, l5)

		print("Overdraft accounts\n");
		var overdraftList=overdraft(accountList);
		overdraftList.foreach(x=>print("\nNic: "+x.nic+" Account number: "+x.acNumber+" Account balance: "+x.acBalance+"\n"))

		var totalBalance=balance(accountList);
		print("\nSum of all the account balances: Rs."+ totalBalance.acBalance + "\n");

		print("\nAccount balances including interests\n")
		var withInterestList=interest(accountList);
		withInterestList.foreach(x=>print("\n" + x + "\n"));
	}

	val overdraft=(list:List[Account])=>list.filter(x=>x.acBalance<=0);
	val balance=(list:List[Account])=>list.reduce((x,y)=>new Account("S000",1000,x.acBalance+y.acBalance));
	val interest=(list:List[Account])=>list.map(x=>(if(x.acBalance>0) x.acBalance*1.05d else x.acBalance*1.01d));
}

class Account (id:String, acNum:Long, acBal:Double) {
	val nic = id
	val acNumber = acNum
	var acBalance = acBal

	def overDraft = (x:Account) => x.acBalance<0

	override def toString = "[" + s"$nic" + " : " + s"$acNumber" + " : " + s"$acBalance" + "]"
}