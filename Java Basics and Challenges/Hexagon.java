
import javax.swing.JOptionPane;
public class Hexagon {
 public static void main(String[] args) {
String input;
input = JOptionPane.showInputDialog("Enter the side length of the hexagon. ");
double side = Double.parseDouble(input);

JOptionPane.showMessageDialog(null, 
"The hexagon's perimeter is  " + 6 * side + "\nThe hexagon's area is " +
	3 * Math.sqrt(3) * Math.pow(side, 2) / 2);
System.exit(0);
 }
}
