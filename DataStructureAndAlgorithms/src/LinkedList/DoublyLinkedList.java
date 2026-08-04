package src.LinkedList;

import java.util.Scanner;

public class DoublyLinkedList{

  //inner class of outer class
  public static class NodeStructure{
    int IntegerData;
    NodeStructure nextInteger;
    NodeStructure previousInteger;
    String  StringData;
    NodeStructure nextString;
    NodeStructure previousString;

    //inner class constructor
    public NodeStructure(int IntegerData){
      this.IntegerData = IntegerData;
      nextInteger = null;
      previousInteger = null;
    }

    public NodeStructure(String StringData){
      this.StringData = StringData;
      nextString = null;
      previousString = null;
    }
  }

  //global var declaration
  static Scanner scan = new Scanner(System.in);
  static NodeStructure newNode = null;
  static int usrGaveType;
  public static NodeStructure IntegerHead = null;
  public static NodeStructure StringHead = null;
  public static NodeStructure IntegerTail = null;
  public static NodeStructure StringTail = null;
  static NodeStructure tempVar;

  //Doubly Linked List operations Methods
  public void CreateLinkedList(){
    try {
      System.out.println("");
      System.out.println("1.Integer");
      System.out.println("2.String");
      System.out.println("Enter Data Type (1/2) ");
      usrGaveType = scan.nextInt();
      if (usrGaveType == 1) {
        System.out.println("");
        System.out.println("Succesfully Integer Type Linked List is Created");
      }
      else if (usrGaveType == 2) {
        System.out.println("");
        System.out.println("Succesfully String Type Linked List is Created");
      }
    } catch(Exception e) {
      System.out.println("");
      System.out.println("Enter Integer value");
    }
  }

  public  void LinkedListIsEmpty(){
    try {
      System.out.println("");
      if ((usrGaveType != 0) || (usrGaveType != 0)) {
        if (usrGaveType == 1) {
          if (IntegerHead == null && IntegerTail == null){
            System.out.println("Linked List is Empty? True");
            return;
          }
          System.out.println("Linked List is  Empty? False");
        }
        else if (usrGaveType == 2) {
          if (StringHead == null && StringTail == null){
            System.out.println("Linked List is Empty? True");
            return;
          }
          System.out.println("Linked List is Empty? False");
        }
      }
      else {
        System.out.println("First You Create Linked List");
      }
    }
    catch (Exception e) {
      System.out.println("Exception" + e);
    }
  }

  public  void InsertAtBeginning(){
    try {
      System.out.println("");
      if ((usrGaveType != 0) || (usrGaveType != 0)) {
        if (usrGaveType == 1) {
          System.out.println("Enter Integer Node Data");
          int IntegerNodeData = scan.nextInt();
          newNode = new NodeStructure(IntegerNodeData);
          if (IntegerHead == null && IntegerTail == null) {
            IntegerHead = newNode;
            IntegerTail = newNode;
            return;
          }
          newNode.nextInteger = IntegerHead;
          IntegerHead.previousInteger = newNode;
          IntegerHead = newNode;
          System.out.println("Inserted Node Succesfully");
        }
        else if (usrGaveType == 2) {
          System.out.println("Enter String Node Data");
          String StringNodeData = scan.nextLine();
          NodeStructure newNode = new NodeStructure(StringNodeData);
          if (StringHead == null) {
          StringHead = newNode;
          StringTail = newNode;
          return;
          }
          newNode.nextString = StringHead;
          StringHead.previousString = newNode;
          StringHead = newNode;
          System.out.println("Inserted Node Succesfully");
        }
      }
      else {
        System.out.println("First You Create Linked List");
      }
    }
    catch (Exception e) {
      System.out.println("Exception" + e);
    }
  }

  public  void InsertAtEnd(){
    try {
      System.out.println("");
      if ((usrGaveType != 0) || (usrGaveType != 0)) {
        if (usrGaveType == 1) {
        	 if (IntegerHead == null && IntegerTail == null){
     	     InsertAtBeginning();
           return;
     	    }
     	    System.out.println("Enter Integer Node Data");
         int IntegerNodeData = scan.nextInt();
         newNode = new NodeStructure(IntegerNodeData);
         IntegerTail.nextInteger = newNode;
         newNode.previousInteger = IntegerTail;
         IntegerTail = newNode;
         System.out.println("Inserted Node Succesfully");
        }
        else if (usrGaveType == 2) {
        	if (StringHead == null && StringTail == null){
     	      InsertAtBeginning();
            return;
       	    }
          System.out.println("Enter Integer Node Data");
          int StringNodeData = scan.nextInt();
          newNode = new NodeStructure(StringNodeData);
          StringTail.nextString = newNode;
          newNode.previousString = StringTail;
          StringTail = newNode;
         System.out.println("Inserted Node Succesfully");
        }
      }
      else {
        System.out.println("First You Create Linked List");
      }
    }
    catch (Exception e) {
      System.out.println("Exception" + e);
    }
  }

