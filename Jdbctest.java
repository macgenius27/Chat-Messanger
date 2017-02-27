
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;
import java.sql.*;
import javax.swing.*;
class Jdbctest
{
String createResult;
Connection con=null;
Statement s=null;
//PreparedStatement p=null;
int count=0;
static int o=0;
ResultSet result =null;
Jdbctest()
{
}
  Jdbctest(String name,String username,String pasword,String gender,String  date,String email)
  {
  //this.createtable();

  }
  public void check()
  {
  try
  {
   Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
     String conStr = "jdbc:odbc:Driver={Microsoft Access Driver (*.mdb, *.accdb)};DBQ=" +"D:\\final1\\data.accdb";
      con = DriverManager.getConnection(conStr);
     s = con.createStatement();
     
     System.out.println("connection created");
    // System.out.println("fffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffff");
    /* Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
              // creating connection toth data base
               con = DriverManager.getConnection("jdbc:odbc:data","",""); */

            //   s = con.createStatement();
            /*   createResult = "create table status(" +"username VARCHAR(30), " +"statUs VARCHAR(30))";
     s.executeUpdate(createResult) ;
  System.out.println("table created"); */

   
    
     //result = s.executeQuery("SELECT St_ID, Name FROM Table");

      //System.out.println("Got results:");
      //while(result.next())
      //{ // process results one row at a time
        //int ID = result.getInt(1);
        //String name = result.getString(2);

        //System.out.println("St_ID = " + ID);
        //System.out.println("Name = " + name);
      //}
      // createResult = "create table ST_Result (" +"St_ID INTEGER, " +"Name VARCHAR(30))";
      // s.executeUpdate(createResult) ;
      // s.close();
      //con.close();

   }
  catch(Exception h)
  {
  System.out.println(h);
  }
  
  }
  /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
  void set_status(String username)
  {
  try
  {
  
  //createResult = "create table status(" +"username VARCHAR(30), " +"statUs VARCHAR(30))";
    // s.executeUpdate(createResult) ;
   
  

     PreparedStatement p=null;
     p = con.prepareStatement ("INSERT INTO status (username, statUs) VALUES(?,?)");
     p.setString(1,username);
     p.setString(2,"on");
     p.executeUpdate ();
  }
  catch(Exception e)
  {
  System.out.println("set status  "+e );
  }
  }
  /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
  void delete_friend(String username,String todelete)
  {
  int flag=0;
  try
  {
  String sql= "SELECT friend_id FROM friends WHERE username = '"+username+"'";
 result= s.executeQuery(sql);
  while(result.next())
    {         
      String usernme = result.getString(1);
    System.out.println(usernme);
    if(todelete.equals(usernme))
    {
    flag=1;
    break;
    }
    }
    }
    catch(Exception ppp)
    {
    System.out.println("1965");
    System.out.println(ppp);
    }
    if(flag==1)
    {
    try
    {
    
    String sql = "DELETE FROM  friends  WHERE username = '"+username+"'"+"AND friend_id ='"+todelete+"'";
   s.executeUpdate(sql);
    String sql1 = "DELETE FROM  friends  WHERE username = '"+todelete+"'"+"AND friend_id ='"+username+"'";
   s.executeUpdate(sql1);
   s.close();
   
   }
   catch(Exception d)
   {
   System.out.println(d);
   }
   }
   
   

  }
  //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
  String  cantaccess(String usern,String emails)
  {
  System.out.println("i am in cant access");
  try
  {
  String name,username,pasword="",gender,date,email="";
  String sql = "SELECT * FROM ali  WHERE username = '"+usern+"'";
  result= s.executeQuery(sql);
  
    while(result.next())
    {         
       name = result.getString(1);
    username=result.getString(2);
     pasword=result.getString(3);
     gender=result.getString(4);
     date=result.getString(5);
     email=result.getString(6);
    
   }
   if(email.equals(emails))
   {
   System.out.println("ok data matched");
   return "1"+pasword;
  
   }
  }
  catch(Exception gf)
  {
  System.out.println(gf);
  }
  return "0";
  }
  /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
  LinkedList list_friends(String usser)
  {
  System.out.println("usser is"+usser);
  LinkedList list=new LinkedList();
  try
 {
String sql= "SELECT friend_id FROM friends WHERE username = '"+usser+"'";
 result= s.executeQuery(sql);
  while(result.next())
    {         
  System.out.println("i am in while of list friends");
      String usernme = result.getString(1);
    
    System.out.println(usernme);
  // String a= check_status(usernme);
   //if(a.equals("on"))
   // {
   // System.out.println(usernme);
    list.add(usernme);
    }
    System.out.println("list is"+list);
    
  //  s.close();
    //  con.close();
   // result=null;
    
    
  }
  catch(Exception vc)
  {
  System.out.println("ali ahsan");
  System.out.println(vc);
  }
  return list;
  }
  ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
   LinkedList listor_friends(String usser)
  {
  System.out.println("usser is"+usser);
  LinkedList list=new LinkedList();
  try
 {
 ResultSet resultw=null;
String sql= "SELECT friend_id FROM friends WHERE username = '"+usser+"'";
 resultw= s.executeQuery(sql);
 if(resultw==null)
 {
 System.out.println("result set is null");
 }
 else
 {
 //String usernmef = resultw.getString(1);
    
  //  System.out.println(usernmef);
    System.out.println("i am in else");
  while(resultw.next())
    {         
  System.out.println("i am in while of list friends");
      String usernme = resultw.getString(1);
    System.out.println(usernme);
  // String a= check_status(usernme);
   //if(a.equals("on"))
   // {
   // System.out.println(usernme);
   list.add(usernme);
    }
    
    System.out.println("list is"+list);
    
  //  s.close();
     // con.close();
   // result=null;
  
    
  }
  }
  
  catch(Exception vc)
  {
  System.out.println("ali ahsan");
  System.out.println(vc);
  }
  return list;
  }
  //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
  String check_status(String username)
  {
  String user="" ;
  try
  {
 // createResult = "create table stat(" +"username VARCHAR(30), " +"statUs VARCHAR(30))";
   // s.executeUpdate(createResult) ;
   String sql="SELECT statUs FROM status WHERE username = '"+username+"'";
  result= s.executeQuery(sql);
  while(result.next())
    {

  user = result.getString(1);
  System.out.println(user);
  }
  
   if(user.equals("on"))
  {
  return "on";
  }
 }
  catch(Exception et)
  {
  System.out.println("problem is here");
  System.out.println(et);
  }
  return "off";
  }
  
public  String searchdata(String username,String pasword)
  
