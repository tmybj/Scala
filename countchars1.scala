import scala.io.Source

if(args.length > 0){
	
	for(line <- Source.fromFile(args(0)).getLine())
		printin(line.length + " " + line)
}
else
	Console.err.println("Please enter filename")