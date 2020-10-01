

import java.awt.*;

import javax.swing.JFrame;
public class Ex6_1 extends JFrame {
	static Ex6_1 frm=new Ex6_1();
	public  static void main(String args[]){
		frm.setLayout(new FlowLayout());
		frm.setTitle("AWT组件的使用");
		frm.setBackground(Color.white);
		frm.setSize(500,300);
		frm.add(new Label("你的名字: "));
		frm.add(new TextField(30));
		frm.add(new Label("性别: "));
		CheckboxGroup cbg = new CheckboxGroup();
		frm.add(new Checkbox("男", cbg, true));
		frm.add(new Checkbox("女", cbg, false));
		frm.add(new Label("你喜欢的水果: "));
		frm.add(new Checkbox("苹果"));
		frm.add(new Checkbox("桔子"));
		frm.add(new Checkbox("香蕉"));
		frm.add(new Checkbox("桃子"));
		frm.add(new Label("你每次吃几个水果: "));
		Choice c = new Choice();
		c.addItem("少于1个");
		c.addItem("1个到3个");
		c.addItem("3个以上");
		frm.add(c);
		frm.add(new Label("你觉得吃水果有什么好处: "));
		TextArea ta = new TextArea("我认为 ", 3, 60,TextArea.SCROLLBARS_HORIZONTAL_ONLY);
		frm.add(ta);
		frm.add(new Button(" 确定 "));
		frm.add(new Button(" 重写 "));
		frm.setVisible(true);
	}
}

