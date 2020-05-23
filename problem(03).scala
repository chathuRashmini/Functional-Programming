object Book extends App{
	def getTotalWholesaleCost(totalCopies:Int, firstCopies:Int,additionalCopies:Int) = 
		(24.95*totalCopies) - (24.95*0.4*totalCopies) - firstCopies*3 - additionalCopies*0.75;
	println (getTotalWholesaleCost(60, 50, 10));
}