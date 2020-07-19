object ceasarCipher extends App {
	val eng_alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"

	val Encryption = (c:Char, key:Int, a:String)=>a((a.indexOf(c.toUpper)+key)%a.size)

	val Decryption = (c:Char, key:Int, a:String)=> if(a.indexOf(c.toUpper)<6) a((a.size-key+a.indexOf(c.toUpper))%a.size) else a((a.indexOf(c.toUpper)-key)%a.size)

	val cipherFunction = (algorithm:(Char,Int,String)=>Char,s:String,key:Int,a:String)=>s.map(algorithm(_,key,a))

	val enCode = cipherFunction(Encryption,eng_alphabet,5,eng_alphabet)

	val deCode = cipherFunction(Decryption,enCode,5,eng_alphabet)

	println("\nEncryption: " + enCode)

	println("\nDecryption: " + deCode)
}