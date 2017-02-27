import java.awt.*;
import javax.swing.*;
import java.io.*;
import java.awt.event.*;
import java.net.*;
import java.util.*;
import java.awt.Color;
import java.awt.Component;
import java.awt.Frame;
import java.awt.Point;
import java.awt.Window;
import java.awt.geom.Point2D;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.*;
import javax.swing.*;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Image;
import java.awt.Insets;
import javax.swing.*;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Spring;
import javax.swing.SpringLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import javax.swing.JSplitPane;
public class conferrence  extends JFrame implements ActionListener
{
client cc;
GridBagConstraints gctc = new GridBagConstraints();
JFrame fx=new JFrame("HOME");
 JPanel px=new JPanel();
 DefaultListModel ab12 = new DefaultListModel();
 DefaultListModel ab1 = new DefaultListModel();
 JList list,listc;
 //JList list=new JList(ab1);
// JList listc=new JList(ab12);
 GridBagLayout layoutc = new GridBagLayout();
JTextField f1,f2,f3,ts;
JTextArea a1 ;
TextArea ar2,ar1,ar1c,ar2c;
String name;
Image iconc;
ImageIcon timage;
JButton bs,bs1,bsc,bs1c,bs1o;
 JMenuItem openItem,cItem;
 LinkedList ll;
String user;
conferrence(client x,String toadd,String user2)
{
this.cc=x;
this.user=user2;
conf();
show(toadd);
}
conferrence(client x,LinkedList l,String user2)
{
this.cc=x;
this.ll=l;
System.out.println("in ini in");
System.out.println(l);
this.user=user2;
conf();
show1();
}
public conferrence()
{
}
void imag()
{
timage=new ImageIcon("0617.png");
}

 
 void conf()
  {
    
    JFrame fc=new JFrame("HOME");
    fc.setSize(600,500);
   //  com.sun.awt.AWTUtilities.setWindowOpacity(fx, 0.7f);
    JPanel pc=new JPanel();

        pc.setLayout(layoutc);
        pc.setBackground(Color.black);
       // GridBagConstraints gctc = new GridBagConstraints();
        gctc.insets = new Insets(-60, -200, 3, 3);
        gctc.gridx = 2;
        gctc.gridy = 1;
          ar1c = new TextArea(14,45);
        ar1c.setForeground(Color.black);
        ar1c.setBackground(Color.white);
        ar1c.setFont(new Font("Arial Black", Font.BOLD, 15));
        pc.add(ar1c,gctc);

        gctc.insets = new Insets(-380, -430, 3, 3);
        gctc.gridx = 2;
        gctc.gridy = 1;
 bsc=new JButton("INVITE FRIEND");
        bsc.setFont(new Font("Arial Black", Font.BOLD, 12));
        bsc.setBackground(Color.orange);
        bsc.setForeground(Color.black);
        bsc.addActionListener(this);
       pc.add(bsc,gctc);
        gctc.insets = new Insets(280, -200, 3, 3);
        gctc.gridx = 2;
        gctc.gridy = 1;
          ar2c = new TextArea(1,45);
        ar2c.setForeground(Color.black);
        ar2c.setBackground(Color.white);
        ar2c.setFont(new Font("Arial Black", Font.BOLD, 15));
        pc.add(ar2c,gctc);
        gctc.insets = new Insets(390, -505, 3, 3);
        gctc.gridx = 2;
        gctc.gridy = 1;
         bs1c=new JButton("SEND");
        bs1c.setFont(new Font("Arial Black", Font.BOLD, 12));
        bs1c.setBackground(Color.orange);
        bs1c.setForeground(Color.black);
        bs1c.addActionListener(this);
        pc.add(bs1c,gctc);
     gctc.insets = new Insets(390, 505, 3, 3);
        gctc.gridx = 2;
        gctc.gridy = 1;
     bs1o=new JButton("OK");
        bs1o.setFont(new Font("Arial Black", Font.BOLD, 12));
        bs1o.setBackground(Color.orange);
        bs1o.setForeground(Color.black);
        bs1o.addActionListener(this);
        pc.add(bs1o,gctc);
        gctc.insets = new Insets(-325, 400, 3, 3);
        gctc.gridx = 2;
        gctc.gridy = 1;
        JLabel lsc=new JLabel("FRIEND LIST");
        lsc.setFont(new Font("Arial Black", Font.BOLD, 15));
        lsc.setBackground(Color.white);
        lsc.setForeground(Color.white);
        pc.add(lsc,gctc);
        gctc.insets = new Insets(-120, 350, 3, 3);
        gctc.gridx = 2;
        gctc.gridy = 1;
        /* ab1c.addElement( "ALI" );
         ab1c.addElement( "IMRAN" );
         ab1c.addElement( "FAISAL" );
         ab1c.addElement( "HASSAN" );
         ab1c.addElement( "SIR SAQLAIN" );
         ab1c.addElement( "IRFAN" );
         ab1c.addElement( "SIR IMRAN" );
          ab1c.addElement( "SIR SHEHZAD ASHRAF" ); */
         list=new JList(ab1);
         list.setBackground(Color.black);
        list.setForeground(Color.WHITE);
            //listc.addListSelectionListener(this);
        list.setSelectedIndex(0);
        pc.add(list,gctc);
    gctc.insets = new Insets(-120, 410, 3, 3);
        gctc.gridx = 2;
        gctc.gridy = 1;
        /* ab1c.addElement( "ALI" );
         ab1c.addElement( "IMRAN" );
         ab1c.addElement( "FAISAL" );
         ab1c.addElement( "HASSAN" );
         ab1c.addElement( "SIR SAQLAIN" );
         ab1c.addElement( "IRFAN" );
         ab1c.addElement( "SIR IMRAN" );
          ab1c.addElement( "SIR SHEHZAD ASHRAF" ); */
         listc=new JList(ab12);
         listc.setBackground(Color.black);
        listc.setForeground(Color.WHITE);
            //listc.addListSelectionListener(this);
        listc.setSelectedIndex(0);
        pc.add(listc,gctc);
        fc.setIconImage(iconc);
        fc.setContentPane(pc);
        fc.setVisible(true);
    //imag();
    //ab1.addElement(timage);
    //ab12.addElement("ALI");
}
void show(String toadd)
{
imag();
ab1.addElement(timage);
ab12.addElement(toadd);
}
void throw_message(String message)
{
ar1c.setText(message);
}
void show1()
{
ListIterator l=ll.listIterator();
while(l.hasNext())
{
System.out.println("i am in show1");
String p=(String)l.next();
System.out.println(p);
imag();
ab1.addElement(timage);
ab12.addElement(p);
}
//ab12.addElement("ali");
}
void set(String s)
{
ar1.setText(s);
}
void remove(String toremove)
{
int index= ab12.indexOf(toremove);
ab12.removeElement(toremove);
ab1.removeElementAt(index);

}
public void actionPerformed(ActionEvent ae)
{
if(ae.getSource()==bs1o)
{
System.out.println("faisalajbhj");
  bsc.setVisible(false);
}
if(ae.getSource()==bsc)
{
  String name = ab12.getElementAt(listc.getSelectedIndex()).toString();
System.out.println(name);
String temp=user;
cc.sendmessage(temp,"9"+name);
}
else if(ae.getSource()==bs1c)
{
System.out.println("sdsdsdsd");
//ab12.addElement("ali");
String name = ab12.getElementAt(listc.getSelectedIndex()).toString();
System.out.println(name);
String message=ar2c.getText();
System.out.println(message);
String z="7"+user+" "+"says to "+name+" "+">>"+message;
ar1c.setText(z);
cc.sendmessage(user,z);
}
}
public static void main(String args[])
{
conferrence obj=new conferrence();
obj.conf();
}  
}