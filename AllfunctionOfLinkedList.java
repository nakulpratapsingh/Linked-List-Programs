import java.util.*;
class Node
{
    int info;
    Node next;

    Node(int n)
    {
        info=n;
        next=null;
    }

    Node()
    {
        next=null;
    }
}
public class AllfunctionOfLinkedList
{
     // Reverse a linkedList
   public static Node reverseLinkedList(Node head)
   {
    if(head==null||head.next==null)
    return head;
      Node pre=null;
      Node curr=head;
      Node nextNode=null;

      while(curr!=null)
      {
        nextNode=curr.next;
        curr.next=pre;
          
        pre=curr;
        curr=nextNode;
        
      }

      head=pre;
      return head;

   }


   public static Node reverse(Node pre,Node curr)
   {
        if(curr==null)
         return pre;

         Node nextNode=curr.next;
         curr.next=pre;
         return reverse(curr,nextNode);
   }




   public static Node reverseLinkedListthroughRecurtion(Node head)
   {
    if(head==null)
    return head;

      Node pre=null;
      Node curr=head;
      
     return reverse(pre,curr);
      
   }
    // Add At first
    public static Node addAtFirst(Node head,int x)
    {
       Node node1=new Node(x);
       if(head==null)
       return node1;
       
       node1.next=head;
       head=node1;
       return head;

    }
    //Add At Last
    public static Node addAtLast(Node head,int x)
    {
    Node node1=new Node(x);
    if(head==null)
    return node1;
    
    Node temp=head;
    while(temp.next!=null)
    {
        temp=temp.next;
    }

    temp.next=node1;
    return head; 
    }


    //Add At kth positon 
    public static Node addAtKthPosition(Node head,int x,int position)
    {
        
        Node newNode=new Node(x);
       int length=0;


    //    github demo 2
    // github demo 3
        
        Node temp=head;
        while(temp!=null)

        {
        length++;
          temp=temp.next;
        }

        if(position>length)
        {
            System.out.print("Your poosition is not right");
            return head;
        }

        if(position==1)
        {
            newNode.next=head;
            head=newNode;
            return head;
        }

        if(position==2)
        {
            newNode.next=head.next;
            head.next=newNode;
            return head;
        }

        temp=head;
       int i=1;
       while(i<=position-2) 
       {
          temp=temp.next;
          i++;
       }
       newNode.next=temp.next;
       temp.next=newNode;
       return head;
    }


    //delete from first
   public static Node deletefromFirst(Node head)
    {
      head=head.next; 
      return head ;

    }

    //Delete from last
    public static Node deleteformLast(Node head)
    {
       Node newNode=head;
       while(newNode.next.next!=null)
       {
        newNode=newNode.next;
       }
       newNode.next=null;
       return head;
    }

    //delete from kth Position 

    public static Node deletefromkth(Node head,int x)
    {
        if(x==1)
        return head.next;

        if(x==2)
        {
            head.next=head.next.next;
            return head;
        }
        

        int i=1;
        Node temp=head;

        while(temp!=null&&i<=x-2)
        {
            temp=temp.next;
            i++;
        }

        if(temp==null)
        {
            System.out.print("Not a valid input ");
            return head;
        }
         
        if(temp.next.next==null)
        {
            temp.next=null;
        return head;  
        }
       

        temp.next=temp.next.next;
        return head;

    
    }

    public static int findMiddel(Node head)
    {
        Node fast,slow;
        fast=head;
        slow=head;
        while(fast!=null&&fast.next!=null)
        {
            fast=fast.next.next;
            slow=slow.next;
        }
        return slow.info;
    
    }

    //add en elemnt add sorted place
       public static Node addAtSortedplace(Node head,int num4)
       {
         
         Node newNode=new Node(num4);
         if(head==null||head.info>=newNode.info)
         {
            newNode.next=head;
            head=newNode;
            return head;
         }
         Node temp;
         temp=head;
        
         while(temp.next!=null&&temp.next.info<newNode.info)
         {
            temp=temp.next;
         }
         newNode.next=temp.next;
         temp.next=newNode;
         return head;
       }

      // kth node from the end of the linked list
      public static int kthNodeToTheEnd(int n,Node head)
      {
        if(head==null)
        {
            System.out.println("underFlow");
          return 0;  
        }
        
        Node fast,slow;
        fast=head;
        slow=head;

        for(int i=0;i<n;i++)
        {
            if(fast==null)
            {
             System.out.print("uderflow");
             return 0;
            }
            fast=fast.next;
        }

         while(fast!=null)
         {
            fast=fast.next;
            slow=slow.next;
         } 

        return slow.info;
      } 


