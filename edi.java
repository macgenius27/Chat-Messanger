import java.awt.Color;
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
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
class pro extends JFrame   implements ActionListener
    {

  // start attributes
    //Container con = null;
    Container con1 = null;
    //JPanel panelBgImg;
  client ooo;
//  client f;
    ///GridBagLayout layoutt = new GridBagLayout();
    //JPanel panelContent = new JPanel(layoutt);
        //GridBagConstraints gct = new GridBagConstraints();
        JPanel panelBgImg1;
    GridBagLayout layoutt1 = new GridBagLayout();
    JPanel panelContent1 = new JPanel(layoutt1);
        GridBagConstraints gct1 = new GridBagConstraints();
        JComboBox month,jc,jc1;
        JButton x,x1;
        JRadioButton b,bf;
        ButtonGroup  rbg;
        String d;
        JTextField jt1,jt2,jt3,jt13,jt14,mont,da,ya,mal;

     pro(client o,String dd)
    {
  this.ooo=o;
  d=dd;
       setTitle("background");
        //setsize(500,300);
        con1 = getContentPane();

        con1.setLayout(null);
        ImageIcon imh = new ImageIcon("1112.png");
        setSize(imh.getIconWidth(), imh.getIconHeight());

        panelBgImg1 = new JPanel()
        {
            public void paintComponent(Graphics g)
            {
                Image img = new ImageIcon("1112.png").getImage();
                Dimension size = new Dimension(img.getWidth(null), img.getHeight(null));
                setPreferredSize(size);
                setMinimumSize(size);
                setMaximumSize(size);
                setSize(size);
                setLayout(null);
                g.drawImage(img, 0, 0, null);
            }
        };

        con1.add(panelBgImg1);
        panelBgImg1.setBounds(0, 0, imh.getIconWidth(), imh.getIconHeight());

        gct1.insets = new Insets(3, -210, 3, 3);
        gct1.gridx = 2;
        gct1.gridy = 1;

        JLabel labelst = new JLabel("ATRON EDIT PROFILE");
        labelst.setForeground(Color.orange);
        labelst.setFont(new Font("Areial Black", Font.BOLD, 15));
        //labels.setFont("Arial Black", Font.BOLD, 12);
        panelContent1.add(labelst, gct1);
        gct1.insets = new Insets(3, 3, 3, 3);
        gct1.gridx = 4;
        gct1.gridy = 1;
        JLabel labelst1 = new JLabel("ATRON");
        labelst1.setForeground(Color.orange);
        labelst1.setFont(new Font("Comic Sans MS", Font.BOLD, 19));
        //labels.setFont("Arial Black", Font.BOLD, 12);
        panelContent1.add(labelst1, gct1);
         gct1.insets = new Insets(-13, 8, 3, 3);
        gct1.gridx = 2;
        gct1.gridy = 2;

        JLabel labelt = new JLabel("PLEASE EDIT INFORMATION IN YOUR ARTON PROFILE");
        labelt.setForeground(Color.white);
        labelt.setFont(new Font("Areial Black", Font.BOLD, 15));
        //labels.setFont("Arial Black", Font.BOLD, 12);
        panelContent1.add(labelt, gct1);
        gct1.insets=new Insets(73, 3, 3, 3);
        gct1.gridx = 2;
        gct1.gridy = 6;
        JLabel label1 = new JLabel("*ATRON UserName:");
        label1.setForeground(Color.white);
        label1.setFont(new Font("Areial Black", Font.BOLD, 12));
        //labels.setFont("Arial Black", Font.BOLD, 12);
       // panelContent1.add(label1, gct1);
        gct1.insets=new Insets(5, -45, 3, 3);
        gct1.gridx = 2;
        gct1.gridy = 7;
        JLabel label2 = new JLabel("*Password:");
        label2.setForeground(Color.white);
        label2.setFont(new Font("Areial Black", Font.BOLD, 12));
        //labels.setFont("Arial Black", Font.BOLD, 12);
        panelContent1.add(label2, gct1);
        gct1.insets=new Insets(3, 5 , 3, 3);
        gct1.gridx = 2;
        gct1.gridy = 8;
        JLabel label3 = new JLabel("*Confirm Password:");
        label3.setForeground(Color.white);
        label3.setFont(new Font("Areial Black", Font.BOLD, 12));
        label3.setVisible(false);
        //labels.setFont("Arial Black", Font.BOLD, 12);
        panelContent1.add(label3, gct1);
         gct1.insets=new Insets(73, -173, 3, 3);
         gct1.gridx = 3;
         gct1.gridy = 6;
           jt1=new JTextField(25);
      String v=ooo.userman;
System.out.println("username of client is"+v); 
      jt1.setText(v);

          jt1.setForeground(Color.black);
        jt1.addActionListener(this);
        jt1.setFont(new Font("Areial Black", Font.BOLD, 12));
        //panelContent1.add(jt1, gct1);
        gct1.insets=new Insets(3, -173, 3, 3);
         gct1.gridx = 3;
         gct1.gridy = 7;
           jt2=new JTextField(25);
          jt2.setForeground(Color.black);
          jt2.addActionListener(this);
        jt2.setFont(new Font("Areial Black", Font.BOLD, 12));
        panelContent1.add(jt2, gct1);
        gct1.insets=new Insets(3, -173, 3, 3);
         gct1.gridx = 3;
         gct1.gridy = 8;
           jt3=new JTextField(25);
          jt3.setForeground(Color.black);
           jt3.addActionListener(this);
        jt3.setFont(new Font("Areial Black", Font.BOLD, 12));
        panelContent1.add(jt3, gct1);
        jt3.setVisible(false);
        //panelContent.add(jta,gct);
        gct1.insets=new Insets(5, -65, 3, 3);
        gct1.gridx = 2;
        gct1.gridy = 10;
        JLabel label12 = new JLabel("*Name:");
        label12.setForeground(Color.white);
        label12.setFont(new Font("Areial Black", Font.BOLD, 12));
        //labels.setFont("Arial Black", Font.BOLD, 12);
        panelContent1.add(label12, gct1);
        gct1.insets=new Insets(5, -25, 3, 3);
        gct1.gridx = 2;
        gct1.gridy = 11;
        JLabel label13 = new JLabel("*Date Of Birth:");
        label13.setForeground(Color.white);
        label13.setFont(new Font("Areial Black", Font.BOLD, 12));
        //labels.setFont("Arial Black", Font.BOLD, 12);
        panelContent1.add(label13, gct1);
        gct1.insets=new Insets(0, -55, 3, 3);
        gct1.gridx = 2;
        gct1.gridy = 12;
        JLabel label14 = new JLabel("*Gender:");
        label14.setForeground(Color.white);
        label14.setFont(new Font("Areial Black", Font.BOLD, 12));
        //labels.setFont("Arial Black", Font.BOLD, 12);
        panelContent1.add(label14, gct1);
        gct1.insets=new Insets(8, -65, 3, 3);
        gct1.gridx = 2;
        gct1.gridy = 13;
        JLabel label15 = new JLabel("*Email:");
        label15.setForeground(Color.white);
        label15.setFont(new Font("Areial Black", Font.BOLD, 12));
        //labels.setFont("Arial Black", Font.BOLD, 12);
        panelContent1.add(label15, gct1);
         gct1.insets=new Insets(0, -173, 3, 3);
         gct1.gridx = 3;
         gct1.gridy = 10;
           jt13=new JTextField(25);
          jt13.setForeground(Color.black);
        jt13.setFont(new Font("Areial Black", Font.BOLD, 12));
        jt13.addActionListener(this);
        panelContent1.add(jt13, gct1);
         gct1.insets=new Insets(5, -220, 3, 3);
         gct1.gridx = 3;
         gct1.gridy = 11;
        month = new JComboBox();
        month.setForeground(Color.black);
        month.setBackground(Color.orange);
        month.addItem("MONTH");
        month.addItem("JANUARY");
        month.addItem("FEBUARY");
        month.addItem("MARCH");
         month.addItem("APRIL");
         month.addItem("MAY");
         month.addItem("JUNE");
         month.addItem("JULY");
          month.addItem("AUGUST");
           month.addItem("SEPTEMBER");
           month.addItem("OCTOBER");
           month.addItem("NOMBER");
           month.addItem("DECEMBER");
           month.addActionListener(this);
           panelContent1.add(month,gct1);
           gct1.insets=new Insets(5, -399, 3, 3);
           gct1.gridx = 3;
           gct1.gridy = 11;
       jc = new JComboBox();
      jc.setForeground(Color.black);
      jc.setBackground(Color.orange);
    jc.addItem("DAY");
    jc.addItem("1");
    jc.addItem("2");
    jc.addItem("3");
    jc.addItem("4");
    jc.addItem("5");
    jc.addItem("6");
    jc.addItem("7");
    jc.addItem("8");
    jc.addItem("9");
    jc.addItem("10");
    jc.addItem("11");
    jc.addItem("12");
    jc.addItem("13");
    jc.addItem("14");
    jc.addItem("15");
    jc.addItem("16");
    jc.addItem("17");
    jc.addItem("18");
    jc.addItem("19");
    jc.addItem("20");
    jc.addItem("21");
    jc.addItem("22");
    jc.addItem("23");
    jc.addItem("24");
    jc.addItem("25");
    jc.addItem("26");
    jc.addItem("27");
    jc.addItem("28");
    jc.addItem("29");
    jc.addItem("30");
    jc.addItem("31");
    jc.addActionListener(this);
    panelContent1.add(jc, gct1);
    gct1.insets=new Insets(5, -40, 3, 3);
           gct1.gridx = 3;
           gct1.gridy = 11;
           jc1 = new JComboBox();
       jc1.setForeground(Color.black);
       jc1.setBackground(Color.orange);
    jc1.addItem("YEAR");
    jc1.addItem("1950");
    jc1.addItem("1951");
    jc1.addItem("1952");
    jc1.addItem("1953");
    jc1.addItem("1954");
    jc1.addItem("1955");
    jc1.addItem("1956");
    jc1.addItem("1957");
    jc1.addItem("1958");
    jc1.addItem("1959");
    jc1.addItem("1960");
    jc1.addItem("1961");
    jc1.addItem("1962");
    jc1.addItem("1963");
    jc1.addItem("1964");
    jc1.addItem("1965");
    jc1.addItem("1966");
    jc1.addItem("1967");
    jc1.addItem("1968");
    jc1.addItem("1969");
    jc1.addItem("1970");
    jc1.addItem("1971");
    jc1.addItem("1972");
    jc1.addItem("1973");
    jc1.addItem("1974");
    jc1.addItem("1975");
    jc1.addItem("1976");
    jc1.addItem("1977");
    jc1.addItem("1978");
    jc1.addItem("1979");
    jc1.addItem("1980");
    jc1.addItem("1981");
    jc1.addItem("1982");
    jc1.addItem("1983");
    jc1.addItem("1984");
    jc1.addItem("1985");
    jc1.addItem("1986");
    jc1.addItem("1987");
    jc1.addItem("1988");
    jc1.addItem("1989");
    jc1.addItem("1990");
    jc1.addItem("1991");
    jc1.addItem("1992");
    jc1.addItem("1993");
    jc1.addItem("1994");
    jc1.addItem("1995");
    jc1.addItem("1996");
    jc1.addItem("1997");
    jc1.addItem("1998");
    jc1.addItem("1999");
    jc1.addItem("2000");
    jc1.addItem("2001");
    jc1.addItem("2002");
    jc1.addItem("2003");
    jc1.addItem("2004");
    jc1.addItem("2005");
    jc1.addItem("2006");
    jc1.addItem("2007");
    jc1.addItem("2008");
    jc1.addItem("2009");
    jc1.addItem("2010");
    jc1.addItem("2011");
    jc1.addActionListener(this);
    panelContent1.add(jc1, gct1);
    gct1.insets=new Insets(0, -395, 3, 3);
           gct1.gridx = 3;
           gct1.gridy = 12;
           rbg=new ButtonGroup();
    b=new JRadioButton("MALE");
   b.setForeground(Color.black);
   b.setBackground(Color.orange);
   b.addActionListener(this);
    panelContent1.add(b, gct1);
    rbg.add(b);
    gct1.insets=new Insets(0, -248, 3, 3);
    gct1.gridx = 3;
    gct1.gridy = 12;
     bf=new JRadioButton("FEMALE");
    bf.setBackground(Color.orange);
    bf.addActionListener(this);
    bf.setForeground(Color.black);
     panelContent1.add(bf, gct1);
    rbg.add(bf);
    gct1.insets=new Insets(8, -173, 3, 3);
         gct1.gridx = 3;
         gct1.gridy = 13;
           jt14=new JTextField(25);
          jt14.setForeground(Color.black);
           jt14.addActionListener(this);
        jt14.setFont(new Font("Areial Black", Font.BOLD, 12));
       panelContent1.add(jt14, gct1);
        String az="By clicking 'the create account button', I accept the ATRON End User License Agreement";
        gct1.insets=new Insets(23, -295, 3, 3);
         gct1.gridx = 3;
         gct1.gridy = 15;
          JLabel r=new JLabel(az);
          r.setForeground(Color.orange);
        r.setFont(new Font("Areial Black", Font.BOLD, 12));
        panelContent1.add(r, gct1);
        r.setVisible(false);
        gct1.insets=new Insets(23, 93, 3, 3);
         gct1.gridx = 3;
         gct1.gridy = 16;
           x=new JButton("Save");
          x.setForeground(Color.black);
           x.addActionListener(this);
          x.setBackground(Color.LIGHT_GRAY);
        x.setFont(new Font("Areial Black", Font.BOLD, 12));
        panelContent1.add(x, gct1);
        gct1.insets=new Insets(23, 3, 3, 3);
         gct1.gridx = 4;
         gct1.gridy = 16;
           x1=new JButton("Cancel");
          x1.setForeground(Color.black);
           x1.addActionListener(this);
          x1.setBackground(Color.LIGHT_GRAY);
        x1.setFont(new Font("Areial Black", Font.BOLD, 12));
       panelContent1.add(x1, gct1);

        panelContent1.setBackground(Color.DARK_GRAY);
        panelContent1.setBorder(new LineBorder(Color.WHITE));

        panelBgImg1.add(panelContent1);

        panelBgImg1.setLayout(new FlowLayout(FlowLayout.RIGHT, 110, 160));

       // setResizable(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //setvisible(true);

    // start components
    // end components
    }
    public void actionPerformed(ActionEvent ae)
    {
    String s=ae.getActionCommand();
    if(s.equals("Cancel"))
      {
      System.out.println("faisal");
        dispose();
      }

  if(ae.getSource()==x)
  {
  String g=ae.getActionCommand();
    String username=d;
   String pasword =jt2.getText();
    //=jt3.getText();
    String name=jt13.getText();
    String email=jt14.getText();
    String day=(String)jc.getSelectedItem();
    String mon=(String)month.getSelectedItem();
    String year=(String)jc1.getSelectedItem();
    String sex=null;
  System.out.println("name is "+name);
    if(b.isSelected()==true)
    {
     sex="MALE";
     }
     if(bf.isSelected()==true)
     {
      sex="FEMALE";

      }
         String date=day+mon+year;
   //String date=;
   // String email;
   //String gender;

   if(pasword.equals("")||name.equals("")||email.equals("")||sex==null||day.equals("DAY")||mon.equals("MONTH")||year.equals("YEAR"))
   {
   if(pasword.equals(""))
   {
   jt2.setBackground(Color.pink);

    }
    if(name.equals(""))
   {
   jt13.setBackground(Color.pink);
    }
    if(email.equals(""))
   {
   jt14.setBackground(Color.pink);
    }
    if(sex==null)
   {
   bf.setBackground(Color.pink);
   b.setBackground(Color.pink);
    }
    if(year.equals("YEAR"))
   {
   jc1.setBackground(Color.pink);
    }
     if(day.equals("DAY"))
   {
   System.out.println("kkkkkkk");
   jc.setBackground(Color.pink);
    }
   if(mon.equals("MONTH"))
   {
   month.setBackground(Color.pink);
    }

    }
    else
    {
     jt2.setBackground(Color.white);
      jt3.setBackground(Color.white);
      jt13.setBackground(Color.white);
      jt14.setBackground(Color.white);
      jc.setBackground(Color.orange);
      month.setBackground(Color.orange);
      jc1.setBackground(Color.orange);
      b.setBackground(Color.orange);
      bf.setBackground(Color.orange);
  System.out.println(username);
  String to="6"+username;
String ss="6"+"$"+name+"!"+username+"#"+pasword+"%"+sex+"&"+date+"*"+email;
System.out.println(ss);
ooo.sendmessage(ss,to);
dispose();

    }
  
  }
   /* String g=ae.getActionCommand();
    String un=jt1.getText();
    String p=jt2.getText();
    String cp=jt3.getText();
    String name=jt13.getText();
    String email=jt14.getText();
    String day=(String)month.getSelectedItem();
    String mon=(String)jc.getSelectedItem();
    String year=(String)jc1.getSelectedItem();
    String sex=null; */

    }
  }
 public class edi extends JFrame   implements ActionListener
{

