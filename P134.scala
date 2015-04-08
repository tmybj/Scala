for (
	file <- filesHere
	if file.isFile
	if file.getName.endsWith(".scala")
)println(file)