import java.awt.*;
import java.awt.event.*;
import java.applet.*;
/*<applet code="awt.class" width=300 height=300></applet>*/
public class awt extends Frame implements ActionListener{
TextField t1,t2,t3;
Button b1,b2,b3,b4;
awt()
{
t1=new TextField();t1.setBounds(20,50,100,20);
t2=new TextField();t2.setBounds(20,100,100,20);
t3=new TextField();t3.setBounds(20,150,100,20);t3.setEditable(false);
b1=new Button("add");
b1.setBounds(20,200,50,50);
b2=new Button("sub");
b2.setBounds(80,200,50,50);
b3=new Button("mul");
b3.setBounds(140,200,50,50);
b4=new Button("div");
b4.setBounds(200,200,50,50);
b1.addActionListener(this);b2.addActionListener(this);
b3.addActionListener(this);b4.addActionListener(this);
add(t1);add(t2);add(t3);add(b1);add(b2);add(b3);add(b4);
setSize(350,350);setLayout(null);
setVisible(true);
}
public void actionPerformed(ActionEvent e){
String s1=t1.getText();
String s2=t2.getText();
int a=Integer.parseInt(s1);
int b=Integer.parseInt(s2);
int c=0;
if(e.getSource()==b1){
c=a+b;
}
else if(e.getSource()==b2){
c=a-b;
}
else if(e.getSource()==b3){
c=a*b;
}
else if(e.getSource()==b4){
c=a%b;
}
String sr=String.valueOf(c);
t3.setText(sr);
}
public static void main(String args[])
{
new awt();
}
}
