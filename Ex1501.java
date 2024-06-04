import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Ex1501 extends JFrame {
	
	public Ex1501() {
		setTitle("이벤트 처리");
		setSize(400, 200);
		
		JPanel panel = new JPanel();
		add(panel);
		
		JButton button = new JButton("버튼을 누르세요.");
		panel.add(button);
		
		button.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JButton button = (JButton) e.getSource();
				button.setText("버튼이 눌렸습니다!~");
			}
		});
		setVisible(true);
	}

	public static void main(String[] args) {
		new Ex1501();
	}
}