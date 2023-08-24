package com.mycompany.firstproject;

import java.util.Scanner;

public class NewClass {
    
public static void main(String args[ ]) {
 


   Scanner in = new Scanner (System.in);
   float sum=0;
   float grade=0;
   int count =0;
   boolean flag=true;
 
 while(flag){
 	
System.out.println("Enter grade # "+ (count+1)  +": ");
		grade=in.nextFloat();
			  if(grade!=-1){
			      sum+=grade;
			            count++; 
			            }
		   System.out.println("sum=  "+sum); 
     
	
			if(grade ==-1){		   
		    flag=false;
		    break;
		    }
		   
		    
 }
 
 
   	System.out.println("Avg=   "+sum/count); 
   
}

}
