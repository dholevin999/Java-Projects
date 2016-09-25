import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;
import java.util.Random;

public class PasswordGenerator{
  public static void main(String []args){
  Scanner reader = new Scanner(System.in);
  System.out.println("Enter the length of your password:");
  int count = reader.nextInt();
  int randomNum = 0;
  int numOrLetter = 0;
  int upperOrLower = 0;
  String numString = "";
  String password = "";
  String symbols = "@#$%:?";

  for (int i = 0; i< count; i++) {
  numOrLetter = ThreadLocalRandom.current().nextInt(0, 3);

  if (numOrLetter == 0) {
  randomNum = ThreadLocalRandom.current().nextInt(0, 9);
  numString = Integer.toString(randomNum);
  password += numString;
  } else if (numOrLetter == 1){
  upperOrLower = ThreadLocalRandom.current().nextInt(0, 2);
  if (upperOrLower == 0) {
  Random r = new Random();
  char c = (char) (r.nextInt(26) + 'A');
  password += c;
  } else {
  Random r = new Random();
  char c = (char) (r.nextInt(26) + 'a');
  password += c;
  }
  } else {
  int randomSymbol = ThreadLocalRandom.current().nextInt(0, symbols.length());
  char sym = symbols.charAt(randomSymbol);
  password += sym;
  }
  }

  System.out.println(password);
  }

}
