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

public class client extends JFrame implements Runnable ,ActionListener,ListSelectionListener
{
int count =1;
static int pount=0;
JLabel l1,l3,l2;
JTextField f1,f2,f3,ts,ghf1,ts1,ts2,ts3,gh;
JTextArea a1 ;
TextArea ar2,ar1;
String name;
JButton bs,bs1,bs1c;
JButton b,rs,d;
DataInputStream is;
DataOutputStream os;
String userman;
int jj;
background ppp;
frie po=new frie();
conferrence conf=null;
GridBagConstraints gct = new GridBagConstraints();
GridBagConstraints gct1 = new GridBagConstraints();
LinkedList l=new LinkedList();
JFrame fx;
JFrame fc;
JFrame fa;
 JPanel px;
 JPanel pc;
  JPanel p1;
 JMenuBar ob=new JMenuBar();
 DefaultListModel ab12 = new DefaultListModel();
 DefaultListModel ab1 = new DefaultListModel();
 JMenuItem openItem,cItem,newItem,vItem,aItem,pItem;
 JList list=new JList(ab1);
 JList list2;
 GridBagLayout layout = new GridBagLayout();
 GridBagLayout layout1 = new GridBagLayout();
GridBagLayout layoutc = new GridBagLayout();
Image icon;
GridBagConstraints gctc = new GridBagConstraints();
Image iconc;
ImageIcon timage;
public client(background h)
{
this.ppp=h;
men();
form();

}
 public client()
{
men();
form();
}
client(int g)
{

}
public client(String d)
{

}
public void remove_friend(String friend)
{
int index= ab12.indexOf(friend);
ab12.removeElement(friend);
ab1.removeElementAt(index);

}
  void men()
  {   
    fx=new JFrame("HOME");

     px=new JPanel();
 
      fx.setSize(900,500);
          JList listScrollPane = new JList();
      icon = Toolkit.getDefaultToolkit().getImage("c.png");
   // com.sun.awt.AWTUtilities.setWindowOpacity(fx, 0.7f);
   //fx.setUndecorated(true);

   
      //JMenu hep = new JMenu("Help");
//------------------------------------------------------------------------------
   JMenu file = new JMenu("ATRON");
    file.setMnemonic('F');
    file.setBackground(Color.black);
    file.setForeground(Color.white);
      file.setFont(new Font("Arial Black", Font.BOLD, 12));
    ob.add(file);
    ob.setBackground(Color.black);
     newItem = new JMenuItem("Profile");
    newItem.setForeground(Color.black);
    newItem.setFont(new Font("Arial Black", Font.BOLD, 12));
    newItem.setMnemonic('U');
    file.add(newItem);
    newItem.addActionListener(this);
     openItem = new JMenuItem("Sign Out");
    openItem.setMnemonic('F');
    openItem.setForeground(Color.black);
    openItem.setFont(new Font("Arial Black", Font.BOLD, 12));
    file.add(openItem);
    openItem.addActionListener(this);
    JMenuItem exitItem = new JMenuItem("Exit");
    exitItem.setForeground(Color.black);
    exitItem.setFont(new Font("Arial Black", Font.BOLD, 12));
    exitItem.setMnemonic('E');
    //file.add(exitItem);
    exitItem.addActionListener(this);
//------------------------------------------------------------------------------
   JMenu cont = new JMenu("Contacts");
    cont.setMnemonic('F');
    cont.setBackground(Color.black);
    cont.setForeground(Color.white);
      cont.setFont(new Font("Arial Black", Font.BOLD, 12));
    ob.add(cont);
    ob.setBackground(Color.black);
     pItem = new JMenuItem("Add Contact");
    pItem.setForeground(Color.black);
    pItem.addActionListener(this);
    pItem.setFont(new Font("Arial Black", Font.BOLD, 12));
   // pItem.setMnemonic('U');
    cont.add(pItem);
    pItem.addActionListener(this);
     vItem = new JMenuItem("View Contacts");
    vItem.setMnemonic('F');
    vItem.setForeground(Color.black);
    vItem.setFont(new Font("Arial Black", Font.BOLD, 12));
    cont.add(vItem);
    vItem.addActionListener(this);
     aItem = new JMenuItem("Remove Contact");
    aItem.setForeground(Color.black);
    aItem.setFont(new Font("Arial Black", Font.BOLD, 12));
    aItem.setMnemonic('E');
    cont.add(aItem);
    aItem.addActionListener(this);
//------------------------------------------------------------------------------
JMenu conv = new JMenu("Coversation");
    conv.setMnemonic('C');
    conv.setBackground(Color.black);
    conv.setForeground(Color.white);
      conv.setFont(new Font("Arial Black", Font.BOLD, 12));
    ob.add(conv);
    ob.setBackground(Color.black);
    cItem = new JMenuItem("Conference");
    cItem.setForeground(Color.black);
    cItem.setFont(new Font("Arial Black", Font.BOLD, 12));
    cItem.setMnemonic('O');
    //cItem.addActionListener(this);
    conv.add(cItem);
    cItem.addActionListener(this);
    JMenuItem caItem = new JMenuItem("Call");
    caItem.setMnemonic('F');
    caItem.setForeground(Color.black);
    caItem.setFont(new Font("Arial Black", Font.BOLD, 12));
   // conv.add(caItem);
    caItem.addActionListener(this);
    JMenuItem tItem = new JMenuItem("Send Text File");
    tItem.setForeground(Color.black);
    tItem.setFont(new Font("Arial Black", Font.BOLD, 12));
    tItem.setMnemonic('E');
    //conv.add(tItem);
    tItem.addActionListener(this);
//------------------------------------------------------------------------------
    fx.setJMenuBar(ob);
    exitItem.addActionListener(this);
    JLabel la=new JLabel("                                                                                    WELCOME:  ");
    la.setFont(new Font("Arial Black", Font.BOLD, 12));
    la.setForeground(Color.white);
    ob.add(la);
     gh=new JTextField(1);
    gh.setBackground(Color.black);
    gh.setForeground(Color.white);
     gh.setFont(new Font("Arial Black", Font.BOLD, 12));
    gh.setBorder(new LineBorder(Color.black));
  ob.add(gh);
   
  }

  
 

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

