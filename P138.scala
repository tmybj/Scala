import java.io.FileReader
import java.io.FileNotFoundException
import java.io.IOException

try{
	val f = new FileReader("input.txt")
	//フアイルを使ってからクローズする
}catch{
	case ex: FileNotFoundException => //ファイルなしエラーを処理
	case ex: IOExeption => // その他のI/Oエラーを処理
}