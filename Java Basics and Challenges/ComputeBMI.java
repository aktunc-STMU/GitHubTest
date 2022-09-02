
import javax.swing.JOptionPane;
public class ComputeBMI {
 public static void main(String[] args) {
String input;
input = JOptionPane.showInputDialog("Enter your weight in pounds.");
double weight = Double.parseDouble(input);
input = 
JOptionPane.showInputDialog("Enter your height in inches.");
double height = Double.parseDouble(input);
double BMI = weight *  0.45359237 /Math.pow(height *  0.0254, 2);
JOptionPane.showMessageDialog(null, 
"Your body mas index is " + BMI);
System.exit(0);
 }
}
