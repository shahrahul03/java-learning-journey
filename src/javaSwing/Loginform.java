package javaSwing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.Font;
import javax.swing.border.TitledBorder;
import org.eclipse.wb.swing.FocusTraversalOnArray;
import java.awt.Component;
import java.awt.Window.Type;
import java.awt.Dimension;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Loginform extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel logincontentPane;
	private JTextField passwordtextField;
	private JTextField usernametextField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Loginform frame = new Loginform();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Loginform() {
		setSize(new Dimension(1200, 1100));
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 484, 351);
		logincontentPane = new JPanel();
		logincontentPane.setBackground(new Color(192, 192, 192));
		logincontentPane.setBorder(new TitledBorder(null, "Login page", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(64, 0, 0)));
		setContentPane(logincontentPane);
		logincontentPane.setLayout(null);
		
		JButton login = new JButton("Login");
		login.setFont(new Font("Tahoma", Font.BOLD, 14));
		login.setBackground(new Color(0, 64, 128));
		login.setBounds(178, 188, 84, 32);
		logincontentPane.add(login);

		// ✅ Correct login logic here
		login.addActionListener(e -> {

		    String username = usernametextField_1.getText();
		    String password = passwordtextField.getText();

		    if (username.isEmpty() || password.isEmpty()) {
		        JOptionPane.showMessageDialog(null, "All fields are required");
		        return;
		    }

		    User user = new User();

		    if (user.checkLogin(username, password)) {
		        JOptionPane.showMessageDialog(null, "Login Successful");
		    } else {
		        JOptionPane.showMessageDialog(null, "Invalid Username or Password");
		    }
		    new Dashboard().setVisible(true);
		    this.dispose();
		});
		
		passwordtextField = new JTextField();
		passwordtextField.setBounds(178, 147, 96, 18);
		logincontentPane.add(passwordtextField);
		passwordtextField.setColumns(10);
		
		JLabel password = new JLabel("password :");
		password.setBounds(178, 114, 86, 20);
		logincontentPane.add(password);
		
		usernametextField_1 = new JTextField();
		usernametextField_1.setBounds(178, 86, 96, 18);
		logincontentPane.add(usernametextField_1);
		usernametextField_1.setColumns(10);
		
		JLabel username = new JLabel("username :");
		username.setBounds(178, 52, 63, 24);
		logincontentPane.add(username);
		
		JLabel lblNewLabel_2 = new JLabel("Login page");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_2.setBackground(new Color(0, 64, 128));
		lblNewLabel_2.setBounds(178, 10, 146, 32);
		logincontentPane.add(lblNewLabel_2);
		
		JButton Register = new JButton("Register ");
		Register.addActionListener(e ->{
			new RegisterForm().setVisible(true);
			this.dispose();
			
		});
		Register.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		Register.setBounds(178, 258, 84, 20);
		logincontentPane.add(Register);
		
		JLabel lblNewLabel = new JLabel("Create new account ");
		lblNewLabel.setBounds(165, 230, 159, 18);
		logincontentPane.add(lblNewLabel);
		setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{logincontentPane, login, passwordtextField, password, usernametextField_1, username, lblNewLabel_2, Register, lblNewLabel}));

	}
}
