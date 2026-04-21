package javaSwing;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class RegisterForm extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTextField usernameTextField;
    private JPasswordField passwordField;

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                RegisterForm frame = new RegisterForm();
                frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    public RegisterForm() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 484, 351);
        setTitle("Registration");

        contentPane = new JPanel();
        contentPane.setBackground(new Color(192, 192, 192));
        contentPane.setBorder(new TitledBorder(null, "Register Page", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(64, 0, 0)));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        // Title Label
        JLabel lblTitle = new JLabel("Create Account");
        lblTitle.setFont(new Font("Tahoma", Font.BOLD, 18));
        lblTitle.setBounds(178, 10, 150, 32);
        contentPane.add(lblTitle);

        // Username
        JLabel lblUsername = new JLabel("Username:");
        lblUsername.setBounds(178, 52, 86, 24);
        contentPane.add(lblUsername);

        usernameTextField = new JTextField();
        usernameTextField.setBounds(178, 86, 120, 25);
        contentPane.add(usernameTextField);

        // Password
        JLabel lblPassword = new JLabel("Password:");
        lblPassword.setBounds(178, 120, 86, 20);
        contentPane.add(lblPassword);

        passwordField = new JPasswordField();
        passwordField.setBounds(178, 147, 120, 25);
        contentPane.add(passwordField);
        
        JButton registerbtnNewButton = new JButton("Register");
        registerbtnNewButton.setFont(new Font("Tahoma", Font.BOLD, 16));
        registerbtnNewButton.setForeground(new Color(0, 0, 0));
        registerbtnNewButton.setBounds(178, 193, 114, 32);
        contentPane.add(registerbtnNewButton);
        registerbtnNewButton.addActionListener(e ->{
        	String username = usernameTextField.getText();
        	String password = new String(passwordField.getPassword());
        	if (username.isEmpty() || password.isEmpty()) {
        		JOptionPane.showMessageDialog(null, "All fileds are required");
        		return;
        	}
//        	register user
        	User user = new User();
        	user.registerUser(username,password);
        	JOptionPane.showMessageDialog(null, "Register successfull");
        	new Loginform().setVisible(true);
        	dispose();
        	
        });
    }
}