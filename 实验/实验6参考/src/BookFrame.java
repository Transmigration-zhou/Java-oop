import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;
import java.util.Map;

import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import javax.swing.JFrame;

public class BookFrame extends JFrame {

	private JComboBox comboBox;
	private JTextField days,fk;
	private JTextField BookTypeId;
	private JTable table;
	private String[] array;
	private String[] columnNames={ "ͼ�������", "ͼ���������", "�ɽ�����","����"};
	DefaultComboBoxModel bookTypeModel;
	DefaultTableModel model;
	Map map;

	private Object[][] getFileStates(){
		Object[][] results={
				new Object[] { "1", "qaz", "30",  "3" },
				new Object[] { "2", "wsx", "40",  "4"},
				new Object[] { "3", "edc", "50",  "5" }
		};
		return results;
	}
	
	public BookFrame() {
		super();
		setTitle("ͼ������޸�");
		setBounds(100, 100, 500, 350);
		final JPanel panel = new JPanel();
		panel.setLayout(new BorderLayout());
		this.getContentPane().add(panel, BorderLayout.NORTH);
		final JLabel logoLabel = new JLabel();
		
		ImageIcon bookTypeModiAndDelIcon=CreatecdIcon.add("res/book.jpg");
		logoLabel.setIcon(bookTypeModiAndDelIcon);
		
		logoLabel.setPreferredSize(new Dimension(400, 80));
		logoLabel.setText("logo");
		panel.add(logoLabel);

		final JPanel panel_1 = new JPanel();
		getContentPane().add(panel_1,BorderLayout.CENTER);
		panel_1.setLayout(new BorderLayout());

		final JScrollPane scrollPane = new JScrollPane();
		scrollPane.setPreferredSize(new Dimension(400, 130));
		panel_1.add(scrollPane,BorderLayout.NORTH);

		model=new DefaultTableModel();
		Object[][] results=getFileStates();
		model.setDataVector(results,columnNames);
		table = new JTable();
		table.setModel(model);
		table.addMouseListener(new TableListener());
		scrollPane.setViewportView(table);
			

		final JPanel panel_2 = new JPanel();
		panel_1.add(panel_2,BorderLayout.CENTER);
		final GridLayout gridLayout = new GridLayout(0, 6);
		gridLayout.setVgap(5);
		gridLayout.setHgap(5);
		panel_2.setLayout(gridLayout);
		panel_2.setPreferredSize(new Dimension(400, 43));

		final JLabel label = new JLabel();
		label.setText("����ţ�");
		panel_2.add(label);

		BookTypeId = new JTextField();
		BookTypeId.setFocusable(false);
		panel_2.add(BookTypeId);

		final JLabel label_1 = new JLabel();
		label_1.setText("������ƣ�");
		panel_2.add(label_1);
		
	
		comboBox = new JComboBox();
		bookTypeModel= (DefaultComboBoxModel)comboBox.getModel();
		

		for(int i=0;i<3;i++){
			bookTypeModel.addElement(i);
		}
		panel_2.add(comboBox);

		final JLabel label_2 = new JLabel();
		label_2.setText("�ɽ�������");
		panel_2.add(label_2);

		days = new JTextField();
		panel_2.add(days);
		
		final JLabel label_3 = new JLabel();
		label_3.setText("���");
		panel_2.add(label_3);
		
		fk = new JTextField();
		panel_2.add(fk);
		
		final JPanel panel_4 = new JPanel();
		panel_1.add(panel_4,BorderLayout.SOUTH);

		final JButton buttonMod = new JButton();
		buttonMod.setText("�޸�");
		panel_4.add(buttonMod);

		final JButton buttonExit = new JButton();
		buttonExit.setText("�˳�");
		buttonExit.addActionListener(new CloseActionListener());
		panel_4.add(buttonExit);
		setVisible(true);
		//
		
	}
	class TableListener extends MouseAdapter {
		public void mouseClicked(final MouseEvent e) {	
			int selRow = table.getSelectedRow();
			BookTypeId.setText(table.getValueAt(selRow, 0).toString().trim());
			bookTypeModel.setSelectedItem(table.getValueAt(selRow, 1).toString().trim());
			days.setText(table.getValueAt(selRow, 2).toString().trim());
			fk.setText(table.getValueAt(selRow, 3).toString().trim());
		}
	}

	class CloseActionListener implements ActionListener {			// ��ӹرհ�ť���¼�������
		public void actionPerformed(final ActionEvent e) {
			System.exit(0);
		}
	}

    public static void main(String[] args) {
        new BookFrame();
    }
}
