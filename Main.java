package interpreter;
import java.util.*;

public class Main {

  public static void main(String[] args) {
    Lexicon lex = new Lexicon();

    String newWord = lex.translate("entropy");
    System.out.println(newWord);
    System.out.println(decode(lex.translate("entropy")));

  }

  /**
   * This method decodes a single word.
   * 
   * @param word The single word to be decoded.
   */
  public static String decode(String word)
  {
      char[] vowels = { 'a', 'e', 'i', 'o', 'u' };


	  for (int i = 0; i<word.length()-1; i++)
	  {
		 if (word.contains("ent"))
		 {
			 word = word.replaceFirst("ent","");
		 }
		 if (word.substring(word.length()-5,word.length()-1) == "ingy")
		 {
			 word = word.replace("ingy", "");
		 }
	  }
	  return word;
  }

  /**
   * This method should not have code copy/pasted from the decode method.
   * 
   * @param message The sentence (multiple words) to be decoded.
   */
  public static String decodeMessage(String message)
  {
    return "";
  }
}