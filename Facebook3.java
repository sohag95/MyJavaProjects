import java.util.*;
import java.lang.*;
import java.io.*;
class Home
{
	Scanner scr=new Scanner(System.in);
	String a[]=new String[100];
	
	String a2[]=new String[100];
	int i=0,e=0,newaccount=0;
	String ab;


		
	void name()
	{
	 a[i]=scr.nextLine(); 
	 i++;newaccount++;    
	}
	void ivalue()
	{
	System.out.println("your pass-word is:"+(i-1));
	}
	String showName(int x)
	{
	return(a[x]);
	}
		
		void friends(int y)
		{
			int z;
			z=y;
			
			for(int j=0,e=0;j<newaccount;j++,e++)
			{
			if(j!=z && e!=z)
				{

				a2[e]=a[j];
				
				}
				
			}
			
		}
		void showFriends()
		{
			for(int jh=0;jh<newaccount;jh++)
			{
			System.out.println((jh+1)+". "+a2[jh]);
			}
		}
	
	String address[]=new String[100];
	String phnno[]=new String[100];
	String email[]=new String[100];
	String dtob[]=new String[100];
	int ad=0,ph=0,em=0,dob=0;
		void setAddress()
		{
		address[ad]=scr.nextLine();
		ad++;
		}
			
			String showAddress(int x)
			{
			return(address[x]);
			}

		void setPhoneNo()
		{
		phnno[ph]=scr.nextLine();
		ph++;
		}
			String showPhoneNo(int x)
			{
			return(phnno[x]);
			}
		
		void setEmail()
		{
		email[em]=scr.nextLine();
		em++;
		}
			String showEmail(int x)
			{
			return(email[x]);
			}

		void setDob()
		{
		dtob[dob]=scr.nextLine();
		dob++;
		}
			String showDob(int x)
			{
			return(dtob[x]);
			}
						int k=0;
						String pst[][]=new String[100][100];
						
						void post(int z)
						{
							
							pst[k][z]=scr.nextLine();
							System.out.println("done....");
							k++;
						}

						void postShowHome(int w)
						{
							
									for(int h=0;h<100;h++)
										{
											for(int z=0;z<100;z++)
												{
												if(pst[h][z]!=null)
												System.out.println("\n\n		"+a[z]+":   "+pst[h][z]);
												}
										}
										
								
						}

						void postShowProfile(int kt)
						{
							
							for(int h=0;h<10;h++)
										{
										if(pst[h][kt]!=null)
										System.out.println("\n\n   "+a[kt]+" : "+pst[h][kt]);
										}
					
						}

			int mg=0,mg2=0;
			String msg[][][]=new String[100][100][100];

			void message(int s,int t)
			{
				for(int i=0;i<=10;i++)
					{
						for(int j=0;j<=10;j++)
							{
							if(i==s && j==t)
								{
									if(s>t)
									{
									msg[i][j][mg]=scr.nextLine();
									
									mg++;
									}
									else
									{
									msg[i][j][mg2]=scr.nextLine();
									
									mg2++;
									}
								}
							}
					}			
			}
			
			
			void messageShow(int s,int t)
			{
			
				System.out.println("                             START YOUR CONVERSATION");
				System.out.println("ME-"+a[s]+"                                                                  FRIEND-"+a[t]);
				
					for(int i=0;i<100;i++)
					{
						for(int j=0;j<100;j++)
						{
						if(i==s && j==t)
							{
							for(int z=0;z<100;z++)
								if(msg[i][j][z]!=null)
								{
								System.out.println(msg[i][j][z]);
								}
							}
						}
					}
				
				
				
					for(int i2=0;i2<100;i2++)
					{
						for(int j2=0;j2<100;j2++)
						{
						if(i2==t && j2==s)
							{
							for(int z2=0;z2<100;z2++)
								if(msg[i2][j2][z2]!=null)
								{
								System.out.println("                                                                             "+msg[i2][j2][z2]);
								}
							}
						}
					}
								
			}
}


public class Facebook3
{
	public static void main(String args[])
	{
	String str,add,pno,eid,date,posthm;
	int login=0,logout=1;
	int newpg=0,passvalue=0;
	int pass=0,msggo,msgin;
	Scanner scr=new Scanner(System.in);
	Home hm=new Home();
	int con=1,con1=0;
	while(logout!=0)
	{
		if(newpg==0)
		{
		System.out.println("\n\nCREAT NEW ACCOUNT\n");
		System.out.println("enter your name : ");
		hm.name();
		System.out.println("enter your address : ");
		hm.setAddress();
		System.out.println("enter your phone number : ");
		hm.setPhoneNo();
		System.out.println("enter your email ID : ");
		hm.setEmail();
		System.out.println("Enter your date of birth : ");
		hm.setDob();
		
		hm.ivalue();
		login=0;
		passvalue++;
		}

		if(login==0)
		{
		System.out.println("Enter your pass-word to log in:");
	
		

		
		pass=scr.nextInt();
		if(pass<passvalue)
		{
		int open=pass;	
			while(con!=0)
			{
			str=hm.showName(open);
			add=hm.showAddress(open);
			pno=hm.showPhoneNo(open);
			eid=hm.showEmail(open);
			date=hm.showDob(open);
			hm.friends(open);
			
			System.out.println("                                                      FACEBOOK");
			System.out.println("                                                    "+str);
			System.out.println("              1.HOME     2.PROFILE     3.FRIENDS     4.NOTIFICATION      5.MESSAGES      6.POST      7.log out!!   ");
			int ch;
			
			ch=scr.nextInt();
				switch(ch)
				{
				case 6:System.out.println("enter your post:");
					hm.post(open);
					
					con1=0;
					break;
				case 1:hm.postShowHome(open);
					con1=0;
					break;
				case 2: System.out.println("                               YOUR PROFILE\n");
					System.out.println("          NAME : "+str);
					System.out.println("          ADDRESS : "+add);  
					System.out.println("          DATE OF BIRTH : "+date);
					System.out.println("          PHONE NUMBER : "+pno);
					System.out.println("          E-MAIL ADDRESS : "+eid);
					System.out.println("\n                             YOUR POSTS:");
					hm.postShowProfile(open);
					con1=0;
					break;
				case 3:System.out.println("BELOW THE LIST OF YOUR ALL FRIENDS:");
					hm.showFriends();
					con1=0;
					break;
				case 4:
					con1=0;
					break;
				case 5:
					hm.showFriends();
					System.out.println("TO WHICH FRIEND YOU WANT TO TALK........ENTER THE NUMBER:");
					msgin=scr.nextInt();
					msggo=msgin-1;
					if(open!=msggo)
					{
					hm.messageShow(open,msggo);
					hm.message(open,msggo);
					}
					else
					{
					System.out.println("THIS IS YOUR OWN ACCOUNT......!!!!!");
					}
					con1=0;
					break;
				case 7:System.out.println("Logging out.......");
					con1=1;
					break;
				default:System.out.println("wrong choice.....");
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
		System.out.println("invalid password!!!!!");
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