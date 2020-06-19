package Main;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Dictionary extends JFrame {

	JLabel lword;
	JTextField tword;
	JButton btnSearch;
	JButton btnSave;
	JButton btnRemove;
	
	JLabel lcontent1;
	JTextArea tcontent1;
	JLabel lcontent2;
	JTextArea tcontent2;
	
	Dictionary() {
		// TODO Auto-generated method stub
		lword = new JLabel("단어 입력 : ");
		lword.setBorder(BorderFactory.createEmptyBorder(0, 10,0,0));
		tword = new JTextField(20);
		tword.setBorder(BorderFactory.createEmptyBorder(0, 10,0,0));
		btnSearch = new JButton("검색");
		btnSearch.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				
			}
		
		});
		
		lcontent1 = new JLabel("뜻");
		lcontent1.setBorder(BorderFactory.createEmptyBorder(0,0,0,300));
		tcontent1 = new JTextArea("hello", 10, 30);
		tcontent1.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
		tcontent1.setLineWrap(true);
		tcontent1.setWrapStyleWord(true);
		
		lcontent2 = new JLabel("예시");
		lcontent2.setBorder(BorderFactory.createEmptyBorder(0,0,0,300));
		tcontent2 = new JTextArea("content", 10, 30);
		tcontent2.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
		tcontent2.setLineWrap(true);
		tcontent2.setWrapStyleWord(true);
		
		
		this.setSize(400, 600);
		this.setLocation(300, 150);
		this.setLayout(new FlowLayout());
		this.setVisible(true);
		
		add(lword);
		add(tword);
		add(btnSearch);
		
		add(lcontent1);
		add(tcontent1);
		add(lcontent2);
		add(tcontent2);
		
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Dictionary();
	}



}