  public  void DeleteAtBeginning(){
    try {
      System.out.println("");
      if ((usrGaveType != 0) || (usrGaveType != 0)) {
        if (usrGaveType == 1) {
          if (IntegerHead == null){
            System.out.println("Not Yet Insert Any Node");
            return;
          }
          if (IntegerHead == IntegerTail) {
            IntegerHead = null;
            IntegerTail = null;
            System.out.println("Deleted Node Succesfully");
            return;
          }
          NodeStructure tempVar = IntegerHead;
          IntegerHead = IntegerHead.nextInteger;
          IntegerHead.previousInteger = null;
          tempVar.nextInteger = null;
          System.out.println("Deleted Node Succesfully");
        }
        else if (usrGaveType == 2) {
          if (StringHead == null){
            System.out.println("Not Yet Insert Any Node");
            return;
          }
         if (StringHead == StringTail) {
            StringHead = null;
            StringTail = null;
            System.out.println("Deleted Node Succesfully");
            return;
          }
          NodeStructure tempVar = StringHead;
          StringHead = StringHead.nextString;
          StringHead.previousString = null;
          tempVar.nextString = null;
          System.out.println("Deleted Node Succesfully");
        }
      }
      else {
        System.out.println("First You Create Linked List");
      }
    }
    catch (Exception e) {
      System.out.println("Exception" + e);
    }
  }

  public  void DisplayNodes(){
  	try {
      System.out.println("");
      if ((usrGaveType != 0) || (usrGaveType != 0)) {
        if (usrGaveType == 1) {
          if (IntegerHead == null){
            System.out.println("Not Yet Insert Any Node");
            return;
          }
          System.out.println("");
          System.out.println("1.traverseForward(Traversing from head to the end of the list)");
          System.out.println("2.traverseBackward(Traversing from tail to the head)");
          System.out.println("Select choice (1/2) : ");
          int getChoice = scan.nextInt();
          if (getChoice == 1) {
            NodeStructure tempVar = IntegerHead;
            System.out.println("Linked List elements are:");
            System.out.println("Note: AONN --> Address Of Next Node");
            while (tempVar != null){
              System.out.print("|" + tempVar.IntegerData + "|AONN|" + "->");
              tempVar = tempVar.nextInteger;
            }
            System.out.println("null");
          }else if (getChoice == 2) {
            NodeStructure tempVar = IntegerTail;
            System.out.println("Linked List elements are:");
            System.out.println("Note: AONN --> Address Of Next Node");
            while (tempVar != null){
              System.out.print("|" + tempVar.IntegerData + "|AONN|" + "->");
              tempVar = tempVar.previousInteger;
            }
            System.out.println("null");
          }
        }
      }
      else if (usrGaveType == 2) {
        if (StringHead == null){
          System.out.println("Linked List is Empty? True");
          return;
        }
        System.out.println("");
        System.out.println("1.Assending order");
        System.out.println("2.Dessending order");
        System.out.println("Select choice (1/2) : ");
        int getChoice = scan.nextInt();
        if (getChoice == 1) {
          NodeStructure tempVar = StringHead;
          System.out.println("Linked List elements are:");
          System.out.println("Note: AONN --> Address Of Next Node");
          while (tempVar != null){
            System.out.print("|" + tempVar.StringData + "|AONN|" + "->");
            tempVar = tempVar.nextString;
          }
          System.out.println("null");
        }else if (getChoice == 2) {
          NodeStructure tempVar = StringTail;
          System.out.println("Linked List elements are:");
          System.out.println("Note: AONN --> Address Of Next Node");
          while (tempVar != null){
            System.out.print("|" + tempVar.StringData + "|AONN|" + "->");
            tempVar = tempVar.previousString;
          }
          System.out.println("null");
        }
      }
  	}catch (Exception e) {
  		System.out.println("Exception: " + e);
  	}
  }

