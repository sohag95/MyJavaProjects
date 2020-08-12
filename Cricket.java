import java.util.Scanner;
class Cricket
{
	public static void main(String args[])
	{
		int run,run1=0,run2=0,total=0,provrrn=0;
		Scanner scr=new Scanner(System.in);
		
		System.out.println("TO FINISH ENTER ''555''!!");
		int k=0,p=1,i=0,p1=0,c=0,s=0,over=0,a=0,b=0;

		String str1,str2;
		System.out.println("Enter the name of Strick batsman:");
		str1=scr.nextLine();
		System.out.println("Enter the name of non-strick batsman:");
		str2=scr.nextLine();
		System.out.println("continue to entering the runs:");
		while(i!=555)
			{	
				run=scr.nextInt();
				if(run!=555 && run>=7)
					{
					System.out.println("You have entered wrong value!!enter the write value!!");
					c++;
					}
				if(run<=6 && p!=10)//to going the first part
					{

							k=1;
							p=10;

					}

				if(run<=6 && k==1)//run counting for the first batsman
					{
					run1=run1+run;
					p1=1;a++;	
					}
				if(run<=6 && k==2)//run counting for the second batsman
					{
					run2=run2+run;
					p1=2;b++;	
					}


					if(run==555)//for exit from the loop
						{
						i=555;
						}
					else		//
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
						i++;	
						}

				if(run>=0 && run<=6)//counting total runs
				{
				total=total+run;
				s++;
				}
				if(run>=0 && run<=6 && s<=6){
				provrrn=provrrn+run;}
				if(s==6 && k==1)//over counting & change batsman after an over & also counting balls after an over
					{
					k=2;
					s=0;
					System.out.println("......over...is...finished.....");
					System.out.println("Total run in this over is = "+provrrn);
					System.out.println("...............................");
					System.out.println("TOTAL RUN IS = "+total);
					System.out.println("..........new....over..........");
					over++;
					
					}
				else if(s==6 && k==2)
					{
					k=1;
					s=0;
					System.out.println("......over...is...finished.....");
					System.out.println("Total run in this over is = "+provrrn);
					System.out.println("...............................");
					System.out.println("TOTAL RUN IS = "+total);
					System.out.println("..........new....over..........");
					over++;
					
					}

				if(s==0){
				provrrn=0;}
					
			}
			
			float sr1=(run1*100)/a;
			float sr2=(run2*100)/b;
			
		System.out.println("Total run of "+str1+" is="+run1+"("+a+")"+"    &    Strick Rate is="+sr1);
		System.out.println("Total run of "+str2+" is="+run2+"("+b+")"+"    &    Strick Rate is="+sr2);
		System.out.println("Total run is="+total);
		System.out.println("Total over is="+over+"."+s);
		if(c==1)
		System.out.println("Wrong value have not been counted!!!!!");
		if(c>1)
		System.out.println("Wrong values have not been counted!!!!!");
	}
}