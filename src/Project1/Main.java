package Project1;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Main {

    public static void main(String[] args) {
	//Could add some stuff to make it fancier
        Scanner scnr = new Scanner(System.in);
        System.out.println("Come try your luck against the all knowing and powerful rock, paper, scissors machine!");
        System.out.println("Type 0 for rock, 1 for paper, or 2 for scissors. ");
        String choice = scnr.nextLine();

        //images = [rock, paper, scissors]
        String [] options = new String[]{"Rock","Paper","Scissors"};


        if (choice.equals("0") || choice.equals("1") || choice.equals("2")){
           int intChoice = Integer.parseInt(choice);
           int cpuChoice = ThreadLocalRandom.current().nextInt(0, 2 + 1);


            System.out.println("You chose: " + options[intChoice]);
           // System.out.println();
            System.out.println("The all-powerful destroyer of dreams chose: " + options[cpuChoice]);
            System.out.println();

            if(cpuChoice == 0 && intChoice == 0)
            System.out.println("It's a draw...How lame.");
            else if(cpuChoice == 0 && intChoice == 1)
                System.out.println("You win! What?!?! How'd that happen?");
            else if(cpuChoice == 0 && intChoice == 2)
                System.out.println("Haha, you lose! Here's your consolation prize. It's a big fat L :)");
            else if(cpuChoice == 1 && intChoice == 0)
            System.out.println("You lose. Hey good game though. Jk, it was too easy for me :)");
            else if(cpuChoice == 1 && intChoice == 1)
            System.out.println("It's a draw, B-O-R-I-N-G");
            else if(cpuChoice == 1 && intChoice == 2)
            System.out.println("You win! Wait, how'd you do that?!");
            else if(cpuChoice == 2 && intChoice == 0)
            System.out.println("You won! Good game. I'm gonna go cry for a little while now :(");
            else if(cpuChoice == 2 && intChoice == 1)
            System.out.println("You lose, but hey who hasn't? Oh wait, I haven't :)");
            else if(cpuChoice == 2 && intChoice == 2)
            System.out.println("It's a draw. Look under the word 'boring' for our picture together");
        } else{
            System.out.println("You lose by default for putting in something stupid :0");
        }
    }
}
