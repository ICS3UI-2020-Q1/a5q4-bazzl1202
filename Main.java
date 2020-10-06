import java.util.Scanner;
/**
 * Asks investment, interest rate and years they are investing for then calculates final balance.
 * @author Liana Bazzarella
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // create a scanner for user input
    Scanner input = new Scanner(System.in);

    // ask the user how much they want to invest
    System.out.println("Please enter a starting balance");
    double balance = input.nextDouble();
    
    // ask the user their interest rate
    System.out.println("Please enter your interest rate as a full percentage");
    double interest = input.nextDouble();

    // ask the user for how long they are investing
    System.out.println("Please enter the number of years you will invest for");
    int investment = input.nextInt(); 

    // declare and initilaize counting variable
    int count = 1;

    while( count <= investment){
      balance =((balance*interest)+ balance);
      count = count + 1;
    }
   System.out.println(balance);
  
  }
}
