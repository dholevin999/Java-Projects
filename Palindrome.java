import java.util.Scanner;
public class HelloWorld{
  public static void main(String []args){
  Scanner reader = new Scanner(System.in); // Reading from System.in
  System.out.println("Enter a word: ");
  //int n = reader.nextInt(); // Scans the next token of the input as an int.
  String word = reader.next();
  String reverseWord = "";
  for (int i = 0; i < word.length(); i++) {
  reverseWord += word.charAt(word.length()-1-i);
  }
  if (word.equals(reverseWord)) {
  System.out.println("its a palindrome");
  } else {
  System.out.println("not a palindrome");
  }
}
}
