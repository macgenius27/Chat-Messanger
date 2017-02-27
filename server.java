import java.awt.*;
import javax.swing.*;
import java.io.*;
import java.awt.event.*;
import java.net.*;
import java.net.InetAddress;
import java.util.*;
public class server 
{
HashMap cmap=new HashMap(100) ;
HashMap cfmap=new HashMap(100) ;
HashMap soc=new HashMap(50);
HashMap confrd=new HashMap(50);
static int i=0;
ServerSocket ss;
DataInputStream is;
DataOutputStream os;
Socket c,temps;
DataOutputStream temp;
public server()
{
is=null;
os=null;
}
void send_con_friends(String message,String nick)
{
System.out.println(message);
System.out.println(nick);
 Boolean b=confrd.containsKey(nick);
 if(b==false)
 {
 System.out.println("hello");
 }
 else
 {
 System.out.println(" hi");
 }

LinkedList h=(LinkedList)confrd.get(nick);
if(h==null)
{
System.out.println("i am null");

}
ListIterator l=h.listIterator();
while(l.hasNext())
{
String pr=(String)l.next();
try
{
sendmessage("7"+message,pr);
System.out.println("friends to broadcast");
System.out.println(pr);
}
catch(Exception hr)
{
System.out.println("dddddddddddddddddddddddddddddddddddddddddddddddddddddddd");
System.out.println(hr);
}
}
}
void add_conference_friends(String offerby,String toadd)
{
LinkedList p=new LinkedList();
LinkedList pp=new LinkedList();
Boolean b=confrd.containsKey(offerby);
if(b==false)
{
System.out.println("i am first");
p.add(toadd);
//p.add()
confrd.put(offerby,p);
System.out.println("conferrence friends of "+" "+offerby);
LinkedList k=(LinkedList)confrd.get(offerby);
ListIterator l=k.listIterator();
while(l.hasNext())
{
String pr=(String)l.next();
}
add_conference_friends2( toadd, offerby);
}
else
{
System.out.println("but i am not");

//LinkedList pp=new LinkedList();
LinkedList k=(LinkedList)confrd.get(offerby);

ListIterator l=k.listIterator();
while(l.hasNext())
{
String pr=(String)l.next();
pp.add(pr);
}
pp.add(toadd);
confrd.remove(offerby);
confrd.put(offerby,pp);
System.out.println("conference friends are"+pp);
add_conference_friends2( toadd, offerby);
}
System.out.println("conference friends are"+p);
}
void add_conference_friends2(String offerby,String toadd)
{
LinkedList p=new LinkedList();
LinkedList pp=new LinkedList();
Boolean b=confrd.containsKey(offerby);
if(b==false)
{
System.out.println("i am first");
p.add(toadd);
confrd.put(offerby,p);
System.out.println("conferrence friends of "+" "+offerby);
LinkedList k=(LinkedList)confrd.get(offerby);
ListIterator l=k.listIterator();
while(l.hasNext())
{
String pr=(String)l.next();
}
}
else
{
System.out.println("but i am not");

//LinkedList pp=new LinkedList();
LinkedList k=(LinkedList)confrd.get(offerby);

ListIterator l=k.listIterator();
while(l.hasNext())
{
String pr=(String)l.next();
pp.add(pr);
}
pp.add(toadd);
confrd.remove(offerby);
confrd.put(offerby,pp);
System.out.println("conference friends are"+pp);
//System.out.println(pp);
}
System.out.println("conference friends are"+p);
}
void buildserver()
{
try
{
//InetAddress addr = new InetAddress("192.168.1.121");
//server = new ServerSocket(200,0,addr);
ss=new ServerSocket(1264);
while(true)
{
Socket s=ss.accept();
System.out.println(s.getInetAddress());
is=new DataInputStream(s.getInputStream());
 os=new DataOutputStream(s.getOutputStream());
temp=os;
temps=s;
 System.out.println(os);
 new sthread(this,s);
}
}
catch(Exception e)
{
System.out.println(e);
}
}
void remove_client(String nick)
{
Boolean b=cmap.containsKey(nick);
Boolean f=soc.containsKey(nick);
if(b==true&&f==true)
{
cmap.remove(nick);
Socket ii=(Socket) soc.get(nick);
soc.remove(nick);
try
{
ii.close();
}
catch(Exception iips)
{
System.out.println(iips);
}
}
else
{
System.out.println("no data is here");
}


}

void add_hash(String s,DataOutputStream os)
{
 if(os==null)
 {
 System.out.println("tu a na bachay");
 }
 else
 {
 cmap.put(s,os); 
  System.out.println(cmap.size());
 }
}
void setnick(String nick)
{
add_hash(nick,temp);
add_soc(nick);
}
void add_soc(String nick)
{
soc.put(nick,temps);
}
void sendmessage(String message,String nick)
{

System.out.println("sss");
 Boolean b=cmap.containsKey(nick);
DataOutputStream   oss=(DataOutputStream)cmap.get(nick);
 if(b==false||oss==null)
 {
 System.out.println("pakri gae na");
 }
 else
 {
System.out.println(message);
try
{
System.out.println("dddddddddddd");
oss.writeUTF(message);
oss.flush();
}
catch(Exception f)
{
System.out.println(f);
}
}
}
int atronclients(String user)
{
int p=0;
try
{

Jdbctest oi=new Jdbctest();
oi.check();
String a=oi.search_username(user);
if(a.equals("invalid"))
{
p=0;
//sendmessage("invalid",user);
}
else
{
p=1;
//sendmessage("your accout has been created",user);
}
}
catch(Exception c)
{
System.out.println();
}
return p;
}
void getfriend(String nick)
{
LinkedList link=new LinkedList();
try
{
nick=nick+".txt";
FileReader fin=new FileReader(nick);
Scanner src=new Scanner(fin);
String a;
while(src.hasNext())
{
a=src.next();
link.add(a);
}
System.out.println(link);
cfmap.put(nick,link);
Boolean b=cfmap.containsKey(nick);
if(b==false)
{
System.out.println("data not found");
}
}
catch(Exception e)
{
System.out.println(e);
}
}
public static void main(String args[])
{
server obj=new server();
obj.buildserver();
}
}