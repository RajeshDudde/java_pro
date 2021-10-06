import java.awt.*;
public class Canvase
{
public Canvase()
{
Frame f=new Frame("canvas");
f.add(new MyCanvas());
f.setLayout(null);
f.setSize(300,300);
f.setVisible(true);
}
public static void main(String args[])
{
new Canvase();
}
}
class MyCanvas extends Canvas
{
public MyCanvas()
{
setBackground(Color.BLUE);
setSize(250,250);
}
public void paint(Graphics g)
{
g.setColor(Color.green);
g.fillOval(75,75,50,50);
}
}