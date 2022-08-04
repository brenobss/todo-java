package view;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.UIManager;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.border.LineBorder;

public class TaskDiologScreen extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			TaskDiologScreen dialog = new TaskDiologScreen();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public TaskDiologScreen() {
		setBounds(100, 100, 450, 579);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JPanel panel = new JPanel();
			panel.setBackground(new Color(0, 153, 102));
			panel.setBounds(10, 11, 414, 63);
			contentPanel.add(panel);
			panel.setLayout(null);
			{
				JLabel lblNewLabel = new JLabel("Tarefa");
				lblNewLabel.setForeground(UIManager.getColor("Button.disabledShadow"));
				lblNewLabel.setFont(new Font("Segoe UI", Font.BOLD, 18));
				lblNewLabel.setBounds(10, 21, 63, 19);
				panel.add(lblNewLabel);
			}
			{
				JLabel lblNewLabel_1 = new JLabel("");
				lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\breno\\Documents\\Workspace\\todo-java\\resources\\check.png"));
				lblNewLabel_1.setBounds(372, 11, 32, 38);
				panel.add(lblNewLabel_1);
			}
		}
		{
			JPanel panel = new JPanel();
			panel.setBackground(UIManager.getColor("Button.disabledShadow"));
			panel.setBounds(10, 85, 414, 411);
			contentPanel.add(panel);
			panel.setLayout(null);
			{
				JLabel lblNewLabel_2 = new JLabel("Nome");
				lblNewLabel_2.setFont(new Font("Segoe UI", Font.PLAIN, 14));
				lblNewLabel_2.setBounds(10, 12, 46, 14);
				panel.add(lblNewLabel_2);
			}
			{
				textField = new JTextField();
				textField.setFont(new Font("Segoe UI", Font.PLAIN, 14));
				textField.setBounds(10, 36, 166, 20);
				panel.add(textField);
				textField.setColumns(10);
			}
			{
				JLabel lblNewLabel_3 = new JLabel("Descrição");
				lblNewLabel_3.setFont(new Font("Segoe UI", Font.PLAIN, 14));
				lblNewLabel_3.setBounds(10, 77, 91, 20);
				panel.add(lblNewLabel_3);
			}
			{
				JTextArea textArea = new JTextArea();
				textArea.setBorder(new LineBorder(UIManager.getColor("Button.shadow")));
				textArea.setFont(new Font("Segoe UI", Font.PLAIN, 14));
				textArea.setBounds(10, 102, 394, 99);
				panel.add(textArea);
			}
			{
				JLabel lblNewLabel_4 = new JLabel("Prazo");
				lblNewLabel_4.setFont(new Font("Segoe UI", Font.PLAIN, 14));
				lblNewLabel_4.setBounds(10, 225, 46, 14);
				panel.add(lblNewLabel_4);
			}
			{
				textField_1 = new JTextField();
				textField_1.setFont(new Font("Segoe UI", Font.PLAIN, 14));
				textField_1.setBounds(10, 250, 166, 20);
				panel.add(textField_1);
				textField_1.setColumns(10);
			}
			{
				JLabel lblNewLabel_5 = new JLabel("Notas");
				lblNewLabel_5.setFont(new Font("Segoe UI", Font.PLAIN, 14));
				lblNewLabel_5.setBounds(10, 292, 46, 14);
				panel.add(lblNewLabel_5);
			}
			{
				JTextArea textArea = new JTextArea();
				textArea.setBorder(new LineBorder(UIManager.getColor("Button.shadow")));
				textArea.setFont(new Font("Segoe UI", Font.PLAIN, 14));
				textArea.setBounds(10, 317, 394, 83);
				panel.add(textArea);
			}
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