  public  void InsertAtGivenPosition(){
    try {
      System.out.println("");
      if ((usrGaveType != 0) || (usrGaveType != 0)) {
        if (usrGaveType == 1) {
          System.out.println("assuming you stored elements in (123) asssending order");
          System.out.println("before insertion you checkout Display Nodes for clarification ");
          System.out.println("Enter Position");
          int IntegerNodePosition = scan.nextInt();

          if (IntegerNodePosition <= 0 ) {
            System.out.println("Invalid Position");
            return;
          }
          if (IntegerHead == null || IntegerNodePosition == 1){
            InsertAtBeginning();
            return;
          }
          if (IntegerHead.nextInteger == null || IntegerNodePosition == 1) {
            InsertAtBeginning();
            return;
          }
          int count = 1;
          NodeStructure tempVar = IntegerHead;
     	    while (count < IntegerNodePosition-1){
            if (tempVar == null) {
              break;
            }
            count++;
            tempVar = tempVar.nextInteger;
          }
       	  if (tempVar == null) {
            System.out.println("You enterd Position out of  Linked List size");
            System.out.println("");
            System.out.println("Note: But we Append(as last node) To the Linked List ");
            System.out.println("Say YES OR NO (1-2)");
            int AppendChoice = scan.nextInt();
            if (AppendChoice == 2) {
              return;
            }
            // System.out.println("Enter Integer Node Data");
            // int IntegerNodeData = scan.nextInt();
            // newNode = new NodeStructure(IntegerNodeData);

          }

          System.out.println("Enter Integer Node Data");
          int IntegerNodeData = scan.nextInt();
          newNode = new NodeStructure(IntegerNodeData);
          NodeStructure middleValue = tempVar.nextInteger;
          tempVar.nextInteger = newNode;
          newNode.nextInteger = middleValue;
          System.out.println("Inserted Node Succesfully");
        }
        else if (usrGaveType == 2) {
          System.out.println("assuming you stored elements in (123) asssending order");
          System.out.println("before insertion you checkout Display Nodes for clarification ");
          System.out.println("Enter Position");
          int StringNodePosition = scan.nextInt();

          if (StringNodePosition <= 0 ) {
            System.out.println("Invalid Position");
            return;
          }
          if (StringHead == null || StringNodePosition == 1){
            InsertAtBeginning();
            return;
          }
          if (StringHead.nextInteger == null || StringNodePosition == 1) {
            InsertAtBeginning();
            return;
          }

          int count = 1;
          NodeStructure tempVar = StringHead;
     	    while (count < StringNodePosition-1){
            if (tempVar == null) {
              break;
            }
            count++;
            tempVar = tempVar.nextString;
          }

     	   if (tempVar == null) {
               System.out.println("Invalid Position");
               return;
          }
          System.out.println("Enter Integer Node Data");
          String StringNodeData = scan.nextLine();
          newNode = new NodeStructure(StringNodeData);
          NodeStructure middleValue = tempVar.nextString;
          tempVar.nextString = newNode;
          newNode.nextString = middleValue;
          System.out.println("Inserted Node Succesfully");
        }
      }
      else {
        System.out.println("First You Create Linked List");
      }
    }
    catch (Exception e) {
      System.out.println("Exception" + e);
    }
  }

  public  void DeleteAtEnd(){
    try {
      System.out.println("");
      if ((usrGaveType != 0) || (usrGaveType != 0)) {
        if (usrGaveType == 1) {
        	if (IntegerTail == null){
            System.out.println("Not Yet Insert Any Node");
            return;
     	    }
          if (IntegerHead == IntegerTail) {
            IntegerHead = null;
            IntegerTail = null;
            return;
          }

          NodeStructure tempVar = IntegerTail;
          IntegerTail = IntegerTail.previousInteger;
          IntegerTail.nextInteger = null;
          tempVar.previousInteger = null;
        }
        else if (usrGaveType == 2) {
        	 if (StringHead == null){
             System.out.println("Not Yet Insert Any Node");
             return;
     	    }
          if (StringHead == StringTail) {
            StringHead = null;
            StringTail = null;
            return;
          }

          NodeStructure tempVar = StringTail;
          StringTail = StringTail.previousInteger;
          StringTail.nextString = null;
          tempVar.previousString = null;
        }
      }
      else {
        System.out.println("First You Create Linked List");
      }
    }
    catch (Exception e) {
      System.out.println("Exception" + e);
    }
  }

