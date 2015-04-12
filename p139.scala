import java.net.URL
import java.net.MalformedURLException

def urlFor(path: String) = 
	try{
		new URL(path)
	}catch{
		case e: MalformedException =>
			new URL("http://www.scala-lang.org")
	}