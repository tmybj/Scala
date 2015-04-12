var i = 0
var foundIt = false
while ( i < arg.length && !foundIt){
	if (!args(i).startsWith("-")){
	if(args(i).endsWith(".scala"))
		foundIt = true
	}
	i = i + 1
}