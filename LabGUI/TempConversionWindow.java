//will make it functional later!! gah sorry i never finish things on time.....

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TempConversionWindow extends JFrame{
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

	b = new JButton("C to F");
	b2 = new JButton("F to C");
	l = new JLabel("",null,JLabel.CENTER);
	t = new JTextField(3);

	pane.add(t);
	pane.add(b);
	pane.add(b2);
	pane.add(l);
    }


    
}
