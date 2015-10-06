// Lab04Bst.java
// The Expo Graphics Program
// This is the student, starting version, of Lab 04B.


import java.awt.*;
import java.applet.*;


public class Lab04Bst extends Applet
{

	public void paint(Graphics g)
	{
		// DRAW CUBE
		Expo.drawRectangle(g,100,200,300,400);
		Expo.drawRectangle(g,150,250,350,450);
		Expo.drawLine(g,100,200,150,250);
		Expo.drawLine(g,300,400,350,450);
		Expo.drawLine(g,300,200,350,250);
		Expo.drawLine(g,100,400,150,450);
		
		





		// DRAW TARGET
		Expo.drawCircle(g,800,300,125);//biggest
		Expo.drawCircle(g,800,300,100);//second biggest
		Expo.drawCircle(g,800,300,75);//third biggest
		Expo.drawCircle(g,800,300,50);//second smallest
		Expo.drawCircle(g,800,300,25);//smallest
	






		// DRAW TRIANGLE
		Expo.drawLine(g,600,450,680,650);//right side
		Expo.drawLine(g,680,650,520,650);//bottom line
		Expo.drawLine(g,520,650,600,450);//left side
		Expo.drawLine(g,680,650,555,560);//slash
		Expo.drawLine(g,600,450,600,650);//center line
		Expo.drawLine(g,520,650,645,560);//slash






		// DRAW SMILEY FACE
		Expo.drawOval(g,250,700,120,170);//oval
		Expo.drawCircle(g,210,630,20);//left eye
		Expo.drawCircle(g,290,630,20);//right eye
		Expo.drawPoint(g,210,630);//pupil left
		Expo.drawPoint(g,290,630);//pupil right
		Expo.drawArc(g,210,620,25,20,260,90);//left eyebrow
		Expo.drawArc(g,290,620,25,20,260,90);//right eyebrow 
		Expo.drawArc(g,250,740,100,50,90,260);//mouth 






		// DRAW JPII
		//Expo.drawLine(g,800,600,800,900);
		//Expo.drawLine(g,800,600,1000,600);//top E line
		//Expo.drawLine(g,1000,600,1000,650);
		//Expo.drawLine(g,1000,650,875,650);
		//Expo.drawLine(g,875,650,875,750);
		//Expo.drawLine(g,875,750,975,750);
		//Expo.drawLine(g,975,750
		
		






	}
}


