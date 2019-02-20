/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package onlinetest;
/*Online Java Paper Test*/
//package onlinetest;
/*Online Java Paper Test*/
import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Timer;
import java.util.TimerTask;
import java.io.*;

class Questions
{
	String qstn,opt1,opt2,opt3,opt4;
	int ans;
	public static Vector <Questions> v=new Vector <Questions> ();
	
	Questions(String qstn, String opt1, String opt2, String opt3,String opt4, int ans)
	{
		this.qstn=qstn;
		this.opt1=opt1;
		this.opt2=opt2;
		this.opt3=opt3;
		this.opt4=opt4;
		this.ans=ans;
	}
	
	public static void database()
	{
		Questions q1=new Questions("What is size of integer variable in bytes?","One","Two","Three","Four",4);
		Questions q2=new Questions("Which one among these is not a datatype?","int","void","Boolean","char",2);
		Questions q3=new Questions("Which class is available to all the class automatically?","Swing","Applet","Object","ActionEvent",3);
		Questions q4=new Questions("Which package is directly available to our class without importing it?","Swing","Applet","Net","Lang",4);
		Questions q5=new Questions("String class is defined in which package?","Lang","Swing","Applet","Awt",1);
		Questions q6=new Questions("Which one among these is not a keyword?","Class","Int","Get","If",3);
		Questions q7=new Questions("Which one among these is not a class?","Swing","ActionEvent","ActionPerformed","Button",2);
		Questions q8=new Questions("Which one among these is not a function of object class?","toString","Finalize","Equals","getDocumentBase",4);
		Questions q9=new Questions("Which function is not present in applet class?","init","main","start","destroy",2);
		Questions q10=new Questions("Which one among these is not a valid component?","JButton","JList","JButtonGroup","JTextArea",3);
		Questions q11=new Questions("Which acid is present in lemon?","Marlic","Citric","Tartaric","Sulphuric",2);
		Questions q12=new Questions("Who is regarded as father of modern chemistry?","Rutherford","Einstine","Lavoisier","C.V.Raman",3);
		Questions q13=new Questions("One of the following model is valid record based Data model?","Object Oriented","Relational","Entity relationShip","N.O.T",2);
		Questions q14=new Questions("Which is example of network Database?","Unify","Ingress","IDMS","N.O.T",3);
		Questions q15=new Questions("(a^2+2ab+b^2)?","(a+b)^2","(a+b)^3","(a-b)^2","(a-b)^3",1);
		Questions q16=new Questions("Scheme for hierarchical database is?","A Tree","A Graph","A B-Tree","N.O.T",1);
		Questions q17=new Questions("Data about data is termed as?","Directory","Data-Bank","Meta-Data","N.O.T",3);
		Questions q18=new Questions("Data model which describes how data stored is?","Internal","External","Logical","N.O.T",1);
		Questions q19=new Questions("What is sleep(),join() methods from the following?","Final","Static","Int","Non-Static",2);
		Questions q20=new Questions("Threads of a process share...?","Global Variables","Heaps","Both","Neither",3);
		Questions q21=new Questions("Can we create an object of an Interface?","Yes","No","Maybe","N.O.T",2);
		Questions q22=new Questions("for a BST(15 node), min and max heights are?","4,15","3,14","4,14","3,15",2);
		Questions q23=new Questions("Which is capital of India?","Mumbai","Delhi","Kolkata","Banglore",2);
		Questions q24=new Questions("~p -> ~q is equivalent to?","q->p","~pvq","1","2 and 1",4);
		Questions q25=new Questions("In fourier Series, when does An and Bn become zero??","Even fucn","Odd fucn","Both","Neither",4);
		Questions q26=new Questions("(a^3+3ba^2+3ab^2+b^3)?","(a+b)^2","(a+b)^3","(a-b)^2","(a-b)^3",2);
		Questions q27=new Questions("The address mapping reallocation is done when the program initially loaded is called?","Dynamic","Relocation","StaticRelocation","Dynamic&Static",3);
		Questions q28=new Questions("Postfix of a*b-c*d?","-*ab*cd","ab*cd*-","abcd**-","*ab-*cd",2);
		Questions q29=new Questions("A computer that converts an entire program into machine language at one time is called?","Interpreter","Simulator","Compiler","Instructor",3);
		Questions q30=new Questions("A microprogram is sequencer perform the operation?","Read","Write","Read and Write","Read and Execute",4);
		Questions q31=new Questions("When CPU Detects and interrupt, it saves ...??","Next State","Previous State","Interrupt","Current State",4);
		Questions q32=new Questions("An exception condition caused by CPU is called?","Interrupt","Halt","Wait","Process",1);
		Questions q33=new Questions("Shell sort uses which sorting?","Insertion","Merge","Selection","Quick",1);
		Questions q34=new Questions("Heap is an example of?","CompleteBinaryTree","Sparse matrix","BST","N.O.T",1);
		Questions q35=new Questions("Time required to merge two sorted lists of size m and n?","O(m/n)","O(m+n)","mlogn","nlogm",2);
		Questions q36=new Questions("Time complexity of Depth First Traversal of is?","O(v+e)","O(v)","O(e)","O(v*e)",1);
		Questions q37=new Questions("What could be the worst case height of an AVL tree?","0.97 logn","2.13 logn","1.44 logn","nlogn",3);
		Questions q38=new Questions("Minimum queues required for priority queue implementation?","5","4","3","2",4);
		Questions q39=new Questions("A circular linked list can be used for?","Stack","Queue","Both A and B","Neither A nor B",3);
		Questions q40=new Questions("Which of the following usees FIFO method?","Queue","Stack","Hash-Table","BST",1);
		v.addElement(q1);
		v.addElement(q2);
		v.addElement(q3);
		v.addElement(q4);
		v.addElement(q5);
		v.addElement(q6);
		v.addElement(q7);
		v.addElement(q8);
		v.addElement(q9);
		v.addElement(q10);
		v.addElement(q11);
		v.addElement(q12);
		v.addElement(q13);
		v.addElement(q14);
		v.addElement(q15);
		v.addElement(q16);
		v.addElement(q17);
		v.addElement(q18);
		v.addElement(q19);
		v.addElement(q20);
		v.addElement(q21);
		v.addElement(q22);
		v.addElement(q23);
		v.addElement(q24);
		v.addElement(q25);
		v.addElement(q26);
		v.addElement(q27);
		v.addElement(q28);
		v.addElement(q29);
		v.addElement(q30);
		v.addElement(q31);
		v.addElement(q32);
		v.addElement(q33);
		v.addElement(q34);
		v.addElement(q35);
		v.addElement(q36);
		v.addElement(q37);
		v.addElement(q38);
		v.addElement(q39);
		v.addElement(q40);
	}
	
