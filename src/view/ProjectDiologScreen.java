package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.UIManager;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.border.LineBorder;

public class ProjectDiologScreen extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			ProjectDiologScreen dialog = new ProjectDiologScreen();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public ProjectDiologScreen() {
		setBounds(100, 100, 490, 391);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JPanel panel = new JPanel();
			panel.setBounds(10, 11, 454, 63);
			panel.setBackground(new Color(0, 153, 102));
			contentPanel.add(panel);
			panel.setLayout(null);
			{
				JLabel lblNewLabel = new JLabel("Projeto");
				lblNewLabel.setForeground(UIManager.getColor("Button.disabledShadow"));
				lblNewLabel.setFont(new Font("Segoe UI", Font.BOLD, 18));
				lblNewLabel.setToolTipText("Projeto");
				lblNewLabel.setBounds(10, 11, 103, 25);
				panel.add(lblNewLabel);
			}
			{
				JLabel lblNewLabel_1 = new JLabel("");
				lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\breno\\Documents\\Workspace\\todo-java\\resources\\check.png"));
				lblNewLabel_1.setBounds(407, 11, 37, 41);
				panel.add(lblNewLabel_1);
			}
		}
		{
			JPanel panel = new JPanel();
			panel.setBackground(UIManager.getColor("Button.disabledShadow"));
			panel.setBounds(10, 85, 454, 223);
			contentPanel.add(panel);
			panel.setLayout(null);
			{
				JLabel lblNewLabel_2 = new JLabel("Nome");
				lblNewLabel_2.setFont(new Font("Segoe UI", Font.PLAIN, 14));
				lblNewLabel_2.setBounds(10, 11, 109, 14);
				panel.add(lblNewLabel_2);
			}
			
			textField = new JTextField();
			textField.setFont(new Font("Segoe UI", Font.PLAIN, 14));
			textField.setBounds(10, 37, 225, 20);
			panel.add(textField);
			textField.setColumns(10);
			
			JLabel lblNewLabel_3 = new JLabel("Descrição");
			lblNewLabel_3.setFont(new Font("Segoe UI", Font.PLAIN, 14));
			lblNewLabel_3.setBounds(10, 68, 142, 14);
			panel.add(lblNewLabel_3);
			
			JTextArea textArea = new JTextArea();
			textArea.setBorder(new LineBorder(UIManager.getColor("Button.shadow")));
			textArea.setFont(new Font("Segoe UI", Font.PLAIN, 14));
			textArea.setBounds(10, 93, 434, 119);
			panel.add(textArea);
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}
}
