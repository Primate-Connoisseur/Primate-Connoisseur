/*
Frank GAzzillo
blackjack2.java
i tried to make it look better, eldrin got it working and instead of implementing it into the other im just gonna redo it. 
saves my sanity if i do that

TO DO
 finish Stand
    -make dealer cards output reliably
    -make win conditions
    -make the loop stop
 win conditions
    -finish thestand conditions
    -hit conditions

*/


import java.util.Scanner;
import java.lang.*;
import java.io.*;
import java.util.ArrayList;

public class Main
{
	public static void main(String[] args)throws InterruptedException 
	{
	  
	    Scanner sc = new Scanner (System.in);
	    
	    String pcheck;


        System.out.println ("Welcome to Black Jack, Type P to play.");
             pcheck = sc.nextLine (); // if p is typed it will runn, if not it will not run
             pcheck = pcheck.toLowerCase ();//makes whatever is entered lower case to detect it simpler

    if (pcheck.contains ("p"))
      {
          
         
           
          int highcard = 11;
          int lowcard = 1;
          
          int numcards = 8;
          int numcards2 = 2;
          int dnumcards = 8;
          int dnumcards2 = 2;
          
          int numhit = 2;
		  int numcards3 = 2;
		  int dnumcards3 = 2;
		  String wordspace = "        ";
		  
		  int dtotal = 0;
		
		ArrayList<Integer> nums = new ArrayList<Integer>();
		ArrayList<String> snums = new ArrayList<String>();
		ArrayList<Integer> dnums = new ArrayList<Integer>();
		ArrayList<String> dsnums = new ArrayList<String>();
	
		int sum = 0;
		for(int x = 0; x < numcards; x++){
		   //nums[x] = (int)(Math.random()*highcard+lowcard);
          //snums[x] = Integer.toString(nums[x]);
          //dnums[x] = (int)(Math.random()*11+1);
          //dsnums[x] = Integer.toString(dnums[x]);
          
           
            
            String randface = "if you see this somethigs fucked with the face cards";
            int intrandface = (int)(Math.random()*3+1);
            
         /*   if(nums[x] == 10){
            if(intrandface == 1){
            randface = "J";
            snums[x] = randface;
            }
            else if (intrandface == 2){
            randface = "Q";
            snums[x] = randface;
            }
            else
            randface ="K";
            snums[x] = randface;
            }
            if(nums[x] == 11)
                snums[x] = "A";
		
		
		
		   if(dnums[x] == 10){
            if(intrandface == 1){
            randface = "J";
            dsnums[x] = randface;
            }
            else if (intrandface == 2){
            randface = "Q";
            dsnums[x] = randface;
            }
            else
            randface ="K";
            dsnums[x] = randface;
            }
            if(dnums[x] == 11)
                dsnums[x] = "A";
                
            */
            
		                            }
		String cardslook = "               ";
		System.out.println("Your cards are       Dealers Cards are ");
		    for(int a = 0; a < numcards2; a++){
		        snums.add()
		        System.out.print (" |" + snums[a] + "   |");
		        
		    } 
		    System.out.print ("       |" + dsnums[1] + "   | |    |");
		    System.out.println();
		    for(int z = 0; z < numcards2; z++){
                System.out.print (" |    |"); 
		    }
		        System.out.print ("       |    | | {} |");
		    System.out.println();
            for(int b = 0; b < numcards2; b++){
               
                    System.out.print (" |   " + snums[b] + "|"); 
            }  
		        System.out.print ("       |   " + dsnums[1] + "| |    |");
            System.out.println();
        for(int y = 0; y < numcards2; y++){
            sum += nums[y];    
        }    
        
		 System.out.println();
		 System.out.println("Your total is " + sum +"   |  Dealer First card is " + dsnums[1]);

		int dead = 0; //garbage variable
		
		for(int stopifstand = 0; stopifstand == 0; dead++ ){
		System.out.println("");
		System.out.println("Hit or Stand?");
		String hort =  sc.nextLine ();
		System.out.println("");
		
		hort = hort.toLowerCase ();
		
		
		
		if(hort.contains("hit")){
		   numhit = numhit + 1;
		  
		  
		  if(numhit == 3){
		  numcards3 = numhit;
		  wordspace = "              "; // plus 6 for each card
		  }
	   	  
		  else if (numhit == 4){
	   	  numcards3 = numhit;
	   	  wordspace = "                     "; 
		  }
	   	  
		  else if (numhit == 5){
		  numcards3 = numhit;
		  wordspace = "                            "; 
		  }
	   	  
		  else if (numhit == 6){
	   	  numcards3 = numhit;
	   	  wordspace = "                                   "; 
		  }
	   	  
	   	  else{
	   	  System.out.println("you have the maximun number of cards");
	   	  hort = "stand";
	   	  break;
	   	  }
	   	  
		System.out.println("Your cards are" + wordspace + "Dealers Cards are ");
		    for(int r = 0; r < numcards3; r++){
		        System.out.print (" |" + snums[r] + "   |" );
		      }
	        System.out.print ("       |" + dsnums[1] + "   | |    |");
	        System.out.println();
	        for(int q = 0; q < numcards3; q++){
                System.out.print (" |    |"); 
		    }
		     System.out.print ("       |    | | {} |");
		     System.out.println();
	        for(int g = 0; g < numcards3; g++){
               
                    System.out.print (" |   " + snums[g] + "|"); 
            }  
		    System.out.print ("       |   " + dsnums[1] + "| |    |");    
		    
		    
            sum = nums[numhit - 1] + sum;    
           
            System.out.println();
            System.out.println();
		    System.out.println("Your total is " + sum +"   |  Dealer First card is " + dsnums[1]);
		
		     
		}
		
		if(hort.contains("stand")){                            //STAND STARTS HERE
		    System.out.println("Your cards are" + wordspace + "Dealers Cards are ");
		    for(int r = 0; r < numcards3; r++){
		        System.out.print (" |" + snums[r] + "   |" );
		      }
	        
	      
	        System.out.print ("       |" + dsnums[1] + "   |");
	        System.out.print (" |" + dsnums[2] + "   |");
	        
	        System.out.println();
	        for(int q = 0; q < numcards3; q++){
                System.out.print (" |    |"); 
		    }
		     System.out.print ("       |    | |    |");
		     System.out.println();
	        for(int g = 0; g < numcards3; g++){
               
                    System.out.print (" |   " + snums[g] + "|"); 
            }  
		    System.out.print ("       |   " + dsnums[1] + "| |   " + dsnums[2] + "|");
		    
		    
               
           
            System.out.println();
            System.out.println();
            dtotal = dnums[1] + dnums[2];
		    System.out.println("Your total is " + sum + "   |  Dealer total is " + dtotal);

	
		        for(int k1 = 1; dtotal <= 17; k1++){
		           
		           
		            System.out.println("Your cards are       Dealers Cards are ");
		    for(int a = 0; a < numcards2; a++){
		        System.out.print (" |" + snums[a] + "   |");
		        
		    } 
		        System.out.print ("       |" + dsnums[1] + "   | |    |");
		        System.out.println();
		    for(int z = 0; z < numcards2; z++){
                System.out.print (" |    |"); 
		    }
		        System.out.print ("       |    | | {} |");
		        System.out.println();
            for(int b = 0; b < numcards2; b++){
               
                    System.out.print (" |   " + snums[b] + "|"); 
            }  
		        System.out.print ("       |   " + dsnums[1] + "| |    |");
                System.out.println();
            for(int y = 0; y < numcards2; y++){
            sum += nums[y];    
            }    
        
		 System.out.println();
		 System.out.println("Your total is " + sum +"   |  Dealer First card is " + dsnums[1]);

		            
		        
		    break;
		    }
		       
              
              break;
		
		}
	
	
	
		}
	
		}
		else 
		{
		    System.out.println("Fuck Yaself Bing Bong (:");
		    return;
		}
		
		
	
          
      }
      
      
	
	
	
	
	
