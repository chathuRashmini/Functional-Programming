object Sphere extends App{
	def getSphereVolume(radius:Double) = (4/3)*(22/7)*radius*radius*radius;
	println(getSphereVolume(5));
}