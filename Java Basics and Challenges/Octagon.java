import javax.swing.JOptionPane;
public class Octagon {
 public static void main(String[] args) {
String input;
input = JOptionPane.showInputDialog("Enter the side length of the octagon. ");
double side = Double.parseDouble(input);

JOptionPane.showMessageDialog(null, 
"The octagon's perimeter is  " + 8 * side + "\nThe octagon's area is " +
	2 * (1  + Math.sqrt(2)) * Math.pow(side, 2));
System.exit(0);
 }
}
