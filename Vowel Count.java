import java.util.Scanner;

public class VowelCount{
  
  public static void main(String []args){
  Scanner reader = new Scanner(System.in); // Reading from System.in
  System.out.println("Enter a word or sentance: ");
  String word = reader.nextLine().toLowerCase();
  int aCount = 0;
  int eCount = 0;
  int iCount = 0;
  int oCount = 0;
  int uCount = 0;
  int yCount = 0;

  for (int i = 0; i < word.length(); i++) {
  if (word.charAt(i) == 'a') {
  aCount++;
  } else if (word.charAt(i) == 'e') {
  eCount++;
  } else if (word.charAt(i) == 'i') {
  iCount++;
  } else if (word.charAt(i) == 'o') {
  oCount++;
  } else if (word.charAt(i) == 'u') {
  uCount++;
  } else if (word.charAt(i) == 'y') {
  yCount++;
  }
  }
  int totalCount = aCount + eCount + iCount + oCount + uCount + yCount;
  System.out.println("There are " + totalCount + " total vowels in the word.");
  System.out.println(aCount + " a's, " + eCount + " e's, " + iCount + " i's, " + oCount + " o's, " + uCount + " u's, and " + yCount + " y's");

  }

}
