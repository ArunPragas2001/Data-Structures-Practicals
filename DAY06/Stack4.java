import java.awt.*;
import javax.swing.*;
public class GraphicElements extends JFrame{


 GraphicElements()
 {
	 
  setTitle("Frame");	
  setSize(800,500);
  setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  setLocationRelativeTo(null);
  setVisible(true);
  
 }
 public void paint(Graphics g)
 {
	 
	g.setColor(Color.green);
    g.drawLine(40,50,500,250);//x1,y1,x2,y2
	
	
	g.setColor(Color.red);
	g.drawString("hi",200,150);
	
	g.setColor(Color.blue);
    g.drawRect(50,50,200,300);
	g.fillRect(50,50,200,300);
	
	
	g.setColor(Color.red);
    g.drawOval(100,100,200,300);
	g.fillOval(100,100,200,300);
	
	
	
	 
	 
 }

public static void main(String[]args) 
		
	 {
		new GraphicElements(); 
		 
	 }
	 
	 
	 
	 
	 
 }	

