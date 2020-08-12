import java.util.*;
import java.lang.*;
import java.io.*;
class Home
{
	Scanner scr=new Scanner(System.in);
	Scanner scr5=new Scanner(System.in);
	Scanner scr6=new Scanner(System.in);
	Scanner scr7=new Scanner(System.in);
	String a[]=new String[100];
	
	String a2[]=new String[100];
	int i=0,e=0,newaccount=0;
	String ab;
	
	String address[]=new String[100];
	long phnno[]=new long[100];
	String email[]=new String[100];
	String dtob[]=new String[100];
	int ad=0,ph=0,em=0,dob=0;
	long tempvar,tempvar2;
	int psw=0,ck,ck2;
	long passvar[]=new long[100];
	int vlupass,vlupass2;
		
	void name()//to entry name of the account holder
	{
	 a[i]=scr.nextLine(); 
	 i++;
	newaccount++;//to count how many account have been created  
	}
		/*void ivalue()
		{
		System.out.println("your pass-word is:"+(i-1));
		}*/
	String showName(int x)//to get the name on profile
	{
	return(a[x]);
	}
		
		void friends(int y)
		{
			
			
			for(int j=0,e=0;j<newaccount;j++,e++)
			{
			if(j!=y && e!=y)
				{

				a2[e]=a[j];
				
				}
				
			}
			
		}
		void showFriends()
		{
			for(int jh=0;jh<newaccount;jh++)
			{
			System.out.println("                    "+(jh+1)+". "+a2[jh]);
			}

		}
	
	
	
	void passGet()//gatting password,every password will be different
	{
	passvar[psw]=scr5.nextLong();
	tempvar=passvar[psw];
	ck=0;
	while(ck==0)
	{
	
		if(psw!=0)
		{
			for(int l=0;l<psw;l++)
			{
				if(tempvar==passvar[l])
				{
				System.out.println("PLEASE ENTER ANOTHER PASSWORD....someone used this password.....");
				passvar[psw]=scr5.nextLong();
				tempvar=passvar[psw];
				ck=0;
				}
				else
				{
				ck=1;
				}
			}
		}
		else
		{
		ck=1;
		}
	}
	psw++;
	}

	
	int checkPass(long p)//check password to log in
	{
		for(int mn=0;mn<100;mn++)
		{
			if(p==passvar[mn])
			{
			vlupass=mn;
			break;
			}
			else
			{
			vlupass=999;//if password will not match then it will pass 999 to say that entered password is wrong
			}
		}
		return(vlupass);
	}	




		void setAddress()
		{
		address[ad]=scr.nextLine();
		ad++;
		}
			
			String showAddress(int x)
			{
			return(address[x]);
			}

		void setPhoneNo()//gatting phone number as well as checking that one new phone number is creating an account
		{
		phnno[ph]=scr7.nextLong();
		tempvar2=phnno[ph];
		ck2=0;
		while(ck2==0)
		{
		
			if(ph!=0)
			{
				for(int l2=0;l2<ph;l2++)
				{
					if(tempvar2==phnno[l2])
					{
					System.out.println("PLEASE USE ANOTHER PHONE NUMBER....each phone number can creat only one account.....");
					phnno[ph]=scr7.nextLong();
					tempvar2=phnno[ph];
					ck2=0;
					}
					else
					{
					ck2=1;
					}
				}
			}
			else
			{
			ck2=1;
			}
		}
		ph++;
		}
			long showPhoneNo(int x)
			{
			return(phnno[x]);
			}
		
		int checkPhn(long p)//checking phone number to log in
		{
			for(int mn1=0;mn1<100;mn1++)
			{
				if(p==phnno[mn1])
				{
				vlupass2=mn1;
				break;
				}
				else
				{
				vlupass2=999;
				}
		}
		return(vlupass2);
		}			

		void setEmail()
		{
		email[em]=scr6.nextLine();
		em++;
		}
			String showEmail(int x)
			{
			return(email[x]);
			}

		void setDob()
		{
		dtob[dob]=scr6.nextLine();
		dob++;
		}
			String showDob(int x)
			{
			return(dtob[x]);
			}
						int k=0;
						String pst[][]=new String[100][100];
						int nti[]=new int[100];
						
						
						void post(int z)//post container
						{
							
							pst[k][z]=scr.nextLine();
							System.out.println("done....");
							k++;
							
							
							for(int gg=0;gg<newaccount;gg++)//it will help to count notifications of every account without the posting account
							{	
								if(gg!=z)
								{
								nti[gg]=nti[gg]+1;
								}
							}
						}
						

