import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PromptWindow implements ActionListener{
	JFrame frame;
	JPanel panel;
	JTextField speedSet;
	JLabel speedInfo;
	JButton speedConfirm;
	
	public static void main(String[] args) {
		PromptWindow r = new PromptWindow();
	}

	public PromptWindow() {
		//GUI
		frame = new JFrame("Set your speed");
		panel = new JPanel();
		speedSet = new JTextField(5);
		speedInfo = new JLabel();
		speedConfirm = new JButton("Confirm");
		
		frame.setVisible(true);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		frame.setSize(400, 60);
		
		frame.add(panel);
		panel.add(speedInfo);
		panel.add(speedSet);
		panel.add(speedConfirm);
		
		speedInfo.setText("Set the word display speed here.");
		
		speedConfirm.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == speedConfirm) {
			int speed = Integer.parseInt(speedSet.getText());
		}
	}
}