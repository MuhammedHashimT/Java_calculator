package Com.farrago;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Calc implements ActionListener{
	JFrame jf ;
	JLabel dispalyLabel ;
	JButton sevenB;
	JButton eightB;
	JButton nineB;
	JButton addB;
	JButton fourB;
	JButton fiveB;
	JButton sixB;
	JButton minusB;
	JButton oneB;
	JButton twoB;
	JButton threeB;
	JButton multB;
	JButton zeroB;
	JButton decimalB;
	JButton equalB;
	JButton divB,clearB,delB;
	String FistValue;
	String LastValue;
	String Operator;
	
	public Calc() {
		jf =new JFrame("Calculator");
		jf.setLayout(null);
		jf.setSize(600,520);
		jf.setLocation(400,100);
		
		dispalyLabel = new JLabel("	 ");
		dispalyLabel.setBounds(50,20,400,50);
		dispalyLabel.setBackground(Color.gray);
		dispalyLabel.setOpaque(true);
		dispalyLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		dispalyLabel.setForeground(Color.white);
		jf.add(dispalyLabel);
		
//		ROW ONE
		sevenB = new JButton("7");
		sevenB.setBounds(50,100,80,80);
		sevenB.addActionListener(this);
		jf.add(sevenB);
		
		eightB = new JButton("8");
		eightB.setBounds(150,100,80,80);
		eightB.addActionListener(this);
		jf.add(eightB);
		
		nineB = new JButton("9");
		nineB.setBounds(250,100,80,80);
		nineB.addActionListener(this);
		jf.add(nineB);
		
		addB = new JButton("+");
		addB.setBounds(370,100,80,80);
		addB.addActionListener(this);
		jf.add(addB);	
		
//		ROW TWO
		fourB = new JButton("4");
		fourB.setBounds(50,200,80,80);
		fourB.addActionListener(this);
		jf.add(fourB);
		
		fiveB = new JButton("5");
		fiveB.setBounds(150,200,80,80);
		fiveB.addActionListener(this);
		jf.add(fiveB);
		
		sixB = new JButton("6");
		sixB.setBounds(250,200,80,80);
		sixB.addActionListener(this);
		jf.add(sixB);
		
		minusB = new JButton("-");
		minusB.setBounds(370,200,80,80);
		minusB.addActionListener(this);
		jf.add(minusB);
		
//		ROW THREE
		oneB = new JButton("1");
		oneB.setBounds(50,300,80,80);
		oneB.addActionListener(this);
		jf.add(oneB);
		
		twoB = new JButton("2");
		twoB.setBounds(150,300,80,80);
		twoB.addActionListener(this);
		jf.add(twoB);
		
		threeB = new JButton("3");
		threeB.setBounds(250,300,80,80);
		threeB.addActionListener(this);
		jf.add(threeB);
		

		multB = new JButton("x");
		multB.setBounds(370,300,80,80);
		multB.addActionListener(this);
		jf.add(multB);
		
//		ROW FOUR
		zeroB = new JButton("0");
		zeroB.setBounds(50,400,80,80);
		zeroB.addActionListener(this);
		jf.add(zeroB);
		
		decimalB = new JButton(".");
		decimalB.setBounds(150,400,80,80);
		decimalB.addActionListener(this);
		jf.add(decimalB);
		
		equalB = new JButton("=");
		equalB.setBounds(250,400,80,80);
		equalB.addActionListener(this);
		jf.add(equalB);
		
		divB = new JButton("/");
		divB.setBounds(370,400,80,80);
		divB.addActionListener(this);
		jf.add(divB);

//		LAST COLEMN
		clearB = new JButton("Clear");
		clearB.setBounds(470,400,80,80);
		clearB.addActionListener(this);
		jf.add(clearB);
		
		delB = new JButton("Del");
		delB.setBounds(470,300,80,80);
		delB.addActionListener(this);
		jf.add(delB);
		
		
		
		
		jf.setVisible(true);jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
	public static void main(String[] args) {
		new Calc();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == sevenB) {
			dispalyLabel.setText(dispalyLabel.getText()+"7");
		}else if(e.getSource() == eightB) {
			dispalyLabel.setText(dispalyLabel.getText()+"8");
		}else if(e.getSource() == nineB) {
			dispalyLabel.setText(dispalyLabel.getText()+"9");
		}else if(e.getSource() == fourB) {
			dispalyLabel.setText(dispalyLabel.getText()+"4");
		}else if(e.getSource() == fiveB) {
			dispalyLabel.setText(dispalyLabel.getText()+"5");
		}else if(e.getSource() == sixB) {
			dispalyLabel.setText(dispalyLabel.getText()+"6");
		}else if(e.getSource() == oneB) {
			dispalyLabel.setText(dispalyLabel.getText()+"1");
		}else if(e.getSource() == twoB) {
			dispalyLabel.setText(dispalyLabel.getText()+"2");
		}else if(e.getSource() == threeB) {
			dispalyLabel.setText(dispalyLabel.getText()+"3");
		}else if(e.getSource() == zeroB) {
			dispalyLabel.setText(dispalyLabel.getText()+"0");
		}else if(e.getSource() == decimalB) {
			dispalyLabel.setText(dispalyLabel.getText()+".");
		}else if(e.getSource() == clearB) {
			dispalyLabel.setText("");
		}else if(e.getSource() == delB) {
			try {
			dispalyLabel.setText(dispalyLabel.getText().substring(0 , dispalyLabel.getText().length() - 1));
			}catch (Exception e1) {
				dispalyLabel.setText("");
			}
		}else if(e.getSource() == addB) {
			FistValue = dispalyLabel.getText();
			Operator = "+";
			dispalyLabel.setText("");
		}else if(e.getSource() == minusB) {
			FistValue = dispalyLabel.getText();
			Operator = "-";
			dispalyLabel.setText("");
		}else if(e.getSource() == multB) {
			FistValue = dispalyLabel.getText();
			Operator = "*";
			dispalyLabel.setText("");
		}else if(e.getSource() == divB) {
			FistValue = dispalyLabel.getText();
			Operator = "/";
			dispalyLabel.setText("");
		}else if(e.getSource() == equalB) {
			LastValue = dispalyLabel.getText();
			switch (Operator) {
			case "+": {
				dispalyLabel.setText((Float.parseFloat(FistValue)+Float.parseFloat(LastValue)+""));
				break;
			}case "-":{
				dispalyLabel.setText((Float.parseFloat(FistValue)-Float.parseFloat(LastValue)+""));
				break;
			}case "*": {
				dispalyLabel.setText((Float.parseFloat(FistValue)*Float.parseFloat(LastValue)+""));
				break;
			}case "/":{
				dispalyLabel.setText((Float.parseFloat(FistValue)/Float.parseFloat(LastValue)+""));
				break;
			}
			default:	
				throw new IllegalArgumentException("Unexpected value: " + Operator);
			}
		}
		
	}
	
}
