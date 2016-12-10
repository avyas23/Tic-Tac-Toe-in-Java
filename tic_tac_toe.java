import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class tic_tac_toe {
	int flag=0;
	Button b1, b2, b3, b4, b5, b6, b7, b8, b9, replay;
	private Label msg;
	tic_tac_toe()
	{
		Frame f= new Frame();
		
		f.addWindowListener(new WindowAdapter() {
	         public void windowClosing(WindowEvent windowEvent){
	            System.exit(0);
	         }        
	      });
		
		b1 = new Button();
		b2 = new Button();
		b3 = new Button();
		b4 = new Button();
		b5 = new Button();
		b6 = new Button();
		b7 = new Button();
		b8 = new Button();
		b9 = new Button();
		replay = new Button();
		
		Font myf = new Font("Courier", Font.BOLD, 24);

		Label lab = new Label();
		lab.setBounds(80, 50, 250, 30);
		lab.setText("Tic Tac Toe");
		lab.setFont(myf);
		lab.setAlignment(lab.CENTER);
		lab.setForeground(Color.MAGENTA);
		
		 msg = new Label();
		 msg.setBounds(80, 500, 250, 30);
		 msg.setText(" ");
		 msg.setFont(myf);
		 msg.setAlignment(lab.CENTER);
		 msg.setForeground(Color.MAGENTA);

		b1.setBounds(50, 110, 80, 80);
		b1.setBackground(Color.cyan);
		b1.setFont(myf);

		b2.setBounds(160, 110, 80, 80);
		b2.setBackground(Color.cyan);
		b2.setFont(myf);

		b3.setBounds(270, 110, 80, 80);
		b3.setBackground(Color.cyan);
		b3.setFont(myf);

		b4.setBounds(50, 220, 80, 80);
		b4.setBackground(Color.cyan);
		b4.setFont(myf);

		b5.setBounds(160, 220, 80, 80);
		b5.setBackground(Color.cyan);
		b5.setFont(myf);

		b6.setBounds(270, 220, 80, 80);
		b6.setBackground(Color.cyan);
		b6.setFont(myf);

		b7.setBounds(50, 330, 80, 80);
		b7.setBackground(Color.cyan);
		b7.setFont(myf);

		b8.setBounds(160, 330, 80, 80);
		b8.setBackground(Color.cyan);
		b8.setFont(myf);

		b9.setBounds(270, 330, 80, 80);
		b9.setBackground(Color.cyan);
		b9.setFont(myf);

		 

		replay = new Button("REPLAY");
		replay.setBounds(130, 440, 140, 50);
		replay.setBackground(Color.yellow);
		f.add(lab);
		f.add(msg);
		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(b4);
		f.add(b5);
		f.add(b6);
		f.add(b7);
		f.add(b8);
		f.add(b9);
		f.add(replay);
		
		b1.addActionListener(new ActionListener(){

			public void actionPerformed(ActionEvent e) {
				
				if(flag%2==0)
				{
				b1.setLabel("X");
				
				}
				else
				{
					b1.setLabel("O");
				
				}
				flag++;
				b1.setEnabled(false);
				Result();
			}
			
			
		});
		b2.addActionListener(new ActionListener(){

			public void actionPerformed(ActionEvent e) {
				

				if(flag%2==0)
				{
				b2.setLabel("X");
				
				}
				else
				{
					b2.setLabel("O");
				
				}
				flag++;
				b2.setEnabled(false);
				
			}
			
			
		});
		b3.addActionListener(new ActionListener(){

			public void actionPerformed(ActionEvent e) {
				
				if(flag%2==0)
				{
				b3.setLabel("X");
				
				}
				else
				{
					b3.setLabel("O");
				
				}
				flag++;
				b3.setEnabled(false);
				Result();
				
			}
			
			
		});
		
		b4.addActionListener(new ActionListener(){

			public void actionPerformed(ActionEvent e) {
				

				if(flag%2==0)
				{
				b4.setLabel("X");
				
				}
				else
				{
					b4.setLabel("O");
				
				}
				flag++;
				b4.setEnabled(false);
				Result();
			}
			
			
		});
		b5.addActionListener(new ActionListener(){

			public void actionPerformed(ActionEvent e) {
				

				if(flag%2==0)
				{
				b5.setLabel("X");
				
				}
				else
				{
					b5.setLabel("O");
				
				}
				flag++;
				b5.setEnabled(false);
				Result();
				
			}
			
			
		});
		b6.addActionListener(new ActionListener(){

			public void actionPerformed(ActionEvent e) {
				

				if(flag%2==0)
				{
				b6.setLabel("X");
				
				}
				else
				{
					b6.setLabel("O");
				
				}
				flag++;
				b6.setEnabled(false);
				Result();
			}
			
			
		});
		b7.addActionListener(new ActionListener(){

			public void actionPerformed(ActionEvent e) {
				

				if(flag%2==0)
				{
				b7.setLabel("X");
				
				}
				else
				{
					b7.setLabel("O");
				
				}
				flag++;
				b7.setEnabled(false);
				Result();
				
			}
			
			
		});
		b8.addActionListener(new ActionListener(){

			public void actionPerformed(ActionEvent e) {
				

				if(flag%2==0)
				{
				b8.setLabel("X");
				
				}
				else
				{
					b8.setLabel("O");
				
				}
				flag++;
				b8.setEnabled(false);
				Result();
				
			}
			
			
		});
		b9.addActionListener(new ActionListener(){

			public void actionPerformed(ActionEvent e) {
				

				if(flag%2==0)
				{
				b9.setLabel("X");
				
				}
				else
				{
					b9.setLabel("O");
				
				}
				flag++;
				b9.setEnabled(false);
				Result();
				
			}
			
			
		});
		replay.addActionListener(new ActionListener(){

			public void actionPerformed(ActionEvent e) {
				
				ReplayFunction();
				
			}
			
			
		});
		
		f.setSize(400,600);
		f.setLayout(null);
		f.setVisible(true);
		
	}
	public void ReplayFunction()
	{
		b1.setLabel(" ");
		b2.setLabel(" ");
		b3.setLabel(" ");
		b4.setLabel(" ");
		b5.setLabel(" ");
		b6.setLabel(" ");
		b7.setLabel(" ");
		b8.setLabel(" ");
		b9.setLabel(" ");
		b1.setEnabled(true);
		
		
		flag=0;
	}
	public static void main(String abc[])
	{
		new tic_tac_toe();
	}
	
	public void Result()
	{
		String s1=b1.getLabel().toString();
		String s2=b2.getLabel().toString();
		String s3=b3.getLabel().toString();
		String s4=b4.getLabel().toString();
		String s5=b5.getLabel().toString();
		String s6=b6.getLabel().toString();
		String s7=b7.getLabel().toString();
		String s8=b8.getLabel().toString();
		String s9=b9.getLabel().toString();
		
		if(s1.equals(s2) && s2.equals(s3) && !s2.equals(" "))
		{
			msg.setText(s1+" wins");
			//frame.setBackgorung(Color.white);
			ReplayFunction();
			
		}
		
	}
	
}
	