public class WordCount{
	private String text;

	public WordCount(String string){
		this.text = string;
	}

	public int hasWordsOf(){
		if(this.text == "") return 0;
		return this.text.split(" ").length;
	}

	public int hasLettersOf(){
		if(this.text == "") return 0;
		return this.text.split("").length;
	}
}