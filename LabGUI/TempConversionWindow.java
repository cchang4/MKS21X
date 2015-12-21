//will make it functional later!! gah sorry i never finish things on time.....

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TempConversionWindow extends JFrame implements ActionListener{
    private Container pane;
    private JButton b, b2;
    private JLabel l;
    private JTextField t;

    public TempConversionWindow(){
	this.setTitle("Temperature Converter");
	this.setSize(600,400);
	//	this.setLocation(100,100);
	this.setDefaultCloseOperation(EXIT_ON_CLOSE);

	pane = this.getContentPane();
	pane.setLayout(new GridLayout(4, 1));

	b = new JButton("\u00b0"+ "C to "+ "\u00b0"+ "F");
	b.addActionListener(this);
	b.setActionCommand(" F");
	b2 = new JButton("\u00b0" +"F to "+ "\u00b0" +"C");
	b2.addActionListener(this);
	b2.setActionCommand(" C");
	l = new JLabel("Convert any number into Farenheit or Celsius!",
		       null,JLabel.CENTER);
	t = new JTextField();
	t.setHorizontalAlignment(JTextField.CENTER);

	pane.add(t);
	pane.add(b);
	pane.add(b2);
	pane.add(l);
    }

    public void actionPerformed(ActionEvent e){
	String event = e.getActionCommand();
	if(event.equals(" F")){
	    try{
		String s = t.getText();
		double d = Double.parseDouble(s) * (9.0 / 5.0) + 32.0;
		l.setText(String.valueOf(d) + "\u00b0" +"F");
	    } catch (NumberFormatException nfe) {
		l.setText("Enter a number");
	    }
	}
	if(event.equals(" C")){
	    try{
		String s = t.getText();
		double d = (Double.parseDouble(s) - 32.0) * (5.0 / 9.0);
		l.setText(String.valueOf(d) + "\u00b0" +"C");
	    } catch (NumberFormatException nfe) {
		l.setText("Enter a number");
    
	    }
	}
    }


    
}
