package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.BoxLayout;
import java.awt.Font;
import javax.swing.SwingConstants;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.FormSpecs;
import com.jgoodies.forms.layout.RowSpec;
import javax.swing.ImageIcon;
import javax.swing.border.EtchedBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.Component;
import java.awt.GridLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.CardLayout;
import javax.swing.JList;
import javax.swing.UIManager;
import javax.swing.ListSelectionModel;
import javax.swing.AbstractListModel;

public class MainScreen {

	private JFrame frame;
	private final JPanel panelTooBar = new JPanel();
	private JLabel emptyListTitle;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainScreen window = new MainScreen();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MainScreen() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 713, 535);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		panelTooBar.setBackground(new Color(0, 153, 102));
		panelTooBar.setBounds(10, 11, 677, 104);
		frame.getContentPane().add(panelTooBar);
		panelTooBar.setLayout(null);
		
		JLabel tooBarTitle = new JLabel("Todo App");
		tooBarTitle.setIcon(new ImageIcon("C:\\Users\\breno\\Documents\\Workspace\\todo-java\\resources\\tick.png"));
		tooBarTitle.setForeground(new Color(255, 255, 255));
		tooBarTitle.setBounds(10, 11, 582, 65);
		tooBarTitle.setVerticalAlignment(SwingConstants.TOP);
		tooBarTitle.setFont(new Font("Segoe UI", Font.PLAIN, 36));
		panelTooBar.add(tooBarTitle);
		
		JLabel tooBarSubTitle = new JLabel("Anote tudo, não esqueça de nada");
		tooBarSubTitle.setForeground(new Color(255, 255, 255));
		tooBarSubTitle.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		tooBarSubTitle.setBounds(10, 81, 582, 20);
		tooBarSubTitle.setVerticalAlignment(SwingConstants.BOTTOM);
		panelTooBar.add(tooBarSubTitle);
		
		JPanel panelProjects = new JPanel();
		panelProjects.setAlignmentY(Component.TOP_ALIGNMENT);
		panelProjects.setAlignmentX(Component.LEFT_ALIGNMENT);
		panelProjects.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		panelProjects.setBackground(Color.WHITE);
		panelProjects.setBounds(10, 126, 181, 69);
		frame.getContentPane().add(panelProjects);
		GridBagLayout gbl_panelProjects = new GridBagLayout();
		gbl_panelProjects.columnWidths = new int[]{70, 0, 0, 0, 0, 0, 0, 32, 0, 0, 0};
		gbl_panelProjects.rowHeights = new int[]{32, 0, 0, 0};
		gbl_panelProjects.columnWeights = new double[]{1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_panelProjects.rowWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
		panelProjects.setLayout(gbl_panelProjects);
		
		JLabel projectsTitle = new JLabel("Projetos");
		projectsTitle.setForeground(new Color(0, 153, 102));
		projectsTitle.setFont(new Font("Segoe UI", Font.BOLD, 18));
		GridBagConstraints gbc_projectsTitle = new GridBagConstraints();
		gbc_projectsTitle.insets = new Insets(0, 0, 5, 5);
		gbc_projectsTitle.gridx = 3;
		gbc_projectsTitle.gridy = 1;
		panelProjects.add(projectsTitle, gbc_projectsTitle);
		
		JLabel projectsAdd = new JLabel("");
		projectsAdd.setIcon(new ImageIcon("C:\\Users\\breno\\Documents\\Workspace\\todo-java\\resources\\add.png"));
		GridBagConstraints gbc_projectsAdd = new GridBagConstraints();
		gbc_projectsAdd.insets = new Insets(0, 0, 5, 5);
		gbc_projectsAdd.anchor = GridBagConstraints.WEST;
		gbc_projectsAdd.gridx = 6;
		gbc_projectsAdd.gridy = 1;
		panelProjects.add(projectsAdd, gbc_projectsAdd);
		
		JPanel panelListProjects = new JPanel();
		panelListProjects.setAlignmentY(Component.BOTTOM_ALIGNMENT);
		panelListProjects.setAlignmentX(Component.LEFT_ALIGNMENT);
		panelListProjects.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		panelListProjects.setBackground(Color.WHITE);
		panelListProjects.setBounds(10, 200, 181, 285);
		frame.getContentPane().add(panelListProjects);
		panelListProjects.setLayout(null);
		
		JList list = new JList();
		list.setFixedCellHeight(30);
		list.setBackground(new Color(255, 255, 255));
		list.setSelectionBackground(new Color(0, 153, 102));
		list.setModel(new AbstractListModel() {
			String[] values = new String[] {"item 1", "item 2"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		list.setToolTipText("");
		list.setFont(new Font("Segoe UI", Font.BOLD, 18));
		list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		list.setBounds(10, 11, 161, 263);
		panelListProjects.add(list);
		
		JPanel panel_4 = new JPanel();
		panel_4.setAlignmentX(Component.RIGHT_ALIGNMENT);
		panel_4.setAlignmentY(Component.BOTTOM_ALIGNMENT);
		panel_4.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		panel_4.setBackground(Color.WHITE);
		panel_4.setBounds(201, 200, 486, 285);
		frame.getContentPane().add(panel_4);
		panel_4.setLayout(null);
		
		JPanel panelEmptyList = new JPanel();
		panelEmptyList.setBackground(Color.WHITE);
		panelEmptyList.setBounds(10, 11, 466, 263);
		panel_4.add(panelEmptyList);
		panelEmptyList.setLayout(null);
		
		JLabel emptyListIcon = new JLabel("");
		emptyListIcon.setIcon(new ImageIcon("C:\\Users\\breno\\Documents\\Workspace\\todo-java\\resources\\lists.png"));
		emptyListIcon.setBounds(168, 50, 136, 136);
		panelEmptyList.add(emptyListIcon);
		
		emptyListTitle = new JLabel("Nenhuma tarefa por aqui :D");
		emptyListTitle.setForeground(new Color(0, 153, 102));
		emptyListTitle.setFont(new Font("Segoe UI", Font.BOLD, 14));
		emptyListTitle.setBounds(142, 197, 197, 20);
		panelEmptyList.add(emptyListTitle);
		
		JLabel emptyListSubTitle = new JLabel("Clique no botão \"+\" para adicionar uma tarefa");
		emptyListSubTitle.setForeground(UIManager.getColor("CheckBox.darkShadow"));
		emptyListSubTitle.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		emptyListSubTitle.setBounds(93, 220, 305, 20);
		panelEmptyList.add(emptyListSubTitle);
		
		JPanel panelTasks = new JPanel();
		panelTasks.setBackground(new Color(255, 255, 255));
		panelTasks.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		panelTasks.setForeground(new Color(60, 179, 113));
		panelTasks.setBounds(201, 126, 486, 69);
		frame.getContentPane().add(panelTasks);
		panelTasks.setLayout(new FormLayout(new ColumnSpec[] {
				FormSpecs.LABEL_COMPONENT_GAP_COLSPEC,
				ColumnSpec.decode("63px"),
				ColumnSpec.decode("32px"),
				FormSpecs.RELATED_GAP_COLSPEC,
				FormSpecs.DEFAULT_COLSPEC,
				FormSpecs.RELATED_GAP_COLSPEC,
				FormSpecs.DEFAULT_COLSPEC,
				FormSpecs.RELATED_GAP_COLSPEC,
				FormSpecs.DEFAULT_COLSPEC,
				FormSpecs.RELATED_GAP_COLSPEC,
				FormSpecs.DEFAULT_COLSPEC,
				FormSpecs.RELATED_GAP_COLSPEC,
				FormSpecs.DEFAULT_COLSPEC,
				FormSpecs.RELATED_GAP_COLSPEC,
				FormSpecs.DEFAULT_COLSPEC,
				FormSpecs.RELATED_GAP_COLSPEC,
				FormSpecs.DEFAULT_COLSPEC,
				FormSpecs.RELATED_GAP_COLSPEC,
				FormSpecs.DEFAULT_COLSPEC,
				FormSpecs.RELATED_GAP_COLSPEC,
				FormSpecs.DEFAULT_COLSPEC,
				FormSpecs.RELATED_GAP_COLSPEC,
				FormSpecs.DEFAULT_COLSPEC,
				FormSpecs.RELATED_GAP_COLSPEC,
				FormSpecs.DEFAULT_COLSPEC,
				FormSpecs.RELATED_GAP_COLSPEC,
				FormSpecs.DEFAULT_COLSPEC,
				FormSpecs.RELATED_GAP_COLSPEC,
				FormSpecs.DEFAULT_COLSPEC,
				FormSpecs.RELATED_GAP_COLSPEC,
				FormSpecs.DEFAULT_COLSPEC,
				FormSpecs.RELATED_GAP_COLSPEC,
				FormSpecs.DEFAULT_COLSPEC,
				FormSpecs.RELATED_GAP_COLSPEC,
				FormSpecs.DEFAULT_COLSPEC,},
			new RowSpec[] {
				FormSpecs.PARAGRAPH_GAP_ROWSPEC,
				RowSpec.decode("32px"),}));
		
		JLabel tasksTitle = new JLabel("Tarefas");
		tasksTitle.setFont(new Font("Segoe UI", Font.BOLD, 18));
		tasksTitle.setForeground(new Color(0, 153, 102));
		panelTasks.add(tasksTitle, "2, 2, left, center");
		
		JLabel tasksSubTitle = new JLabel("");
		tasksSubTitle.setAlignmentX(Component.RIGHT_ALIGNMENT);
		tasksSubTitle.setIcon(new ImageIcon("C:\\Users\\breno\\Documents\\Workspace\\todo-java\\resources\\add.png"));
		panelTasks.add(tasksSubTitle, "31, 2, 3, 1, right, center");
	}
	public Color getLblNewLabel_7Foreground() {
		return emptyListTitle.getForeground();
	}
	public void setLblNewLabel_7Foreground(Color foreground) {
		emptyListTitle.setForeground(foreground);
	}
}
