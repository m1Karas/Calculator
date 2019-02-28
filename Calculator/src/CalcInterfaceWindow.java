import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JTextPane;


public class CalcInterfaceWindow 
{

	private JFrame CalculatorWindow;
	private JTextField EntryField;
	
	public int operationType;
	public int x;
	public int y;
	
	public double CalcArray[];

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) 
	{
		EventQueue.invokeLater(new Runnable() 
		{
			public void run() 
			{
				try 
				{
					CalcInterfaceWindow window = new CalcInterfaceWindow();
					window.CalculatorWindow.setVisible(true);
				} 
				
				catch (Exception e) 
				{
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public CalcInterfaceWindow() 
	{
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() 
	{
		CalculatorWindow = new JFrame();
		CalculatorWindow.setResizable(false);
		CalculatorWindow.setBounds(100, 100, 546, 456);
		CalculatorWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		CalculatorWindow.getContentPane().setLayout(null);
		
		
		
		JButton BtnOne = new JButton("1");
		BtnOne.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent arg0) 
			{
				String entry = EntryField.getText();
				EntryField.setText(entry + "1");
				
			}
		});
		BtnOne.setBounds(55, 124, 62, 58);
		CalculatorWindow.getContentPane().add(BtnOne);
		
		JButton BtnTwo = new JButton("2");
		BtnTwo.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent arg0) 
			{
				String entry = EntryField.getText();
				EntryField.setText(entry + "2");
			}
		});
		BtnTwo.setBounds(55, 194, 62, 61);
		CalculatorWindow.getContentPane().add(BtnTwo);
		
		JButton BtnThree = new JButton("3");
		BtnThree.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent arg0) 
			{
				String entry = EntryField.getText();
				EntryField.setText(entry + "3");
			}
		});
		BtnThree.setBounds(55, 267, 62, 61);
		CalculatorWindow.getContentPane().add(BtnThree);
		
		JButton BtnFour = new JButton("4");
		BtnFour.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent arg0) 
			{
				String entry = EntryField.getText();
				EntryField.setText(entry + "4");
			}
		});
		BtnFour.setBounds(129, 123, 62, 61);
		CalculatorWindow.getContentPane().add(BtnFour);
		
		JButton BtnFive = new JButton("5");
		BtnFive.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				String entry = EntryField.getText();
				EntryField.setText(entry + "5");
			}
		});
		BtnFive.setBounds(129, 194, 62, 61);
		CalculatorWindow.getContentPane().add(BtnFive);
		
		JButton BtnSix = new JButton("6");
		BtnSix.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				String entry = EntryField.getText();
				EntryField.setText(entry + "6");
			}
		});
		BtnSix.setBounds(129, 267, 62, 61);
		CalculatorWindow.getContentPane().add(BtnSix);
		
		JButton BtnSeven = new JButton("7");
		BtnSeven.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				String entry = EntryField.getText();
				EntryField.setText(entry + "7");
			}			
		});
		BtnSeven.setBounds(203, 123, 62, 61);
		CalculatorWindow.getContentPane().add(BtnSeven);
		
		JButton BtnEight = new JButton("8");
		BtnEight.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				String entry = EntryField.getText();
				EntryField.setText(entry + "8");
			}
		});
		BtnEight.setBounds(203, 194, 62, 61);
		CalculatorWindow.getContentPane().add(BtnEight);
		
		JButton BtnNine = new JButton("9");
		BtnNine.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				String entry = EntryField.getText();
				EntryField.setText(entry + "9");
			}
		});
		BtnNine.setBounds(203, 267, 62, 61);
		CalculatorWindow.getContentPane().add(BtnNine);
		
		JButton BtnAdd = new JButton("+"); // Addition
		BtnAdd.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				String entry = EntryField.getText();
				EntryField.setText(entry + "+");
				
			}
		});
		BtnAdd.setBounds(277, 267, 62, 61);
		CalculatorWindow.getContentPane().add(BtnAdd);
		
		JButton BtnSubtract = new JButton("-"); //Subtraction
		BtnSubtract.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				String entry = EntryField.getText();
				EntryField.setText(entry + "-");
			}
		});
		BtnSubtract.setBounds(277, 194, 62, 61);
		CalculatorWindow.getContentPane().add(BtnSubtract);
		
		JButton BtnLeftBracket = new JButton("(");
		BtnLeftBracket.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				String entry = EntryField.getText();
				EntryField.setText(entry + "(");
			}
		});
		BtnLeftBracket.setBounds(277, 123, 62, 61);
		CalculatorWindow.getContentPane().add(BtnLeftBracket);
		
		JButton BtnZero = new JButton("0");
		BtnZero.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				String entry = EntryField.getText();
				EntryField.setText(entry + "0");
			}
		});
		BtnZero.setBounds(55, 340, 136, 61);
		CalculatorWindow.getContentPane().add(BtnZero);
		
		JButton BtnDecimal = new JButton(".");
		BtnDecimal.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				String entry = EntryField.getText();
				EntryField.setText(entry + ".");
			}
		});
		BtnDecimal.setBounds(203, 340, 62, 61);
		CalculatorWindow.getContentPane().add(BtnDecimal);
		
		JButton BtnExponant = new JButton("^"); //Exponent
		BtnExponant.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				String entry = EntryField.getText();
				EntryField.setText(entry + "^");
			}
		});
		BtnExponant.setBounds(277, 340, 62, 61);
		CalculatorWindow.getContentPane().add(BtnExponant);
		
		JButton BtnEqual = new JButton("="); //Gives the answer
		BtnEqual.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				String entry = EntryField.getText();
				
				
			}
		});
		BtnEqual.setBounds(425, 267, 62, 134);
		CalculatorWindow.getContentPane().add(BtnEqual);
		
		JButton BtnRightBracket = new JButton(")");
		BtnRightBracket.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				String entry = EntryField.getText();
				EntryField.setText(entry + ")");
			}
		});
		BtnRightBracket.setBounds(351, 123, 62, 61);
		CalculatorWindow.getContentPane().add(BtnRightBracket);
		
		JButton BtnDivision = new JButton("/"); //Division
		BtnDivision.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				
			}
		});
		BtnDivision.setBounds(351, 194, 62, 61);
		CalculatorWindow.getContentPane().add(BtnDivision);
		
		JButton BtnMultiply = new JButton("x"); //Multiplication
		BtnMultiply.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				String entry = EntryField.getText();
				EntryField.setText(entry + "*");
			}
		});
		BtnMultiply.setBounds(351, 267, 62, 61);
		CalculatorWindow.getContentPane().add(BtnMultiply);
		
		JButton BtnSqrRt = new JButton("√"); //Square
		BtnSqrRt.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				String entry = EntryField.getText();
				EntryField.setText(entry + "√(");
			}
		});
		BtnSqrRt.setBounds(351, 340, 62, 61);
		CalculatorWindow.getContentPane().add(BtnSqrRt);
		
		EntryField = new JTextField();
		EntryField.setBounds(55, 12, 432, 100);
		CalculatorWindow.getContentPane().add(EntryField);
		EntryField.setColumns(10);
		
		JButton BtnClear = new JButton("C"); //Clear
		BtnClear.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				EntryField.setText("");
			}
		});
		BtnClear.setBounds(425, 121, 62, 134);
		CalculatorWindow.getContentPane().add(BtnClear);
	}
}
