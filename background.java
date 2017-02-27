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
import java.lang.*;
import javax.swing.border.LineBorder;
 class signup1 extends JFrame   implements ActionListener
{


  // start attributes
    Container con = null;
   GridBagLayout layoutt = new GridBagLayout();

        JPanel panelContent = new JPanel(layoutt);
        GridBagConstraints gct = new GridBagConstraints();
       
    JPanel panelBgImg;
    JComboBox month,jc,jc1;
    JButton x,x1,btnf;
    JRadioButton b,bf;
    ButtonGroup  rbg;
  JLabel xl;
    JTextField jt1,jt13,jt14;
    JPasswordField jt2,jt3 ;

  // end attributes

    public signup1(int s)
  {
  System.out.println("i am in constructor");
  //xl.setVisible(true);
  //xl.setText("Username Already Exit");
  //xl.setVisible(true);
  
  }
  void ss()
  {
   panelContent.add(x, gct);
    gct.insets=new Insets(23, 93, 3, 3);
         gct.gridx = 1;
         gct.gridy = 16;
           xl=new JLabel("Username Already Exist");
          xl.setForeground(Color.red);
           x.addActionListener(this);
          x.setBackground(Color.LIGHT_GRAY);
        xl.setFont(new Font("Areial Black", Font.BOLD, 12));
        panelContent.add(xl, gct);
  xl.setText("Username Already Exit");
  xl.setVisible(true);
  }
    public signup1()
    {
        setTitle("background");
        //setsize(500,300);
        con = getContentPane();

        con.setLayout(null);
        ImageIcon imh = new ImageIcon("111.png");
        setSize(imh.getIconWidth(), imh.getIconHeight());

        panelBgImg = new JPanel()
        {
            public void paintComponent(Graphics g)
            {
                Image img = new ImageIcon("111.png").getImage();
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

        GridBagLayout layoutt = new GridBagLayout();

        JPanel panelContent = new JPanel(layoutt);
        GridBagConstraints gct = new GridBagConstraints();
        gct.insets = new Insets(3, -210, 3, 3);
        gct.gridx = 2;
        gct.gridy = 1;

        JLabel labelst = new JLabel("Create Your ATRON Account");
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

        JLabel labelt = new JLabel("We need some information from you to create your account");
        labelt.setForeground(Color.white);
        labelt.setFont(new Font("Areial Black", Font.BOLD, 15));
        //labels.setFont("Arial Black", Font.BOLD, 12);
        panelContent.add(labelt, gct);
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
        //labels.setFont("Arial Black", Font.BOLD, 12);
        panelContent.add(label3, gct);
         gct.insets=new Insets(73, -173, 3, 3);
         gct.gridx = 3;
         gct.gridy = 6;
           jt1=new JTextField(25);
          
          jt1.setForeground(Color.black);
        jt1.addActionListener(this);
        jt1.setFont(new Font("Areial Black", Font.BOLD, 12));
        panelContent.add(jt1, gct);
        gct.insets=new Insets(3, -173, 3, 3);
         gct.gridx = 3;
         gct.gridy = 7;
           jt2=new JPasswordField(25);
          jt2.setForeground(Color.black);
          jt2.addActionListener(this);
        jt2.setFont(new Font("Areial Black", Font.BOLD, 12));
        panelContent.add(jt2, gct);
        gct.insets=new Insets(3, -173, 3, 3);
         gct.gridx = 3;
         gct.gridy = 8;
           jt3=new JPasswordField(25);
          jt3.setForeground(Color.black);
           jt3.addActionListener(this);
        jt3.setFont(new Font("Areial Black", Font.BOLD, 12));
        panelContent.add(jt3, gct);
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
          jt13.setForeground(Color.black);
        jt13.setFont(new Font("Areial Black", Font.BOLD, 12));
        jt13.addActionListener(this);
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
    panelContent.add(jc1, gct);
    gct.insets=new Insets(0, -395, 3, 3);
           gct.gridx = 3;
           gct.gridy = 12;
           rbg=new ButtonGroup();
    b=new JRadioButton("MALE");
   b.setForeground(Color.black);
   b.setBackground(Color.orange);
   b.addActionListener(this);
    panelContent.add(b, gct);
    rbg.add(b);
    gct.insets=new Insets(0, -248, 3, 3);
    gct.gridx = 3;
    gct.gridy = 12;
     bf=new JRadioButton("FEMALE");
    bf.setBackground(Color.orange);
    bf.addActionListener(this);
    bf.setForeground(Color.black);
     panelContent.add(bf, gct);
    rbg.add(bf);
    gct.insets=new Insets(8, -173, 3, 3);
         gct.gridx = 3;
         gct.gridy = 13;
           jt14=new JTextField(25);
          jt14.setForeground(Color.black);
           jt14.addActionListener(this);
        jt14.setFont(new Font("Areial Black", Font.BOLD, 12));
       panelContent.add(jt14, gct);
        String az="By clicking 'the create account button', I accept the ATRON End User License Agreement";
        gct.insets=new Insets(23, -295, 3, 3);
         gct.gridx = 3;
         gct.gridy = 15;
          JLabel r=new JLabel(az);
          r.setForeground(Color.orange);
        r.setFont(new Font("Areial Black", Font.BOLD, 12));
        panelContent.add(r, gct);
        gct.insets=new Insets(23, 93, 3, 3);
         gct.gridx = 3;
         gct.gridy = 16;
           x=new JButton("I Accept - Create Account");
          x.setForeground(Color.black);
           x.addActionListener(this);
          x.setBackground(Color.LIGHT_GRAY);
        x.setFont(new Font("Areial Black", Font.BOLD, 12));
        panelContent.add(x, gct);
//    gct.insets=new Insets(23, 93, 3, 3);
  //       gct.gridx = 1;
    //     gct.gridy = 16;
      //     xl=new JLabel("Username Already Exist");
       //   xl.setForeground(Color.red);
          // x.addActionListener(this);
          //x.setBackground(Color.LIGHT_GRAY);
       // xl.setFont(new Font("Areial Black", Font.BOLD, 12));
      //  panelContent.add(xl, gct);
  //  xl.setVisible(false);
        gct.insets=new Insets(23, 3, 3, 3);
         gct.gridx = 4;
         gct.gridy = 16;
           x1=new JButton("Cancel");
          x1.setForeground(Color.black);
          x1.setBackground(Color.LIGHT_GRAY);
        x1.setFont(new Font("Areial Black", Font.BOLD, 12));
       panelContent.add(x1, gct);
        x1.addActionListener(this);

        panelContent.setBackground(Color.DARK_GRAY);
        panelContent.setBorder(new LineBorder(Color.WHITE));

        panelBgImg.add(panelContent);

        panelBgImg.setLayout(new FlowLayout(FlowLayout.RIGHT, 1330, 160));

       // setResizable(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    // start components
    // end components
    }

  // start methods
    public void actionPerformed(ActionEvent ae)
    {
    String g=ae.getActionCommand();
    if(g.equals("Cancel"))
      {

        dispose();
      }
  
    //String g=ae.getActionCommand();
    String un=jt1.getText();
    char pa[]=jt2.getPassword();
   String pas=String.valueOf(pa);
  
    char cp[]=jt3.getPassword();
     String pac=String.valueOf(cp);
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
      if(ae.getSource()==x)
      {
      if(un.equals("")||pas.equals("")||pac.equals("")||name.equals("")||email.equals("")||sex==null||day.equals("DAY")||mon.equals("MONTH")||year.equals("YEAR"))
   {
   if(un.equals(""))
   {
   jt1.setBackground(Color.pink);

   }
   if(pas.equals(""))
   {
   jt2.setBackground(Color.pink);

    }
    if(pac.equals(""))
   {
   jt3.setBackground(Color.pink);

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
    if(day.equals("DAY"))
   {
   jc.setBackground(Color.pink);
    }
    if(mon.equals("MONTH"))
   {
   month.setBackground(Color.pink);
    }
    if(year.equals("YEAR"))
   {
   jc1.setBackground(Color.pink);
    }
    }
      else
      {
    System.out.println("sign up dtaa");
      jt1.setBackground(Color.white);
      jt2.setBackground(Color.white);
      jt3.setBackground(Color.white);
      jt13.setBackground(Color.white);
      jt14.setBackground(Color.white);
      jc.setBackground(Color.orange);
      month.setBackground(Color.orange);
      jc1.setBackground(Color.orange);
      b.setBackground(Color.orange);
      bf.setBackground(Color.orange);
         String date=day+mon+year;
     clientinfo o=new clientinfo(name,un,pas,sex,date,email);
    // dispose();
     }
      }
    }
  // end methods
}
public class background extends JFrame implements ActionListener
{
JLabel wa,wq;
JLabel lb;
JPasswordField txtName1;
JTextField txtName;
JButton btn,btnf;
GridBagLayout layout = new GridBagLayout();

        JPanel panelContent = new JPanel(layout);
        GridBagConstraints gc = new GridBagConstraints();


  // start attributes1
    Container con = null;
     private JProgressBar jpb = new JProgressBar();
    JPanel panelBgImg;
  // end attributes1


    public background()
    {
        setTitle("ATRON");
        //setsize(500,300);
        con = getContentPane();

        con.setLayout(null);
        ImageIcon imh = new ImageIcon("testing.png");
        setSize(imh.getIconWidth(), imh.getIconHeight());

        panelBgImg = new JPanel()
        {
            public void paintComponent(Graphics g)
            {
                Image img = new ImageIcon("testing.png").getImage();
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

        //GridBagLayout layout = new GridBagLayout();

        //JPanel panelContent = new JPanel(layout);
        //GridBagConstraints gc = new GridBagConstraints();
        gc.insets = new Insets(3, -10, 3, 3);
        gc.gridx = 2;
        gc.gridy = 1;

        JLabel labels = new JLabel("Sign In To ATRON ", JLabel.CENTER);
        labels.setForeground(Color.blue);
        //labels.setFont(new Font("Arial Black", Font.BOLD, 12));
        //labels.setFont("Arial Black", Font.BOLD, 12);
        panelContent.add(labels, gc);
        
        /*gc.insets = new Insets(3, 3, 3, 3);
        gc.gridx = 1;
        gc.gridy = 2;

        JLabel labelsl = new JLabel(" ", JLabel.LEFT);
        panelContent.add(labelsl, gc);*/
        
        gc.insets = new Insets(3, 3, 3, 3);
        gc.gridx = 1;
        gc.gridy = 3;

        JLabel label = new JLabel("UserName: ", JLabel.LEFT);
        label.setForeground(Color.blue);
        panelContent.add(label, gc);

        gc.gridx = 2;
        gc.gridy = 3;

         txtName = new JTextField(16);
        panelContent.add(txtName, gc);
        
        gc.insets = new Insets(3, 3, 3, 3);
        gc.gridx = 1;
        gc.gridy = 4;

        JLabel label1 = new JLabel("Password: ", JLabel.LEFT);
        label1.setForeground(Color.blue);
        panelContent.add(label1, gc);

        gc.gridx = 2;
        gc.gridy = 4;

         txtName1 = new JPasswordField(16);
        panelContent.add(txtName1, gc);


        gc.insets = new Insets(3, -35, 3, 3);
        gc.gridx = 1;
        gc.gridy = 5;
        gc.gridwidth = 2;

         btn = new JButton("LOGIN");
        btn.setBackground(Color.white);
        btn.setForeground(Color.blue);
        panelContent.add(btn, gc);
        btn.addActionListener(this);
        gc.insets = new Insets(3, 75, 3, 3);
        gc.gridx = 2;
        gc.gridy = 5;
        gc.gridwidth = 2;
         btnf = new JButton("Can't Access");
        btnf.setBackground(Color.white);
        btnf.setForeground(Color.blue);
    btnf.addActionListener(this);
        panelContent.add(btnf, gc);
        
        gc.insets = new Insets(3, 63, 3, 3);
        gc.gridx = 1;
        gc.gridy = 6;
        gc.gridwidth = 2;

        JLabel labela = new JLabel("Don't Have ATRON ID ? ", JLabel.LEFT);
        labela.setForeground(Color.blue);
        panelContent.add(labela, gc);

        gc.insets = new Insets(3, 85, 3, 3);
        gc.gridx = 1;
        gc.gridy = 7;
        gc.gridwidth = 2;

        JButton btnu = new JButton("SIGN UP");
        btnu.setBackground(Color.white);
        btnu.setForeground(Color.blue);
        btnu.addActionListener(this);
        panelContent.add(btnu, gc);
        gc.insets = new Insets(3, 85, 3, 3);
        gc.gridx = 1;
        gc.gridy = 8;
        gc.gridwidth = 2;

        JButton btnuh = new JButton("HELLO");
        btnuh.setBackground(Color.white);
        btnuh.setForeground(Color.blue);
        btnuh.addActionListener(this);
        //panelContent.add(btnuh, gc);

        
        gc.insets = new Insets(3, -125, 3, 3);
        gc.gridx = 1;
        gc.gridy = 7;
        gc.gridwidth = 2;

         lb = new JLabel("faisal sajjad bhatti");
        lb.setForeground(Color.red);
        lb.setText("Invalid Username&Password");
         lb.setFont(new Font("serif", Font.BOLD, 10));
        //lb.addActionListener(this);
        lb.setVisible(false);
        panelContent.add(lb, gc);


        panelContent.setBackground(Color.black);
        panelContent.setBorder(new LineBorder(Color.black));

        panelBgImg.add(panelContent);

        panelBgImg.setLayout(new FlowLayout(FlowLayout.RIGHT, 520, 245));

       // setResizable(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    // start components1
    // end components1
    }

  // start methods1
    public void actionPerformed(ActionEvent ae)
  {

  String sq=ae.getActionCommand();
   if(sq.equals("Can't Access"))
  {
  
    client ou=new client(2);
    ou.cant();
  }
  if(sq.equals("LOGIN"))
  {
  if(ae.getSource()==btn)
  {
  
  System.out.println("xcccc");
  String a=txtName.getText();
  char z[]=txtName1.getPassword();
  String b=String.valueOf(z);
   if(a.equals("")||b.equals(""))
   {
   if(a.equals(""))
   {
   txtName.setBackground(Color.pink);

   }
   if(b.equals(""))
   {
   txtName1.setBackground(Color.pink);

    }
    }
    else
    {
     txtName.setBackground(Color.white);
     txtName1.setBackground(Color.white);
    String mes="0"+a+"#"+b;
    client obj=new client(this);
    obj.setconnection1(mes);
   // dispose();
  }          }


  }
  if(sq.equals("SIGN UP"))
  {
  new signup1().setVisible(true);
  //signup1 ob=new signup1().setVisible(true);
  //ob.init1();
  }
  }

    public static void main(String[] args)
    {
        new background().setVisible(true);
    }
  // end methods1
}