  {
  int i=0;
   try
    {
result = s.executeQuery("SELECT username, pasword FROM ali");

    System.out.println("Got results:");
    while(result.next())
    {         
      String usernme = result.getString(1);
    String paswrd=result.getString(2);
    if(usernme.equals(username)&&paswrd.equals(pasword))
    {
        System.out.println("data found");
      System.out.println(username);
      System.out.println(pasword);
      i=1;
      break;
      
    }
  
   }
   if(i==1)
  {
  System.out.println("dd");
      
  String x="ok";
  System.out.println("sdshgdhygdsgys");
     return   x+"("+username; 
   }
   else
   {
   System.out.println("sssssssssssss");
    return "0"+"("+username;
   }
    }
    catch(Exception e)
    {
      System.out.println("dd");
      System.out.println(e);
    }
   
 return "0"+"("+username;
  
  }
  String search_username(String name)
  {
  int i=0;
   try
    {
result = s.executeQuery("SELECT username FROM ali");

    System.out.println("Got results:");
    while(result.next())
    {
System.out.println("i am in while");         
      String usernme = result.getString(1);
  if(name.equals(usernme))
  {
  i=1;
  break;
  }
  }
  }
  catch(Exception r)
  {
  System.out.println(r);
  }
  if(i==1)
  {
  
  return "invalid";
  }
  else
  {
  return "ok";
  }
  }
  String profile(String nick)
  {
  try
  {
  String name="";
  String username="";
  String pasword="";
  String gender="";
  String date="";
  String email="";
  String ss="";
   String sql = "SELECT * FROM ali  WHERE username = '"+nick+"'";
  result= s.executeQuery(sql);
  
    while(result.next())
    {         
       name = result.getString(1);
    username=result.getString(2);
     pasword=result.getString(3);
     gender=result.getString(4);
     date=result.getString(5);
     email=result.getString(6);
  //  System.out.println(name);
//    System.out.println(username);/
//    System.out.println(username1);
  //  System.out.println(username2);
//    System.out.println(username3);
//    System.out.println(username4);
    
   }
    ss="6"+"$"+name+"!"+username+"#"+pasword+"%"+gender+"&"+date+"*"+email;
 return ss;

   }
   catch(Exception ff)
   {
   System.out.println(ff);
   }
     return "0";
  }
  void edit_profile(String name,String username,String pasword,String gender,String date,String email)
  {
   
   try
   {
   String sql = "DELETE FROM  ali  WHERE username = '"+username+"'";
   s.executeUpdate(sql);
   PreparedStatement p=null;
   p = con.prepareStatement ("INSERT INTO ali (name, username,pasword,gender,date_of_birth,email) VALUES(?,?,?,?,?,?)");
   p.setString (1, name);
   p.setString (2, username);
   p.setString(3,pasword);
   p.setString(4,gender);
   p.setString(5,date);
   p.setString(6,email);
   p.executeUpdate ();
   }
   catch(Exception z)
   {
   System.out.println("aaaaaaaaaassssdsdsd");
   System.out.println(z);
   }
  
  
  
  }
  void update_status(String clientname)
  {
  try
  {
   String sql = "DELETE FROM  status  WHERE username = '"+clientname+"'";
   s.executeUpdate(sql);
   s.close();
   con.close();
  }
  catch(Exception p)
  {
  System.out.println("updating problem"+p);
  }
  }
  ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
   void createtable(String nam,String username,String pasword,String gender,String date,String email)
  {
    try
    {
  //  if(count==0)
  //  {
   //  createResult = "create table ali (" +"name VARCHAR(30), " +"username VARCHAR(30),"+"pasword VARCHAR(30),"+"gender VARCHAR(30),"+" date_of_birth VARCHAR(30),"+" email  VARCHAR(30))";
     //  s.executeUpdate(createResult) ;
       //count++;
   // }
  PreparedStatement p=null;
   p = con.prepareStatement ("INSERT INTO ali (name, username,pasword,gender,date_of_birth,email) VALUES(?,?,?,?,?,?)");
   p.setString (1, nam);
   p.setString (2, username);
   p.setString(3,pasword);
   p.setString(4,gender);
   p.setString(5,date);
   p.setString(6,email);
   p.executeUpdate ();


      // createResult = "create table a (" +"name VARCHAR(30), " +"username VARCHAR(30),pasword VARCHAR(30),"+"email VARCHAR(30))";
      // s.executeUpdate(createResult) ;
       //String insertResult;="insert into St_perinfo12345 values"+"("+1,faisal,sajjad,3)";
      //s.executeUpdate("insert into a  " +  "values('alsssssi','aldfdfdis','ahfdgfdfgdfsan','ffffdfdgff' )")
       s.close();
      con.close();
    }
    catch(Exception e)
   {
     System.out.printf("creating problem"+e);
   }
  }
 /* void delete()
  {
    try{
         String query = "delete from ST_perinfof";
      PreparedStatement pstmt = con.prepareStatement(query);
      pstmt.executeUpdate();

      }
      catch (SQLException s){
        System.out.println("SQL statement is not executed!");
      }
  } */
  ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
  int set_friends(String friend,String user,int check)
  {
  int flag=9;
  int ck=88;
 System.out.println("i am in set friends");
 System.out.println(friend);
 System.out.println(user);
String q= search_username(friend);
  System.out.println("value of q is"+q);
  
  if(q.equals("invalid"))
  {
  flag=0;
  ck=1;
  try
  {
  String sql= "SELECT friend_id FROM friends WHERE username = '"+user+"'";
System.out.println("i am in set friends trtr ccdcd");
result= s.executeQuery(sql);
System.out.println("i am in set friends trtr kijhtgijr");
  while(result.next())
    {
System.out.println("aaaaaaaaaaaaaaaaaaaaaaaa");         
      String friendid = result.getString(1);
    System.out.println(friendid);
    if(friend.equals(friendid))
    {
    flag=1;
    ck=0;
    System.out.println("ha pahalay para howa ha");
    return 1;
    }
    
   }
   }
   catch(Exception h)
   {
   System.out.println("jjjjjjjjjjjjjjjjjjjjjjjjjjj");
   
   System.out.println(h);
   }
   }
   
System.out.println("i am in else");
System.out.println("value of flag is");
System.out.println(flag);

if(flag==0&&ck==1)
{  
System.out.println("i am in if");
try
  {  
  String h="INSERT INTO friends (username,friend_id) VALUES(?,?)";
  System.out.println("asasasas");
  PreparedStatement p=null;
     p = con.prepareStatement(h);
     p.setString(1,user);
     p.setString(2,friend);
     p.executeUpdate();
    // p=null;
    // p = con.prepareStatement ("INSERT INTO friends (username,friend_id) VALUES(?,?)");
    //  p.setString(1,friend);
    // p.setString(2,user);
  //  s.close();
    //  con.close();  
  
  }
  catch(Exception ex)
  {
  System.out.println(ex);
  }
  return 0;
  } 

return 0;
}
  /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
  public static void main(String[] args)
  {
    Jdbctest obj = new Jdbctest();
  obj.check();
  String o="oop";
  
  //obj.createtable("cscs","sdsds","fdfd","dd","fhgt","htht");
  //obj.set_friends("ali","oop",0);
  obj.listor_friends(o);
  //obj.searchdata();
    //obj.delete();
  }
}
