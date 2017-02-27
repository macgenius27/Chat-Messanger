import java.util.LinkedList;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.*;
import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import java.util.Queue;
class Data
  {
    String pname,brusttime;
    public String toString()
    {
      return pname+brusttime;
    }
  }
class tthread extends Thread
{
String time;
  String second;
  public final Label lblTime1 = new Label();
   tthread()
   {

   }
   public void run()
  {
  //count=0;
  while (true)
      {
       Calendar now = Calendar.getInstance();
       String hour = Integer.toString(now.get(Calendar.HOUR));
       if (hour.equals("0")) hour = "12";
       String minute = Integer.toString(now.get(Calendar.MINUTE));
       if (minute.length() == 1) minute = "0" + minute;
        second = Integer.toString(now.get(Calendar.SECOND));
       if (second.length() == 1) second = "0" + second;
       //second.addActionListener(this);
       String ampm = now.get(Calendar.AM_PM) == Calendar.AM? "AM" : "PM";
        lblTime1.setText(hour + ":" + minute + ":" + second/*+ " " + ampm*/);
    try
    {
        sleep(500);
    }
    catch (InterruptedException e)
    {
    }
      }
    }

}
 class guit extends Thread implements ActionListener,ListSelectionListener
{
JTextField ar2,ts;
int i=1;
 int count1=1;
 int k=1;
  JFrame fx=new JFrame("HOME");
 JPanel px=new JPanel();
  JList list;
  JLabel bs,ar1,ws,wa,wq;
 Aqueue a =new Aqueue();
tthread t=new tthread();
Data r1=new Data();
 public final Label lblTime1 = new Label();
GridBagConstraints gct = new GridBagConstraints();
 DefaultListModel ab12 = new DefaultListModel();
 DefaultListModel ab1 = new DefaultListModel();
 Image icon;
GridBagLayout layout = new GridBagLayout();
 guit()
 {

 }
  void form()
  {
        fx.setSize(900,500);
        px.setLayout(layout);
        px.setBackground(Color.yellow);
        gct.insets = new Insets(-393, 200, 3, 3);
        gct.gridx = 2;
        gct.gridy = 1;
         ws=new JLabel("PROCESS ENTRY FORM");
       // ts.setText("JOB TITTLE");
        ws.setFont(new Font("Arial Black", Font.BOLD, 20));
        //ws.setBackground(Color.white);
        ws.setForeground(Color.red);
        px.add(ws,gct);

        //GridBagConstraints gct = new GridBagConstraints();
        gct.insets = new Insets(-253, 300, 3, 3);
        gct.gridx = 2;
        gct.gridy = 1;
         ts=new JTextField(20);
       // ts.setText("JOB TITTLE");
        ts.setFont(new Font("Arial Black", Font.BOLD, 10));
        ts.setBackground(Color.white);
        ts.setForeground(Color.black);
        px.add(ts,gct);
        gct.insets = new Insets(-253, -45, 3, 3);
        gct.gridx = 2;
        gct.gridy = 1;
          ar1 = new JLabel("JOB TITTLE*");
        ar1.setForeground(Color.red);
        ar1.setBackground(Color.white);
        ar1.setFont(new Font("Arial Black", Font.BOLD, 12));
        px.add(ar1,gct);

        gct.insets = new Insets(-180, -60, 3, 3);
        gct.gridx = 2;
        gct.gridy = 1;
         bs=new JLabel("JOB TIME*");
        bs.setFont(new Font("Arial Black", Font.BOLD, 12));
        bs.setBackground(Color.orange);
        bs.setForeground(Color.red);
       // bs.addActionListener(this);
        px.add(bs,gct);
        gct.insets = new Insets(-180, 300, 3, 3);
        gct.gridx = 2;
        gct.gridy = 1;
          ar2 = new JTextField(20 );
        ar2.setForeground(Color.black);
        ar2.setBackground(Color.white);
        //ar2.setHighlighter("job time");
        //ar2.setText("job time");
        ar2.setFont(new Font("Arial Black", Font.BOLD, 10));
        px.add(ar2,gct);
        gct.insets = new Insets(-110, 280, 3, 3);
        gct.gridx = 2;
        gct.gridy = 1;
        JButton bs1=new JButton("SUBMIT PROCESS");
        bs1.setFont(new Font("Arial Black", Font.BOLD, 10));
        bs1.setBackground(Color.red);
        bs1.setForeground(Color.white);
        bs1.addActionListener(this);
        px.add(bs1,gct);
         gct.insets = new Insets(250, -135, 3, 3);
        gct.gridx = 2;
        gct.gridy = 1;
        JButton bsa=new JButton("NEW PROCESS");
        bsa.setFont(new Font("Arial Black", Font.BOLD, 10));
        bsa.setBackground(Color.red);
        bsa.setForeground(Color.white);
        bsa.addActionListener(this);
        px.add(bsa,gct);
         gct.insets = new Insets(250,128, 3, 3);
        gct.gridx = 2;
        gct.gridy = 1;
        JButton bs1t=new JButton("START TIME");
        bs1t.setFont(new Font("Arial Black", Font.BOLD, 10));
        bs1t.setBackground(Color.red);
        bs1t.setForeground(Color.white);
        bs1t.addActionListener(this);
        px.add(bs1t,gct);
        gct.insets = new Insets(250, 425, 3, 3);
        gct.gridx = 2;
        gct.gridy = 1;
        JButton bs1p=new JButton("START PROCESSING");
        bs1p.setFont(new Font("Arial Black", Font.BOLD, 10));
        bs1p.setBackground(Color.red);
        bs1p.setForeground(Color.white);
        bs1p.addActionListener(this);
        px.add(bs1p,gct);
         gct.insets = new Insets(250, 700, 3, 3);
        gct.gridx = 2;
        gct.gridy = 1;
        JButton bs1q=new JButton("QUIT APP");
        bs1q.setFont(new Font("Arial Black", Font.BOLD, 10));
        bs1q.setBackground(Color.red);
        bs1q.setForeground(Color.white);
        bs1q.addActionListener(this);
        px.add(bs1q,gct);




        gct.insets = new Insets(-393, -683, 3, 3);
        gct.gridx = 2;
        gct.gridy = 1;
        JLabel ls=new JLabel("QUEUE PROCESS");
        ls.setFont(new Font("Arial Black", Font.BOLD, 18));
       // ls.setBackground(Color.white);
        ls.setForeground(Color.red);
        px.add(ls,gct);
        gct.insets = new Insets(-163, -683, 3, 3);
        gct.gridx = 2;
        gct.gridy = 1;
        /* ab1.addElement( "ALI" );
         ab1.addElement( "IMRAN" );
         ab1.addElement( "FAISAL" );
         ab1.addElement( "HASSAN" );
         ab1.addElement( "SIR SAQLAIN" );
         ab1.addElement( "IRFAN" );
         ab1.addElement( "SIR IMRAN" );
          ab1.addElement( "SIR SHEHZAD ASHRAF" ); */
         list=new JList(ab1);
         list.setBackground(Color.YELLOW);
        list.setForeground(Color.red);
            list.addListSelectionListener(this);
        //list.setSelectedIndex(0);
        px.add(list,gct);
        //fx.setIconImage(icon);
        fx.setContentPane(px);
        //fx.setResizable(false);
        fx.setVisible(true);
        //ab1.addElement( "ho ja0" );


}
 void chech()
  {
    gct.gridx = 2;
    gct.gridy = 1;
  //  gc.gridwidth = 1;
    //gc.gridheight = 5;
    gct.fill = GridBagConstraints.HORIZONTAL;
    gct.insets = new Insets(80,495,3,3);
    t.lblTime1.setFont(new Font("Areial Black", Font.BOLD, 25));
    t.lblTime1.setForeground(Color.red);
   layout.setConstraints(t.lblTime1, gct);
    px.add(t.lblTime1);
    t.setDaemon(true);
    t.start();

  }
  void ass()
  {

  try
  {
    while ((a.queue.element()) != null)
     {
     r1 = (Data)a.queue.remove();
     ab1.removeElement(r1);
     break;
      //System.out.println(r1);
    }
    }
    catch(Exception e )
    {

    }

  }
  public void run()
  {
  Data r1;
      while (true)
      {
       try
        {
          while ((a.queue.element()) != null)
          {
          for(int i=1;i<=9200;i++)
          {
          System.out.println("r1");
          }
           r1 = (Data)a.queue.remove();
           ab1.removeElement(r1);
           System.out.println(r1);
          }
         }
         catch(Exception e )
         {

         }

      }
   }


