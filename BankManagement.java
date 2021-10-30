package newbanksystem;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import java.io.*;
import java.util.*;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.ClassNotFoundException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;
import javax.script.ScriptEngineManager;
import javax.script.ScriptEngine;
import javax.script.ScriptException;

import java.io.BufferedWriter;
 
import java.io.PrintWriter;

public class BankManagement  {
	 private static Scanner sc= new Scanner(System.in); 
	 private static  Accounts account = new Accounts();
	// FileOutputStream out = new FileOutputStream("");
	 private static ReadWriteFile fileReader=new ReadWriteFile();
	 private static boolean isLogin=false;
	 private static Accounts currentLoginAccount;
	  public static void main(String[] args) throws IOException {
	        System.out.println("======================================================================================="); 
	        System.out.println("                             Bank Management System                                    "); 
	        System.out.println("======================================================================================="); 
			char choice;
			 
			// Print the read value
		//	System.out.println("c = "+c);
	        //mainmenue();
			mainmenue();
			System.out.println("enter your choice");
			Scanner sc = new Scanner(System.in);
   
			// Character input
			char c = sc.next().charAt(0);
	   
			if(c=='4')
			{

			makewithdrawl();

			}
			else if(c=='7')
			{
				// searcher:
				 
				calculateZakat();
			}
			else if(c=='5')
			{
checkbalance();
			}
			else if(c=='3')
			{
				makedeposit();
			}
			else if(c=='1')
			{
				new_account();
			}
			else if(c=='2')
			{

				old_account();
			}
			else if(c=='8')
			{
				System.out.println("sorry accounts are not closing yet\n");
			}
	    }
	/*	public static void accountverify()
		{
			int i=12345;
System.out.println("enter the account number\n");
search:
 for(int count=0;count<10;count++)
 {
	 if(count>=1)
	 {
		System.out.println("incorrect account number!   enter again \n");
	 }
	int deposit= sc.nextInt();

	 if(deposit==i)
	 {
	//	mainmenue();
	 	 break;
		 
	 } 
	 
 
else 
{
continue search;
} 




 }

		}*/
		  
	    public static void mainmenue( ) {
	    	
	        //String manueSelected="";
	     // accountverify();
		    
		
 	            System.out.println("======================================================================================="); 
	            System.out.println("Enter 1 For : Open a New Account");
	            if(!isLogin)
	                System.out.println("Enter 2 For : Login to a specific account by providing the unique account number");
					System.out.println("Enter 3 For : makeDeposit");
					System.out.println("Enter 4 For : makeWithdrawal");
					System.out.println("Enter 5 For : checkBalance");
					 
 	            System.out.println("Enter 6 For : Specify the Interest Rate, applicable to all Saving Accounts");
	            System.out.println("Enter 7 For : Display all account details, including the bank owner details ");
 	            System.out.println("Enter 8 For : Close an account");
	             System.out.println("=======================================================================================");
			//4
				 System.out.println("Enter your choice");
	             
	  
	        }
	   


 


