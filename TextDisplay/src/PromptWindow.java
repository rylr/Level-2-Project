import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PromptWindow implements ActionListener{
	JFrame frame;
	JPanel panel;
	JTextField speedSet;
	JLabel speedInfo;
	JButton speedConfirm;
	JButton fileBrowse;
	JButton run;
	JFileChooser doc;
	
	public static void main(String[] args) {
		PromptWindow r = new PromptWindow();
	}

	public PromptWindow() {
		//Speed
		frame = new JFrame("Set your speed");
		panel = new JPanel();
		speedSet = new JTextField(5);
		speedInfo = new JLabel();
		speedConfirm = new JButton("Confirm");
		
		frame.setVisible(true);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		frame.setSize(525, 600);
		
		frame.add(panel);
		panel.add(speedInfo);
		panel.add(speedSet);
		panel.add(speedConfirm);
		
		speedInfo.setText("Set the word display speed here.");
		
		speedConfirm.addActionListener(this);
		
		//speedSet.setBounds(450, 50, 30, 10);
	
		//File Browser
		fileBrowse = new JButton();
		doc = new JFileChooser();
		panel.add(doc);
		
		
		fileBrowse.addActionListener(this);
		
		doc.setCurrentDirectory(new java.io.File("C:/Users/Tyler/Desktop"));
		doc.setDialogTitle("Text Document Chooser");
		doc.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
		
		//System.out.println("You chose: " +doc.getSelectedFile().getAbsolutePath());
		
		
		//Run Button
		run = new JButton("Run");
		panel.add(run);
		
		run.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == speedConfirm) {
			int speed = Integer.parseInt(speedSet.getText());
		}
		
		if(e.getSource() == fileBrowse) {
			
		}
		
		if(e.getSource() == run) {
			if(speedSet.getText().equals("")) {
				JOptionPane.showMessageDialog(null, "Set a speed for your text display.");
			}
		}
	}
}