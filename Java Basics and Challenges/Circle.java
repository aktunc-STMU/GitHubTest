import javax.swing.JOptionPane;  //use autoformat for your programs, Ctrl+Shift+F in Eclipse
public class Circle {
 public static void main(String[] args) {
String input;
input = JOptionPane.showInputDialog("Enter the radius of the cirle ");
double radius = Double.parseDouble(input);

JOptionPane.showMessageDialog(null, 
"The circle's radius is  " + radius + "\nThe circle's diameter is  " + 2 * radius 
+ "\nThe circle's circumference is " + 2 * Math.PI * radius + "\nThe circle's area is " +
	Math.PI * Math.pow(radius, 2));
System.exit(0);
 }
}
