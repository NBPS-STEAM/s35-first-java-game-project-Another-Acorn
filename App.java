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
     static boolean win1 = false;

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
        printBoard();
        Winner1(win1, A1, A2, A3, B1, B2, B3, C1, C2, C3);
    
  static public void printBoard()
  { 
    System.out.println(" _ _ _");
        System.out.println("|" + A1 + "|" + A2 + "|" + A3 + "|");
        System.out.println("|" + B1 + "|" + B2 + "|" + B3 + "|");
        System.out.println("|" + C1 + "|" + C2 + "|" + C3 + "|");
  }

  static public void moveItt (String move1)
    {
      move1.equals(move1);
        if (move1.equals(A1))
        {
            A1 = "X";
        }
        else if (move1.equals( A2))
        {
            A2 = "X";
        }
        else if (move1.equals( A3))
        {
            A3 = "X";
        }
        else if (move1.equals( B1))
        {
            B1 = "X";
        }
        else if (move1.equals( B2))
        {
            B2 = "X";
        }
        else if (move1.equals( B3))
        {
            B3 = "X";
        }
        else if (move1.equals( C1))
        {
            C1 = "X";
        }
        else if (move1.equals( C2))
        {
            C2 = "X";
        }
        else 
        {
            C3 = "X";
        }
      
    }
  static public void Winner1 (boolean win1, String A1, String A2, String A3, String B1, String B2, String B3,  String C1, String C2, String C3,)
  {
    win1 = win1;
    A1.equals(A1);
    A2.equals(A2);
    A3.equals(A3);
    B1.equals(B1);
    B2.equals(B2);
    B3.equals(B3);
    C1.equals(C1);
    C2.equals(C2);
    C3.equals(C3);
    if (A1 && A2 && A3 != "_" || "O")
        {
          win1 = true;
        }
        else if (B1 && B2 && B3 != "_" || "O")
        {
          win1 = true;
        }
        else if (C1 && C2 && C3 != "_" || "O")
        {
          win1 = true;
        }
        else if (A1 && B1 && C1 != "_" || "O")
        {
          win1 = true;
        }
        else if (A2 && B2 && C2 != "_" || "O")
        {
          win1 = true;
        }
        else if (A3 && B3 && C3 != "_" || "O")
        {
          win1 = true;
        }
        else if (A1 && B2 && C3 != "_" || "O")
        {
          win1 = true;
        }
        else if (A3 && B2 && C != "_" || "O")
        {
          win1 = true;
        }
        else 
    }
  }
}