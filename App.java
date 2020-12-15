import java.util.Scanner;
public class App {

     static String move1;
     static String move2;
     static String p1 = "_";
     static String p2 = "_";
     static String A1 = "_";
     static String A2 = "_";
     static String A3 = "_";
     static String B1 = "_";
     static String B2 = "_";
     static String B3 = "_";
     static String C1 = "_";
     static String C2 = "_";
     static String C3 = "_";

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Let's play a game of tic-tac-toe" + "\nPick a slot to put your piece in using \nA1, A2, A3, B1, B2, B3, C1, C2, or C3" + "\nYou can win by claiming all A slots, all 1 slots, or A1, B2, C3 or A3, B2, or C1");
        System.out.println("Enter player 1's name:");
        p1 = input.nextLine();
        System.out.println("Enter player 2's name:");
        p2 = input.nextLine();
        System.out.println("Player 1: " + p1 + "\nPlayer 2: " + p2);
        System.out.println("Give " + p1 + "'s next move:");
        move1 = input.nextLine();
        moveItt(move1);
    }
    
  static public void printBoard()
  { 
    System.out.println(" _ _ _");
        System.out.println("|" + A1 + "|" + A2 + "|" + A3 + "|");
        System.out.println("|" + B1 + "|" + B2 + "|" + B3 + "|");
        System.out.println("|" + C1 + "|" + C2 + "|" + C3 + "|");
  }

  static public void moveItt (String move1)
    {
      move1 = move1;
        if (move1 == A1)
        {
            A1 = "X";
        }
        else if (move1 == A2)
        {
            A2 = "X";
        }
        else if (move1 == A3)
        {
            A3 = "X";
        }
        else if (move1 == B1)
        {
            B1 = "X";
        }
        else if (move1 == B2)
        {
            B2 = "X";
        }
        else if (move1 == B3)
        {
            B3 = "X";
        }
        else if (move1 == C1)
        {
            C1 = "X";
        }
        else if (move1 == C2)
        {
            C2 = "X";
        }
        else 
        {
            C3 = "X";
        }
      
    }
}