							void notificationValue(int ss)//total how much notifications have arrived on account,it will help to show that 
							{
							if(nti[ss]==0)
							System.out.println("\n                    -->> THERE IS NO NOTIFICATION.........!!!\n");
							if(nti[ss]==1)
							System.out.println("\n                    -->> IN YOUR HOME THERE IS * "+nti[ss]+" * NEW POST.........!!!\n");
							if(nti[ss]>1)
							System.out.println("\n                    -->> IN YOUR HOME THERE ARE * "+nti[ss]+" * NEW POSTS.........!!!\n");

							nti[ss]=0;//notification starts from zero again as it is shown
							}

							int giveNoNotification(int sss)//shows total number of notificatons come,at home notification button
							{
							return(nti[sss]);
							}							


						void postShowHome(int w)
						{
							System.out.println("             ..............................................................................");
									for(int h=0;h<100;h++)
										{
											for(int z=0;z<100;z++)
												{
												if(pst[h][z]!=null)
												System.out.println("\n	      "+a[z]+":   "+pst[h][z]+"\n");
												}
										}
										
								
						}

						void postShowProfile(int kt)
						{
							
							for(int h1=0;h1<10;h1++)
										{
										if(pst[h1][kt]!=null)
										System.out.println("\n                  "+a[kt]+" : "+pst[h1][kt]+"\n");
										}
					
						}

			int mg=0,mg2=0;
			String msg[][][]=new String[100][100][100];
			int cntMsg[][]=new int[100][100];
			int msgcntfi[]=new int[100];
			
			void message(int s,int t)
			{
				for(int i2=0;i2<100;i2++)
					{
						for(int j2=0;j2<100;j2++)
							{
							if(i2==s && j2==t)
								{
									if(s>t)
									{
									msg[i2][j2][mg]=scr.nextLine();
									
									mg++;
									}
									else
									{
									msg[i2][j2][mg2]=scr.nextLine();
									
									mg2++;
									}
								}
							}
					}
				cntMsg[t][s]=cntMsg[t][s]+1;
				msgcntfi[t]=msgcntfi[t]+1;
							
			}
			
			
			
			void messageCount(int ms)
			{
				for(int cm=0;cm<newaccount;cm++)
				{
					if(cntMsg[ms][cm]!=0)
					{
					System.out.println("\n       -=>> YOU HAVE '"+cntMsg[ms][cm]+"' MESSAGE from '"+a[cm]+"'\n");
					}
				}
			}
			
			int msgCounting(int jjj)
			{
			return(msgcntfi[jjj]);	
			}
			
			
			void messageShow(int s,int t)
			{
			msgcntfi[s]=msgcntfi[s]-cntMsg[s][t];
			cntMsg[s][t]=0;			

				System.out.println("                                   START YOUR CONVERSATION");
				System.out.println("ME-"+a[s]+"                                                                  FRIEND-"+a[t]);
				System.out.println("'''''''''''''''''''''''''''''''''''                       ''''''''''''''''''''''''''''''''''''''''''''");
					for(int i3=0;i3<100;i3++)
					{      
						for(int j3=0;j3<100;j3++)
						{
						if(i3==s && j3==t)
							{
							for(int z2=0;z2<100;z2++)
								if(msg[i3][j3][z2]!=null)
								{
								System.out.println(msg[i3][j3][z2]);
								}
							}
						}
					}
				
				
				
					for(int i5=0;i5<100;i5++)
					{
						for(int j5=0;j5<100;j5++)
						{
						if(i5==t && j5==s)
							{
							for(int z3=0;z3<100;z3++)
								if(msg[i5][j5][z3]!=null)
								{
								System.out.println("                                                                             "+msg[i5][j5][z3]);
								}
							}
						}
					}
								
			}
}


