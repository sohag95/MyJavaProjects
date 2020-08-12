import java.util.*;
class Bowler
{
	Scanner scnr=new Scanner(System.in);
	int b=0,choiceblr,retn;
	String blrname[]=new String[11];
	int bpor=0,aob;
	int blrrun[]=new int[11];
	int blrwicket[]=new int[11];
	int blrmaden[]=new int[11];
	int blrover[]=new int[11];
	int blrttlwd[]=new int[11];
	int blrttlnbl[]=new int[11];	
	int aftrovrbl[]=new int[11];

	int firstBowler()
	{
		blrname[b]=scnr.nextLine();
		b++;
		return(b-1);
	}


	int bowlerName()
	{
	int wl=1;
		while(wl!=0)
		{
			System.out.println("BOWLERS NAME LIST:");
				for(int kk=0;kk<b;kk++)
				{
				System.out.println((kk+1)+"."+blrname[kk]);
				}
			System.out.println("12.TO ENTER NEW BOWLER'S NAME:");
			System.out.println("Enter your choice:");
			choiceblr=scnr.nextInt();
		
				if(choiceblr==12)
				{
				System.out.println("Enter the bowler name:");
				blrname[b]=scnr.next();
				b++;
				wl=0;
				retn=b-1;
				}
			else if(choiceblr!=12 && choiceblr>b)
			{
			System.out.println("Wrong choice!!!....choose again!!!");
			wl=1;
			}
				else
				{
				wl=0;
				retn=choiceblr-1;
				}
		}
		return(retn);	
		
	}
		
	void bowlerDetails(int a,int b,int s,byte runout,byte wd,byte no,byte nbl,byte by,byte byr)
	{

		if(wd==1)
		{
		blrttlwd[a]=blrttlwd[a]+1;
		}

		if(no==1 || nbl==1)
		{
		blrttlnbl[a]=blrttlnbl[a]+1;
		}

		if(s>=0)
		{
		bpor=bpor+b;
		}

		if(b<7 && by!=1 && no!=1 && byr!=1)
		{
		blrrun[a]=blrrun[a]+b;
		}

		if(wd==1 || no==1 || nbl==1)
		{
		blrrun[a]=blrrun[a]+1;
		bpor=bpor+1;
		}

		if(b==7 && runout!=1)
		{
		blrwicket[a]=blrwicket[a]+1;
		}

		if(s==6 && bpor==0)
		{
		blrmaden[a]=blrmaden[a]+1;
		}

		if(s==6)
		{
		blrover[a]=blrover[a]+1;
		bpor=0;
		}

		if(s>=0)
		{
		aob=s;
			if(s==6)
			{
			aob=0;
			}
		aftrovrbl[a]=aob;
		}
		
	}
	
	void allOver()
	{
		System.out.println("                       BOWLING DETAILS\n\n");
		
			for(int M=0;M<b;M++)
			{
				System.out.println((M+1)+"."+blrname[M]+"     OVERS:"+blrover[M]+"."+aftrovrbl[M]+"     RUNS:"+blrrun[M]+"     WICKETS:"+blrwicket[M]+"     MADEN OVERS:"+blrmaden[M]+"    wide-ball:"+blrttlwd[M]+"    no-ball:"+blrttlnbl[M]);
			}
		System.out.println("\n...................................................................................................");
	}	
	

		
}

class Batting
{
        Scanner scnr=new Scanner(System.in);
		byte aa;
        int b=0,retn;
        String batsmnname[]=new String[11];
        int bpor=0,aob;
        int runs[]=new int[11];
		int balls[]=new int[11];
        int sixes[]=new int[11];
        int fours[]=new int[11];
        float strikerate[]=new float[11];

        
        void firstBatsman()
        {
            batsmnname[b]=scnr.nextLine();
            b++; 
        }

        void secondBatsman()
        {
            batsmnname[b]=scnr.nextLine();
            b++; 
        }

