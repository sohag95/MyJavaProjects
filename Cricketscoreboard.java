import java.util.*;
class Cricketscoreboard
{
	public static void main(String args[])
	{
		int run,total=0,provrrn=0,w=0,totalovers,to;
		int run1=0,run2=0,run3=0,run4=0,run5=0,run6=0,run7=0,run8=0,run9=0,run10=0,run11=0;

		Scanner scr=new Scanner(System.in);
		System.out.println("FOLLOW THE FOLLOWING INSTRUCTIONS....");
		System.out.println("ENTER   7   IN CASE OF OUT A BATSMAN!!!");
		System.out.println("ENTER   8   IN CASE OF WIDEBALL!!!");
		System.out.println("ENTER   9   IN CASE OF BY-RUN!!!");
		System.out.println("ENTER   10  IN CASE OF NO-BALL & RUN FROM BATSMAN!!!");
		System.out.println("ENTER   11  IN CASE OF NO-BALL & BY-RUN!!!");
		System.out.println("TO FINISH ENTER ''555''!!");
		System.out.println("ENTER TOTAL OVERS WILL BE PLAYED:");
		totalovers=scr.nextInt();

		to=totalovers;
		int k=0,p=1,i=0,p1=0,c=0,s=0,over=0,a=0,b=0,r4f=0,r6f=0,r4s=0,r6s=0,qq1=0,qq2=0,w1=0,w2=0;
		int r41=0,r42=0,r43=0,r44=0,r45=0,r46=0,r47=0,r48=0,r49=0 ,r410=0,r411=0;
		byte r61=0,r62=0,r63=0,r64=0,r65=0,r66=0,r67=0,r68=0,r69=0,r610=0,r611=0;
		byte a1=0,a2=0,a3=0,a4=0,a5=0,a6=0,a7=0,a8=0,a9=0,a10=0,a11=0;
		float sr1=0.0f,sr2=0.0f,sr3=0.0f,sr4=0.0f,sr5=0.0f,sr6=0.0f,sr7=0.0f,sr8=0.0f,sr9=0.0f,sr10=0.0f,sr11=0.0f;
		byte wn2=0,wn3=0,wn4=0,wn5=0,wn6=0,wn7=0,wn8=0,wn9=0,wn10=0,wn11=0,wn12=0,wn13=0,wn14=0,wn15=0,wn16=0,wn17=0,wn18=0,wn19=0,wn20=0,wn21=0;
		String str1,str2, str3=null,str4=null,str5=null,str6=null,str7=null,str8=null,str9=null,str10=null,str11=null;
		byte not1=0,not2=0,not3=0,not4=0,not5=0,not6=0,not7=0,not8=0,not9=0,not10=0,not11=0;		
		byte er1=0,er2=0,er3=0,er4=0,er5=0,er6=0,er7=0,er8=0,er9=0,er10=0,er11=0;

		int lb=0,cntwide=0,ttllbrn=0,lbr=0,nbl=0,nobl=0;
		int wid=0,lgbrn=0,noblrn=0,nblrun=0,lbnbl=0,lbnoblrn=0;

		System.out.println("Enter the name of Strick batsman:");
		str1=scr.next();
		System.out.println("Enter the name of non-strick batsman:");
		str2=scr.next();
		System.out.println("CONTINUOUSLY ENTER THE RUNS:");
		while(i!=555 && w!=10 && to!=over)
			{	
				run=scr.nextInt();
				
					if(run==8)
					{
						for(int kl=1;kl<=1;kl++)
						{
						total=total+1;
						System.out.println("------------------");
						System.out.println("WIDE-BALL!!!!!!....enter extra run:");
						wid=scr.nextInt();
						System.out.println("------------------");
						System.out.println(wid+"wd");
						run=wid;
						lb=1;
						ttllbrn=ttllbrn+run;
						
						cntwide++;
						provrrn=provrrn+1;
						}
					}
					if(run==9)
					{
						for(int kln=1;kln<=1;kln++)
						{
						
						System.out.println("------------------");
						System.out.println("BY-RUN....enter extra run:");
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
						System.out.println("------------------");
						System.out.println("NO-BALL!!!!!!....enter the run:");
						noblrn=scr.nextInt();
						System.out.println("------------------");
						System.out.println(noblrn+"nb");
						run=noblrn;
						nobl++;
						nbl=1;
						provrrn=provrrn+1;
						}
					}
					if(run==11)
					{
						for(int klmn=1;klmn<=1;klmn++)
						{
						total=total+1;
						System.out.println("------------------");
						System.out.println("NO-BALL!!!!!!....enter extra run:");
						lbnoblrn=scr.nextInt();
						System.out.println("------------------");
						System.out.println(lbnoblrn+"nb");
						run=lbnoblrn;
						nobl++;
						lbnbl=1;
						ttllbrn=ttllbrn+run;
						provrrn=provrrn+1;
						}
					} 
				if(run!=555 && run>7)
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
							
					if(w1==0 && run<=7)
					{
					
					   if(run<=6 && lb!=1 && lbr!=1 && lbnbl!=1)
					   {
					   run1=run1+run;
					   }
					   if(lb!=1 && nbl!=1 && lbnbl!=1)
					   ++a;
					   	
					   if(run==4 && lb!=1 && lbr!=1)
					   r41++;
					   if(run==6 && lb!=1 && lbr!=1)
					   r61++;
					   sr1=(run1*100)/a;
							if(run<=7 && er1==0)//to show ** in case of not out
							{
							not1=1;
							er1=1;
							}
							if(run==7)
							{
							wn2=1;
							not1=2;
							}	
					}
						if(w1==1 && run<=7)
						{
						if(run<=6 && lb!=1 && lbr!=1 && lbnbl!=1)
						{run3=run3+run;}
						if(lb!=1 && nbl!=1 && lbnbl!=1)
						++a1;
							
						if(run==4 && lb!=1 && lbr!=1)
						r43++;
						if(run==6 && lb!=1 && lbr!=1)
						r63++;
						sr3=(run3*100)/a1;
							if(run<=7 && er3==0)
							{
							not3=1;
							er3=1;
							}
							if(run==7)
							{
							wn3=1;
							not3=2;
							}	
						}
							if(w1==2 && run<=7)
							{
							if(run<=6 && lb!=1 && lbr!=1 && lbnbl!=1)
							{run4=run4+run;}
							if(lb!=1 && nbl!=1 && lbnbl!=1)
							++a2;
								
							if(run==4 && lb!=1 && lbr!=1)
							r44++;
							if(run==6 && lb!=1 && lbr!=1)
							r64++;
							 sr4=(run4*100)/a2;	
							if(run<=7 && er4==0)
							{
							not4=1;
							er4=1;
							}
							if(run==7)
							{
							wn4=1;
							not4=2;
							}	
							}
								if(w1==3 && run<=7)
								{
								if(run<=6 && lb!=1 && lbr!=1 && lbnbl!=1)
								{run5=run5+run;}
								if(lb!=1 && nbl!=1 && lbnbl!=1)
								++a3;
									
								if(run==4 && lb!=1 && lbr!=1)
								r45++;
								if(run==6 && lb!=1 && lbr!=1)
								r65++;
								sr5=(run5*100)/a3;
							if(run<=7 && er5==0)
							{
							not5=1;
							er5=1;
							}
							if(run==7)
							{
							wn5=1;
							not5=2;
							}				
								}
						if(w1==4 && run<=7)
						{
						if(run<=6 && lb!=1 && lbr!=1 && lbnbl!=1)
						{run6=run6+run;}
						if(lb!=1 && nbl!=1 && lbnbl!=1)
						++a4;
							
						if(run==4 && lb!=1 && lbr!=1)
						r46++;
						if(run==6 && lb!=1 && lbr!=1)
						r66++;
						sr6=(run6*100)/a4;
							if(run<=7 && er6==0)
							{
							not6=1;
							er6=1;
							}
							if(run==7)
							{
							wn6=1;
							not6=2;
							}	
						}
							if(w1==5 && run<=7)
							{
							if(run<=6 && lb!=1 && lbr!=1 && lbnbl!=1)
							{run7=run7+run;}
							if(lb!=1 && nbl!=1 && lbnbl!=1)
							++a5;
								
							if(run==4 && lb!=1 && lbr!=1)
							r47++;
							if(run==6 && lb!=1 && lbr!=1)
							r67++;
							 sr7=(run7*100)/a5;	
							if(run<=7 && er7==0)
							{
							not7=1;
							er7=1;
							}
							if(run==7)
							{
							wn7=1;
							not7=2;
							}		
							}
								if(w1==6 && run<=7)
								{
								if(run<=6 && lb!=1 && lbr!=1 && lbnbl!=1)
								{run8=run8+run;}
								if(lb!=1 && nbl!=1 && lbnbl!=1)
								++a6;
									
								if(run==4 && lb!=1 && lbr!=1)
								r48++;
								if(run==6 && lb!=1 && lbr!=1)
								r68++;
								sr8=(run8*100)/a6;
							if(run<=7 && er8==0)
							{
							not8=1;
							er8=1;
							}
							if(run==7)
							{
							wn8=1;
							not8=2;
							}				
								}
						if(w1==7 && run<=7)
						{
						if(run<=6 && lb!=1 && lbr!=1 && lbnbl!=1)
						{run9=run9+run;}
						if(lb!=1 && nbl!=1 && lbnbl!=1)
						++a7;
							
						if(run==4 && lb!=1 && lbr!=1)
						r49++;
						if(run==6 && lb!=1 && lbr!=1)
						r69++;
						sr9=(run9*100)/a7;
							if(run<=7 && er9==0)
							{
							not9=1;
							er9=1;
							}
							if(run==7)
							{
							wn9=1;
							not9=2;
							}		
						}
							if(w1==8 && run<=7)
							{
							if(run<=6 && lb!=1 && lbr!=1 && lbnbl!=1)
							{run10=run10+run;}
							if(lb!=1 && nbl!=1 && lbnbl!=1)
							++a8;
								
							if(run==4 && lb!=1 && lbr!=1)
							r410++;
							if(run==6 && lb!=1 && lbr!=1)
							r610++;
							 sr10=(run10*100)/a8;	
							if(run<=7 && er10==0)
							{
							not10=1;
							er10=1;
							}
							if(run==7)
							{
							wn10=1;
							not10=2;
							}	
							}
								if(w1==9 && run<=7)
								{
								if(run<=6 && lb!=1 && lbr!=1 && lbnbl!=1)
								{run11=run11+run;}
								if(lb!=1 && nbl!=1 && lbnbl!=1)
								++a9;
									
								if(run==4 && lb!=1 && lbr!=1)
								r411++;
								if(run==6 && lb!=1 && lbr!=1)
								r611++;
								sr11=(run11*100)/a9;
							if(run<=7 && er11==0)
							{
							not11=1;
							er11=1;
							}
							if(run==7)
							{
							wn11=1;
							not11=2;
							}					
								}
							if(run==7)
						        {
							w1++;
							w++;
							qq1++;
							}
							if(run==7)
						        {
							w1=w1+qq2;
							qq2=0;
							}		
					p1=1;
				}
				if(run<=7 && k==2)//run counting for the 2nd set batsmans
				{
							
					if(w2==0 && run<=7 )
					{
					if(run<=6 && lb!=1 && lbr!=1 && lbnbl!=1)																			
					run2=run2+run;
					if(lb!=1 && nbl!=1 && lbnbl!=1)
					++b;
						
					if(run==4 && lb!=1 && lbr!=1)
					r42++;
					if(run==6 && lb!=1 && lbr!=1)
					r62++;
					 sr2=(run2*100)/b;
							if(run<=7 && er2==0)
							{
							not2=1;
							er2=1;
							}
							if(run==7)
							{
							wn12=1;
							not2=2;
							}	
					}
						if(w2==1 && run<=7)
						{
						if(run<=6 && lb!=1 && lbr!=1 && lbnbl!=1)
						run3=run3+run;
						if(lb!=1 && nbl!=1 && lbnbl!=1)
						++a1;
							
						if(run==4 && lb!=1 && lbr!=1)
						r43++;
						if(run==6 && lb!=1 && lbr!=1)
						r63++;
						sr3=(run3*100)/a1;
							if(run<=7 && er3==0)
							{
							not3=1;
							er3=1;
							}
							if(run==7)
							{
							wn13=1;
							not3=2;
							}
						}
							if(w2==2 && run<=7 )
							{
							if(run<=6 && lb!=1 && lbr!=1 && lbnbl!=1)
							run4=run4+run;
							if(lb!=1 && nbl!=1 && lbnbl!=1)
							++a2;
								
							if(run==4 && lb!=1 && lbr!=1)
							r44++;
							if(run==6 && lb!=1 && lbr!=1)
							r64++;
							sr4=(run4*100)/a2;
							if(run<=7 && er4==0)
							{
							not4=1;
							er4=1;
							}
							if(run==7)
							{
							wn14=1;
							not4=2;
							}	
							}
								if(w2==3 && run<=7)
								{
								if(run<=6 && lb!=1 && lbr!=1 && lbnbl!=1)
								run5=run5+run;
								if(lb!=1 && nbl!=1 && lbnbl!=1)
								++a3;
									
								if(run==4 && lb!=1 && lbr!=1)
								r45++;
								if(run==6 && lb!=1 && lbr!=1)
								r65++;
								sr5=(run5*100)/a3;	
							if(run<=7 && er5==0)
							{
							not5=1;
							er5=1;
							}
							if(run==7)
							{
							wn15=1;
							not5=2;
							}		
								}
						if(w2==4 && run<=7)
						{
						if(run<=6 && lb!=1 && lbr!=1 && lbnbl!=1)
						{run6=run6+run;}
						if(lb!=1 && nbl!=1 && lbnbl!=1)
						++a4;
							
						if(run==4 && lb!=1 && lbr!=1)
						r46++;
						if(run==6 && lb!=1 && lbr!=1)
						r66++;
						sr6=(run6*100)/a4;
							if(run<=7 && er6==0)
							{
							not6=1;
							er6=1;
							}
							if(run==7)
							{
							wn16=1;
							not6=2;
							}	
						}
							if(w2==5 && run<=7)
							{
							if(run<=6 && lb!=1 && lbr!=1 && lbnbl!=1)
							{run7=run7+run;}
							if(lb!=1 && nbl!=1 && lbnbl!=1)
							++a5;
								
							if(run==4 && lb!=1 && lbr!=1)
							r47++;
							if(run==6 && lb!=1 && lbr!=1)
							r67++;
							 sr7=(run7*100)/a5;
							if(run<=7 && er7==0)
							{
							not7=1;
							er7=1;
							}
							if(run==7)
							{
							wn17=1;
							not7=2;
							}			
							}
								if(w2==6 && run<=7)
								{
								if(run<=6 && lb!=1 && lbr!=1 && lbnbl!=1)
								{run8=run8+run;}
								if(lb!=1 && nbl!=1 && lbnbl!=1)
								++a6;
									
								if(run==4 && lb!=1 && lbr!=1)
								r48++;
								if(run==6 && lb!=1 && lbr!=1)
								r68++;
								sr8=(run8*100)/a6;	
							if(run<=7 && er8==0)
							{
							not8=1;
							er8=1;
							}
							if(run==7)
							{
							wn18=1;
							not8=2;
							}		
								}
						if(w2==7 && run<=7)
						{
						if(run<=6 && lb!=1 && lbr!=1 && lbnbl!=1)
						{run9=run9+run;}
						if(lb!=1 && nbl!=1 && lbnbl!=1)
						++a7;
							
						if(run==4 && lb!=1 && lbr!=1)
						r49++;
						if(run==6 && lb!=1 && lbr!=1)
						r69++;
						sr9=(run9*100)/a7;
							if(run<=7 && er9==0)
							{
							not9=1;
							er9=1;
							}
							if(run==7)
							{
							wn19=1;
							not9=2;
							}	
						}
							if(w2==8 && run<=7)
							{
							if(run<=6 && lb!=1 && lbr!=1 && lbnbl!=1)
							{run10=run10+run;}
							if(lb!=1 && nbl!=1 && lbnbl!=1)
							++a8;
								
							if(run==4 && lb!=1 && lbr!=1)
							r410++;
							if(run==6 && lb!=1 && lbr!=1)
							r610++;
							 sr10=(run10*100)/a8;
							if(run<=7 && er10==0)
							{
							not10=1;
							er10=1;
							}
							if(run==7)
							{
							wn20=1;
							not10=2;
							}	
							}
								if(w2==9 && run<=7)
								{
								if(run<=6 && lb!=1 && lbr!=1 && lbnbl!=1)
								{run11=run11+run;}
								if(lb!=1 && nbl!=1 && lbnbl!=1)
								++a9;
									
								if(run==4 && lb!=1 && lbr!=1)
								r411++;
								if(run==6 && lb!=1 && lbr!=1)
								r611++;
								sr11=(run11*100)/a9;	
							if(run<=7 && er11==0)
							{
							not11=1;
							er11=1;
							}
							if(run==7)
							{
							wn21=1;
							not11=2;
							}		
								}
							if(run==7)//go to the next batsman's account after out one
						        {
							w2++;
							w++;
							qq2++;
							}
							if(run==7)
						        {
							w2=w2+qq1;
							qq1=0;
							}		
					p1=2;
					}
				


					if(run==555)//for exit from the loop
						{
						i=555;
						}
					else//odd or even run operation
						{
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

						i++;	
						}

					
					if(wn2==1)//after out one batsmen showing his details
					{
					System.out.println(str1+" IS OUT!!!!\n"+str1+"'s Run is = "+run1+"("+a+")");
					wn2=0;
					}
					if(wn12==1)
					{
					System.out.println(str2+" IS OUT!!!!\n"+str2+"'s Run is = "+run2+"("+b+")");
					wn12=0;
					}
					if(wn3==1 || wn13==1)
					{
					System.out.println(str3+" IS OUT!!!!\n"+str3+"'s Run is = "+run3+"("+a1+")");
					wn3=0;wn13=0;
					}
					if(wn4==1 || wn14==1)
					{
					System.out.println(str4+" IS OUT!!!!\n"+str4+"'s Run is = "+run4+"("+a2+")");
					wn4=0;wn14=0;
					}
					if(wn5==1 || wn15==1)
					{
					System.out.println(str5+" IS OUT!!!!\n"+str5+"'s Run is = "+run5+"("+a3+")");
					wn5=0;wn15=0;
					}
					if(wn6==1 || wn16==1)
					{
					System.out.println(str6+" IS OUT!!!!\n"+str6+"'s Run is = "+run6+"("+a4+")");
					wn6=0;wn16=0;
					}
					if(wn7==1 || wn17==1)
					{
					System.out.println(str7+" IS OUT!!!!\n"+str7+"'s Run is = "+run7+"("+a5+")");
					wn7=0;wn17=0;
					}
					if(wn8==1 || wn18==1)
					{
					System.out.println(str8+" IS OUT!!!!\n"+str8+"'s Run is = "+run8+"("+a6+")");
					wn8=0;wn18=0;
					}
					if(wn9==1 || wn19==1)
					{
					System.out.println(str9+" IS OUT!!!!\n"+str9+"'s Run is = "+run9+"("+a7+")");
					wn9=0;wn19=0;
					}
					if(wn10==1 || wn20==1)
					{
					System.out.println(str10+" IS OUT!!!!\n"+str10+"'s Run is = "+run10+"("+a8+")");
					wn10=0;wn20=0;
					}
					if(wn11==1 || wn21==1)
					{
					System.out.println(str3+" IS OUT!!!!\n"+str11+"'s Run is = "+run11+"("+a9+")");
					wn11=0;wn21=0;
					}

				if(run==7)//entering the name of new batsman
				{
					if(w==1)
					{
					System.out.println("Enter the name of 3rd batsman:");
					str3=scr.next();
					System.out.println("continue to entering the runs:");
					}
					if(w==2)
					{
					System.out.println("Enter the name of 4th batsman:");
					str4=scr.next();
					System.out.println("continue to entering the runs:");
					}
					if(w==3)
					{
					System.out.println("Enter the name of 5th batsman:");
					str5=scr.next();
					System.out.println("continue to entering the runs:");
					}
					if(w==4)
					{
					System.out.println("Enter the name of 6th batsman:");
					str6=scr.next();
					System.out.println("continue to entering the runs:");
					}
					if(w==5)
					{
					System.out.println("Enter the name of 7th batsman:");
					str7=scr.next();
					System.out.println("continue to entering the runs:");
					}
					if(w==6)
					{
					System.out.println("Enter the name of 8th batsman:");
					str8=scr.next();
					System.out.println("continue to entering the runs:");
					}
					if(w==7)
					{
					System.out.println("Enter the name of 9th batsman:");
					str9=scr.next();
					System.out.println("continue to entering the runs:");
					}
					if(w==8)
					{
					System.out.println("Enter the name of 10th batsman:");
					str10=scr.next();
					System.out.println("continue to entering the runs:");
					}
					if(w==9)
					{
					System.out.println("Enter the name of 11th batsman:");
					str11=scr.next();
					System.out.println("continue to entering the runs:");
					}
				}
	
				if(run>=0 && run<=7)//counting total runs
				{
				 if(run>=0 && run<=6)
				 {
				 total=total+run;
				 }
				if(lb!=1 && nbl!=1 && lbnbl!=1)
				  {s++;}
				}

				if(run>=0 && run<=6 && s<=6)//counting per over runs
				{
					
				provrrn=provrrn+run;
				}

				if(s==6 && k==1)//over counting & change batsman after an over & also counting balls after an over
					{
					k=2;
					s=0;
					over++;
					System.out.println("*********over....("+over+")....is....finished**********");
					System.out.println("Total run in this over is = "+provrrn);
					System.out.println("...............................");

					if(w1==0)
					System.out.println(str1+"'s run is = "+run1+"("+a+")*");
					if(w2==0)
					System.out.println(str2+"'s run is = "+run2+"("+b+")*");
					if(w1==1 || w2==1)
					System.out.println(str3+"'s run is = "+run3+"("+a1+")*");
					if(w1==2 || w2==2)
					System.out.println(str4+"'s run is = "+run4+"("+a2+")*");
					if(w1==3 || w2==3)
					System.out.println(str5+"'s run is = "+run5+"("+a3+")*");
					if(w1==4 || w2==4)
					System.out.println(str6+"'s run is = "+run6+"("+a4+")*");
					if(w1==5 || w2==5)
					System.out.println(str7+"'s run is = "+run7+"("+a5+")*");
					if(w1==6 || w2==6)
					System.out.println(str8+"'s run is = "+run8+"("+a6+")*");
					if(w1==7 || w2==7)
					System.out.println(str9+"'s run is = "+run9+"("+a7+")*");
					if(w1==8 || w2==8)
					System.out.println(str10+"'s run is = "+run10+"("+a8+")*");
					if(w1==9 || w2==9)
					System.out.println(str11+"'s run is = "+run11+"("+a9+")*");
					
					System.out.println("...............................");
					System.out.println("TOTAL RUN IS = "+total);
					System.out.println("TOTAL WICKET iS = "+w);
					System.out.println("******************new....over*****************");
						
					}
				else if(s==6 && k==2)
					{
					k=1;
					s=0;
					over++;
					System.out.println("*********over....("+over+")....is....finished**********");
					System.out.println("Total run in this over is = "+provrrn);
					System.out.println("...............................");

					if(w1==0)
					System.out.println(str1+"'s run is = "+run1+"("+a+")*");
					if(w2==0)
					System.out.println(str2+"'s run is = "+run2+"("+b+")*");
					if(w1==1 || w2==1)
					System.out.println(str3+"'s run is = "+run3+"("+a1+")*");
					if(w1==2 || w2==2)
					System.out.println(str4+"'s run is = "+run4+"("+a2+")*");
					if(w1==3 || w2==3)
					System.out.println(str5+"'s run is = "+run5+"("+a3+")*");
					if(w1==4 || w2==4)
					System.out.println(str6+"'s run is = "+run6+"("+a4+")*");
					if(w1==5 || w2==5)
					System.out.println(str7+"'s run is = "+run7+"("+a5+")*");
					if(w1==6 || w2==6)
					System.out.println(str8+"'s run is = "+run8+"("+a6+")*");
					if(w1==7 || w2==7)
					System.out.println(str9+"'s run is = "+run9+"("+a7+")*");
					if(w1==8 || w2==8)
					System.out.println(str10+"'s run is = "+run10+"("+a8+")*");
					if(w1==9 || w2==9)
					System.out.println(str11+"'s run is = "+run11+"("+a9+")*");

					System.out.println("...............................");
					System.out.println("TOTAL RUN IS = "+total);
					System.out.println("TOTAL WICKET IS = "+w);
					System.out.println("******************new....over*****************");
					
					}

				if(s==0)
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

				lb=0;
				lbr=0;
				nbl=0;
				lbnbl=0;	
			}
			
						
		//final result shows	
			
