mport java.util.Scanner;

public class PigLatin{
  public static void main(String []args){
  Scanner reader = new Scanner(System.in);
  System.out.println("Enter your text:");
  String word = reader.next();
  String pigWord = "";

  for (int i = 1; i < word.length(); i++) {
  pigWord += word.charAt(i);
  }

  pigWord = pigWord + word.charAt(0) + "ay";

  System.out.println(pigWord);
  }

}
