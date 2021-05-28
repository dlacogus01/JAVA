package concept;
import javax.swing.*;
import java.awt.*;

public class GUIEX02 extends JFrame {
	public GUIEX02() {
		setTitle("FlowLayout ¿¹Á¦");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container contentPane = getContentPane();
		
		contentPane.setLayout(new FlowLayout(FlowLayout.LEFT, 30, 40));
		contentPane.add(new JButton("Add"));
		contentPane.add(new JButton("Sub"));
		contentPane.add(new JButton("Mul"));
		contentPane.add(new JButton("Div"));
		contentPane.add(new JButton("Calculate"));
		setSize(300, 200);
		setVisible(true);
	}
	public static void main(String[] args) {
		
	}

}