  public  void DeleteAtGivenPosition(){
  	try {
      System.out.println("");
      if ((usrGaveType != 0) || (usrGaveType != 0)) {
        if (usrGaveType == 1) {
          if (IntegerHead == null) {
            System.out.println("Not yet insert any node");
            return;
          }
          System.out.println("assuming you stored elements in (123) asssending order");
          System.out.println("before deletion you checkout Display Nodes for clarification ");
          System.out.println("Enter Position");
          int IntegerNodePosition = scan.nextInt();

          if (IntegerNodePosition <= 0 ) {
            System.out.println("Invalid Position");
            return;
          }
          if (IntegerHead.nextInteger == null || IntegerNodePosition == 1) {
            DeleteAtBeginning();
            return;
          }

          int count = 1;
          NodeStructure tempVar = IntegerHead;
     	    while (count < IntegerNodePosition-1){
            if (tempVar == null) {
              break;
            }
            count++;
            tempVar = tempVar.nextInteger;
          }

     	    if (tempVar == null) {
            System.out.println("You enterd Position out of Linked List size");
            return;
          }
          NodeStructure middleValue = tempVar.nextInteger.nextInteger;
          tempVar.nextInteger = middleValue;
          System.out.println("deleted  Node Succesfully");
        }
        else if (usrGaveType == 2) {
          if (StringHead == null) {
            System.out.println("Not yet insert any node");
            return;
          }
          System.out.println("assuming you stored elements in (123) asssending order");
          System.out.println("before deletion you checkout Display Nodes for clarification ");
          System.out.println("Enter Position");
          int StringNodePosition = scan.nextInt();

          if (StringNodePosition <= 0 ) {
            System.out.println("Invalid Position");
            return;
          }
          if (StringHead.nextString == null || StringNodePosition == 1) {
            DeleteAtBeginning();
            return;
          }

          int count = 1;
          NodeStructure tempVar = StringHead;
     	    while (count < StringNodePosition-1){
            if (tempVar == null) {
              break;
            }
            count++;
            tempVar = tempVar.nextString;
          }

     	    if (tempVar == null) {
            System.out.println("You enterd Position out of Linked List size");
            return;
          }
          NodeStructure middleValue = tempVar.nextString.nextString;
          tempVar.nextString = middleValue;
          System.out.println("deleted  Node Succesfully");
        }
      }
      else {
        System.out.println("First You Create Linked List");
      }
    }
    catch (Exception e) {
      System.out.println("Exception" + e);
    }
  }

  public  void Search(){
    try {
      System.out.println("");
      if ((usrGaveType != 0) || (usrGaveType != 0)) {
        if (usrGaveType == 1) {
          if (IntegerHead == null){
            System.out.println("Not Yet Insert Any Node");
            return;
          }
          NodeStructure tempVar = IntegerHead;
          System.out.println("Enter Searching Node data:");
          int searchElement = scan.nextInt();
          int count = 1;
          while (tempVar != null){
            if (tempVar.IntegerData == searchElement) {
              System.out.println("is There? True");
              System.out.println("assuming  stored elements are in  assending order");
              System.out.println("index number of " + searchElement + " is " + count );
              break;
            }
            count++;
            tempVar = tempVar.nextInteger;
          }
          if (tempVar == null) {
            System.out.println("is There? False");
          }
        }
        else if (usrGaveType == 2) {
          if (StringHead == null){
            System.out.println("Linked List is Empty? True");
            return;
          }
          NodeStructure tempVar = StringHead;
          System.out.println("Enter Searching Node data:");
          String searchElement = scan.nextLine();
          int count = 1;
          while (tempVar != null){
            if (tempVar.StringData == searchElement) {
              System.out.println("is There? True");
              System.out.println("assume store elements assending order");
              System.out.println("index number of " + searchElement + " is " + count );
              break;
            }
            count++;
            tempVar = tempVar.nextString;
          }
          if (tempVar == null) {
            System.out.println("is There? False");
          }
        }
      }
      else {
        System.out.println("First You Create Linked List");
      }
  	}catch (Exception e) {
  		System.out.println("Exception: " + e);
  	}
  }

  public  void Size(){
    try {
      System.out.println("");
      if ((usrGaveType != 0) || (usrGaveType != 0)) {
        if (usrGaveType == 1) {
          if (IntegerHead == null){
            System.out.println("Not Yet Insert Any Node");
            return;
          }
          int count = 0;
          NodeStructure tempVar = IntegerHead;
          while (tempVar != null){
            count++;
            tempVar = tempVar.nextInteger;
          }
          System.out.println("Size of SinglyLinkedList elements: " + count);
        }
        else if (usrGaveType == 2) {
          if (StringHead == null){
            System.out.println("Linked List is Empty? True");
            return;
          }
          int count = 0;
          NodeStructure tempVar = StringHead;
          while (tempVar != null){
            count++;
            tempVar = tempVar.nextString;
          }
          System.out.println("Size of SinglyLinkedList elements: " + count);
        }
      }
      else {
        System.out.println("First You Create Linked List");
      }
  	}catch (Exception e) {
  		System.out.println("Exception: " + e);
  	}
  }
}