public class Facebook
{
	public static void main(String args[])
	{
	String str,add,eid,date,posthm;
	int login=0,logout=1;
	int newpg=0,passvalue=0;
	int pass=0,msggo,msgin,pnpass=0,pwpass=0;
	Scanner scr2=new Scanner(System.in);
	Home hm=new Home();
	int con=1,con1=0,open,ntfi,mssgg;
	
	long gtpss,gtphn,pno;

	while(logout!=0)
	{
		if(newpg==0)
		{
		System.out.println("\n                                      CREAT NEW ACCOUNT");
		System.out.println("'''''''''''''''''''''''''''''''''''                       ''''''''''''''''''''''''''''''''''''''''''''");
		System.out.println("Enter your name : ");
		hm.name();
		System.out.println("Enter your address : ");
		hm.setAddress();
		
		System.out.println("Enter your email ID : ");
		hm.setEmail();
		System.out.println("Enter your date of birth : ");
		hm.setDob();
		System.out.println("''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''");
		
		System.out.println("ENTER YOUR PHONE NUMBER: ");
		hm.setPhoneNo();
		System.out.println("ENTER YOUR PASS-WORD:");
		hm.passGet();
		System.out.println(".......................................................................................................");
			/*hm.ivalue();*/
			login=0;

		passvalue++;
		}

		if(login==0)
		{
		System.out.println("\n                                     LOG-IN YOUR ACCOUNT");
		System.out.println(".......................................................................................................");
		System.out.println("ENTER YOUR PHONE NUMBER: ");
		gtphn=scr2.nextLong();
		pnpass=hm.checkPhn(gtphn);
		System.out.println("ENTER YOUR PASS-WORD:");
		gtpss=scr2.nextLong();
		pwpass=hm.checkPass(gtpss);
		
		System.out.println(".......................................................................................................");
		if(pnpass==pwpass)
		pass=pwpass;
		else
		pass=999;

			/*pass=scr2.nextInt();*/

			/*if(pass<passvalue)*/
		if(pass!=999 && pass<passvalue)
		{
		
			while(con!=0)
			{
			open=pass;
			
			str=hm.showName(open);
			
			add=hm.showAddress(open);
			pno=hm.showPhoneNo(open);
			eid=hm.showEmail(open);
			date=hm.showDob(open);
			hm.friends(open);
			ntfi=hm.giveNoNotification(open);
			mssgg=hm.msgCounting(open);
			
			System.out.println(".......................................................................................................");
			System.out.println("                                             FACEBOOK");
			System.out.println("					 ''''''''''''''''");
			System.out.println("                                       OWNER - "+str);
			System.out.println("                                   ''''''''''''''''''''''''''''");
			System.out.println("     1.HOME     2.PROFILE     3.FRIENDS     4.NOTIFICATION("+ntfi+")    5.MESSAGES("+mssgg+")     6.POST      7.log out!!   ");
			int ch;
					    													
			ch=scr2.nextInt();
				switch(ch)
				{
				case 6:System.out.println("ENTER YOUR POST : ");
					System.out.println("...................");
					hm.post(open);
					System.out.println(".......................................................................................................");
					con1=0;
					break;
				case 1:hm.postShowHome(open);
					System.out.println(".......................................................................................................");
					con1=0;
					break;
				case 2: System.out.println("\n                                        YOUR PROFILE\n");
					System.out.println("                  ............................................................\n");
					System.out.println("                  NAME : "+str);
					System.out.println("                  ADDRESS : "+add);  
					System.out.println("                  DATE OF BIRTH : "+date);
					System.out.println("                  PHONE NUMBER : "+pno);
					System.out.println("                  E-MAIL ADDRESS : "+eid);
					System.out.println("\n                                         YOUR POSTS:");
					System.out.println("                                       ''''''''''''''''''''");
					hm.postShowProfile(open);
					System.out.println("                  ............................................................\n");
					System.out.println(".......................................................................................................");
					con1=0;
					break;
				case 3:System.out.println("                                BELOW THE LIST OF YOUR ALL FRIENDS");
					System.out.println("                          '''''''''''''''''''''''''''''''''''''''''''\n");
					hm.showFriends();
					System.out.println(".......................................................................................................");
					con1=0;
					break;
				case 4:System.out.println("                                          NOTIFICATIONS");
					System.out.println("                                   '''''''''''''''''''''''''\n");
					 hm.notificationValue(open);
					System.out.println(".......................................................................................................");
					con1=0;
					break;
				case 5:System.out.println("                                BELOW THE LIST OF YOUR ALL FRIENDS");
					System.out.println("                          '''''''''''''''''''''''''''''''''''''''''''\n");
					hm.showFriends();
					System.out.println("	 ..........................................................................................	");
					 hm.messageCount(open);
					System.out.println("	 ..........................................................................................	");
					System.out.println("         TO WHICH FRIEND YOU WANT TO TALK........ENTER THE NUMBER:");
					msgin=scr2.nextInt();
					msggo=msgin-1;
					if(passvalue>msggo && open!=msggo)
					{
					hm.messageShow(open,msggo);
					hm.message(open,msggo);
					}
					else
					{
					System.out.println("Wrong choice!!!");
					}
					if(open==msggo)
					{
					System.out.println("THIS IS YOUR OWN ACCOUNT......!!!!!");
					}
					System.out.println(".......................................................................................................");
					con1=0;
					break;
				case 7:System.out.println("Logging out.......");
					System.out.println(".......................................................................................................");
					con1=1;
					break;
				default:System.out.println("Wrong choice.....");
					System.out.println(".......................................................................................................");
					con1=0;
					break;
				}
				con++;
				if(con1==1)
				con=0;
			}
		
		}
		login=1;
		newpg=1;
		}
		if(pass>=passvalue)
		System.out.println("Invalid password!!!!!");
			System.out.println("           1.CREAT NEW ACCOUNT         2.LOG IN         3.EXIT.......");
			int ch2=scr2.nextInt();
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
				case 3:System.out.println("Exiting.......");
					logout=0;
					break;
				default:System.out.println("Wrong choice.....");
					break;	
		
			}
				
	}
	}
}