	/*
		int numcards = 2;
		int[] nums = new int[numcards];
		int sum = 0;
		for(int x = 0; x < numcards; x++){
		    nums[x] = (int)(Math.random()*11+1);
		}
		String cardslook = "               ";
		System.out.println("Your cards are ");
		    for(int a = 0; a < numcards; a++){
		        if(nums[a] < 10)
		        System.out.print (" |" + nums[a] + "   |");
		        else
		        System.out.print (" |" + nums[a] + "  |"); 
		    }  
		    System.out.println();
		    for(int z = 0; z < numcards; z++){
                System.out.print (" |    |"); 
		    }
		    System.out.println();
            for(int b = 0; b < numcards; b++){
                if(nums[b] < 10){
                    System.out.print (" |   " + nums[b] + "|"); 
                }
                else
                System.out.print (" |  " + nums[b] + "|"); 
            }   
            System.out.println();
        for(int y = 0; y < numcards; y++){
            sum += nums[y];    
        }    
		System.out.println("Your total is "+ sum);
	
	
	|    |
	| {} |
	|    |

    */
    
    public void facecard(){
        if(nums() == 10){
            if(intrandface == 1){
            randface = "J";
            snums() = randface;
            }
            else if (intrandface == 2){
            randface = "Q";
            snums() = randface;
            }
            else
            randface ="K";
            snums() = randface;
            }
            if(nums() == 11)
                snums() = "A";
		
		
		
		   if(dnums() == 10){
            if(intrandface == 1){
            randface = "J";
            dsnums() = randface;
            }
            else if (intrandface == 2){
            randface = "Q";
            dsnums() = randface;
            }
            else
            randface ="K";
            dsnums() = randface;
            }
            if(dnums() == 11)
                dsnums() = "A";
        
    }
	}


















