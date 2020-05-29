object salaryCalculation_1 extends App {
	val takeHomeSalary = {
		val normalHrs = 150*40;
		val otHrs = 75*20;
		val monthlySalary = (normalHrs + otHrs)*4;
		//assuming that a month has only four weeks
		monthlySalary*0.9
		//after payin 10% for taxes
	}
	
	println("Take home salary is " + takeHomeSalary)
}
