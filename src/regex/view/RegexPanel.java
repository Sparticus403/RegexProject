package regex.view;

import regex.controller.RegexController;
import javax.swing.*;

public class RegexPanel extends JPanel
{
	private RegexController baseController;
	private SpringLayout baseLayout;
	private JButton submitButton;
	private JTextField firstNameField;
	private JTextField lastNameField;
	private JTextField emailField;
	private JTextField phoneField;
	private JLabel firstNameLabel;
	private JLabel lastNameLabel;
	private JLabel emailLabel;
	private JLabel phoneLabel;
	
	public RegexPanel(RegexController baseController)
	{
		this.baseController = baseController;
		this.baseLayout = new SpringLayout();
		this.submitButton = new JButton("Submit");
		this.firstNameField = new JTextField();
		this.lastNameField = new JTextField();
		this.emailField = new JTextField();
		this.phoneField = new JTextField();
		this.firstNameLabel = new JLabel("First Name");
		this.lastNameLabel = new JLabel("Last Name");
		this.phoneLabel = new JLabel("Phone #");
		this.emailLabel = new JLabel("Email");
		
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	private void setupPanel()
	{
		this.setLayout(baseLayout);
		this.add(submitButton);
		this.add(firstNameField);
		this.add(lastNameField);
		this.add(emailField);
		this.add(phoneField);
		this.add(firstNameLabel);
		this.add(lastNameLabel);
		this.add(emailLabel);
		this.add(phoneLabel);
	}
	
	private void setupLayout()
	{
		
	}
	
	private void setupListeners()
	{
		
	}

}
