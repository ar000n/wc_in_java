public class WordCount {
    private String text;

    public WordCount(String string) {
        this.text = string;
    }

    public int hasWordsOf() {
        if (this.text == "") return 0;
        return this.text.split(" ").length;
    }

    public int hasLettersOf() {
        if (this.text == "") return 0;
        return this.text.split("").length;
    }

    public int hasLinesOf() {
        if (this.text == "") return 0;
        return this.text.split("\n").length - 1;
    }

    public static void main(String[] args) {
		ReadingUnit textFile = new ReadingUnit(args[0]);
		String fileContent = textFile.read();
		WordCount text = new WordCount(fileContent);
        System.out.println(text.hasLinesOf());

    }

}
