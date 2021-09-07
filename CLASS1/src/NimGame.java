import java.util.ArrayList;
import java.util.Scanner;

public class NimGame
{
  public static void main(String[] args)
  {
    int piles[] = {3, 5, 8};

    while(true)
    {
      for(int i=0;i<piles[0];i++)
      {
        System.out.print("|");
      }
      System.out.println(" ");
      for(int i=0;i<piles[1];i++)
      {
        System.out.print("|");
      }
      System.out.println(" ");
      for(int i=0;i<piles[2];i++)
      {
        System.out.print("|");
      }
      System.out.println(" ");
      Scanner keyboard = new Scanner(System.in);
      System.out.println("Player 1 choose a pile");

      int player1pile = keyboard.nextInt();
      piles[player1pile-1]=piles[player1pile-1]-1;

      if(piles[player1pile-1]==0)
      {
        System.out.println("Player2 wins");
        break;
      }

      System.out.println("Player 2 choose a pile");
      int player2pile = keyboard.nextInt();
      piles[player2pile-1]=piles[player2pile-1]-1;

      if(piles[player2pile-1]==0)
      {
        System.out.println("Player1 wins");
        break;
      }
    }

  }
}
