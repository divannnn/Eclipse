package GUI_Unit5;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class CalculatorEngine implements ActionListener {
	Calculator parent;// a regerence to the Calculator
	//constructor stores the reference to the 
	//Calculator window in the member variable parent
	CalculatorEngine(Calculator parent){
		this.parent = parent;
	}

	@Override	
	public void actionPerformed(ActionEvent e){
		//Get the source of thia action
		JButton clickedButton = (JButton) e.getSource();
		
		//get the existing text from the Calculatior's
		//display field. Reaching  inside another objects is bad
		String dispFieldText = parent.getDisplayValue();
		
		//get the button's label
		String clickedButtonLabel = clickedButton.getText();
		
		parent.setDisplayValue(dispFieldText + clickedButtonLabel);
		
	}
}