        void takeBatsmanName()
        {
            batsmnname[b]=scnr.nextLine();
            b++;
        }


        void battingDetails(int wno,int run,byte wb,byte lbr,byte lbnbl,byte byr,byte runout,byte change)//'wno' is for number of wicket
        {
			if(run<=7 && change!=1)
			{
					
					if(run<=6 && wb!=1 && lbr!=1 && lbnbl!=1 && byr!=1)
					{
					runs[wno]=runs[wno]+run;
					}

					if(wb!=1 && byr!=1 && runout!=1)
					{
					balls[wno]=balls[wno]+1;
					} 

					if(balls[wno]>0)
					aa=0;

					if(balls[wno]==0)//in case of out a batsman by run out without face a single ball
					{
					balls[wno]=1;
					aa=1;
					}
					   	
					if(run==4 && wb!=1 && lbr!=1 && lbnbl!=1 && byr!=1)
					fours[wno]=fours[wno]+1;
					if(run==6 && wb!=1 && lbr!=1 && lbnbl!=1 && byr!=1)
					sixes[wno]=sixes[wno]+1;
					
					strikerate[wno]=(runs[wno]*100)/balls[wno];

					if(aa==1)
					balls[wno]=0;

			}
            
        }

		void afterOutBattingDetails(int outbatsman)
		{
			System.out.println(batsmnname[outbatsman]+" IS OUT!!!!");
			System.out.println("SCORE : "+batsmnname[outbatsman]+"  :  "+runs[outbatsman]+"("+balls[outbatsman]+")		4's:"+fours[outbatsman]+"		6's:"+sixes[outbatsman]+"		strike-rate:"+strikerate[outbatsman]);
		}

		String batsmanName(int btsmn)
		{
			return(batsmnname[btsmn]);
		} 

		int ttlruns(int btsmn)
		{
			return(runs[btsmn]);
		}
		int ttlballs(int btsmn)
		{
			return(balls[btsmn]);
		}
		int ttlfours(int btsmn)
		{
			return(fours[btsmn]);
		}
		int ttlsixes(int btsmn)
		{
			return(sixes[btsmn]);
		}
		float strikrt(int btsmn)
		{
			return(strikerate[btsmn]);
		}
		void everyOneScore(int ink1,int ink2)
		{
			for(int i=0;i<11;i++)
			{
				if(ink1==i || ink2==i)
				{
					System.out.println((i+1)+". "+batsmnname[i]+"-->"+runs[i]+"("+balls[i]+")**		4's:"+fours[i]+"		6's:"+sixes[i]+"		strike-rate:"+strikerate[i]);	
				}
				else
				{
				System.out.println((i+1)+". "+batsmnname[i]+" : "+runs[i]+"("+balls[i]+")		4's:"+fours[i]+"		6's:"+sixes[i]+"		strike-rate:"+strikerate[i]);
				}
			}	
		}

}

