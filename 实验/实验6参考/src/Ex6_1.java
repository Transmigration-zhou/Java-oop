

import java.awt.*;

import javax.swing.JFrame;
public class Ex6_1 extends JFrame {
	static Ex6_1 frm=new Ex6_1();
	public  static void main(String args[]){
		frm.setLayout(new FlowLayout());
		frm.setTitle("AWT�����ʹ��");
		frm.setBackground(Color.white);
		frm.setSize(500,300);
		frm.add(new Label("�������: "));
		frm.add(new TextField(30));
		frm.add(new Label("�Ա�: "));
		CheckboxGroup cbg = new CheckboxGroup();
		frm.add(new Checkbox("��", cbg, true));
		frm.add(new Checkbox("Ů", cbg, false));
		frm.add(new Label("��ϲ����ˮ��: "));
		frm.add(new Checkbox("ƻ��"));
		frm.add(new Checkbox("����"));
		frm.add(new Checkbox("�㽶"));
		frm.add(new Checkbox("����"));
		frm.add(new Label("��ÿ�γԼ���ˮ��: "));
		Choice c = new Choice();
		c.addItem("����1��");
		c.addItem("1����3��");
		c.addItem("3������");
		frm.add(c);
		frm.add(new Label("����ó�ˮ����ʲô�ô�: "));
		TextArea ta = new TextArea("����Ϊ ", 3, 60,TextArea.SCROLLBARS_HORIZONTAL_ONLY);
		frm.add(ta);
		frm.add(new Button(" ȷ�� "));
		frm.add(new Button(" ��д "));
		frm.setVisible(true);
	}
}

