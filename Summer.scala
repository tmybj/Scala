import ChecksumAccumlator.calculate

object Summer {
	def main(args: Array[String]){
		for(arg <- args)
			printl(arg +": " + calculate(arg))
	}
	
}