		System.out.println("*********************************************--FINAL RESULT--********************************************\n");
		System.out.println("---------------------------------------------------------------------------------------------------------\n");
		if(not1==1)
		System.out.println("Total run of "+str1+" is = "+run1+"("+a+")"+"**  || total 4's is= "+r41+"   total 6's is= "+r61+" ||   &    Strick Rate is="+sr1);
		else if(not1==0 || not1==2)	
		System.out.println("Total run of "+str1+" is = "+run1+"("+a+")"+"  || total 4's is= "+r41+"   total 6's is= "+r61+" ||   &    Strick Rate is="+sr1);
		if(not2==1)
		System.out.println("Total run of "+str2+" is = "+run2+"("+b+")"+"**  || total 4's is= "+r42+"   total 6's is= "+r62+" ||   &    Strick Rate is="+sr2);
		else if(not2==0 || not2==2)
		System.out.println("Total run of "+str2+" is = "+run2+"("+b+")"+"  || total 4's is= "+r42+"   total 6's is= "+r62+" ||   &    Strick Rate is="+sr2);
		if(not3==1)
		System.out.println("Total run of "+str3+" is = "+run3+"("+a1+")"+"**  || total 4's is= "+r43+"   total 6's is= "+r63+" ||   &    Strick Rate is="+sr3);
		else if(not3==0 || not3==2)
		System.out.println("Total run of "+str3+" is = "+run3+"("+a1+")"+"  || total 4's is= "+r43+"   total 6's is= "+r63+" ||   &    Strick Rate is="+sr3);
		if(not4==1)
		System.out.println("Total run of "+str4+" is = "+run4+"("+a2+")"+"**  || total 4's is= "+r44+"   total 6's is= "+r64+" ||   &    Strick Rate is="+sr4);
		else if(not4==0 || not4==2)
		System.out.println("Total run of "+str4+" is = "+run4+"("+a2+")"+"  || total 4's is= "+r44+"   total 6's is= "+r64+" ||   &    Strick Rate is="+sr4);
		if(not5==1)
		System.out.println("Total run of "+str5+" is = "+run5+"("+a3+")"+"**  || total 4's is= "+r45+"   total 6's is= "+r65+" ||   &    Strick Rate is="+sr5);
		else if(not5==0 || not5==2)
		System.out.println("Total run of "+str5+" is = "+run5+"("+a3+")"+"  || total 4's is= "+r45+"   total 6's is= "+r65+" ||   &    Strick Rate is="+sr5);
		if(not6==1)
		System.out.println("Total run of "+str6+" is = "+run6+"("+a4+")"+"**  || total 4's is= "+r46+"   total 6's is= "+r66+" ||   &    Strick Rate is="+sr6);
		else if(not6==0 || not6==2)
		System.out.println("Total run of "+str6+" is = "+run6+"("+a4+")"+"  || total 4's is= "+r46+"   total 6's is= "+r66+" ||   &    Strick Rate is="+sr6);
		if(not7==1)
		System.out.println("Total run of "+str7+" is = "+run7+"("+a5+")"+"**  || total 4's is= "+r47+"   total 6's is= "+r67+" ||   &    Strick Rate is="+sr7);
		else if(not7==0 || not7==2)
		System.out.println("Total run of "+str7+" is = "+run7+"("+a5+")"+"  || total 4's is= "+r47+"   total 6's is= "+r67+" ||   &    Strick Rate is="+sr7);
		if(not8==1)
		System.out.println("Total run of "+str8+" is = "+run8+"("+a6+")"+"**  || total 4's is= "+r48+"   total 6's is= "+r68+" ||   &    Strick Rate is="+sr8);
		else if(not8==0 || not8==2)
		System.out.println("Total run of "+str8+" is = "+run8+"("+a6+")"+"  || total 4's is= "+r48+"   total 6's is= "+r68+" ||   &    Strick Rate is="+sr8);
		if(not9==1)
		System.out.println("Total run of "+str9+" is = "+run9+"("+a7+")"+"**  || total 4's is= "+r49+"   total 6's is= "+r69+" ||   &    Strick Rate is="+sr9);
		else if(not9==0 || not9==2)
		System.out.println("Total run of "+str9+" is = "+run9+"("+a7+")"+"  || total 4's is= "+r49+"   total 6's is= "+r69+" ||   &    Strick Rate is="+sr9);
		if(not10==1)
		System.out.println("Total run of "+str10+" is = "+run10+"("+a8+")"+"**  || total 4's is= "+r410+"   total 6's is= "+r610+" ||   &    Strick Rate is="+sr10);
		else if(not10==0 || not10==2)
		System.out.println("Total run of "+str10+" is = "+run10+"("+a8+")"+"  || total 4's is= "+r410+"   total 6's is= "+r610+" ||   &    Strick Rate is="+sr10);
		if(not11==1)
		System.out.println("Total run of "+str11+" is = "+run11+"("+a9+")"+"**  || total 4's is= "+r411+"   total 6's is= "+r611+" ||   &    Strick Rate is="+sr11);
		else if(not11==0 || not11==2)
		{
		System.out.println("Total run of "+str11+" is = "+run11+"("+a9+")"+"  || total 4's is= "+r411+"   total 6's is= "+r611+" ||   &    Strick Rate is="+sr11);
		}
		System.out.println("\n--------------------------------------------------------------------------------------------------------");
		
					System.out.println(" Total wide-ball is = "+cntwide);
					System.out.println(" Total no-ball is = "+nobl);
					System.out.println(" Total leg-by run is = "+ttllbrn);
					System.out.println(" TOTAL EXTRA RUN IS = "+(ttllbrn+nobl+cntwide));
		System.out.println("\n                              TOTAL RUN IS = "+total);
		System.out.println("                             TOTAL WICKET IS = "+w);
		System.out.println("                             TOTAL OVER IS = "+over+"."+s);
		if(c==1)
		System.out.println("Wrong value have not been counted!!!!!");
		if(c>1)
		{
		System.out.println("Wrong values have not been counted!!!!!");
		}
		System.out.println("*******************************************************************************************************");
	}

}