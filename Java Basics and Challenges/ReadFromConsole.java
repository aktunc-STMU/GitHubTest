import java.util.Scanner;
public class ReadFromConsole {
 public static void main(String[] args) {
Scanner input = new Scanner 
(System.in);
System.out.println("Please enter your name");
String name = input.nextLine();
System.out.println("Your name is " + name);
System.out.println("How old are you?");
int age = input.nextInt();
System.out.println("Your age is " + age);
System.out.println("How many seconds can you run a 100 meter dash?");
double seconds = input.nextDouble();
System.out.println("Your time to run a 100 meter dash is " + seconds + " seconds");
input.close();
 }
}
