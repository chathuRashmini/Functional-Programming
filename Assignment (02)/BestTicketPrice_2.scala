object BestTicketPrice_2 extends App {
	
	def getBestTicketPrice():Int = {
		//the maximum price where no one would attend for the movie
		val maxTicketPrice: Int = (120*5/20) + 15;

		var maxProfit = 0;
		var bestTicketPrice  = 0;

		for (i <- maxTicketPrice to 0 by -1) {
			var numOfWatchers = 120 + (15-i)*20/5;
			var profit = (i-3)*numOfWatchers - 500;
			if (profit > maxProfit) {
				maxProfit = profit;
				bestTicketPrice = i;
			}
		}
		return bestTicketPrice;
	}
	println("The Best Ticket Price is " + getBestTicketPrice());
}