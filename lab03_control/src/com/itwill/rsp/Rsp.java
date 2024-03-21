package com.itwill.rsp;




import java.util.Random;
import java.util.Scanner;

public class Rsp {

    public static void main(String[] args) {
        
        
    	Random rand = new Random();       
    	Scanner scr = new Scanner(System.in);
    	

        System.out.println("가위바위보 게임");
        System.out.println("---------------");
        System.out.println("[0] 가위");
        System.out.println("[1] 바위");
        System.out.println("[2] 보");
        System.out.println("---------------");
        System.out.print("선택>>> ");

        
        int user = scr.nextInt(); 
        int computer = rand.nextInt(3);
        
        

        
        switch(computer) { 
        case 0:
       	System.out.println("컴퓨터 : 가위");
       	break;
       case 1:
       	System.out.println("컴퓨터 : 바위");
       	break;
       case 2:
       	System.out.println("컴퓨터 : 보");
       }
        
        switch(user) { 
        case 0:
       	System.out.println("사용자 : 가위");
       	break;
       case 1:
       	System.out.println("사용자 : 바위");
       	break;
       case 2:
       	System.out.println("사용자 : 보");
       }
        
        if (user == 0 && computer == 2 ||
            user == 1 && computer == 0 ||
            user == 2 && computer == 1) {
        	System.out.println("사용자 승");
        } else if (user == 0 && computer == 1 ||
        		   user == 1 && computer == 2 ||
        		   user == 2 && computer == 0) {
        	System.out.println("컴퓨터 승");
        } else  {
        	System.out.println("무승부");
        }
        scr.close();
    }

}