    public static void printLinkedList(Node head)
    {
        Node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.info+" ");
            temp=temp.next;
        }
         System.out.println();
    }

    public static void printLinkedListInReverseOrder(Node head)
    {
        if(head==null)
        return ;

        printLinkedListInReverseOrder(head.next);
        System.out.print(head.info+" ");
    }

    public static void main(String ar[])
    {
        Scanner sc=new Scanner(System.in);

       System.out.println("Make your head for linked List");
       System.out.println("Enter your data for first head Node");
       int num=sc.nextInt();
       Node head=new Node(num);

       while(true)
       {
       
       System.out.println("Enter your choice");
       System.out.println("Select 1 for Addition");
       System.out.println("Select 2 for Deletion");
       System.out.println("Select 3 for print");
       System.out.println("Select 4 for reverse linked list" );
       System.out.println("Select 5 for find Middele Element");
       System.out.println("Select 6 for Add an element at sorted place");
       System.out.println("Select 7 for kth Node from the end");
       System.out.println("Select 8 for terminate programme");
       
    
       int n=sc.nextInt();
       switch(n)
       {
        case 1 :
        System.out.println("Enter 1 for Addition at first");
        System.out.println("Enetr 2 for Addition at kth positoin");
        System.out.println("Enter 3 for Adition at last");
        int m=sc.nextInt();
        switch(m)
        {
            case 1:
            //Add At first
                 System.out.println("Enter your data for first place");
                int num1=sc.nextInt();
                head=addAtFirst(head,num1);
            break;


            case 2 :
            //Add At kth
            System.out.println("Enter your place where you want to add new data ");
            int position=sc.nextInt();
            System.out.println("Enter your data for kth place");
            int num3=sc.nextInt();
            head=addAtKthPosition(head,num3,position);
            break;

            case 3 :
            //Add At Last
            System.out.println("Enter your data for last place");
            int num2=sc.nextInt();
            head=addAtLast(head,num2);
            break;

            default :
            System.out.print("Not a valid input");
            break;
        }
        break;

        case 2:
         System.out.println("Enter 1 for Deletion at first");
        System.out.println("Enetr 2 for Deletion at kth positoin");
        System.out.println("Enter 3 for Deletion at last");
         int mm=sc.nextInt();
        switch(mm)
        {
            case 1 :

            head=deletefromFirst(head);
            break;

            case 2 :
           System.out.println("Enter yoour place which you want to delete");
            int num2=sc.nextInt();
            head=deletefromkth(head,num2);
            break;
           

            case 3 :
            head=deleteformLast(head);
            break;

            default :
            System.out.print("Not a valid input");
            break;
        }
        break;

        case 3 :

        System.out.println("Enter 1 for print linked list in order");
        System.out.println("Enter 2 for print linked list in ReverseOrder");
        int num3=sc.nextInt();System.out.println("Enter your choise");

        System.out.println("This is your linked list");
        switch(num3)
        {
            case 1 :
            printLinkedList(head);
            break;

            case 2 :
            printLinkedListInReverseOrder(head);
            System.out.println();
            break;

            default :
            System.out.print("Not a valid input");
            break;

        }
        break;

        
       case 4 :
      //reverse a linkedlist
       System.out.println("Enter your choice");
       System.out.println("Enter 1 for iteration");
       System.out.println("Enter 2 through recurtion");
       int num1=sc.nextInt();
       switch(num1)
       {
        case 1:
        head=reverseLinkedList(head);
        break;

        case 2:
          head=reverseLinkedListthroughRecurtion(head);
        break;

        default :
        System.out.print("this is not a valid input");
        break;
       }

       
       case 5:
       // for find the middle element
       System.out.print("This is your middle element --> ");
       System.out.print(findMiddel(head));
       System.out.println();
       break;
       
       case 6 :
       //add en elemnt add sorted place
       System.out.print("Enter yur elemnt");
         int num4=sc.nextInt();
       head=addAtSortedplace(head,num4);
        break;
    
        case 7:
        System.out.print("Enter your position which you want of linkedList");
        int num5=sc.nextInt();
        int ans=kthNodeToTheEnd(num5,head);
        System.out.print("this is your saerched data --->> ");
        System.out.println( ans);
        break;

       case 8:
          System.out.println("Your programme completely complete");
       break;

       default :
       System.out.println("This is not valid input");
       break;
       }
    }
    }
    
}

