import java.util.*;
import java.lang.*;
import java.io.*;
class Home
{
	Scanner scr=new Scanner(System.in);
	String a[]=new String[40];
	int b[][]=new int[5][5];
	int i=0;
	String ab;


		void inputMsg()
		{
		ab=scr.nextLine();
		}
		void getMsg1()
		{
		System.out.println("                                               "+ab);
		}
		void getMsg2()
		{
		System.out.println("                                                                                                                        "+ab);
		}


	void name()
	{
	 a[i]=scr.nextLine(); 
	 i++;    
	}
	void ivalue()
	{
	System.out.println("your pass word is:"+(i-1));
	}
	String showName(int x)
	{
	return(a[x]);
	}
	
}


public class Facebook1
{
	public static void main(String args[])
	{
	String str;
	int login=0,logout=1;
	int newpg=0;
	Scanner scr=new Scanner(System.in);
	Home hm=new Home();
	int con=1,con1=0;
	while(logout!=0)
	{
		if(newpg==0)
		{
		System.out.println("CREAT NEW ACCOUNT");
		System.out.println("enter your name:");
		hm.name();
		hm.ivalue();
		login=0;
		}

		if(login==0)
		{
		System.out.println("enter your pass word:");
	
		

		int pass;
		pass=scr.nextInt();
		int open=pass;	
			while(con!=0)
			{
			str=hm.showName(open);
			System.out.println("                                                      FACEBOOK");
			System.out.println("                                                     "+str);
			System.out.println("              1.HOME     2.PROFILE     3.FRIENDS     4.NOTIFICATION      5.MESSEGES      6.log out!!     ");
			int ch;
			ch=scr.nextInt();
			switch(ch)
			{
			case 1:
				break;
			case 2:
				break;
			case 3:
				break;
			case 4:
				break;
			case 5:
				Scanner sc=new Scanner(System.in);
				System.out.println("TO WHICH FRIEND YOU WANT TO TAKL:");
				System.out.println("1.PRANAB SINHA \n2.SANJU ROY\n3.JONY ROY\n4.AKASH GOSHWAMI");
				int che;
				String f2=null;
				che=sc.nextInt();
				switch(che)
				{
					case 1:f2="PRANAB SINHA";
					break;
					case 2:f2="SANJU ROY";
					break;
					case 3:f2="JONY ROY";
					break;
					case 4:f2="AKASH GOSHWAMI";
					break;
					default:System.out.println("This friend is not available!!!!!!!");
					break;
				}
				if(che==1 || che==2 || che==3 || che==4)
				{
        			              
				System.out.println("                                                                             START YOUR CONVERSATION");
				System.out.println("                                              "+str+"                                                                   "+f2);
				int i=1;
					do
					{
						if(i==1)
						{
						hm.inputMsg();
						hm.getMsg1();
						}
						if(i!=1){
		     				if(i%2!=0)
						{
						for(int j=1;j<=2;j++)
							{
							hm.inputMsg();
							hm.getMsg1();
							}
						}
						else
						{
						for(int j=1;j<=2;j++)
						{
						hm.inputMsg();
						hm.getMsg2();
						}
						}
					}
				i++;
				if(i==8)
				i=0;
				}
				while(i!=0);
			}
				break;
			case 6:System.out.println("Logging out.......");
				con1=1;
				break;
			default:System.out.println("wrong choice.....");
				break;
			}
			con++;
			if(con1==1)
			con=0;
			}
		login=1;
		newpg=1;
		}
			System.out.println("           1.CREAT NEW ACCOUNT         2.LOG IN         3.EXIT.......");
			int ch2=scr.nextInt();
			switch(ch2)
			{
				case 1:newpg=0;
					logout=1;
					con=1;
					break;
				case 2:login=0;
					logout=1;
					con=1;
					break;
				case 3:System.out.println("exiting.......");
					logout=0;
					break;
				default:System.out.println("wrong choice.....");
					break;	
		
			}
				
	}
	}
}