 public void actionPerformed(ActionEvent ae)
  {
  Data r=new Data();
       String s=ae.getActionCommand();
          if(s.equals("SUBMIT PROCESS"))
          {
           String k=ts.getText();
           r.pname=k;
           String h=ar2.getText();
           r.brusttime=h;
           String l=null;
           if(k.equals("")||h.equals(""))
            {             if(k.equals(""))
                          {
                    gct.insets = new Insets(-253, 650, 3, 3);
                    gct.gridx = 2;
                    gct.gridy = 1;
                    wa=new JLabel("FILL THIS FILED");
                    // ts.setText("JOB TITTLE");
                      wa.setFont(new Font("serif", Font.BOLD, 10));
                      wa.setBackground(Color.white);
                      wa.setForeground(Color.black);
                       px.add(wa,gct);
                          }
                          if(h.equals(""))
                          {
                    gct.insets = new Insets(-180, 650, 3, 3);
                    gct.gridx = 2;
                    gct.gridy = 1;
                    wq=new JLabel("FILL THIS FILED");
                    // ts.setText("JOB TITTLE");
                      wq.setFont(new Font("serif", Font.BOLD, 10));
                      wq.setBackground(Color.white);
                      wq.setForeground(Color.black);
                       px.add(wq,gct);

                           }

              fx.setContentPane(px);
              fx.setVisible(true);


            }
             else
             {
             try
             {
                wa.setVisible(false);
              //wq.setVisible(false);
              }
              catch(Exception e)
              {

              }
              try
             {
                //wa.setVisible(false);
              wq.setVisible(false);
              }
              catch(Exception e)
              {

              }

              a.insertq(r);
             ab1.addElement(r);
             }
          }
              if(s.equals("NEW PROCESS"))
              {
              //wa.setVisible(false);
              //wq.setVisible(false);

                ts.setText("");
                ar2.setText("");

              }
              if(s.equals("START PROCESSING"))
              {
              //ass();
              //  setDaemon(true);
               //start();
              }
              if(s.equals("START TIME"))
              {
                chech();
              }
           if(s.equals("QUIT APP"))
           {
            fx.dispose();
            }

 }

        public void valueChanged(ListSelectionEvent evt) {
        if (evt.getValueIsAdjusting())
          return;
          //String ad= evt.getValueIsAdjusting();
          //JOptionPane.showMessageDialog(null,"hi faisal");
        System.out.println("Selected from " + evt.getFirstIndex() + " to " + evt.getLastIndex()+"name"+evt.getValueIsAdjusting());
      }
      }
public class Aqueue
{
Data temp=new Data();
  Queue queue = new LinkedList();
    Aqueue()
    {

    }
    public void insertq(Data item)
    {
        queue.add(item);
    }
    void delq()
    {
        System.out.println("remove: " + queue.remove());
    }
    void check1stq()
    {

     System.out.println("element: " + queue.element());

        //Removing the first item from the queue.
        //If the queue is empty the method just returns false.
        System.out.println("poll: " + queue.poll());

        //Checking what item is first in line without removing it
        //If the queue is empty a null value will be returned.
        System.out.println("peek: " + queue.peek());
    }

       public static void main(String[] args)
    {
    guit obj = new guit();
    //obj.men();
    obj.form();


    }

}