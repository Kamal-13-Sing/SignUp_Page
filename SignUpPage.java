package form;

import java.awt.*;
import java.awt.event.*;

public class SignUpPage extends ConnectionJDBC{
	String usernamel;
	String pass ;
	
	
	public static void main(String[] args) {
		SignUpPage lg = new SignUpPage();
		Frame f = new Frame("Login Frame");
		
		
		f.setSize(400,500);
		f.setLayout(null);
		f.setVisible(true);
		
	//--------------------closing window-----------------------
		f.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
//-------------------------Heading----------------------
		Label lbc = new Label("*Create New Account*");
		lbc.setBounds(80,50,210,25);
		lbc.setFont(new Font("Arial",Font.BOLD,20));
		f.add(lbc);
		
	//--------------------------Login page----------------------------
		Label lbn = new Label("UserName: ");
		lbn.setBounds(50,120,100,25);	
		lbn.setFont(new Font("Arial",Font.BOLD,15));
		f.add(lbn);
		
		Label lbp = new Label("Password: ");
		lbp.setBounds(50,170,100,25);	
		lbp.setFont(new Font("Arial",Font.BOLD,15));
		f.add(lbp);
		
		TextField tfn = new TextField();
		tfn.setBounds(150,120,150,25);
		f.add(tfn);
		
		TextField tfp = new TextField();
		tfp.setBounds(150,170,150,25);
		f.add(tfp);
		
		
	//-------------------------Submit Button----------------------------
		Button btn = new Button("Sign_In");
		btn.setBounds(150,220,80,30);
		btn.setFont(new Font("Arial",Font.BOLD,15));
		btn.setBackground(Color.green);
		f.add(btn);
		
	//--------------------Result--------------------------
		Label lbr = new Label();
		lbr.setBounds(50,260,250,25);
		lbr.setFont(new Font("Arial",Font.BOLD,15));
		f.add(lbr);
		
	//---------------------send value to LoginPage Class-------------------
		
	//-------------condition for button----------------------
		
			
	btn.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			
			if(tfn.getText().equals("") || tfp.getText().equals("")){
						
				Label lbnt = new Label("***Required both field***");
				lbnt.setBounds(100,90,200,25);
				f.add(lbnt);
				lbr.setText("");
						
			}else {
				//String username = tfn.getText();
				//String pass = tfp.getText();
				//lg.data(username, pass);
				
				String result = lg.data(tfn.getText(), tfp.getText());
				
				lbr.setText(result);
				
				tfn.setText("");
				tfp.setText("");
				
				}
			}
		});
	
	
	}

}