  //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
  public void actionPerformed(ActionEvent ae)
   {
   String s=ae.getActionCommand();
   if(s.equals("Add Contact"))
   {
   ts.setText("Add FRIEND");
   ts.setVisible(true);
   bs.setVisible(true);
   }
   if(s.equals("Remove Contact"))
   {
   
  bs.setVisible(false);
  ts.setVisible(true);
   ts.setText("REMOVE FRIEND");
   gct.insets = new Insets(-363, 730, 3, 3);
        gct.gridx = 2;
        gct.gridy = 1;
         rs=new JButton("REMOVE");
        rs.setFont(new Font("Arial Black", Font.BOLD, 12));
        rs.setBackground(Color.orange);
        rs.setForeground(Color.black);
        rs.addActionListener(this);
        px.add(rs,gct);
    fx.setVisible(true);

        }
   
   if(ae.getSource()==b)
   {
   
   }
   if(ae.getSource()==bs)
   {
   String a=ts.getText();
   System.out.println(a);
   String temp="2"+a;
   sendmessage(userman,temp);
   }
   else if(ae.getSource()==openItem)
   {
   System.out.println("hit the keyboard");
   sendmessage("signout","4"+userman);
   fx.dispose();
   //background obj=new background();
   //obj.setVisible(true);
   
   }
   else if(ae.getSource()==cItem)
   {
   System.out.println(l);
    conf=new conferrence(this,l,userman);
  // conf.men();
  // conf.form();
  
   }
   else if(ae.getSource()==rs)
   {
   System.out.println("friends are goind to delete");
   String n= ts.getText();
   String j="!"+userman;
   sendmessage(n,j);
   }
    else if(ae.getSource()==vItem)
  {
  System.out.println("zardari");
  String hh="@"+userman;
  sendmessage("list",hh);
   po.vf();
  
  }
   else if(ae.getSource()==bs1)
   {
   System.out.println("hello g hello");
  String name = ab12.getElementAt(list2.getSelectedIndex()).toString();
System.out.println(name);
String message=ar2.getText();
System.out.println(message);
message=userman+">>"+message;
sendmessage(name,message);
   }
   else if(ae.getSource()==newItem)
   {
    
   System.out.println("hello beta kahan");
   String temp="3"+userman;
   sendmessage("profile",temp);
  
   
   }
   else if(ae.getSource()==d)
   {
   String a=ts1.getText();
   userman=a;
   String b=ts2.getText();
   System.out.println(a);
   System.out.println(b);
   String mess="^"+a+"{"+b;
   setconnection1(mess);
   
   }
   }
   void cant()
{           fa=new JFrame("Can't Access");
            fa.setSize(500,200);
            p1=new JPanel();
            fa.add(p1);
        p1.setLayout(layout1);
        p1.setBackground(Color.white);
        //GridBagConstraints gct = new GridBagConstraints();
        gct1.insets = new Insets(3, 3, 3, 3);
        gct1.gridx = 1;
        gct1.gridy = 1;
         l1=new JLabel("USER NAME");
        //l1.setText("Add Friend");
       l1.setFont(new Font("Arial Black", Font.BOLD, 12));
        l1.setBackground(Color.white);
        l1.setForeground(Color.black);
       // l1.setVisible(false);
        p1.add(l1,gct1);

        gct1.insets = new Insets(3, 3, 3, 3);
        gct1.gridx = 2;
        gct1.gridy = 1;
         ts1=new JTextField(15);
      //  ts1.setText("Add Friend");
        ts1.setFont(new Font("Arial Black", Font.BOLD, 12));
        ts1.setBackground(Color.white);
        ts1.setForeground(Color.black);
        //ts1.setVisible(false);
        p1.add(ts1,gct1);
        gct1.insets = new Insets(3, 3, 3, 3);
        gct1.gridx = 1;
        gct1.gridy = 2;
         l2=new JLabel("Emial ID");
        //l2.setText("Add Friend");
       l2.setFont(new Font("Arial Black", Font.BOLD, 12));
        l2.setBackground(Color.white);
        l2.setForeground(Color.black);
       // l1.setVisible(false);
        p1.add(l2,gct1);
        gct1.insets = new Insets(3, 3, 3, 3);
        gct1.gridx = 2;
        gct1.gridy = 2;
         ts2=new JTextField(15);
       // ts2.setText("Add Friend");
        ts2.setFont(new Font("Arial Black", Font.BOLD, 12));
        ts2.setBackground(Color.white);
        ts2.setForeground(Color.black);
        //ts1.setVisible(false);
        p1.add(ts2,gct1);
        gct1.insets = new Insets(3, 3, 3, 3);
        gct1.gridx = 1;
        gct1.gridy = 3;
         l3=new JLabel("Password");
        //l3.setText("Add Friend");
       l3.setFont(new Font("Arial Black", Font.BOLD, 12));
        l3.setBackground(Color.white);
        l3.setForeground(Color.black);
           // l1.setVisible(false);
        p1.add(l3,gct1);
    l3.setVisible(false);

        gct1.insets = new Insets(3, 3, 3, 3);
        gct1.gridx = 2;
        gct1.gridy = 3;
         ts3=new JTextField(15);
        //ts3.setText("Add Friend");
        ts3.setFont(new Font("Arial Black", Font.BOLD, 12));
        ts3.setBackground(Color.white);
        ts3.setForeground(Color.black);
    p1.add(ts3,gct1);
        ts3.setVisible(false);
    gct1.insets = new Insets(3, -43, 3, 3);
        gct1.gridx = 2;
        gct1.gridy = 5;
     d=new JButton("SUBMIT");
    d.setFont(new Font("Arial Black", Font.BOLD, 12));
        d.setBackground(Color.white);
        d.setForeground(Color.black);
        d.setVisible(true);
    d.addActionListener(this);
    p1.add(d,gct1);
       // l1.setVisible(false);
        //p1.add(l3,gct1);
       
        //ts1.setVisible(false);
        //p1.add(ts3,gct1);
    
         fa.setContentPane(p1);
         fa.setVisible(true);


        

        

}
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
 void form()
  {

        px.setLayout(layout);
        px.setBackground(Color.black);
        //GridBagConstraints gct = new GridBagConstraints();
        gct.insets = new Insets(-363, 130, 3, 3);
        gct.gridx = 2;
        gct.gridy = 1;
         ts=new JTextField(35);
        ts.setText("Add Friend");
        ts.setFont(new Font("Arial Black", Font.BOLD, 12));
        ts.setBackground(Color.white);
        ts.setForeground(Color.black);
        ts.setVisible(false);
        px.add(ts,gct);
        gct.insets = new Insets(-30, 250, 3, 3);
        gct.gridx = 2;
        gct.gridy = 1;
          ar1 = new TextArea(14,70);
        ar1.setForeground(Color.black);
        ar1.setBackground(Color.white);
        ar1.setFont(new Font("Arial Black", Font.BOLD, 15));
        px.add(ar1,gct);

        gct.insets = new Insets(-363, 730, 3, 3);
        gct.gridx = 2;
        gct.gridy = 1;
         bs=new JButton("SEARCH");
        bs.setFont(new Font("Arial Black", Font.BOLD, 12));
        bs.setBackground(Color.orange);
        bs.setForeground(Color.black);
        bs.setVisible(false);
        
        bs.addActionListener(this);
        px.add(bs,gct);
        gct.insets = new Insets(320, 170, 3, 3);
        gct.gridx = 2;
        gct.gridy = 1;
          ar2 = new TextArea(1,60);
        ar2.setForeground(Color.black);
        ar2.setBackground(Color.white);
        ar2.setFont(new Font("Arial Black", Font.BOLD, 15));
        px.add(ar2,gct);
        gct.insets = new Insets(320, 755, 3, 3);
        gct.gridx = 2;
        gct.gridy = 1;
         bs1=new JButton("SEND");
        bs1.setFont(new Font("Arial Black", Font.BOLD, 12));
        bs1.setBackground(Color.orange);
        bs1.setForeground(Color.black);
        bs1.addActionListener(this);
        px.add(bs1,gct);
        gct.insets = new Insets(-393, -683, 3, 3);
        gct.gridx = 2;
        gct.gridy = 1;
        JLabel ls=new JLabel("FRIEND LIST");
        ls.setFont(new Font("Arial Black", Font.BOLD, 18));
       // ls.setBackground(Color.white);
        ls.setForeground(Color.white);
        px.add(ls,gct);
        gct.insets = new Insets(-123, -700, 3, 3);
        gct.gridx = 2;
        gct.gridy = 1;
         /*ab1.addElement( "ALI" );
         ab1.addElement( "IMRAN" );
         ab1.addElement( "FAISAL" );
         ab1.addElement( "HASSAN" );
         ab1.addElement( "SIR SAQLAIN" );
         ab1.addElement( "IRFAN" );
         ab1.addElement( "SIR IMRAN" );
          ab1.addElement( "SIR SHEHZAD ASHRAF" ); */
     //     ImageIcon tivitImage = new ImageIcon("C:\\Users\\faisal\\Desktop\\my\\067.jpg"+"FAISAL");
      //    ab1.addElement(tivitImage);
          //ab1.addElement( " Faisal" );
          /*ImageIcon tivitImage1 = new ImageIcon("C:\\Users\\faisal\\Desktop\\my\\0671.jpg","faisal");
          ab1.addElement( tivitImage1);
          ab1.addElement( "   Ali" );
          ImageIcon tivitImage2 = new ImageIcon("C:\\Users\\faisal\\Desktop\\my\\0672.jpg","faisal");
          ab1.addElement( tivitImage2);
          ab1.addElement( " Hassan" );*/
         list=new JList(ab1);
     //  JScrollPane   listScrollPane = new JScrollPane(list);
       //listScrollPane.setBackground(Color.black);
       //listScrollPane.setForeground(Color.black);
         list.setBackground(Color.black);
        list.setForeground(Color.WHITE);
            list.addListSelectionListener(this);
        //list.setSelectedIndex(0);
        //px.add(listScrollPane,gct);
        px.add(list,gct);
    gct.insets = new Insets(-123, -640, 3, 3);
        gct.gridx = 2;
        gct.gridy = 1;
         list2=new JList(ab12);
         list2.setBackground(Color.black);
        list2.setForeground(Color.WHITE);
            list2.addListSelectionListener(this);
             px.add(list2,gct);
        fx.setIconImage(icon);
        fx.setContentPane(px);
        //fx.setResizable(false);
        fx.setVisible(true);
    
        //ab1.addElement( "   Faisal" );
       // ab1.addElement( "ho ja0" );
        //ab1.addElement( "ho ja0" );


}
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
public void valueChanged(ListSelectionEvent evt) 
{

//if(pount==1)/
//{
//pount=0;
  //String name = ab1.getElementAt(list.getSelectedIndex()).toString();
//System.out.println(name);

//}/
//else
//{
//pount++;       
//}
}
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
  void send_to_list(String a)
  {
  icon();
  ab1.addElement(timage);
  ab12.addElement(a);
  }
  void icon()
  {
timage=new ImageIcon("0617.png");
  }
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
void sendmessage(String d,String s)
{
String message=s+"$"+d;
try
{
System.out.println(message);
os.writeUTF(message);
os.flush();
}
catch(Exception ea)
{
System.out.println(ea);
}
}
void setconnection1(String sss)
{
try
{
  Socket s=new Socket("localhost",1264);
  is=new DataInputStream(s.getInputStream());
  os=new DataOutputStream(s.getOutputStream());
  System.out.println(os);
    try
  {
  System.out.println(sss);
    os.writeUTF(sss);
    os.flush();
    new Thread(this).start();
    }
catch(Exception ea)
{
System.out.println(ea);
}
}
catch(Exception ea)
{
System.out.println(ea);
}
}
void setconnection(String ss,int i)
{

try
{
System.out.println(ss);

Socket s=new Socket("localhost",1264);
is=new DataInputStream(s.getInputStream());
os=new DataOutputStream(s.getOutputStream());
System.out.println(os);
   try
{
if(count==1)
{

System.out.println(s);
os.writeUTF(ss);
os.flush();
count++;
}
new Thread(this).start();
}
catch(Exception ea)
{
System.out.println(ea);
}
}
catch(Exception e)
{
System.out.println(e);
}
}
public void run()
{
while(true)
{
try
{
String s=is.readUTF();
System.out.println(s);
String sub=s.substring(0,1);
if(sub.equals("0"))
{
userman=s.substring(s.indexOf("0")+1);
System.out.println("client name is "+userman);
 gh.setText(userman);
 gh.setEditable(false); 
}
else if(sub.equals("2"))
{
System.out.println("na g na");
//JOptionPane.showMessageDialog(null, "invalid username or pasword");
ppp.lb.setVisible(true);
  ppp.lb.setText("Invalid Username&Password");
  fx.dispose();
}
else if(sub.equals("@"))
{
int o=s.indexOf("@");
String sz=s.substring(o+1);
System.out.println(sz);
po.icon(sz);
}
else if(sub.equals("!"))
{
int c=s.indexOf("!");
String j=s.substring(c+1);
System.out.println(j);
ab1.removeElement(j);
//send_to_list(j);
}
else if(sub.equals(":"))
{
System.out.println("invalid username");
signup1 f=new signup1(123);
f.ss();

}
else if(sub.equals("~"))
{
System.out.println("invalid g invalid");
}
else if(sub.equals("3"))
{
System.out.println("jList friends");

System.out.println(s.length());
if(s.length()>1)
{
int a=s.indexOf("3");
String f=s.substring(a+1);
System.out.println(f);
System.out.println("i am sending name to list");
l.add(f);
send_to_list(f);
}
else
{
System.out.println("no friends are online");
}
}
else if(sub.equals("^"))
{
int a=s.indexOf("^");
String pasword=s.substring(a+1);
l3.setVisible(true);
ts3.setVisible(true);
ts3.setText(pasword);
d.setVisible(false);
System.out.println(pasword);
}

else if(sub.equals("4"))
{
int a=s.indexOf("4");
String f=s.substring(a+1);
System.out.println("this client has been sign_out ok"+f);
l.remove(f);
remove_friend(f);
System.out.println("this client has been sign_out"+f);
if(conf!=null)
{
conf.remove(f);
}
}
else if(sub.equals("9"))
{
System.out.println("i am in 9 of client side");
int c=s.indexOf("9");
int h=s.indexOf("=");
String sendto=s.substring(c+1,h);
String message=s.substring(h+1);
System.out.println(s);
System.out.println(message);
System.out.println(sendto);
int a=JOptionPane.showConfirmDialog(null,"DO YOU WANT TO ACCEPT THE CONFERENCE FROM"+sendto);
if(a==0)
{
String xxc="5"+message;
sendmessage(sendto,xxc);
conf=new conferrence(this,sendto,userman);
}
else
{
String f=")"+message;
sendmessage(sendto,f);
}
}
else if(sub.equals("5"))
{
System.out.println("added to your friendlist"+s);

}
else if(sub.equals("7"))
{
System.out.println("i am in 7 of client");
int a=s.indexOf("7");
String temp=s.substring(a+1);
System.out.println(temp);
conf.throw_message(temp);
//conf.set(temp);
}
else if(sub.equals(")"))
{
System.out.println("i am in ) of client");
//int a=s.indexOf("$");
int hx=s.indexOf(")");
String remove=s.substring(hx+1);
//String message=s.substring(hx+1,a);
System.out.println(s);
//System.out.println(message);
System.out.println(remove);
conf.remove(remove);

}
else if(sub.equals("6"))
{
System.out.println("i love inkjksd");
System.out.println(s);
String name;
String username;
String pasword;
String date;
String email;
String gender;

name=s.substring(s.indexOf("$")+1,s.indexOf("!"));
username=s.substring(s.indexOf("!")+1,s.indexOf("#"));
pasword=s.substring(s.indexOf("#")+1,s.indexOf("%"));
gender=s.substring(s.indexOf("%")+1,s.indexOf("&"));
date=s.substring(s.indexOf("&")+1,s.indexOf("*"));
email=s.substring(s.indexOf("*")+1);
System.out.println(name);
System.out.println(username);
System.out.println(pasword);
System.out.println(gender);
System.out.println(date);
System.out.println(email);
//name.replaceAll(name,"khan");
String h="khan";
String to="6"+userman;
String ss="6"+"$"+h+"!"+username+"#"+pasword+"%"+gender+"&"+date+"*"+email;
System.out.println(ss);
//ss.replaceAll(name,"khan");
//System.out.println(ss);
//sendmessage(ss,to);
 new edi(name,username,pasword,gender,date,email,this).setVisible(true);
}
else
{
System.out.println(s);
ar1.append(s+"\n");

}
}
catch(EOFException d)
{
//System.exit(0);
}
catch(Exception a)
{
System.out.println(a);
System.out.println("yahi d na");
}
}
}
void add_to_jlist(String friends)
{
//try//
//{
// DefaultListModel ab1 = new DefaultListModel();
//    ab1.addElement(friends);

//ab1 = new DefaultListModel();
  //       ab1.addElement( friends );
//   list=new JList(ab1);
  // }
//   catch(Exception t)
  // {//
//   System.out.println("on ha");
  // System.out.println(t);
//   }
}
public static void main(String args[])
{
client obj=new client();
//obj.show();
}
}