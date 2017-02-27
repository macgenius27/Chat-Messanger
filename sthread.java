import java.awt.*;
import javax.swing.*;
import java.io.*;
import java.awt.event.*;
import java.net.*;
import java.util.*;
public class sthread extends Thread
{
Socket c;
server obj;
String usernam;
static  int check=1;
LinkedList lis=new LinkedList();
public sthread()
{
}
public sthread(server bj,Socket ss)
{
this.c=ss;
this.obj=bj;
start();
}
public void run()
{
try
{
System.out.println("xxxxx");
DataInputStream  dis = new DataInputStream(c.getInputStream());
while(true)
{

String s=dis.readUTF();
process_message(s);
}
}
catch(Exception a)
{
System.out.println(a);
}
}
void check1(String username)
{
System.out.println("username is"+username);
LinkedList  final1=new LinkedList ();
Jdbctest oo=new Jdbctest();
oo.check();
LinkedList  list=oo.list_friends(username);
System.out.println("list is ");
System.out.println(list);
ListIterator l=list.listIterator();
while(l.hasNext())
{
String saz=(String)l.next();
Jdbctest oog=new Jdbctest();
oog.check();
String f=oog.check_status(saz);
if(f.equals("on"))
{
final1.add(saz);
}
}
System.out.println(final1);
concat_list(final1,username);
send_to_client(final1,username);
}
void check14(String temp2,String temp)
{
System.out.println("temp is"+temp);
System.out.println("temp2 is"+temp2);

Jdbctest test=new Jdbctest();
test.check();
int a=test.set_friends(temp2,temp,check);
int b=test.set_friends(temp,temp2,check);
System.out.println("username is"+temp2);
if(a==0&&b==0)
{
LinkedList  final1=new LinkedList ();
LinkedList  list=test.listor_friends(temp2);
System.out.println("list is of check14 ");
System.out.println(list);
System.out.println("hello");
ListIterator l=list.listIterator();
while(l.hasNext())
{
String saz=(String)l.next();
Jdbctest oog=new Jdbctest();
oog.check();
String f=oog.check_status(saz);
if(f.equals("on"))
{
final1.add(saz);
}
}
System.out.println(final1);
concat_list(final1,temp2);
send_to_client(final1,temp2);
}
}
String process_first_message(String data)
{
String name;
String username;
String pasword;
String date_of_birth;
String email;
String gender;
name=data.substring(data.indexOf("$")+1,data.indexOf("!"));
username=data.substring(data.indexOf("!")+1,data.indexOf("#"));
pasword=data.substring(data.indexOf("#")+1,data.indexOf("%"));
gender=data.substring(data.indexOf("%")+1,data.indexOf("&"));
date_of_birth=data.substring(data.indexOf("&")+1,data.indexOf("*"));
email=data.substring(data.indexOf("*")+1);
System.out.println(name);
System.out.println(username);
System.out.println(pasword);
System.out.println(gender);
System.out.println(date_of_birth);
System.out.println(email);
usernam=username;
obj.setnick(username);
int o=obj.atronclients(username);
if(o==1)
{
System.out.println("accepted");  
Jdbctest oo=new Jdbctest();
oo.check();
oo.set_status(username);

oo.createtable(name,username,pasword,gender,date_of_birth,email); 
String temp="0"+username;
obj.sendmessage(temp,username);
return username;
//String temp="0"+username;
//concat_list(ooo,username);
//obj.sendmessage(temp,username);
}
else
{
obj.sendmessage(":"+"invalid",username);
}
return username;
}
void process_message(String s)
{
String username;

String h=null;
String i=s.substring(0,1);
if(i.equals("1"))
{ 
 username=process_first_message(s);
check1(username);
}
else if(i.equals("0"))
{
int a;
a=s.indexOf("#");
String x=s.substring(1,a);
String v=s.substring(a+1);
System.out.println(x);
System.out.println(v);
Jdbctest oi=new Jdbctest();
oi.check();
String xz=oi.searchdata(x,v);
int b=xz.indexOf("(");
String xx=xz.substring(0,b);
String nick=xz.substring(b+1);
System.out.println(xx);
System.out.println(nick);
if(xx.equals("ok"))
{
obj.setnick(nick);
Jdbctest g=new Jdbctest();
g.check();
String m=g.check_status(nick);
if(m.equals("off"))
{
g.set_status(x);
String temp="0"+x;
obj.sendmessage(temp,x);
check1(x);
}
else
{
System.out.println("pakistan is the hdsjghj");
String temp="2";
obj.setnick(nick);
obj.sendmessage(temp,nick);
obj.remove_client(nick);
}


}
else
{
System.out.println("jul wa");
String temp="2";
obj.setnick(nick);
obj.sendmessage(temp,nick);
obj.remove_client(nick);
}

}
else if(i.equals("!"))
{
System.out.println(s);
int g=s.indexOf("!");
int hv=s.indexOf("$");
String offerby=s.substring(g+1,hv);
String todelete=s.substring(hv+1);
System.out.println(offerby);
System.out.println(todelete);
Jdbctest joi=new Jdbctest();
joi.check();
String p=joi.search_username(todelete);
System.out.println(p);
if(p.equals("invalid"))
{
System.out.println("i am in delete friend");
joi.delete_friend(offerby,todelete);
String mess="!"+todelete;
obj.sendmessage(mess,offerby);
String mess1="!"+offerby;
obj.sendmessage(mess1,todelete);
}
else
{

}
}
else if(i.equals("^"))
{
int a=s.indexOf("^");
int b=s.indexOf("{");
String usern=s.substring(a+1,b);
String email=s.substring(b+1);
Jdbctest joi=new Jdbctest();
joi.check();
String o=joi.cantaccess(usern,email);
String hh=o.substring(0,1);
if(hh.equals("1"))
{
obj.setnick(usern);
int gff=o.indexOf("1");
String fd=o.substring(gff+1);
String message="^"+fd;
   obj.sendmessage(message,usern);
  obj. remove_client(usern);
   }
   else
   {
   obj.setnick(usern);
   String message="~"+"invalid";
    obj.sendmessage(message,usern);
  obj. remove_client(usern);
   }

}
else if(i.equals("3"))
{
System.out.println("hi");
System.out.println(s);
int ind=s.indexOf("3");
int inf=s.indexOf("$");
String name=s.substring(ind+1,inf);
System.out.println(name);
Jdbctest g=new Jdbctest();
g.check();
String profile=g.profile(name);
obj.sendmessage(profile,name);


}
else if(i.equals("2"))
{
System.out.println("i am here");

int ii=s.indexOf("2");
int ij=s.indexOf("$");
String temp=s.substring(ii+1,ij);
String temp2=s.substring(ij+1);
System.out.println(temp);
System.out.println(temp2);
//Jdbctest g=new Jdbctest();
//g.check();
//g.set_friends(temp2,temp,check);
//g.set_friends(temp,temp2,check);
//if(a==0&&b==0)
//{
//System.out.println("a and b are zero");
check14(temp2,temp);
//}
}
else if(i.equals("4"))
{
System.out.println("signout");
int get=s.indexOf("$");
int get1=s.indexOf("4");
String clientname=s.substring(get1+1,get);
System.out.println("client name is"+clientname);
obj.remove_client(clientname);
Jdbctest g=new Jdbctest();
g.check();
g.update_status(clientname);
LinkedList  final1=new LinkedList ();
Jdbctest oo=new Jdbctest();
oo.check();
LinkedList  list=oo.list_friends(clientname);
System.out.println(list);
ListIterator l=list.listIterator();
while(l.hasNext())
{
String saz=(String)l.next();
Jdbctest oog=new Jdbctest();
oog.check();
String f=oog.check_status(saz);
if(f.equals("on"))
{
final1.add(saz);
}
}
send_to_friends(final1,clientname);

}
else if(i.equals("9"))
{
System.out.println("i am in 9");
int a=s.indexOf("$");
int x=s.indexOf("9");
String sendto=s.substring(x+1,a);
String message=s.substring(a+1);
System.out.println(sendto);
System.out.println(message);
String temp="9"+message+"="+sendto;
System.out.println(temp);
obj.sendmessage(temp,sendto); 
}
else if(i.equals("5"))
{
System.out.println("i am in 5 of server");
int a=s.indexOf("$");
int hx=s.indexOf("5");
String sendto=s.substring(a+1);
String message=s.substring(hx+1,a);
System.out.println(s);
System.out.println(message);
System.out.println(sendto);
obj.add_conference_friends(sendto,message);
obj.sendmessage("5"+message,sendto);
}
else if(i.equals(")"))
{
System.out.println("i am in ) of server");
int a=s.indexOf("$");
int hx=s.indexOf(")");
String sendto=s.substring(a+1);
String message=s.substring(hx+1,a);
System.out.println(s);
System.out.println(message);
System.out.println(sendto);
obj.sendmessage(")"+message,sendto);

}
else if(i.equals("7"))
{
System.out.println("i am in 7 of server");
int a=s.indexOf("$");
int hx=s.indexOf("7");
String z=s.substring(hx+1,a);
String c=s.substring(a+1);
System.out.println(s);
System.out.println(z);
System.out.println(c);

obj.send_con_friends(z,c);
}
else if(i.equals("@"))
{
int p=s.indexOf("@");
int z=s.indexOf("$");
String temp=s.substring(p+1,z);
Jdbctest oog=new Jdbctest();
oog.check();
LinkedList sz=oog.list_friends(temp);
ListIterator l=sz.listIterator();
while(l.hasNext())
{
String pr=(String)l.next();
pr="@"+pr;
obj.sendmessage(pr,temp);
}
}
else if(i.equals("6"))
{
System.out.println("imran khan");
String name;
String usernae;
String pasword;
String date;
String email;
String gender;
System.out.println(s);
//int v=s.indexOf("$");
//String r=s.substring(0,v);
//System.out.println(r);
name=s.substring(s.indexOf("$")+3,s.indexOf("!"));
usernae=s.substring(s.indexOf("!")+1,s.indexOf("#"));
pasword=s.substring(s.indexOf("#")+1,s.indexOf("%"));
gender=s.substring(s.indexOf("%")+1,s.indexOf("&"));
date=s.substring(s.indexOf("&")+1,s.indexOf("*"));
email=s.substring(s.indexOf("*")+1);
System.out.println(name);
System.out.println(usernae);
System.out.println(pasword);
System.out.println(gender);
System.out.println(date);
System.out.println(email);
Jdbctest oog=new Jdbctest();
oog.check();
oog.edit_profile(name,usernae,pasword,gender,date,email);
}
else
{
int a;
System.out.println("i am in anywahere here ");

System.out.println("this am here");

a=s.indexOf("$");
String message=s.substring(0,a);
String sendto=s.substring(a+1);
System.out.println("yahan se");
System.out.println(sendto);
System.out.println(message);
obj.sendmessage(message,sendto);
}
}
void concat_list(LinkedList ox,String temp2)
{
String friends="3";
ListIterator l=ox.listIterator();
while(l.hasNext())
{
String p=(String)l.next();
System.out.println(p);
p="3"+p;
//friends=friends+","+p;
obj.sendmessage(p,temp2); 
}
System.out.println(friends);
obj.sendmessage(friends,temp2);
}
void send_to_friends(LinkedList final1,String clientname)
{
ListIterator l=final1.listIterator();
while(l.hasNext())
{
String p=(String)l.next();
System.out.println(p);
clientname="4"+clientname;
obj.sendmessage(clientname,p);
}
}

void send_to_client(LinkedList final1,String clientname)
{
ListIterator l=final1.listIterator();
while(l.hasNext())
{
String p=(String)l.next();
System.out.println(p);
clientname="3"+clientname;
obj.sendmessage(clientname,p);
}
}

public static void main(String ss[])
{
}
}
