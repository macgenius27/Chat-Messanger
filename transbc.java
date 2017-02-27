import java.awt.Color;
import java.awt.Component;
import java.awt.Frame;
import java.awt.Point;
import java.awt.Window;
import java.awt.geom.Point2D;
//import java_import 'com.sun.awt.AWTUtilities';
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
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import javax.swing.JSplitPane;
public class transbc  implements ActionListener,ListSelectionListener
{
JTextField gh,ts;
GridBagConstraints gct = new GridBagConstraints();
JFrame fc=new JFrame("CONFERENCE ROOM");
 JPanel pc=new JPanel();
  JList listc;
  JButton bs,rs;
// DefaultListModel ab12 = new DefaultListModel();
 DefaultListModel ab1c = new DefaultListModel();
 Image iconc;
GridBagLayout layoutc = new GridBagLayout();
JFrame fx=new JFrame("HOME");
 JPanel px=new JPanel();
  JList list;
 DefaultListModel ab12 = new DefaultListModel();
 DefaultListModel ab1 = new DefaultListModel();
 Image icon;
GridBagLayout layout = new GridBagLayout();
  transbc()
  {
  fc.setSize(600,500);
  // JList listScrollPane = new JList();
      iconc = Toolkit.getDefaultToolkit().getImage("C:\\Users\\faisal\\Desktop\\my\\c.png");
    //com.sun.awt.AWTUtilities.setWindowOpacity(fc, 0.7f);
  }
    void conf()
  {

        pc.setLayout(layoutc);
        pc.setBackground(Color.black);
        GridBagConstraints gctc = new GridBagConstraints();
        gctc.insets = new Insets(-60, -200, 3, 3);
        gctc.gridx = 2;
        gctc.gridy = 1;
         TextArea ar1c = new TextArea(14,45);
        ar1c.setForeground(Color.black);
        ar1c.setBackground(Color.white);
        ar1c.setFont(new Font("Arial Black", Font.BOLD, 15));
        pc.add(ar1c,gctc);

        gctc.insets = new Insets(-380, -430, 3, 3);
        gctc.gridx = 2;
        gctc.gridy = 1;
        JButton bsc=new JButton("INVITE FRIEND");
        bsc.setFont(new Font("Arial Black", Font.BOLD, 12));
        bsc.setBackground(Color.orange);
        bsc.setForeground(Color.black);
        bsc.addActionListener(this);
       pc.add(bsc,gctc);
        gctc.insets = new Insets(280, -200, 3, 3);
        gctc.gridx = 2;
        gctc.gridy = 1;
         TextArea ar2c = new TextArea(1,45);
        ar2c.setForeground(Color.black);
        ar2c.setBackground(Color.white);
        ar2c.setFont(new Font("Arial Black", Font.BOLD, 15));
        pc.add(ar2c,gctc);
        gctc.insets = new Insets(390, -505, 3, 3);
        gctc.gridx = 2;
        gctc.gridy = 1;
        JButton bs1c=new JButton("SEND");
        bs1c.setFont(new Font("Arial Black", Font.BOLD, 12));
        bs1c.setBackground(Color.orange);
        bs1c.setForeground(Color.black);
        bs1c.addActionListener(this);
        pc.add(bs1c,gctc);
        gctc.insets = new Insets(-325, 400, 3, 3);
        gctc.gridx = 2;
        gctc.gridy = 1;
        JLabel lsc=new JLabel("FRIEND LIST");
        lsc.setFont(new Font("Arial Black", Font.BOLD, 15));
        lsc.setBackground(Color.white);
        lsc.setForeground(Color.white);
        pc.add(lsc,gctc);
        gctc.insets = new Insets(-60, 400, 3, 3);
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
         list=new JList(ab12);
         list.setBackground(Color.black);
        list.setForeground(Color.WHITE);
            //listc.addListSelectionListener(this);
        list.setSelectedIndex(0);
        pc.add(list,gctc);
        fc.setIconImage(iconc);
        fc.setContentPane(pc);
        fc.setResizable(false);
        fc.setVisible(true);
        ImageIcon tivitImage = new ImageIcon("C:\\Users\\faisal\\Desktop\\my\\067.jpg","faisal");
          ab12.addElement( tivitImage);
          ab12.addElement( " Faisal" );
          ImageIcon tivitImage1 = new ImageIcon("C:\\Users\\faisal\\Desktop\\my\\0671.jpg","faisal");
          ab12.addElement( tivitImage1);
          ab12.addElement( "   Ali" );
          ImageIcon tivitImage2 = new ImageIcon("C:\\Users\\faisal\\Desktop\\my\\0672.jpg","faisal");
          ab12.addElement( tivitImage2);
          ab12.addElement( " Hassan" );
        //ab12.addElement( "Syed Muhammad Saqlain Shah" );
        //ab1.addElement( "ho jankjn" );


}

