package GUI_Unit5;
import javax.swing.JButton;
import javax.swing.JFrame;
public class HelloWorld extends JFrame{
	public HelloWorld(){
		setSize(200,300);
		setTitle("Hi bitches");
		setVisible(true);
		
		JButton myButton = new JButton("Click me baby");
		add(myButton);
	}

	public static void main(String[] args) {
		new HelloWorld();
	}

}
