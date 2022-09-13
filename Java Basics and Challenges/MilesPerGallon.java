
import javax.swing.JOptionPane;
public class MilesPerGallon {
 public static void main(String[] args) {
String input;
input = JOptionPane.showInputDialog("Please enter the number of miles driven ");
double milesDriven = Double.parseDouble(input);
input = JOptionPane.showInputDialog("Please enter the number of gallons used ");
double gallonsOfGasUsed = Double.parseDouble(input);
Double MPG = milesDriven / gallonsOfGasUsed;  //use double not Double for basic variables
JOptionPane.showMessageDialog(null, 
"Caar's MPG: " + MPG);
System.exit(0);
 }
}
