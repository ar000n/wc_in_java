import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class WordCountTest{
	String simpleString = "i am a hero";
	String stringSymbol = "80900 &*(& jkhl %^$& kljll (****";
	String lines = "hey dude\n it looks cool\n right???";
	@Test
	public void should_return_number_of_words_in_a_string(){
		WordCount string = new WordCount(simpleString);
		assertEquals(string.hasWordsOf(),4);
	}

	@Test
	public void should_return_number_of_words_in_a_set_of_symbols(){
		WordCount string = new WordCount(stringSymbol);
		assertEquals(string.hasWordsOf(),6);
	}

	@Test
	public void should_return_number_of_words_in_a_empty_string(){
		WordCount string = new WordCount("");
		assertEquals(string.hasWordsOf(),0);
	}

	@Test
	public void should_return_number_of_letters_in_a_string(){
		WordCount string = new WordCount(simpleString);
		assertEquals(string.hasLettersOf(),12);
	}

	@Test
	public void should_return_number_of_letters_in_a_set_of_symbols(){
		WordCount string = new WordCount(stringSymbol);
		assertEquals(string.hasLettersOf(),33);
	}

	@Test
	public void should_return_number_of_letters_in_a_empty_string(){
		WordCount string = new WordCount("");
		assertEquals(string.hasLettersOf(),0);
	}

	@Test
	public void should_return_number_of_lines_in_a_set_of_symbols(){
		WordCount string = new WordCount(lines);
		assertEquals(string.hasLinesOf(),2);
	}

	@Test
	public void should_return_number_of_lines_in_a_empty_string(){
		WordCount string = new WordCount("");
		assertEquals(string.hasLinesOf(),0);
	}
}