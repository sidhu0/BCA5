import java.awt.*;
import javax.swing.*;
public class MyJFrame extends JFrame
{
    MyJFrame(String s)
    { setTitle(s);
        setVisible( true );
        setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
    }
    public void paint(Graphics g) {
        g.setColor(Color.BLUE);
        g.drawLine(10, 100, 200, 300);

        g.drawString("Welcome to Graphics", 50,300);

// Rectangles and squares
        g.setColor(Color.red);
        g.drawRect(600, 100,50, 50);

// how to make a square?
        g.fillRect(600, 400, 100, 100);
        g.drawRoundRect(1100,100,100,100,80,80); //(x,y: starting pt, w, h,and w,h of round

// Drawing a Triangle. A Triangle is also a polygon
        int x[] = {0,150,300};
        int y[]= {200,40,200};
        g.drawPolygon(x,y,3);
        int xValues[] = {525, 645, 525, 645, 525};
        int yValues[] = {525, 525,700 , 700, 525};
        int points = 5;

//filled polygon
        g.fillPolygon(xValues, yValues, points);
        g.drawOval(100, 1000, 100, 100);//x1,y1: starting point, xradius and yradius
        g.fillOval(100, 400, 100, 100);

// changing the line styles
        Graphics2D g2d = (Graphics2D) g;
        g2d.setStroke(new BasicStroke(16));//solid line with thickness
        g.drawOval(300, 100, 150, 200);
        g.setColor(Color.CYAN);
        g.fillOval(300,400,150,200);

// draw an oval with more width
        g.setColor(Color.BLUE);
        g.drawOval(300,200, 400,180);
        g.drawArc(800,200,400,180,60, 180); //x,y of starting pt, w,h,starting angle,ending angle
        g.setColor(Color.green);
        g.fillArc(900,500,400,180,60, 180);
    }
    public static void main ( String[] args ) {
        new MyJFrame("My Graphics Drawing Java Frame");
    }
}