	public static Questions generate()
	{
		int i,rand=1000;
		while(rand>=v.size())
		{
			rand=(int)(Math.random()*40);
		}
		Questions x=null;
		x=v.elementAt(rand);
		v.removeElementAt(rand);
		return x;
	}
}

public class OnlineTest extends JFrame implements ActionListener
{
	static boolean bool=false,flag=false;
	static JLabel l,l1,l2,l3;
	JRadioButton jb[]=new JRadioButton[5];
	static JButton b1,b2,b3,b4,b5,b6;
	JTextField t1;
	ButtonGroup bg;
	int count=0,current=0,x=1,y=1,now=0,b,round=4;
	static int score=0,score1=0,score2=0,score3=0,score4=0;
	Questions q=null;
	static String roll;
	OnlineTest(String s)
	{
		super(s);
		l=new JLabel();
		l1=new JLabel();
		l2=new JLabel();
		l3=new JLabel();
		t1=new JTextField();
		add(l);
		add(l1);
		add(l2);
		add(l3);
		add(t1);
		b1=new JButton("Next");
		b2=new JButton("Result");
		b3=new JButton("Start");
		b4=new JButton("Help");
		b5=new JButton("Go To Test");
		b6=new JButton("View Previous Score");
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		add(b1);
		add(b2);
		add(b3);
		add(b4);
		add(b5);
		add(b6);
		q.database();
		q=q.generate();
		l.setBounds(30,40,450,20);
		l1.setBounds(400,20,450,20);
		l2.setBounds(25,20,300,20);
		l3.setBounds(185,50,450,20);
		String str1=q.qstn;
		b1.setBounds(100,240,100,30);
		b2.setBounds(270,240,100,30);
		b3.setBounds(200,90,100,30);
		b4.setBounds(200,200,100,30);
		t1.setBounds(185,10,150,30);
		b3.setEnabled(true);
		b4.setEnabled(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);
		setLocation(250,100);
		setVisible(true);
		setSize(600,350);
		t1.setVisible(false);
		b1.setVisible(false);
		b2.setVisible(false);
	}
	public void actionPerformed(ActionEvent e) 
	{	
	    if(e.getSource()==b3)
		{
			b3.setVisible(false);
			b4.setVisible(false);
			b5.setBounds(100,200,100,30);
			b6.setBounds(270,200,180,30);
			b5.setEnabled(true);
			b6.setEnabled(true);
			t1.setVisible(true);
			l3.setText("Enter Your Roll no.");
			roll=t1.getText();
		}
		if(e.getSource()==b5)
		    {
				bool=true;
				t1.setVisible(false);
				l3.setVisible(false);
				b5.setVisible(false);
				b6.setVisible(false);
				q.database();
				q=q.generate();
				String str1=q.qstn;
				bg=new ButtonGroup();
				for(int i=0;i<5;i++)
				{
					jb[i]=new JRadioButton();	
					add(jb[i]);
					bg.add(jb[i]);
				}
				jb[4].setSelected(true);
				jb[0].setBounds(50,80,300,20);
				jb[1].setBounds(50,110,300,20);
				jb[2].setBounds(50,140,300,20);
				jb[3].setBounds(50,170,300,20);
				b1.setVisible(true);
				b2.setVisible(true);
				b2.setEnabled(false);
				l.setText("Question 1: "+str1);
				jb[0].setText(q.opt1);jb[1].setText(q.opt2);jb[2].setText(q.opt3);jb[3].setText(q.opt4);
				l2.setText("Level "+(5-round));
			}
		if(e.getSource()==b6)
		{
			roll=t1.getText();
			try{
					
					int i=0,j=0;
					FileReader fr=new FileReader("Result.txt");
					BufferedReader br=new BufferedReader(fr);
					String str=null;
					while((str=br.readLine())!=null)
					{
						String []temp=str.split("\t");
						if(roll.equals(temp[0]))
						{	
							i=1;
							JOptionPane.showMessageDialog(this,"You score:\nLevel 1 : \t"+temp[1]+"\nLevel 2 : \t"+temp[2]+"\nLevel 3 : \t"+temp[3]+"\nLevel 4 : \t"+temp[4]+"\nTotal:\t"+temp[5]);
						}
					}
					if(i==0)
					{
						JOptionPane.showMessageDialog(this,"Sorry, No record for this no.");
					}
					br.close();
				}
			catch(IOException t)
			{
				JOptionPane.showMessageDialog(this,"Sorry, No record for this no.");
			}
		}
		if(e.getSource()==b4)
		{
		    JOptionPane.showMessageDialog(this,"The MCQ Test contains of four levels each with 10 questions and each question contains 4 options with only 1 option correct.\nThe minimum marks you must score to pass a level is more than 40% , in this case 4 marks out of 10.");		  
		}
		if(e.getSource()==b1)
		{
			current++;
			String str;
			int a=q.ans;
			if(jb[a-1].isSelected())
				count++;
			q=q.generate();
			str=q.qstn;
			jb[4].setSelected(true);
			l.setText("Question "+(current+1)+":"+str);
			jb[0].setText(q.opt1);jb[1].setText(q.opt2);jb[2].setText(q.opt3);jb[3].setText(q.opt4);
			if(current%9==0||(setInterval())==0)
			{
				b1.setEnabled(false);
				b2.setEnabled(true);
			}
		}
	
		if(e.getSource()==b2)
		{    
			round=round-1;
	        int b=q.ans;
			if(round==0)
				timer.cancel();
			if(jb[b-1].isSelected())
				count++;
			if((4-round)==1)
				score1=count;
			if((4-round)==2)
				score2=count;
			if((4-round)==3)
				score3=count;
			if(count>=4 && round==0)
			{
				score4=count;
				JOptionPane.showMessageDialog(this,"You scored "+count+"! Test is completed!");
				flag=true;
			}
			else if(count>4 && setInterval()!=0)
			{
				JOptionPane.showMessageDialog(this,"You scored "+count+"! and passed!");
				count=0;
				current=0;
				q=q.generate();
				l.setBounds(30,40,450,20);
				l1.setBounds(400,20,450,20);
				String str1=q.qstn;
				b1.setEnabled(true);
				b2.setEnabled(false);
				jb[4].setSelected(true);
				l.setText("Question 1: "+str1);
				jb[0].setBounds(50,80,300,20);
				jb[1].setBounds(50,110,300,20);
				jb[2].setBounds(50,140,300,20);
				jb[3].setBounds(50,170,300,20);
				b1.setBounds(100,240,100,30);
				jb[0].setText(q.opt1);jb[1].setText(q.opt2);jb[2].setText(q.opt3);jb[3].setText(q.opt4);
				l2.setText("Level "+(5-round));
				b2.setBounds(270,240,100,30);
			}
			else
			{   
		      if(setInterval()==0)
			  {
				JOptionPane.showMessageDialog(this,"You scored "+count+"! But Time is up!"); 
			  }
			  else
				JOptionPane.showMessageDialog(this,"You scored "+count+"! But sadly failed!");
			  flag=true;
			}
		}
		score=score1+score2+score3+score4;
		if(flag==true)
		{	
			roll=t1.getText();
			try{
				FileWriter outfile=new FileWriter("Result.txt",true);
				PrintWriter out=new PrintWriter(outfile);
				out.println(roll+"\t"+score1+"\t"+score2+"\t"+score3+"\t"+score4+"\t"+score);
				out.close();
				System.exit(0);
			}
			catch(IOException p)
			{
				JOptionPane.showMessageDialog(this,"Sorry, No record for this no.");
			}
		}
	}
	static int interval = 100;
	static Timer timer = new Timer();
	
	public static void main(String args[]) 
	{
	Scanner sc = new Scanner(System.in);
    int delay = 1000;
    int period = 1000;
    timer.scheduleAtFixedRate(new TimerTask() {

        public void run() {
		   if(bool==true)
			   l1.setText("Time Remaining: "+setInterval());

        }
    }, delay, period);
	OnlineTest n=new OnlineTest("Online Test Of Java");
	}

	private static final int setInterval() {
		if (interval == 1)
		{
			timer.cancel();
			b1.setEnabled(false);
			b2.setEnabled(true);
			return 0;
		}
	return --interval;
	}
}
	