			public static void new_account()
			{

			   FileWriter myObj = null;
			   BufferedWriter bw = null;
			   PrintWriter pw = null;
			   char account_n;
			   String deposit ;
				String []arr=new String[100];
				String []arr1=new String[100];
			File myObj1 = new File("file1.txt");
			
				System.out.println("enter your name \n");
				Scanner sc= new Scanner(System.in); //System.in is a standard input stream  
String str= sc.nextLine();   
				
				System.out.println("your 5 digit system generated account number is \n");
				int randomNum;
				
		   	 fib:
				for(int count=0;count<100;count++)
				{
				randomNum= ThreadLocalRandom.current().nextInt(10000,  20000+1);
			   // System.out.println(randomNum+"");
				if(arr[count]!="")
				{ 
				   String str1 = Integer.toString(randomNum);
					arr[count]= str1;
				//	System.out.println("\n");
				//	System.out.println(count+"");
					System.out.println(arr[count]);

			 



					try {
				
					   myObj = new FileWriter("file1.txt",true);
			 		   myObj.write(arr[count]+"");
					   arr1[count]=arr[count];
					   count+=1;
					//   System.out.println("\n");
			 		   arr[count]=str;
			 		 myObj.write("\n");
					 myObj.write(arr[count]+""); 
					 arr1[count]=arr[count]; 
					 myObj.write("\n");
					   	  
					  System.out.println("do you want to deposit some money\n");
					  Scanner sc1= new Scanner(System.in);   
					  account_n = sc.next().charAt(0);
					  if(account_n=='y'){
						count+=1;
						System.out.println("enter the amount which you want to deposit \n");	
						Scanner sc2= new Scanner(System.in);   
						deposit= sc2.nextLine();
						arr[count]=deposit; 
						myObj.write(arr[count]+""); 
						arr1[count]=arr[count]; 
						myObj.write("\n");

 













					}
						 myObj.close();
						
				myObj.close();
						 
					 
						System.out.println("Successfully account created\n.start the program again to deposit or withdraw amount");
					  } catch (IOException e) {
						System.out.println("An error occurred.");
						e.printStackTrace();
					  }
	
				 
 
					  

					break;
				}
				else {
					continue fib;
			 
				}
				 
				
			} 

	 

		   }



public static void old_account(){

	 
	FileWriter myObj2 = null;
	BufferedWriter bw = null;
	PrintWriter pw = null;
 int count4=0; 
String l="";
	int i=0;
	int f=0;
	char choice3;
String deposit;
String result;
	String k="";
	String []arr=new String[1000];
	String []arr1=new String[1000];
	int []arr2=new int[1000];
				String data="";
				try {
					File myObj = new File("file1.txt");
					Scanner myReader = new Scanner(myObj);
					int count1=0;
					brander:
		 			while (myReader.hasNextLine()) {
				
					   data= myReader.nextLine();
					   arr[count4]=data;
		 			    count4+=1;
 
				}
			 
		 

					myReader.close();
				  } catch (FileNotFoundException e) {
					System.out.println("An error occurred.");
					e.printStackTrace();
				  }
 
	brand:

	for(int count=0;count<=100;count++)
	{
		System.out.println("enter the account number\n");
	String account_n;
	Scanner sc= new Scanner(System.in);   
	account_n= sc.nextLine(); 


char choice='\0';

df:
	for(int r=0;r<100;r++)
	{
		if(r%3==0)
		{
			l=arr[r];
			if(account_n.equals(l)==true)
			{
				System.out.println(l.equals(account_n)+"     "+"account founded in the database run program again to deposit or withdraw amount in this account\n");
			 	 
				System.out.println("do you want to deposit some amount or withdraw amount\n");
				Scanner sc1= new Scanner(System.in);   
				choice3 = sc.next().charAt(0);
			 if(choice3=='y')
			 {
				r+=2;
			//	choice='\0';
				System.out.println("press 1 to deposit amount\n");
				System.out.println("press 2 to withdraw amount\n");
				Scanner sc2= new Scanner(System.in);   
				choice3 = sc2.next().charAt(0);
				if(choice3=='1')
				{
				System.out.println("enter the amount which you want to deposit\n");	
				Scanner sc7= new Scanner(System.in);   
				deposit= sc7.nextLine();
				int value = Integer.parseInt(arr[r])+Integer.parseInt(deposit);
				// arr[f]=value;

				result = String. valueOf(value) ;
				System.out.println("the total amount"+result);
				}
				else if(choice3=='2')
				{
				System.out.println("enter the amount which you want to withdraw\n");	
				Scanner sc7= new Scanner(System.in);   
				deposit= sc7.nextLine();
				int value1=Integer.parseInt(deposit);
				int value2=Integer.parseInt(arr[r]);
				if(value1>value2)
				{
					System.out.println("the enetered amount is greater than available balance\n");
				}
				int value = Integer.parseInt(arr[r])-Integer.parseInt(deposit);

				// arr[f]=value;

				result = String. valueOf(value) ;
				System.out.println("the total amount"+result);
				}
				
				//arr[r]="\0";
 

						//arr1[count]=arr[count]; 
						//myObj.write("\n");



























































						
			 }
				System.exit(0);
			}
		  


}

}
}
	 

}

 
	    public static void makewithdrawl() {
	    	int def=40; 
 
			
			String data;
			try {
				File myObj = new File("file.txt");
				Scanner myReader = new Scanner(myObj);
				while (myReader.hasNextLine()) {
			
				   data = myReader.nextLine();
				   def=Integer.parseInt(data);
				  System.out.println("your current balance is "+def);
				}
				myReader.close();
			  } catch (FileNotFoundException e) {
				System.out.println("An error occurred.");
				e.printStackTrace();
			  }

 
        System.out.println(" enter the amount to be withdrawl\n");
		int withdrawl= sc.nextInt(); 
	        if(withdrawl>def){
				System.out.println("entered amount is greater than amount available\n");
			 }
			 System.out.println("the withdrawl amouunt is "+(withdrawl));
			 
			 System.out.println("the amount left after withdrawl is "+(def-withdrawl));



			 def-=withdrawl;
			 
			 
			 try {
				FileWriter  myObj = new FileWriter("file.txt");
				myObj.write(def+"");
				  myObj.close();
				 
			 
			  } catch (IOException e) {
				System.out.println("An error occurred.");
				e.printStackTrace();
			  }
 


	        }
	          public static void makedeposit()
			  {
				int i=0;
				String data;
				try {
					File myObj = new File("file.txt");
					Scanner myReader = new Scanner(myObj);
					while (myReader.hasNextLine()) {
				
					   data = myReader.nextLine();
					   i=Integer.parseInt(data);
					  System.out.println("current balance in the accounyt is "+i);
					}
					myReader.close();
				  } catch (FileNotFoundException e) {
					System.out.println("An error occurred.");
					e.printStackTrace();
				  }

				System.out.println("enter the amount which you want to deposit\n");
				int deposit= sc.nextInt();
	    deposit+=i;
	 
		System.out.println("total amount after depositing your corrent money is "+deposit+" run program again to withdraw");
		BufferedWriter bw = null;
        PrintWriter pw = null;
		try {
			FileWriter  myObj = new FileWriter("file.txt",true);
          pw.flush();
			myObj.write(deposit+"");
			  myObj.close();
			 
		 
		 	 
		  }
		   catch (IOException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		  }
 

				System.out.println("the amount has been deposited succesfully run the program again to withdarw amount from your account");
			
			  }  
	            
 
	      public static void checkbalance()
		  {
			int i=0;
			String data;
			try {
				File myObj = new File("file.txt");
				Scanner myReader = new Scanner(myObj);
				while (myReader.hasNextLine()) {
			
				   data = myReader.nextLine();
				   i=Integer.parseInt(data);
				  System.out.println(i);
				}
				myReader.close();
			  } catch (FileNotFoundException e) {
				System.out.println("An error occurred.");
				e.printStackTrace();
			  }


			System.out.println("your current balance is rs:"+i);
		  }
		  public static void calculateZakat(){
			  double total;
			double i=0;
			double zakat;
			String data;
			try {
				File myObj = new File("file.txt");
				Scanner myReader = new Scanner(myObj);
				while (myReader.hasNextLine()) {
			
				   data = myReader.nextLine();
				   i=Integer.parseInt(data);
				  System.out.println(i);
				}
				myReader.close();
			  } catch (FileNotFoundException e) {
				System.out.println("An error occurred.");
				e.printStackTrace();

			  }
			  if(i>=20000)
			  {
			 
				zakat=(i*2.5)/100;
				total=i-zakat;
				try {
					FileWriter  myObj = new FileWriter("file.txt");
					myObj.write(total+"");
					  myObj.close();
					 
				 
					System.out.println("Successfully wrote to the file.");
				  } catch (IOException e) {
					System.out.println("An error occurred.");
					e.printStackTrace();
				  }

		
			  }
		  }
	}


