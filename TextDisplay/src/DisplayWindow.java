import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.Timer;

public class DisplayWindow implements ActionListener{
	JFrame disframe;
	JPanel dispanel;
	ArrayList<String> wordList;
	Timer timer;
	JLabel currentWord;
	int counter = 1;
	
	public DisplayWindow(ArrayList<String> x, int y)
	{
		wordList = x;
		
		//GUI
			disframe = new JFrame();
			disframe.setVisible(true);
			disframe.setSize(800, 400);
			disframe.setLocationRelativeTo(null);
			dispanel = new JPanel();
		
			disframe.add(dispanel);
		
		//Text Display	
			currentWord = new JLabel(wordList.get(0));
			dispanel.setLayout(new BorderLayout());
			dispanel.add(currentWord, BorderLayout.CENTER);
			
		//Timer
			timer = new Timer((1000/y) * 60, this);
			timer.start();
			
		//Panel and Text Cosmetics
			dispanel.setBackground(Color.BLACK);
			currentWord.setForeground(Color.WHITE);
			
			currentWord.setHorizontalAlignment(SwingConstants.CENTER);
			
			currentWord.setFont(new Font("Arial", Font.PLAIN, 80));
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(counter < wordList.size())
			currentWord.setText(wordList.get(counter++));
		else
			System.exit(0);
	}
}
