import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    int balance = 0;
    while (true) {
      Scanner scanner = new Scanner (System.in);
      String [] user_choices = {"VIEW BALANCE","DEPOSIT","WITHDRAW","EXIT"};
      System.out.println("Choose from the 4 options: (1) View Balance, (2) Deposit, (3) Withdraw, (4) Exit");
      String user_choice = scanner.nextLine().toUpperCase();

      if (user_choice.equals(user_choices[0])) {
        System.out.println(balance);
      }
      else if (user_choice.equals(user_choices[1])) {
        System.out.println("How much do you want to depsoit");
        int deposit = scanner.nextInt();
        balance = balance + deposit;
        System.out.println("Your balance is "+balance);
      }
      else if (user_choice.equals(user_choices[2])) {
        System.out.println("How much do you want to withdraw?");
        int withdraw = scanner.nextInt();
        balance = balance - withdraw;
        System.out.println("Your balance is "+balance);
      }
      else if (user_choice.equals(user_choices[3])) {
        break;
      }
    }
  }
}
