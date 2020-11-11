package week09;
//1
import javax.swing.*;

public class MyFrame extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public MyFrame(){
		setTitle("Let's study Java");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 200);
		setVisible(true);
	}
	public static void main(String[] args){
		new MyFrame();
	}
}
