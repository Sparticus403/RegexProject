package regex.view;

import regex.controller.RegexController;
import javax.swing.*;
import java.awt.event.*;

public class RegexPanel extends JPanel
{
	private RegexFrame appFrame;
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
		this.firstNameField = new JTextField(5);
		this.lastNameField = new JTextField(5);
		this.emailField = new JTextField(5);
		this.phoneField = new JTextField(5);
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
		setSize(600, 400);
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
		baseLayout.putConstraint(SpringLayout.WEST, lastNameField, 10, SpringLayout.WEST, lastNameLabel);
		baseLayout.putConstraint(SpringLayout.NORTH, firstNameField, 7, SpringLayout.SOUTH, firstNameLabel);
		baseLayout.putConstraint(SpringLayout.WEST, firstNameField, 10, SpringLayout.WEST, firstNameLabel);
		baseLayout.putConstraint(SpringLayout.NORTH, phoneField, 0, SpringLayout.NORTH, firstNameField);
		baseLayout.putConstraint(SpringLayout.NORTH, emailField, 0, SpringLayout.NORTH, firstNameField);
		baseLayout.putConstraint(SpringLayout.NORTH, lastNameField, 0, SpringLayout.NORTH, firstNameField);
		baseLayout.putConstraint(SpringLayout.SOUTH, submitButton, -10, SpringLayout.SOUTH, this);
		baseLayout.putConstraint(SpringLayout.EAST, submitButton, -10, SpringLayout.EAST, this);
		baseLayout.putConstraint(SpringLayout.WEST, firstNameLabel, 10, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, firstNameLabel, -69, SpringLayout.SOUTH, this);
		baseLayout.putConstraint(SpringLayout.NORTH, lastNameLabel, 0, SpringLayout.NORTH, firstNameLabel);
		baseLayout.putConstraint(SpringLayout.WEST, lastNameLabel, 45, SpringLayout.EAST, firstNameLabel);
		baseLayout.putConstraint(SpringLayout.NORTH, phoneLabel, 0, SpringLayout.NORTH, firstNameLabel);
		baseLayout.putConstraint(SpringLayout.WEST, phoneLabel, 57, SpringLayout.EAST, lastNameLabel);
		baseLayout.putConstraint(SpringLayout.NORTH, emailLabel, 0, SpringLayout.NORTH, firstNameLabel);
		baseLayout.putConstraint(SpringLayout.WEST, emailLabel, 56, SpringLayout.EAST, phoneLabel);
		baseLayout.putConstraint(SpringLayout.WEST, phoneField, 10, SpringLayout.WEST, phoneLabel);
		baseLayout.putConstraint(SpringLayout.WEST, emailField, 10, SpringLayout.WEST, emailLabel);
	}
	
	private void setupListeners()
	{
		submitButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				//first name
				if(firstNameField.toString().matches("[A-Za-z]{2,30}"))
				{
//					JOptionPane.showMessageDialog(appFrame, "woooo");
				}
				else
				{
//					JOptionPane.showMessageDialog(appFrame, "no");
				}
				//last name
				if(lastNameField.toString().matches("[A-Za-z,.'-]{2,40}"))
				{
					
				}
				else
				{
					
				}
				//email
				if(emailField.toString().matches("^[_A-Za-z0-9-\\+]+(\\.[_a-Za-z0-9-])*@"
						+ "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$"))
				{
					
				}
				else
				{
					
				}
				//phone
				if(phoneField.toString().matches("^(\+\d)*\s*(\(\d{3}\)\s*)*\d{3}(-{0,1}|\s{0,1})\d{2}(-{0,1}|\s{0,1})\d{2}$"))
				{
					
				}
				else
				{
					
				}
			}
		});
	}

}
