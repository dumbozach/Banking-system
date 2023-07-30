import java.util.Scanner;
import java.util.Random;
import java.lang.Math;

class Main {
  public static void main(String[] args) {
    int balance = 0;
    int min = 0;
    int max = 0;
    int rand_min = 1;
    int rand_max = 1000;
    int range = max - min + 1;
    while (true) {
      Scanner scanner = new Scanner (System.in);
      String [] user_choices = {"VIEW BALANCE","DEPOSIT","WITHDRAW","INVEST", "EXIT"};
      System.out.println("Choose from the 4 options: (1) View Balance, (2) Deposit, (3) Withdraw, (4) Invest, (5) Exit");
      String user_choice = scanner.nextLine().toUpperCase();

      if (user_choice.equals(user_choices[0])) {
        System.out.println(balance);
      }
      else if (user_choice.equals(user_choices[1])) {
        System.out.println("How much do you want to deposit?");
        int deposit = scanner.nextInt();
        balance = balance + deposit;
        System.out.println("Your balance is $"+balance);
      }
      else if (user_choice.equals(user_choices[2])) {
        System.out.println("How much do you want to withdraw?");
        int withdraw = scanner.nextInt();
        balance = balance - withdraw;
        System.out.println("Your balance is $"+balance);
      }
      else if (user_choice.equals(user_choices[3])) {
        System.out.println("How much do you want to invest?");
        int invest = scanner.nextInt();
        max = max + invest;
        int random_invest = (int)Math.floor(Math.random() * (max - min + 1) + min);
        int random_int = (int)Math.floor(Math.random() * (rand_max - rand_min + 1) + rand_min);

        if (random_int > 500) {
          balance = balance - random_invest;
          System.out.println("Your balance is $"+balance);
        }
        else if (random_int < 500) {
          balance = balance + random_invest;
          System.out.println("Your balance is $"+balance);
        }
        else if (random_int == 500) {
          System.out.println("Your investment did not make nor lose any money");
        }
        
      
      
    }
      else if (user_choice.equals(user_choices[4])) {
        System.out.println("Program closed");
        break;
      }
  }
}
}