class ScoreBoardOfCricket
{
	public static void main(String args[])
	{
		
		Bowler blrcls=new Bowler();
		Bowler blrcls2=new Bowler();
        Batting btsmncls=new Batting();

		int k=0,p=1,i=0,p1=0,c=0,s=0,over=0,a=0,b=0; 
		int run,total=0,provrrn=0,w=0,totalovers,to,take1,take2;
		String team;
		int cntwide=0,ttllbrn=0,nobl=0,byrn=0;
		int wid=0,lgbrn=0,noblrn=0,nblrun=0,lbnoblrn=0,tbyrn=0;

		int wno,qq1=0,qq2=1,w1=0,w2=1,outbatsman=0,ink1=0,ink2=1;
		byte wb=0,lbr=0,lbnbl=0,byr=0,runout=0,change=0,nbl=0;
		byte oc=0;

		int bl1,bl2,sx1,sx2,fr1,fr2,rn1,rn2;
		String nm1,nm2;
		float str1,str2;

		
		Scanner scr=new Scanner(System.in);
		System.out.println("FOLLOW THE FOLLOWING INSTRUCTIONS....");
		System.out.println("ENTER   7   IN CASE OF OUT A BATSMAN!!!");
		System.out.println("ENTER   8   IN CASE OF WIDE-BALL!!!");
		System.out.println("ENTER   9   IN CASE OF LEG_BYE-RUN!!!");
		System.out.println("ENTER   10  IN CASE OF NO-BALL & RUN FROM BATSMAN!!!");
		System.out.println("ENTER   11  IN CASE OF NO-BALL & LEG-BYE-RUN!!!");
		System.out.println("ENTER   12  IN CASE OF BYE-RUN!!!");
		System.out.println("ENTER   13  IN CASE OF RUN-OUT!!!");
		System.out.println("ENTER   14  IN CASE OF CHANGE THE STRIKE!!!");

		System.out.println("TO FINISH ENTER ''555''!!");
		System.out.println("ENTER THE TEAM NAME:");
		team=scr.nextLine();
		System.out.println("ENTER TOTAL OVERS WILL BE PLAYED:");
		totalovers=scr.nextInt();
		to=totalovers;

		

		System.out.println("Enter the bowler's name:");
		take1=blrcls.firstBowler();
		System.out.println("Enter the name of Strick batsman:");
		btsmncls.firstBatsman();
		System.out.println("Enter the name of non-strick batsman:");
		btsmncls.secondBatsman();
		System.out.println("CONTINUOUSLY ENTER THE RUNS:");
		while(i!=555 && w!=10 && to!=over)
		{	
				run=scr.nextInt();
					
				if(s==0 && (run==8 || run==10 || run==11 || run==12 || run==13 || run==14))
				oc=1;
				if(s>0)
				oc=0;//oc variable for,keep right the run for per over(provrrn)
					if(run==8)
					{
						for(int kl=1;kl<=1;kl++)
						{
						total=total+1;
						provrrn=provrrn+1;
						System.out.println("------------------");
						System.out.println("WIDE-BALL!!!!!!....enter extra run:");
						wid=scr.nextInt();
						System.out.println("------------------");
						System.out.println(wid+"wd");
						run=wid;
						wb=1;
						tbyrn=tbyrn+run;
						cntwide++;
						}
					}
					if(run==9)
					{
						for(int kln=1;kln<=1;kln++)
						{						
						System.out.println("------------------");
						System.out.println("LEG_BYE-RUNs....enter extra run:");
						lgbrn=scr.nextInt();
						System.out.println("------------------");
						System.out.println(lgbrn+"lb");
						run=lgbrn;
						lbr=1;						
						ttllbrn=ttllbrn+run;						
						}
					}
					if(run==10)
					{
						for(int klm=1;klm<=1;klm++)
						{
						total=total+1;
						provrrn=provrrn+1;
						System.out.println("------------------");
						System.out.println("NO-BALL!!!!!!....enter the run:");
						noblrn=scr.nextInt();
						System.out.println("------------------");
						System.out.println(noblrn+"nb");
						run=noblrn;
						nobl++;
						nbl=1;		
						}
					}
					if(run==11)
					{
						for(int klmn=1;klmn<=1;klmn++)
						{
						total=total+1;
						provrrn=provrrn+1;
						System.out.println("------------------");
						System.out.println("NO-BALL  & LEG-BYE!!!!!!....enter extra run:");
						lbnoblrn=scr.nextInt();
						System.out.println("------------------");
						System.out.println(lbnoblrn+"nb");
						run=lbnoblrn;
						nobl++;
						lbnbl=1;
						ttllbrn=ttllbrn+run;
						}
					} 
					if(run==12)
					{
						for(int klnG=1;klnG<=1;klnG++)
						{
						System.out.println("------------------");
						System.out.println("BYE-RUNs....enter the run:");
						byrn=scr.nextInt();
						System.out.println("------------------");						
						run=byrn;
						byr=1;
						tbyrn=tbyrn+run;			
						}
					}
					if(run==13)
					{	
						System.out.println("------------------");
						System.out.println("RUN-OUT....!!!!!!!!");	
						System.out.println("------------------");
						runout=1;
						run=7;
					}
					if(run==14)
					{
						System.out.println("------------------");
						System.out.println("CHANGING STRIKE.....!!!!!!!!");
						System.out.println("------------------");
						change=1;
						run=1;
					}
				if(run!=555 && run>7 )
					{
					System.out.println("You have entered wrong value!!enter the right value!!");
					c++;
					}
				if(run<=7 && p!=10)//to go to the first part of batting side
					{

							k=1;
							p=10;

					}

				if(run<=7 && k==1)//run counting for the 1st set batsmans
				{
						wno=w1;
						btsmncls.battingDetails(wno,run,wb,lbr,lbnbl,byr,runout,change);//setting the detailsof a batsman
						outbatsman=wno;
					        if(run==7)//go to the next batsman's account after out one
						    {
							w1++;
							w++;
							qq1++;
							w1=w1+qq2;
							qq2=0;
							
							System.out.println("------------------");
							btsmncls.afterOutBattingDetails(outbatsman);
							System.out.println("------------------");
							
						
							System.out.println("Enter the NAME of next batsman:");
							btsmncls.takeBatsmanName();
							System.out.println("continue to entering the runs:");
						
							}		
					p1=1;
					ink1=w1;
				}
                
				if(run<=7 && k==2)//run counting for the 2nd set batsmans
				{
							
						wno=w2;
						btsmncls.battingDetails(wno,run,wb,lbr,lbnbl,byr,runout,change);
						outbatsman=wno;
							if(run==7)//go to the next batsman's account after out one
						    {
							w2++;
							w++;
							qq2++;
							w2=w2+qq1;
							qq1=0;
							
							System.out.println("------------------");
							btsmncls.afterOutBattingDetails(outbatsman);
							System.out.println("------------------");
							System.out.println("Enter the NAME of next batsman:");
							btsmncls.takeBatsmanName();
							System.out.println("continue to entering the runs:");
				
							}		
					p1=2;
					ink2=w2;
				}
				


					
					//odd or even run operation
							
							if(run<=7)
							{
								if(run!=7)
								{
								if(run%2==0 && p1==1)
									{
									k=1;
									}
								else
									{
									if(run%2!=0 && p1==1)
									k=2;
									}
								if(run%2==0 && p1==2)
									{
									k=2;
									}
								else
									{
									if(run%2!=0 && p1==2)
									k=1;
									}
								}
							}
						
	
				if(run>=0 && run<=7 && change!=1)//counting total runs
				{
					if(run>=0 && run<=6)
					{
					total=total+run;
					}
					if(wb!=1 && nbl!=1 && lbnbl!=1 && byr!=1 && runout!=1 && change!=1)//counting total balls
					{
					++s;
					}
				}

	            blrcls.bowlerDetails(take1,run,s,runout,wb,lbnbl,nbl,lbr,byr);//setting details of bowlears


				if(run>=0 && run<=6 && s<=6 && change!=1)//counting per over runs
				{	
				provrrn=provrrn+run;
				}

					nm2=btsmncls.batsmanName(ink2);//THIS PART RETURN THE DETAILS OF STRIKE AND NON STRIKE BATSMAN
					rn2=btsmncls.ttlruns(ink2);
					sx2=btsmncls.ttlsixes(ink2);
					fr2=btsmncls.ttlfours(ink2);
					bl2=btsmncls.ttlballs(ink2);
					str2=btsmncls.strikrt(ink2);
					
					fr1=btsmncls.ttlfours(ink1);
					bl1=btsmncls.ttlballs(ink1);
					str1=btsmncls.strikrt(ink1);
					sx1=btsmncls.ttlsixes(ink1);
					rn1=btsmncls.ttlruns(ink1);
					nm1=btsmncls.batsmanName(ink1);

				if(s==6 && k==1)//over counting & change batsman after an over & also counting balls after an over
				{
					
					k=2;
					s=0;
					over++;
					System.out.println("*********over....("+over+")....is....finished**********");
					System.out.println("Total run in this over is = "+provrrn);
					System.out.println("...............................");
					//ink2-strike,ink1-non-strike
					System.out.println(nm2+"-->"+rn2+"("+bl2+")		4's:"+fr2+"		6's:"+sx2+"		strike-rate:"+str2+" **(ON-STRIKE)");
					System.out.println(nm1+"-->"+rn1+"("+bl1+")		4's:"+fr1+"		6's:"+sx1+"		strike-rate:"+str1);
					System.out.println("...............................");
					System.out.println("TOTAL RUN IS = "+total);
					System.out.println("TOTAL WICKET iS = "+w);
					System.out.println("******************new....over*****************");
					take1=blrcls.bowlerName();
					System.out.println("**********************************************");	
				}
				else if(s==6 && k==2)
				{
					k=1;
					s=0;
					over++;
					System.out.println("*********over....("+over+")....is....finished**********");
					System.out.println("Total run in this over is = "+provrrn);
					System.out.println("...............................");
					//ink1-strike,ink2-non-strike
					System.out.println(nm1+"-->"+rn1+"("+bl1+")		4's:"+fr1+"		6's:"+sx1+"		strike-rate:"+str1+" **(ON-STRIKE)");
					System.out.println(nm2+"-->"+rn2+"("+bl2+")		4's:"+fr2+"		6's:"+sx2+"		strike-rate:"+str2);
					System.out.println("...............................");
					System.out.println("TOTAL RUN IS = "+total);
					System.out.println("TOTAL WICKET IS = "+w);
					System.out.println("******************new....over*****************");
					take1=blrcls.bowlerName();
					System.out.println("**********************************************");	
				}

				if(s==0 && oc==0)
				{
				provrrn=0;
				}
				
				if(w==10)//out from loop aftre all the wickets
				{
				System.out.println("...............................");
				System.out.println("Wickets are finished\nGAME IS OVER!!!!!!!");
				}
				if(to==over)//out from loop aftrer finishing overs
				{
				System.out.println("...............................");
				System.out.println("Overs are finished\nGAME IS OVER!!!!!!!!");
				}

				wb=0;
				lbr=0;
				nbl=0;
				lbnbl=0;
				byr=0;
				runout=0;
				change=0;

				i++;
				if(run==555)//for exit from the loop
						{
						i=555;
						}
				
		}
		System.out.println("*********************************************--FINAL RESULT--********************************************\n");
		System.out.println("                                                 "+team+"						     \n");
		System.out.println("---------------------------------------------------------------------------------------------------------\n");
		System.out.println("                                              BATTING DETAILS						     ");
		System.out.println("                                            ------------------						     \n");
		btsmncls.everyOneScore(ink1,ink2);
		System.out.println("\n--------------------------------------------------------------------------------------------------------");
		blrcls.allOver();
		
					System.out.println(" Total wide-ball is = "+cntwide);
					System.out.println(" Total no-ball is = "+nobl);
					System.out.println(" Total bye-run is = "+tbyrn);
					System.out.println(" Total leg-bye run is = "+ttllbrn);
					System.out.println(" TOTAL EXTRA RUN IS = "+(ttllbrn+nobl+cntwide+tbyrn));
		System.out.println("\n                              TOTAL RUN IS = "+total);
		System.out.println("                             TOTAL WICKET IS = "+w);
		System.out.println("                             TOTAL OVER IS = "+over+"."+s);
		System.out.println("\n                             	TARGET IS="+(total+1));
		if(c==1)
		System.out.println("Wrong value have not been counted!!!!!");
		if(c>1)
		{
		System.out.println("Wrong values have not been counted!!!!!");
		}
		System.out.println("*******************************************************************************************************\n");

	}
}