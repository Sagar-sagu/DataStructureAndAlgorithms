import src.Algorithms.AlgorithmsMenu;
import src.Arrays.ArraysMenu;
import src.LinkedList.LinkedListMenu;
import src.Queue.QueueMenu;
import src.Stack.StackMenu;
import java.util.Scanner;

public class Main{
  public static void main(String[] args)
  {
    Scanner scan = new Scanner(System.in);
    running:
    while (true)
    {
      System.out.println("****** WELCOME TO DATA STRUCTURE AND ALGORITHMS ********");
      System.out.println("");
      System.out.println("1.Algorithms");
      System.out.println("2.Arrays");
      System.out.println("3.Queues");
      System.out.println("4.Stacks");
      System.out.println("5.LinkedList");
      System.out.println("6.Exit");

      System.out.println("Enter your Option(1,2,3,4,5,6) : ");
      String Option = scan.nextLine();

      switch (Option){
       case "1":AlgorithmsMenu.Algorithms();
           break;
       case "2":ArraysMenu.ArrayImplementTypes();
           break;
       case "3":QueueMenu.QueueTypes();
           break;
       case "4":StackMenu.StackImplementTypes();
           break;
       case "5":LinkedListMenu.LinkedListTypes();
           break;
       case "6":System.out.println("Exiting........");
             System.exit(0);
       default:System.out.println("Invalid choice. Please try again.");
         break;
      }
    }
  }
}
