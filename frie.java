import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.*;
import javax.swing.*;
public class frie implements ActionListener
{
 Image icon;
        ImageIcon tivitImage1;
    Container con = null;
    JList list;
    DefaultListModel ab1 = new DefaultListModel();
    JList list2;
    DefaultListModel ab12 = new DefaultListModel();

    JPanel panelBgImg;
  JFrame fx;
    GridBagLayout layout = new GridBagLayout();

        JPanel panelContent = new JPanel(layout);
        GridBagConstraints gc = new GridBagConstraints();


frie()
{
//this.vf();

}
void vf()
{
  fx=new JFrame("ATRON");
 //com.sun.awt.AWTUtilities.setWindowOpacity(fx, 0.7f);
    fx.setSize(350,600);
    JPanel px=new JPanel();
    fx.add(px);
    px.setBackground(Color.LIGHT_GRAY);

    GridBagLayout layout = new GridBagLayout();

        px.setLayout(layout);
        GridBagConstraints gc = new GridBagConstraints();
        gc.insets = new Insets(-470, -15, 3, 3);
        gc.gridx = 2;
        gc.gridy = 1;

        JLabel labels = new JLabel("CONTACT LIST");
        labels.setForeground(Color.blue);
        labels.setFont(new Font("Areial Black", Font.BOLD, 25));
        //labels.setFont("Arial Black", Font.BOLD, 12);
        px.add(labels, gc);
       gc.insets = new Insets(-130, -53, 3, 3);
        gc.gridx = 2;
        gc.gridy = 1;
        list=new JList(ab1);
         list.setBackground(Color.LIGHT_GRAY);
        list.setForeground(Color.black);
       /* imag();
     ab1.addElement(tivitImage1);
     imag();
     ab1.addElement(tivitImage1);
     imag();
     ab1.addElement(tivitImage1);   */

            //list1.addListSelectionListener(this);
        //JLabel label = new JLabel("UserName: ", JLabel.LEFT);
        //label.setForeground(Color.blue);
        px.add(list, gc);
        gc.insets = new Insets(-130, 60, 3, 3);
        gc.gridx = 2;
        gc.gridy = 1;
        list2=new JList(ab12);
         list2.setBackground(Color.LIGHT_GRAY);
        list2.setForeground(Color.black);
            //list1.addListSelectionListener(this);
        //JLabel label = new JLabel("UserName: ", JLabel.LEFT);
        //label.setForeground(Color.blue);
        px.add(list2, gc);



        gc.insets = new Insets(463, -25, 3, 3);
        gc.gridx = 2;
        gc.gridy = 1;
        gc.gridwidth = 2;

        JButton btnu = new JButton("OK");
        btnu.setBackground(Color.white);
        btnu.setForeground(Color.blue);
        btnu.addActionListener(this);
        px.add(btnu, gc);



        fx.setContentPane(px);
        fx.setVisible(true);
}
void icon(String name)
{
imag();
     ab1.addElement(tivitImage1);
     ab12.addElement(name);
}
 public void actionPerformed(ActionEvent ae)
  {

  String sq=ae.getActionCommand();
  if(sq.equals("OK"));
   {
fx.dispose();
     
   }

  }
  void imag()
   {
      tivitImage1 = new ImageIcon("a1.jpg");
     //ab12.addElement( tivitImage1);
   }
public static void main(String[] args)
  {
    frie obj=new frie();
    obj.vf();
  }

}