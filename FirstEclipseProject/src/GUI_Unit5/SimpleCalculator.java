package GUI_Unit5;
import javax.swing.*;
import java.awt.FlowLayout;
public class SimpleCalculator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//create a panel
		JPanel windowsContent = new JPanel();
		
		//set a laout manager fot this panel
		FlowLayout f1 = new FlowLayout();
		windowsContent.setLayout(f1);
		
		//create controls in memory
		JLabel label1 = new JLabel("Number 1:");
		JTextField field1 = new JTextField(10);
		JLabel label2 = new JLabel("Number 2:");
		JTextField field2 = new JTextField(10);
		JLabel label3 = new JLabel("Number 3:");
		JTextField field3 = new JTextField(10);
		JButton go = new JButton("Add");
		
		//Add controls to the panel
		windowsContent.add(label1);
		windowsContent.add(field1);
		windowsContent.add(label2);
		windowsContent.add(field2);
		windowsContent.add(label3);
		windowsContent.add(field3);
		//windowsContent.add(result);
		windowsContent.add(go);
		
		//create the frame and the panel to it
		JFrame frame = new JFrame("My first calculator");
		
		//Add panel
		frame.setContentPane(windowsContent);
		//set size
		frame.setSize(400,100);
		frame.setVisible(true);
		
		
	}

}
