import java.util.*;



class guesser{
    int guessnum()
    {
        int guess;
        Random random = new Random();   

        guess = random.nextInt(10);  
        
        return guess;
    }

}
class player{
    int noro;
    int guessingnum(){
       
        Scanner mn = new Scanner(System.in);
            System.out.println("guess any number");
            noro = mn.nextInt();

        
        return noro;
    }
}
class umpire 
{
    int numFromGuesser;
    int numFromPlayer1;
    int numFromPlayer2;
    int numFromPlayer3;

    void collectFromGuesser()
    {
        guesser obj = new guesser();
        numFromGuesser= obj.guessnum();
        // System.out.println("damn");

    }
    void collectFromPlayer()
    {
     player p1 = new player();
     player p2 = new player();
     player p3 = new player();
     numFromPlayer1 = p1.guessingnum();   
     numFromPlayer2 = p2.guessingnum(); 
     numFromPlayer3 = p3.guessingnum(); 
    //  System.out.println("lmao");
    }
    void compare()
	{
		
		if(numFromGuesser==numFromPlayer1)
		{
			if(numFromGuesser==numFromPlayer2 && numFromGuesser==numFromPlayer3)
			{
				System.out.println("Game tied all three players guessed correctly");
			}
			else if(numFromGuesser==numFromPlayer2)
			{
				System.out.println("Player 1 and Player2 won the game");
			}
			else if(numFromGuesser==numFromPlayer3)
			{
				System.out.println("Player 1 and Player3 won ");
			}
			else
			{
			
			System.out.println("Player 1 won the game");
			}
		}
		
		
		else if(numFromGuesser==numFromPlayer2)
		{
			
			if(numFromGuesser==numFromPlayer3)
			{
			System.out.println("Player 2 and Player3 won the game");
			}
			else
			{
				System.out.println("Player 2 won the game");
			}
		}
		
		
		
		else if(numFromGuesser==numFromPlayer3)
		{
			System.out.println("Player 3 won the game");
		}
		else
		{
			System.out.println("Game lost! try again");
		}
	}
}

class Launchgame
{
    public static void main(String[] args) {

        umpire um = new umpire();
        um.collectFromGuesser();
        um.collectFromPlayer();
        um.compare();
        
        guesser hehe = new guesser();
        int k = hehe.guessnum();
        System.out.println("guessed number is " + k);

    }

}
