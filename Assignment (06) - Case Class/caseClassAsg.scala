object caseClassAsg extends App {
	val p1 = Point(2,3)
	val p2 = Point(1,2)

	println("p1 = " + p1)
	println("p2 = " + p2)

	val p3: Point = p1.add(p2)
	println("p1 + p2 = " + p3)

	var p4: Point = p1.move(10,20)
	println("When p1 is moved 10 points along x axis\n\tand 20 points along y aixs = " + p4)

	println("\nDistance between p1 and p2 = " + p1.distance(p2))

	println("When x and y cordinates of p1 is switched = " + p1.invert())
}

case class Point(a: Int, b: Int) {
	def x: Int = a
	def y: Int = b

	def add(p:Point): Point = Point(this.x+p.x,this.y+p.y)

	def move(dx:Int, dy:Int): Point = Point(this.x+dx, this.y+dy)

	def distance(p: Point): Double = {
	      (Math.sqrt(Math.pow(this.x - p.x, 2) + Math.pow(this.y - p.y, 2)))
	}

	def invert(): Point = Point (this.y , this.x)
}
