package driven;

import java.awt.Color;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.*;

public class frame {

	
	static int  num=0;
	
	 public static void plus()
	 {
		 num++;
	 }
	 public static void minus()
	 {
		 num--;
	 }
	 
	public static void main(String[] args) {
		
		 
		JFrame ST = new JFrame("Student frame");
		ST.setSize(700,500);
		
		JLabel welbl = new JLabel("Welcome to HTU site");
		welbl.setBounds(260, 20, 200, 50);
		ST.add(welbl);
		
		
				
		JLabel label = new JLabel("The number of hours passed = 0");
		label.setBounds(65, 270, 250, 50);
		ST.add(label);
		
		JLabel or = new JLabel("or");
		or.setBounds(150, 310, 30, 30);
		ST.add(or);
		
		JButton more = new JButton("+1");
		more.setBounds(70, 310, 70, 30);
		ST.add(more);
		
		more.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
					
				plus();
				label.setText("The number of hours passed = " + num );
			}
		});

		JButton less = new JButton("-1");
		less.setBounds(175, 310, 70, 30);
		ST.add(less);
		
		less.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
			    minus();
				label.setText("The number of hours passed = " + num );
			}
		});
		
		JLabel grlbl = new JLabel("click here to see your grades: ");
		grlbl.setBounds(420, 280, 170, 30);
		ST.add(grlbl);
		
		JButton btn = new JButton("grades");
		btn.setBounds(460, 310, 80, 30);
		btn.setForeground(Color.red);
		ST.add(btn);
		
		btn.addActionListener(new ActionListener() {
			
			private Component ST;

			@Override
			public void actionPerformed(ActionEvent e) {
				
				JOptionPane.showMessageDialog(ST, "The grades will be available at the end of the semester ");
			}
		});
		
		
		JLabel lbl = new JLabel("student number: ");
		lbl.setBounds(50, 90, 150, 40);
		ST.add(lbl);
	
		JTextField text = new JTextField();
		text.setBounds(170, 90, 100, 40);
		ST.add(text);
		
		JButton bntex = new JButton("Done");
		bntex.setBounds(50, 150, 90, 30);
		bntex.setBackground(Color.lightGray);
		ST.add(bntex);
		
		text.addKeyListener(new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent e) {
				lbl.setText("Verifying...");
			}
			
			@Override
			public void keyReleased(KeyEvent e) {
				lbl.setText("Waiting...");
			}
			
			@Override
			public void keyPressed(KeyEvent e) {
				lbl.setText("Verifying 2 ...");
			}
		});

		JLabel chklbl = new JLabel("Please fill out this:");
		chklbl.setBounds(430, 90, 220, 20);
		ST.add(chklbl);
		
		JCheckBox tikbox = new JCheckBox("that's my first year");
		tikbox.setBounds(430, 110, 220, 20);
		ST.add(tikbox);
		
		JCheckBox tikbox2 = new JCheckBox("that's my second year");
		tikbox2.setBounds(430, 130, 220, 20);
		ST.add(tikbox2);
		
		JCheckBox tikbox3 = new JCheckBox("that's my third year");
		tikbox3.setBounds(430, 150, 220, 20);
		ST.add(tikbox3);
		
		JCheckBox tikbox4 = new JCheckBox("I am studying Computer science");
		tikbox4.setBounds(430, 180, 220, 20);
		ST.add(tikbox4);
		
		JCheckBox tikbox5 = new JCheckBox("I am studying Syber security");
		tikbox5.setBounds(430, 200, 220, 20);
		ST.add(tikbox5);
		
		
		ST.setLayout(null);
		ST.setVisible(true);
	
	}

}
