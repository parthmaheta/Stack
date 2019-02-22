import myCollection.Stack;
import java.util.Scanner;
/* 
  Program Name: Stack
  Author: Parth Maheta
  Date: 21 feb,2019
  Language: java		  
  Number Of File:3
  Files Name:Main.java,Node.java,Stack.java  
  
  Description: Stack 
              follows "last in first out" rule
  
  Step 1: Compile Main java File Using Command Given Below
           java -d . Node.java          //hit enter
           java -d . Stack.java  //hit enter		   
           javac Main.java             //hit enter
		   
  Step2: Run Program		   
          java Main      //hit enter	


       Thank You

 Written With Love.......	   
		   
*/
public class Main{
  public static void main(String[] args)
   {
     Scanner Scan=new Scanner(System.in);
	 int Choice=0;
	 int Num;
	 Stack Stack1=new Stack();
	   
	   while(Choice!=-1)
	   {
	     System.out.print("\nEnter Choice \n\t-1 For Exit \n\t 1 For Push \n\t 2 For Pop \n\t 3 For Peek \n\t4 For Print Stack \n\t Enter Choice:");
		 Choice=Scan.nextInt();

               switch(Choice)
               {   
			       case -1:
				    System.exit(0);
					
			       case 1:
				   System.out.print("Enter Number:");
				   Num=Scan.nextInt();
				   Stack1.push(Num);
				   break;
				   
			       case 2:
			           Stack1.pop();
				   break;
					
                  	       case 3:
                                   Stack1.peek();
                                   break;

                   	       case 4:
                                  Stack1.printStack();
                                  break;
                  
                   		default:
                                    System.out.println("\t\t\tEnter Proper Choice");   				   
                     				   
               }// end switch
 			   
	   }// end While
	 
   }
}
