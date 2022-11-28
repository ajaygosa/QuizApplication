package com.user;
import java.util.Scanner;
public class Login {
	Jdbc_Mysql obj = new Jdbc_Mysql();
 public static void main(String[] args) {
  System.out.println("Welcome to Quiz Competetion");
  System.out.println("Signup to take the quiz");
  Login login=new Login();
  login.signUp();
 }
 public void signUp()
 {
  SignUpLogin sul=new SignUpLogin();
  
          Scanner sc=new Scanner(System.in);
         
         System.out.println("Set Username : ");
         
         String uName=sc.nextLine();
         
         sul.setUserName(uName);
         
         System.out.println("Set Password : ");
         
         String uPassword=sc.nextLine();
         
         sul.setPassword(uPassword);
         
         while(true) {
          int temp=0;
         
   System.out.println("please Login to Start the Quiz");

   System.out.println("Enter Username : ");
   
   String user=sc.nextLine();
   
   System.out.println("Enter Password : ");
   String pwd=sc.nextLine();
   
   if(user.equals(sul.getUserName()))
   {
    if(pwd.equals(sul.getPassword()))
    {
     System.out.println("Logged Inn Successfully!!");
     
     System.out.println("Best Luck");
     temp++;
     if(temp!=0)
     {
      break;
     }
    }
   }
   else
   {
    System.out.println("Invalid Credentials");
    
    System.out.println("Please login again");
    if(temp==0)
    {
     continue;
    }
    } 
 }
         System.out.println("The Test has been Started");
         obj.fetchData();
}
}
