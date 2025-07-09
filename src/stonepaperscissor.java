import java.util.*;
public class stonepaperscissor {
    public static void main(String[] args){

        String[] choices = {"rock","paper","scissors"};
        String action;
        Scanner sc = new Scanner(System.in);
        Random rm = new Random();
        String computer;
        String playagain;

        do{
            System.out.print("Enter your Move(Rock,Paper,Scissors): ");
            action = sc.nextLine().toLowerCase();

            if(!action.equals("rock") && !action.equals("paper") && !action.equals("scissors")){
                System.out.println("Invalid choice");
            }


            computer = choices[rm.nextInt(3)];
            System.out.println("Computer choice: "+computer);

            if(computer.equals(action)){
                System.out.println("It's a tie!");
            }
            else if ((computer.equals("rock") && action.equals("paper")) ||
                    (computer.equals("paper") && action.equals("scissors")) ||
                    (computer.equals("scissors") && action.equals("rock"))){
                System.out.println("You Won!");
            }
            else {
                System.out.println("You Lost!");
            }

            System.out.print("Play again(yes/no): ");
            playagain = sc.nextLine();
        }
        while (playagain.equals("yes"));

        System.out.println("Thanks for playing!");

        sc.close();
    }
}