  // start attributes
  client obj;
    Container con = null;
    Container con1 = null;
    JPanel panelBgImg;
    GridBagLayout layoutt = new GridBagLayout();
    JPanel panelContent = new JPanel(layoutt);
        GridBagConstraints gct = new GridBagConstraints();
        JPanel panelBgImg1;
    GridBagLayout layoutt1 = new GridBagLayout();
    JPanel panelContent1 = new JPanel(layoutt1);
        GridBagConstraints gct1 = new GridBagConstraints();
        JComboBox month,jc,jc1;
        JButton x,x1;
        JRadioButton b,bf;
        ButtonGroup  rbg;
        String hh;
        JTextField jt1,jt2,jt3,jt13,jt14,mont,da,ya,mal;

  // end attributes


    public edi(String name,String username,String pasword,String gender,String date,String email,client op)
    {
  this.obj=op;
  this.hh=name;
  
        setTitle("background");
        //setsize(500,300);
        con = getContentPane();

        con.setLayout(null);
        ImageIcon imh = new ImageIcon("1112.png");
        setSize(imh.getIconWidth(), imh.getIconHeight());

        panelBgImg = new JPanel()
        {
            public void paintComponent(Graphics g)
            {
                Image img = new ImageIcon("1112.png").getImage();
                Dimension size = new Dimension(img.getWidth(null), img.getHeight(null));
                setPreferredSize(size);
                setMinimumSize(size);
                setMaximumSize(size);
                setSize(size);
                setLayout(null);
                g.drawImage(img, 0, 0, null);
            }
        };

        con.add(panelBgImg);
        panelBgImg.setBounds(0, 0, imh.getIconWidth(), imh.getIconHeight());

        //GridBagLayout layoutt = new GridBagLayout();

        //JPanel panelContent = new JPanel(layoutt);
        //GridBagConstraints gct = new GridBagConstraints();
        gct.insets = new Insets(3, -220, 3, 3);
        gct.gridx = 2;
        gct.gridy = 1;

        JLabel labelst = new JLabel(" ATRON USER PROFILE");
        labelst.setForeground(Color.orange);
        labelst.setFont(new Font("Areial Black", Font.BOLD, 15));
        //labels.setFont("Arial Black", Font.BOLD, 12);
        panelContent.add(labelst, gct);
        gct.insets = new Insets(3, 3, 3, 3);
        gct.gridx = 4;
        gct.gridy = 1;
        JLabel labelst1 = new JLabel("ATRON");
        labelst1.setForeground(Color.orange);
        labelst1.setFont(new Font("Comic Sans MS", Font.BOLD, 19));
        //labels.setFont("Arial Black", Font.BOLD, 12);
        panelContent.add(labelst1, gct);
         gct.insets = new Insets(-13, 8, 3, 3);
        gct.gridx = 2;
        gct.gridy = 2;

        JLabel labelt = new JLabel("    THIS IS YOUR REQURIED INFORMATION ABOUT ATRON");
        labelt.setForeground(Color.white);
        labelt.setFont(new Font("Areial Black", Font.BOLD, 15));
        //labels.setFont("Arial Black", Font.BOLD, 12);
        panelContent.add(labelt, gct);
        //labelt.setVisible(false);
        gct.insets=new Insets(73, 3, 3, 3);
        gct.gridx = 2;
        gct.gridy = 6;
        JLabel label1 = new JLabel("*ATRON UserName:");
        label1.setForeground(Color.white);
        label1.setFont(new Font("Areial Black", Font.BOLD, 12));
        //labels.setFont("Arial Black", Font.BOLD, 12);
        panelContent.add(label1, gct);
        gct.insets=new Insets(5, -45, 3, 3);
        gct.gridx = 2;
        gct.gridy = 7;
        JLabel label2 = new JLabel("*Password:");
        label2.setForeground(Color.white);
        label2.setFont(new Font("Areial Black", Font.BOLD, 12));
        //labels.setFont("Arial Black", Font.BOLD, 12);
        panelContent.add(label2, gct);
        gct.insets=new Insets(3, 5 , 3, 3);
        gct.gridx = 2;
        gct.gridy = 8;
        JLabel label3 = new JLabel("*Confirm Password:");
        label3.setForeground(Color.white);
        label3.setFont(new Font("Areial Black", Font.BOLD, 12));
        label3.setVisible(false);
        //labels.setFont("Arial Black", Font.BOLD, 12);
        panelContent.add(label3, gct);
         gct.insets=new Insets(73, -173, 3, 3);
         gct.gridx = 3;
         gct.gridy = 6;
           jt1=new JTextField(25);

          jt1.setForeground(Color.white);
        jt1.addActionListener(this);
        jt1.setFont(new Font("Areial Black", Font.BOLD, 12));
        jt1.setText(username);
        jt1.setBackground(Color.DARK_GRAY);
        jt1.setBorder(new LineBorder(Color.DARK_GRAY));
        panelContent.add(jt1, gct);
        gct.insets=new Insets(3, -173, 3, 3);
         gct.gridx = 3;
         gct.gridy = 7;
           jt2=new JTextField(25);
          jt2.setForeground(Color.white);
        jt2.setFont(new Font("Areial Black", Font.BOLD, 12));
        jt2.setText(pasword);
        jt2.setBackground(Color.DARK_GRAY);
        jt2.setBorder(new LineBorder(Color.DARK_GRAY));
        panelContent.add(jt2, gct);
        jt2.addActionListener(this);
        gct.insets=new Insets(3, -173, 3, 3);
         gct.gridx = 3;
         gct.gridy = 8;
           jt3=new JTextField(25);
          jt3.setForeground(Color.white);
           jt3.addActionListener(this);
        jt3.setFont(new Font("Areial Black", Font.BOLD, 12));
        panelContent.add(jt3, gct);
        jt3.setText("FAISAL SAJJAD");
        jt3.setBackground(Color.DARK_GRAY);
        jt3.setBorder(new LineBorder(Color.DARK_GRAY));
        jt3.setVisible(false);
        //panelContent.add(jta,gct);
        gct.insets=new Insets(5, -65, 3, 3);
        gct.gridx = 2;
        gct.gridy = 10;
        JLabel label12 = new JLabel("*Name:");
        label12.setForeground(Color.white);
        label12.setFont(new Font("Areial Black", Font.BOLD, 12));
        //labels.setFont("Arial Black", Font.BOLD, 12);
        panelContent.add(label12, gct);
        gct.insets=new Insets(5, -25, 3, 3);
        gct.gridx = 2;
        gct.gridy = 11;
        JLabel label13 = new JLabel("*Date Of Birth:");
        label13.setForeground(Color.white);
        label13.setFont(new Font("Areial Black", Font.BOLD, 12));
        //labels.setFont("Arial Black", Font.BOLD, 12);
        panelContent.add(label13, gct);
        gct.insets=new Insets(0, -55, 3, 3);
        gct.gridx = 2;
        gct.gridy = 12;
        JLabel label14 = new JLabel("*Gender:");
        label14.setForeground(Color.white);
        label14.setFont(new Font("Areial Black", Font.BOLD, 12));
        //labels.setFont("Arial Black", Font.BOLD, 12);
        panelContent.add(label14, gct);
        gct.insets=new Insets(8, -65, 3, 3);
        gct.gridx = 2;
        gct.gridy = 13;
        JLabel label15 = new JLabel("*Email:");
        label15.setForeground(Color.white);
        label15.setFont(new Font("Areial Black", Font.BOLD, 12));
        //labels.setFont("Arial Black", Font.BOLD, 12);
        panelContent.add(label15, gct);
         gct.insets=new Insets(0, -173, 3, 3);
         gct.gridx = 3;
         gct.gridy = 10;
           jt13=new JTextField(25);
          jt13.setForeground(Color.white);
        jt13.setFont(new Font("Areial Black", Font.BOLD, 12));
        jt13.addActionListener(this);
        jt13.setText(name);
        jt13.setBackground(Color.DARK_GRAY);
        jt13.setBorder(new LineBorder(Color.DARK_GRAY));
        panelContent.add(jt13, gct);
         gct.insets=new Insets(5, -220, 3, 3);
         gct.gridx = 3;
         gct.gridy = 11;
        month = new JComboBox();
        month.setForeground(Color.black);
        month.setBackground(Color.orange);
        month.addItem("MONTH");
        month.addItem("JANUARY");
        month.addItem("FEBUARY");
        month.addItem("MARCH");
         month.addItem("APRIL");
         month.addItem("MAY");
         month.addItem("JUNE");
         month.addItem("JULY");
          month.addItem("AUGUST");
           month.addItem("SEPTEMBER");
           month.addItem("OCTOBER");
           month.addItem("NOMBER");
           month.addItem("DECEMBER");
           month.addActionListener(this);
           month.setVisible(false);
           panelContent.add(month,gct);
           gct.insets=new Insets(5, -399, 3, 3);
           gct.gridx = 3;
           gct.gridy = 11;
       jc = new JComboBox();
      jc.setForeground(Color.black);
      jc.setBackground(Color.orange);
    jc.addItem("DAY");
    jc.addItem("1");
    jc.addItem("2");
    jc.addItem("3");
    jc.addItem("4");
    jc.addItem("5");
    jc.addItem("6");
    jc.addItem("7");
    jc.addItem("8");
    jc.addItem("9");
    jc.addItem("10");
    jc.addItem("11");
    jc.addItem("12");
    jc.addItem("13");
    jc.addItem("14");
    jc.addItem("15");
    jc.addItem("16");
    jc.addItem("17");
    jc.addItem("18");
    jc.addItem("19");
    jc.addItem("20");
    jc.addItem("21");
    jc.addItem("22");
    jc.addItem("23");
    jc.addItem("24");
    jc.addItem("25");
    jc.addItem("26");
    jc.addItem("27");
    jc.addItem("28");
    jc.addItem("29");
    jc.addItem("30");
    jc.addItem("31");
    jc.addActionListener(this);
    jc.setVisible(false);
    panelContent.add(jc, gct);

    gct.insets=new Insets(5, -40, 3, 3);
           gct.gridx = 3;
           gct.gridy = 11;
           jc1 = new JComboBox();
       jc1.setForeground(Color.black);
       jc1.setBackground(Color.orange);
    jc1.addItem("YEAR");
    jc1.addItem("1950");
    jc1.addItem("1951");
    jc1.addItem("1952");
    jc1.addItem("1953");
    jc1.addItem("1954");
    jc1.addItem("1955");
    jc1.addItem("1956");
    jc1.addItem("1957");
    jc1.addItem("1958");
    jc1.addItem("1959");
    jc1.addItem("1960");
    jc1.addItem("1961");
    jc1.addItem("1962");
    jc1.addItem("1963");
    jc1.addItem("1964");
    jc1.addItem("1965");
    jc1.addItem("1966");
    jc1.addItem("1967");
    jc1.addItem("1968");
    jc1.addItem("1969");
    jc1.addItem("1970");
    jc1.addItem("1971");
    jc1.addItem("1972");
    jc1.addItem("1973");
    jc1.addItem("1974");
    jc1.addItem("1975");
    jc1.addItem("1976");
    jc1.addItem("1977");
    jc1.addItem("1978");
    jc1.addItem("1979");
    jc1.addItem("1980");
    jc1.addItem("1981");
    jc1.addItem("1982");
    jc1.addItem("1983");
    jc1.addItem("1984");
    jc1.addItem("1985");
    jc1.addItem("1986");
    jc1.addItem("1987");
    jc1.addItem("1988");
    jc1.addItem("1989");
    jc1.addItem("1990");
    jc1.addItem("1991");
    jc1.addItem("1992");
    jc1.addItem("1993");
    jc1.addItem("1994");
    jc1.addItem("1995");
    jc1.addItem("1996");
    jc1.addItem("1997");
    jc1.addItem("1998");
    jc1.addItem("1999");
    jc1.addItem("2000");
    jc1.addItem("2001");
    jc1.addItem("2002");
    jc1.addItem("2003");
    jc1.addItem("2004");
    jc1.addItem("2005");
    jc1.addItem("2006");
    jc1.addItem("2007");
    jc1.addItem("2008");
    jc1.addItem("2009");
    jc1.addItem("2010");
    jc1.addItem("2011");
    jc1.addActionListener(this);
    jc1.setVisible(false);
    panelContent.add(jc1, gct);
           gct.insets=new Insets(0, -395, 3, 3);
           gct.gridx = 3;
           gct.gridy = 12;
           rbg=new ButtonGroup();
    b=new JRadioButton("MALE");
   b.setForeground(Color.black);
   b.setBackground(Color.orange);
   b.addActionListener(this);
   b.setVisible(false);
    panelContent.add(b, gct);
    rbg.add(b);
    gct.insets=new Insets(0, -248, 3, 3);
    gct.gridx = 3;
    gct.gridy = 12;
     bf=new JRadioButton("FEMALE");
    bf.setBackground(Color.orange);
    bf.addActionListener(this);
    bf.setForeground(Color.black);
    bf.setVisible(false);
     panelContent.add(bf, gct);
    rbg.add(bf);
    gct.insets=new Insets(8, -173, 3, 3);
         gct.gridx = 3;
         gct.gridy = 13;
           jt14=new JTextField(25);
          jt14.setForeground(Color.white);
           jt14.addActionListener(this);
        jt14.setFont(new Font("Areial Black", Font.BOLD, 12));
        jt14.setText(email);
        jt14.setBackground(Color.DARK_GRAY);
        jt14.setBorder(new LineBorder(Color.DARK_GRAY));
       panelContent.add(jt14, gct);
        String az="By clicking 'the create account button', I accept the ATRON End User License Agreement";
        gct.insets=new Insets(23, -295, 3, 3);
         gct.gridx = 3;
         gct.gridy = 15;
          JLabel r=new JLabel(az);
          r.setForeground(Color.orange);
        r.setFont(new Font("Areial Black", Font.BOLD, 12));
        panelContent.add(r, gct);
        r.setVisible(false);
        gct.insets=new Insets(23, 243, 3, 3);
         gct.gridx = 3;
         gct.gridy = 16;
           x=new JButton("OK");
          x.setForeground(Color.black);
           x.addActionListener(this);
          x.setBackground(Color.LIGHT_GRAY);
        x.setFont(new Font("Areial Black", Font.BOLD, 12));
        panelContent.add(x, gct);
        gct.insets=new Insets(23, -19, 3, 3);
         gct.gridx = 4;
         gct.gridy = 16;
           x1=new JButton("Edit");
          x1.setForeground(Color.black);
          x1.setBackground(Color.LIGHT_GRAY);
        x1.setFont(new Font("Areial Black", Font.BOLD, 12));
       panelContent.add(x1, gct);
       x1.addActionListener(this);
       gct.insets=new Insets(5, -335, 3, 3);
         gct.gridx = 3;
         gct.gridy = 11;
         mont=new JTextField(10);
           mont.setForeground(Color.white);
           mont.setFont(new Font("Areial Black", Font.BOLD, 12));
           mont.addActionListener(this);
           mont.setText(date);
           mont.setBackground(Color.DARK_GRAY);
           mont.setBorder(new LineBorder(Color.DARK_GRAY));
           panelContent.add(mont, gct);
            gct.insets=new Insets(5, -425, 3, 3);
           gct.gridx = 3;
           gct.gridy = 11;
           da=new JTextField(2);
           da.setForeground(Color.white);
           da.setFont(new Font("Areial Black", Font.BOLD, 12));
           da.addActionListener(this);
           da.setText("25");
           da.setBackground(Color.DARK_GRAY);
           da.setBorder(new LineBorder(Color.DARK_GRAY));
           //panelContent.add(da, gct);
           gct.insets=new Insets(5, -218, 3, 3);
           gct.gridx = 3;
           gct.gridy = 11;
           ya=new JTextField(4);
           ya.setForeground(Color.white);
           ya.setFont(new Font("Areial Black", Font.BOLD, 12));
           ya.addActionListener(this);
           ya.setText("1989");
           ya.setBackground(Color.DARK_GRAY);
           ya.setBorder(new LineBorder(Color.DARK_GRAY));
           //panelContent.add(ya, gct);
           gct.insets=new Insets(0, -405, 3, 3);
           gct.gridx = 3;
           gct.gridy = 12;
            mal=new JTextField(4);
           mal.setForeground(Color.white);
           mal.setFont(new Font("Areial Black", Font.BOLD, 12));
           mal.addActionListener(this);
           mal.setText(gender);
           mal.setBackground(Color.DARK_GRAY);
           mal.setBorder(new LineBorder(Color.DARK_GRAY));
           panelContent.add(mal, gct);



        panelContent.setBackground(Color.DARK_GRAY);
        panelContent.setBorder(new LineBorder(Color.WHITE));

        panelBgImg.add(panelContent);

        panelBgImg.setLayout(new FlowLayout(FlowLayout.RIGHT, 30, 160));

       // setResizable(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    // start components
    // end components
    }

  // start methods
    public void actionPerformed(ActionEvent ae)
    {
    String s=ae.getActionCommand();
   /* String g=ae.getActionCommand();
    String un=jt1.getText();
    String p=jt2.getText();
    String cp=jt3.getText();
    String name=jt13.getText();
    String email=jt14.getText();
    String day=(String)month.getSelectedItem();
    String mon=(String)jc.getSelectedItem();
    String year=(String)jc1.getSelectedItem();
    String sex=null; */
    if(s.equals("OK"))
      {
      //System.out.println("faisal");
        dispose();
      }

    if(s.equals("Edit"))
    {
    System.out.println("hi anamn");
        new pro(obj,hh).setVisible(true);
        dispose();
    }

    }
    
      public static void main(String[] args)
    {
            // edi obj=new edi();
             //edi.
        //new edi("a","b","c","d","r","t").setVisible(true);
    }
  // end methods1
}