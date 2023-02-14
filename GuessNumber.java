import java.util.*;

public class GuessNumber{
    public static void main(String args[]){
        int num, i_num, attempt = 0;
        int min = 1, max = 101, chance = 10, score = 100;
        Scanner sc = new Scanner(System.in); 
        num = (int)(Math.random()*(max-min+1)+min);
        // while(chance != 0){
        //     num = (int)(Math.random()*(max-min+1)+min);
        //     System.out.println(num);
        //     chance--;
        // }
        System.out.println("You have 5 chances....");
        System.out.println("Guess the correct number...");
        System.out.println("Every wrong guess will result in deduction of 10 points");
        System.out.println("Guess the number");
        System.out.println();
        while(chance != 0){
            System.out.println();
            System.out.println("Attempt " + attempt + ": ");
            i_num = sc.nextInt();
            if(num == i_num){
                System.out.println();
                System.out.println("Congrats........You got it right :)");
                break;
            }
            else{
                System.out.println();
                System.out.println("Oops....you are wrong :( ......Plz try again");
                System.out.println("Remaining atempts: " + chance);
                System.out.println();
                if(i_num < num){
                    System.out.println("Hint  :  It is grater than  your answer.");
                }
                else{
                    System.out.println("Hint  :  It is less than  your answer.");
                }
                score -= 10;
            }
            attempt++;
            chance--;
        }
        System.out.println("Score:   " + score);
    }
}