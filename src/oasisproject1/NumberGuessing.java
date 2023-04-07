package oasisproject1;
import java.util.Random;
import java.util.Scanner;
public class NumberGuessing {
	public static void main(String[] args) {
		System.out.println("-------------------------------------------");
		System.out.println("Heyy Player!Welcome to Number Guessing Game");
		System.out.println("-------------------------------------------");
		System.out.println();
        Random rand=new Random();
		int randomNumber=rand.nextInt(99)+1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Pick a number between 0 and 100(you have 6 attempts)");
		int userGuess;
		int guess=0;
		boolean win=false;
		while(win==false)
		{
		  userGuess=sc.nextInt();
		  if(guess<6)
		  {
			if(userGuess==randomNumber)
			{
				System.out.println();
				System.out.println("Your guess is right!"+randomNumber);
				sc.close();
				win=true;
			}
			else if(userGuess<randomNumber)
			{
				System.out.println("Your guess is lower than random number");
				System.out.println();
				System.out.println("Please try again later!");
			}
			else if(userGuess>randomNumber)
			{
				System.out.println("Your guess is higher than random number");
				System.out.println();
				System.out.println("Please try again later");
			}
		  }
		  else if(guess==6)
		  {
			  if(userGuess==randomNumber)
			  {
				  System.out.println(); 
				  System.out.println("You got it!It is indeed:"+randomNumber);
				  sc.close();
				  win=true;
			  }
			  if(userGuess!=randomNumber)
			  {
				  System.out.println();
				  System.out.println("Sorry you ran out of attempts.The correct answer is:"+randomNumber);
				  System.out.println("Better luck next time!");
				  sc.close();
				  break;
			  }
		   }
		  guess+=1;
	  }
   }
}