  void men()
  {
      fx.setSize(900,500);
          JList listScrollPane = new JList();
      icon = Toolkit.getDefaultToolkit().getImage("C:\\Users\\faisal\\Desktop\\my\\c.png");
    //com.sun.awt.AWTUtilities.setWindowOpacity(fx, 0.8f);
   //fx.setUndecorated(true);

   JMenuBar ob=new JMenuBar();
      //JMenu hep = new JMenu("Help");
//------------------------------------------------------------------------------
   JMenu file = new JMenu("ATRON");
    file.setMnemonic('F');
    file.setBackground(Color.black);
    file.setForeground(Color.white);
      file.setFont(new Font("Arial Black", Font.BOLD, 12));
    ob.add(file);
    ob.setBackground(Color.black);
    JMenuItem newItem = new JMenuItem("Profile");
    newItem.setForeground(Color.black);
    newItem.setFont(new Font("Arial Black", Font.BOLD, 12));
    newItem.setMnemonic('U');
    file.add(newItem);
    newItem.addActionListener(this);
    JMenuItem openItem = new JMenuItem("Sign Out");
    openItem.setMnemonic('F');
    openItem.setForeground(Color.black);
    openItem.setFont(new Font("Arial Black", Font.BOLD, 12));
    file.add(openItem);
    openItem.addActionListener(this);
    JMenuItem exitItem = new JMenuItem("Exit");
    exitItem.setForeground(Color.black);
    exitItem.setFont(new Font("Arial Black", Font.BOLD, 12));
    exitItem.setMnemonic('E');
    file.add(exitItem);
    exitItem.addActionListener(this);
//------------------------------------------------------------------------------
   JMenu cont = new JMenu("Contacts");
    cont.setMnemonic('F');
    cont.setBackground(Color.black);
    cont.setForeground(Color.white);
      cont.setFont(new Font("Arial Black", Font.BOLD, 12));
    ob.add(cont);
    ob.setBackground(Color.black);
    JMenuItem pItem = new JMenuItem("Add Contact");
    pItem.setForeground(Color.black);
    pItem.addActionListener(this);
    pItem.setFont(new Font("Arial Black", Font.BOLD, 12));
   // pItem.setMnemonic('U');
    cont.add(pItem);
    pItem.addActionListener(this);
    JMenuItem vItem = new JMenuItem("View Contacts");
    vItem.setMnemonic('F');
    vItem.setForeground(Color.black);
    vItem.setFont(new Font("Arial Black", Font.BOLD, 12));
    cont.add(vItem);
    vItem.addActionListener(this);
    JMenuItem aItem = new JMenuItem("Remove Contact");
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
    JMenuItem cItem = new JMenuItem("Conference");
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
    conv.add(caItem);
    caItem.addActionListener(this);
    JMenuItem tItem = new JMenuItem("Send Text File");
    tItem.setForeground(Color.black);
    tItem.setFont(new Font("Arial Black", Font.BOLD, 12));
    tItem.setMnemonic('E');
    conv.add(tItem);
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
    gh.setText("FAISAL SAJJAD");
    ob.add(gh);


  }
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
         TextArea ar1 = new TextArea(14,70);
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
         TextArea ar2 = new TextArea(1,60);
        ar2.setForeground(Color.black);
        ar2.setBackground(Color.white);
        ar2.setFont(new Font("Arial Black", Font.BOLD, 15));
        px.add(ar2,gct);
        gct.insets = new Insets(320, 755, 3, 3);
        gct.gridx = 2;
        gct.gridy = 1;
        JButton bs1=new JButton("SEND");
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
        gct.insets = new Insets(-123, -683, 3, 3);
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
          ImageIcon tivitImage = new ImageIcon("C:\\Users\\faisal\\Desktop\\my\\067.jpg"+"FAISAL");
          ab1.addElement(tivitImage);
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
        fx.setIconImage(icon);
        fx.setContentPane(px);
        fx.setResizable(false);
        fx.setVisible(true);
        //ab1.addElement( "   Faisal" );
       // ab1.addElement( "ho ja0" );
        //ab1.addElement( "ho ja0" );


}
public void valueChanged(ListSelectionEvent evt) {
        if (evt.getValueIsAdjusting())
          return;
          //String ad= evt.getValueIsAdjusting();
          //JOptionPane.showMessageDialog(null,"hi faisal");
        System.out.println("Selected from " + evt.getFirstIndex() + " to " + evt.getLastIndex()+"name"+evt.getValueIsAdjusting());
      }
      
      public void actionPerformed(ActionEvent ae)
   {
   String s=ae.getActionCommand();
   if(s.equals("Conference"))
   {
   conf();
   }
   if(s.equals("Add Contact"))
   {
   ts.setText("Add FRIEND");
   ts.setVisible(true);
   bs.setVisible(true);
   }
   if(s.equals("Remove Contact"))
   {
  bs.setVisible(false);
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

        }

   }
   
   public void prof()
   {

   }

     public static void main(String[] args)
    {
    transbc obj = new transbc();
    obj.men();
    obj.form();
    //obj.formc();


    }
  }