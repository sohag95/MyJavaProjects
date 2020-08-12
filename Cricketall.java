import java.util.*;
class Cricketall
{
	public static void main(String args[])
	{
		int run,total=0,provrrn=0,w=0,totalovers,to;
		int run1=0,run2=0,run3=0,run4=0,run5=0,run6=0,run7=0,run8=0,run9=0,run10=0,run11=0;
		Scanner scr=new Scanner(System.in);
		System.out.println("ENTER 7 IN CASE OF OUT A BATSMAN!!!");
		System.out.println("TO FINISH ENTER ''555''!!");
		System.out.println("ENTER TOTAL OVERS WILL BE PLAYED:");
		totalovers=scr.nextInt();

		to=totalovers;
		int k=0,p=1,i=0,p1=0,c=0,s=0,over=0,a=0,b=0,r4f=0,r6f=0,r4s=0,r6s=0,qq1=0,qq2=0,w1=0,w2=0;
		int r41=0,r42=0,r43=0,r44=0,r45=0,r46=0,r47=0,r48=0,r49=0 ,r410=0,r411=0;
		int r61=0,r62=0,r63=0,r64=0,r65=0,r66=0,r67=0,r68=0,r69=0,r610=0,r611=0;
		int a1=0,a2=0,a3=0,a4=0,a5=0,a6=0,a7=0,a8=0,a9=0,a10=0,a11=0;
		float sr1=0.0f,sr2=0.0f,sr3=0.0f,sr4=0.0f,sr5=0.0f,sr6=0.0f,sr7=0.0f,sr8=0.0f,sr9=0.0f,sr10=0.0f,sr11=0.0f;
		
		String str1,str2, str3=null,str4=null,str5=null,str6=null,str7=null,str8=null,str9=null,str10=null,str11=null;
		System.out.println("Enter the name of Strick batsman:");
		str1=scr.next();
		System.out.println("Enter the name of non-strick batsman:");
		str2=scr.next();
		System.out.println("continue to entering the runs:");
		while(i!=555 && w!=10 && to!=over)
			{	
				run=scr.nextInt();
				if(run!=555 && run>7)
					{
					System.out.println("You have entered wrong value!!enter the right value!!");
					c++;
					}
				if(run<=7 && p!=10)//to going the first part
					{

							k=1;
							p=10;

					}

				if(run<=7 && k==1)//run counting for the 1 batsman
				{
							
					if(w1==0 && run<=7)
					{
					if(run<=6)
					{run1=run1+run;}
					++a;
						
					if(run==4)
					r41++;
					if(run==6)
					r61++;
					sr1=(run1*100)/a;	
					}
						if(w1==1 && run<=7)
						{
						if(run<=6)
						{run3=run3+run;}
						++a1;
							
						if(run==4)
						r43++;
						if(run==6)
						r63++;
						sr3=(run3*100)/a1;
							
						}
							if(w1==2 && run<=7)
							{
							if(run<=6)
							{run4=run4+run;}
							++a2;
								
							if(run==4)
							r44++;
							if(run==6)
							r64++;
							 sr4=(run4*100)/a2;	
								
							}
								if(w1==3 && run<=7)
								{
								if(run<=6)
								{run5=run5+run;}
								++a3;
									
								if(run==4)
								r45++;
								if(run==6)
								r65++;
								sr5=(run5*100)/a3;
											
								}
						if(w1==4 && run<=7)
						{
						if(run<=6)
						{run6=run6+run;}
						++a4;
							
						if(run==4)
						r46++;
						if(run==6)
						r66++;
						sr6=(run6*100)/a4;
							
						}
							if(w1==5 && run<=7)
							{
							if(run<=6)
							{run7=run7+run;}
							++a5;
								
							if(run==4)
							r47++;
							if(run==6)
							r67++;
							 sr7=(run7*100)/a5;	
								
							}
								if(w1==6 && run<=7)
								{
								if(run<=6)
								{run8=run8+run;}
								++a6;
									
								if(run==4)
								r48++;
								if(run==6)
								r68++;
								sr8=(run8*100)/a6;
											
								}
						if(w1==7 && run<=7)
						{
						if(run<=6)
						{run9=run9+run;}
						++a7;
							
						if(run==4)
						r49++;
						if(run==6)
						r69++;
						sr9=(run9*100)/a7;
							
						}
							if(w1==8 && run<=7)
							{
							if(run<=6)
							{run10=run10+run;}
							++a8;
								
							if(run==4)
							r410++;
							if(run==6)
							r610++;
							 sr10=(run10*100)/a8;	
								
							}
								if(w1==9 && run<=7)
								{
								if(run<=6)
								{run11=run11+run;}
								++a9;
									
								if(run==4)
								r411++;
								if(run==6)
								r611++;
								sr11=(run11*100)/a9;
											
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
				if(run<=7 && k==2)//run counting for the 2 batsman
				{
							
					if(w2==0 && run<=7 )
					{
					if(run<=6)																			
					run2=run2+run;
					++b;
						
					if(run==4)
					r42++;
					if(run==6)
					r62++;
					 sr2=(run2*100)/b;	
					}
						if(w2==1 && run<=7)
						{
						if(run<=6)
						run3=run3+run;
						++a1;
							
						if(run==4)
						r43++;
						if(run==6)
						r63++;
						sr3=(run3*100)/a1;
							
						}
							if(w2==2 && run<=7 )
							{
							if(run<=6)
							run4=run4+run;
							++a2;
								
							if(run==4)
							r44++;
							if(run==6)
							r64++;
							sr4=(run4*100)/a2;
								
							}
								if(w2==3 && run<=7)
								{
								if(run<=6)
								run5=run5+run;
								++a3;
									
								if(run==4)
								r45++;
								if(run==6)
								r65++;
								sr5=(run5*100)/a3;	
										
								}
						if(w2==4 && run<=7)
						{
						if(run<=6)
						{run6=run6+run;}
						++a4;
							
						if(run==4)
						r46++;
						if(run==6)
						r66++;
						sr6=(run6*100)/a4;
							
						}
							if(w2==5 && run<=7)
							{
							if(run<=6)
							{run7=run7+run;}
							++a5;
								
							if(run==4)
							r47++;
							if(run==6)
							r67++;
							 sr7=(run7*100)/a5;
								
							}
								if(w2==6 && run<=7)
								{
								if(run<=6)
								{run8=run8+run;}
								++a6;
									
								if(run==4)
								r48++;
								if(run==6)
								r68++;
								sr8=(run8*100)/a6;	
										
								}
						if(w2==7 && run<=7)
						{
						if(run<=6)
						{run9=run9+run;}
						++a7;
							
						if(run==4)
						r49++;
						if(run==6)
						r69++;
						sr9=(run9*100)/a7;
							
						}
							if(w2==8 && run<=7)
							{
							if(run<=6)
							{run10=run10+run;}
							++a8;
								
							if(run==4)
							r410++;
							if(run==6)
							r610++;
							 sr10=(run10*100)/a8;
								
							}
								if(w2==9 && run<=7)
								{
								if(run<=6)
								{run11=run11+run;}
								++a9;
									
								if(run==4)
								r411++;
								if(run==6)
								r611++;
								sr11=(run11*100)/a9;	
										
								}
							if(run==7)
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
					else
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
				{total=total+run;}
				s++;
				}

				if(run>=0 && run<=6 && s<=6)
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
					System.out.println(str1+"'s run is="+run1+"("+a+")");
					if(w2==0)
					System.out.println(str2+"'s run is="+run2+"("+b+")");
					if(w1==1 || w2==1)
					System.out.println(str3+"'s run is="+run3+"("+a1+")");
					if(w1==2 || w2==2)
					System.out.println(str4+"'s run is="+run4+"("+a2+")");
					if(w1==3 || w2==3)
					System.out.println(str5+"'s run is="+run5+"("+a3+")");
					if(w1==4 || w2==4)
					System.out.println(str6+"'s run is="+run6+"("+a4+")");
					if(w1==5 || w2==5)
					System.out.println(str7+"'s run is="+run7+"("+a5+")");
					if(w1==6 || w2==6)
					System.out.println(str8+"'s run is="+run8+"("+a6+")");
					if(w1==7 || w2==7)
					System.out.println(str9+"'s run is="+run9+"("+a7+")");
					if(w1==8 || w2==8)
					System.out.println(str10+"'s run is="+run10+"("+a8+")");
					if(w1==9 || w2==9)
					System.out.println(str11+"'s run is="+run11+"("+a9+")");
					
					System.out.println("...............................");
					System.out.println("TOTAL RUN IS = "+total);
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
					System.out.println(str1+"'s run is="+run1+"("+a+")");
					if(w2==0)
					System.out.println(str2+"'s run is="+run2+"("+b+")");
					if(w1==1 || w2==1)
					System.out.println(str3+"'s run is="+run3+"("+a1+")");
					if(w1==2 || w2==2)
					System.out.println(str4+"'s run is="+run4+"("+a2+")");
					if(w1==3 || w2==3)
					System.out.println(str5+"'s run is="+run5+"("+a3+")");
					if(w1==4 || w2==4)
					System.out.println(str6+"'s run is="+run6+"("+a4+")");
					if(w1==5 || w2==5)
					System.out.println(str7+"'s run is="+run7+"("+a5+")");
					if(w1==6 || w2==6)
					System.out.println(str8+"'s run is="+run8+"("+a6+")");
					if(w1==7 || w2==7)
					System.out.println(str9+"'s run is="+run9+"("+a7+")");
					if(w1==8 || w2==8)
					System.out.println(str10+"'s run is="+run10+"("+a8+")");
					if(w1==9 || w2==9)
					System.out.println(str11+"'s run is="+run11+"("+a9+")");

					System.out.println("...............................");
					System.out.println("TOTAL RUN IS = "+total);
					System.out.println("******************new....over*****************");
					
					
					}

				if(s==0){
				provrrn=0;}
				
				
				if(w==10)
				System.out.println("Wickets are finished\nGAME IS OVER!!!!!!!");
				if(to==over)
				System.out.println("Overs are finished\nGAME IS OVER!!!!!!!!");
					
			}
			
			
			
			
			
			
		System.out.println("*********************************************FINAL RESULT********************************************");
			
		System.out.println("Total run of "+str1+" is="+run1+"("+a+")"+"  || total 4's is= "+r41+"   total 6's is= "+r61+" ||   &    Strick Rate is="+sr1);
		System.out.println("Total run of "+str2+" is="+run2+"("+b+")"+"  || total 4's is= "+r42+"   total 6's is= "+r62+" ||   &    Strick Rate is="+sr2);
		System.out.println("Total run of "+str3+" is="+run3+"("+a1+")"+"  || total 4's is= "+r43+"   total 6's is= "+r63+" ||   &    Strick Rate is="+sr3);
		System.out.println("Total run of "+str4+" is="+run4+"("+a2+")"+"  || total 4's is= "+r44+"   total 6's is= "+r64+" ||   &    Strick Rate is="+sr4);
		System.out.println("Total run of "+str5+" is="+run5+"("+a3+")"+"  || total 4's is= "+r45+"   total 6's is= "+r65+" ||   &    Strick Rate is="+sr5);
		System.out.println("Total run of "+str6+" is="+run6+"("+a4+")"+"  || total 4's is= "+r46+"   total 6's is= "+r66+" ||   &    Strick Rate is="+sr6);
		System.out.println("Total run of "+str7+" is="+run7+"("+a5+")"+"  || total 4's is= "+r47+"   total 6's is= "+r67+" ||   &    Strick Rate is="+sr7);
		System.out.println("Total run of "+str8+" is="+run8+"("+a6+")"+"  || total 4's is= "+r48+"   total 6's is= "+r68+" ||   &    Strick Rate is="+sr8);
		System.out.println("Total run of "+str9+" is="+run9+"("+a7+")"+"  || total 4's is= "+r49+"   total 6's is= "+r69+" ||   &    Strick Rate is="+sr9);
		System.out.println("Total run of "+str10+" is="+run10+"("+a8+")"+"  || total 4's is= "+r410+"   total 6's is= "+r610+" ||   &    Strick Rate is="+sr10);
		System.out.println("Total run of "+str11+" is="+run11+"("+a9+")"+"  || total 4's is= "+r411+"   total 6's is= "+r611+" ||   &    Strick Rate is="+sr11);
		
		System.out.println("Total run is="+total);
		System.out.println("Total wicket is="+w);
		System.out.println("Total over is="+over+"."+s);
		if(c==1)
		System.out.println("Wrong value have not been counted!!!!!");
		if(c>1)
		System.out.println("Wrong values have not been counted!!!!!");
		System.out.println("*****************************************************************************************************");
	}
}