package week09;
//3
import java.awt.*;

public class PanelEx1{

	public PanelEx1(){
		Frame f = new Frame("Panel Test");
		Panel p1 = new Panel();
		Panel p2 = new Panel();

		f.setLayout(new GridLayout(2,1));
		p1.setBackground(Color.red);
		p2.setBackground(Color.yellow);
//		f.add(p1,BorderLayout.EAST);
		f.add(p1);
		f.add(p2);

		f.setSize(200, 400);
		f.setVisible(true);
	}
	public static void main(String[] args){
		new PanelEx1();
	}
}
