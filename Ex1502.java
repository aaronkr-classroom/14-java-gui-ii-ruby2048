import javax.swing.*;

public class Ex1502 extends JFrame {
	
	public Ex1502() {
		setTitle("메뉴 만들기");
		setSize(400, 200);
		
		JMenuBar menuBar = new JMenuBar();
		JMenu m1 = new JMenu("File");
		JMenu m2 = new JMenu("Edit");
		JMenu m3 = new JMenu("Help");
		menuBar.add(m1);
		menuBar.add(m2);
		menuBar.add(m3);
		
		JMenuItem mf1 = new JMenuItem("New");
		JMenuItem mf2 = new JMenuItem("Ofen");
		m1.add(mf1);
		m1.add(mf2);
		
		JMenuItem m21 = new JMenuItem("Copy");
		JMenuItem m22 = new JMenuItem("Paste");
		m2.add(m21);
		m2.add(m22);
		
		setJMenuBar(menuBar);
		
		setLayout(null);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Ex1502();
	}
}