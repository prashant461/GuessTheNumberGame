import java.util.Random;
import java.util.Scanner;

class Game{
    private int genNo,guessNo,noOfAttempts=0;

    public Game(){
        Random random=new Random();
        genNo=random.nextInt(1,100);
    }
    public void setNum(int num){
        guessNo=num;
    }
    public boolean isCorrect(){
        if(guessNo<genNo){
            System.out.println("OHH!!You are wrong.You selected small no.");
            noOfAttempts++;
            return false;

        }
        else if(guessNo>genNo){
            System.out.println("OHH!!....you are wrong.You selected big no.");
            noOfAttempts++;
            return false;

        }
        else{
            System.out.println("Cogratulation!!...your guess is correct.");
            noOfAttempts++;
            return true;
        }
    }
    public int getNoOfAttempts(){
        return noOfAttempts;
    }
}

public class GuessTheNoGame {
    public static void main(String[] args) {
        System.out.println("WELCOME TO THE GUESS THE NUMBER GAME!");
        System.out.print("Enter your guessed number:");
        Scanner sc= new Scanner(System.in);
        int guessNo=sc.nextInt();
        Game player =new Game();
        player.setNum(guessNo);

        while(!player.isCorrect()){
            System.out.println("Guess again:");
            player.setNum(sc.nextInt());
        }
        System.out.println("No of attempts required=" + player.getNoOfAttempts() );
    }
}


