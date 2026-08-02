
package src.LinkedList;

import src.LinkedList.SinglyLinkedList;
import java.util.Scanner;

public class LinkedListMenu{
  static Scanner scan = new Scanner(System.in);

  static void SinglyLinkedListOperations(){
    running:
    while (true) {
      System.out.println("");
      System.out.println("1.Create Linked List, avilable Types are (Integer,String)");
      System.out.println("2.Linked List is Empty (check wheather  Linked List empty or not)");
      System.out.println("3.Insert At Beginning (Add Node)");
      System.out.println("4.Insert At End (Add Node)");
      System.out.println("5.INsert At Given Position (Add Node At Given Position)");
      System.out.println("6.Delete At Beginning (Remove Node)");
      System.out.println("7.Delete At End (Remove Node )");
      System.out.println("8.Delete At Given Position (Remove Node At Given Position)");
      System.out.println("9.View (Show All Node in Linked List)");
      System.out.println("10.Search (check wheather Searching Node is there in Linked List or not)");
      System.out.println("11.Size (it returns the number of Node in the Linked List)");
      System.out.println("12.Goe's Back");
      System.out.println("13.Exit");
      System.out.println("");
      System.out.println("Enter your Option(1,2,3,4,5,6,7,8,9,10,11,12,13) : ");
      String Option = scan.nextLine();
      //Create object of SinglyLinkedList Class
      SinglyLinkedList LinkedList = new SinglyLinkedList();

      switch (Option){
       case "1":LinkedList.CreateLinkedList();
           break;
       case "2":LinkedList.LinkedListIsEmpty();
           break;
       case "3":LinkedList.InsertAtBeginning();
           break;
       case "4":LinkedList.InsertAtEnd();
           break;
       case "5":LinkedList.InsertAtGivenPosition();
           break;
       case "6":LinkedList.DeleteAtBeginning();
           break;
       case "7":LinkedList.DeleteAtEnd();
           break;
       case "8":LinkedList.DeleteAtGivenPosition();
           break;
       case "9":LinkedList.DisplayNodes();
           break;
       case "10":LinkedList.Search();
           break;
       case "11":LinkedList.Size();
           break;
       case "12":System.out.println("your are going Back");;
           break running;
       case "13":System.out.println("Exiting........");
             System.exit(0);
       default:System.out.println("Invalid choice. Please try again.");
           break;
      }
    }
  }

  static void DoublyLinkedListOperations(){
    running:
    while (true) {
      System.out.println("");
      System.out.println("1.Create Linked List, avilable Types are (Integer,String)");
      System.out.println("2.Linked List is Empty (check wheather  Linked List empty or not)");
      System.out.println("3.Insert At Beginning (Add Node)");
      System.out.println("4.Insert At End (Add Node)");
      System.out.println("5.INsert At Given Position (Add Node At Given Position)");
      System.out.println("6.Delete At Beginning (Remove Node)");
      System.out.println("7.Delete At End (Remove Node )");
      System.out.println("8.Delete At Given Position (Remove Node At Given Position)");
      System.out.println("9.View (Show All Node in Linked List)");
      System.out.println("10.Search (check wheather Searching Node is there in Linked List or not)");
      System.out.println("11.Size (it returns the number of Node in the Linked List)");
      System.out.println("12.Goe's Back");
      System.out.println("13.Exit");
      System.out.println("");
      System.out.println("Enter your Option(1,2,3,4,5,6,7,8,9,10,11,12,13) : ");
      String Option = scan.nextLine();
      //Create object of SinglyLinkedList Class
      DoublyLinkedList LinkedList = new DoublyLinkedList();

      switch (Option){
       case "1":LinkedList.CreateLinkedList();
           break;
       case "2":LinkedList.LinkedListIsEmpty();
           break;
       case "3":LinkedList.InsertAtBeginning();
           break;
       case "4":LinkedList.InsertAtEnd();
           break;
       case "5":LinkedList.InsertAtGivenPosition();
           break;
       case "6":LinkedList.DeleteAtBeginning();
           break;
       case "7":LinkedList.DeleteAtEnd();
           break;
       case "8":LinkedList.DeleteAtGivenPosition();
           break;
       case "9":LinkedList.DisplayNodes();
           break;
       case "10":LinkedList.Search();
           break;
       case "11":LinkedList.Size();
           break;
       case "12":System.out.println("your are going Back");;
           break running;
       case "13":System.out.println("Exiting........");
             System.exit(0);
       default:System.out.println("Invalid choice. Please try again.");
           break;
      }
    }
  }

  public static void LinkedListTypes(){
    running:
    while (true){
      System.out.println("");
      System.out.println("1.SinglyLinkedList ( it can Traverse only Forword )");
      System.out.println("2.DoublyLinkedList ( it can Traverse Both Forword and Backword )");
      System.out.println("3.CircularLinkedList ( it can Traverse only Forword Circularly)");
      System.out.println("4.DoublyCircularLinkedList ( it can Traverse Both Forword And Backword Circularly)");
      System.out.println("5.Back");

      System.out.println("Enter your Option(1,2,3,4,5) : ");
      int Option = scan.nextInt();

      switch (Option){
         case 1:SinglyLinkedListOperations();
                //System.out.println("comming soon");
             break;
         case 2:System.out.println("comming soon");
             break;
         case 3:System.out.println("comming soon");
             break;
         case 4:System.out.println("comming soon");
             break;
         case 5:System.out.println("you are going back.....");
               System.out.println("");
              break running;
         default:System.out.println("Invalid choice. Please try again.");
             break;
      }
    }
  }
}
