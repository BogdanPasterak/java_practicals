import java.awt.*;
import java.util.Calendar;
import java.util.Scanner;

import javax.swing.*;
import javax.swing.border.*;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.printf("-> %28.25f <-%n%04x%n", Math.PI, 11);
		Calendar c = Calendar.getInstance();
		System.out.printf("%te %tB %tY%n", c, c, c);
		//1. Create the frame.
		JFrame frame = new JFrame("FrameDemo");

		//2. Optional: What happens when the frame closes?
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setPreferredSize(new Dimension(600, 300));
		frame.setVisible(true);
		frame.setPreferredSize(new Dimension(600, 300));
		frame.pack();

		Insets inset = frame.getInsets();
		System.out.println(inset);

		//3. Create components and put them in the frame.
		//...create emptyLabel...
		JLabel hello = new JLabel(" Hello World ;-) ",JLabel.CENTER);
		hello.setBackground(Color.CYAN);
		hello.setOpaque(true);
		hello.setForeground(Color.BLUE);
		hello.setFont(new Font("Arial", Font.BOLD, 48));
		hello.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
		frame.add(hello, BorderLayout.CENTER);
		hello.setBounds(50 - inset.left, 50 - (inset.top + inset.bottom)/2, 500, 200);
		frame.setTitle("Sey \"Hello\"");
		//4. Size the frame.
		Scanner ask = new Scanner(System.in);
		System.out.print("Name : ");
		String name = ask.next();
		System.out.println("Hello " + name);
		System.out.print("Name : ");
		name = ask.next();
		System.out.println("Hello " + name);
		//5. Show it.
	}

}
