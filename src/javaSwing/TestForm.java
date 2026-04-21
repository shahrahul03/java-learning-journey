package javaSwing;

import javax.swing.JButton;
import javax.swing.JFrame;

public class TestForm {
	public static void main(String[] args) {
		JFrame form = new JFrame();
		form.setSize(800, 900);
		form.setTitle("This is JFrame ");
		form.setLayout(null);
		form.setVisible(true);
		
		JButton addButton = new JButton("click me ");
		addButton.setSize(20,15);
		addButton.setBounds(200,90,150,50);
		form.add(addButton);
		}

}
