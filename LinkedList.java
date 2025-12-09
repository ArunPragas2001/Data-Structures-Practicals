class Node
{
    String name;
    Node next;


    public Node(String name)
    {
        this.name=name;
        this.next=null;

    }




}

public class LinkedList
{  
    Node head;
    public void printList()
    {
        Node temp=head;
        while(temp!=null)
        {
            System.out.println(temp.name);
            temp=temp.next;
        }
        System.out.println("null");


    }

    public void InsertAfter(String TargetName, String newName )
    {

        Node temp=head;
        while(temp!=null&& !temp.name.equals(TargetName))
        {
            temp=temp.next;

        }
        if(temp==null)
        {
            System.out.println("Name " +TargetName +"not found");
        }

         

        Node newNode =new Node(newName);
        newNode.next=temp.next;
        temp.next=newNode;





    }
    public void InsertEnd(String newName)
    {
        Node newNode=new Node(newName);

        if(head==null)
        {
            head=newNode;
            return;
        }

        Node temp=head;

        while(temp.next!=null)
        {
            temp=temp.next;
        }

        temp.next=newNode;

    }
    public void DeleteNode(String NodeName)
    {
         if(head==null) return;

         if(head.name.equals(NodeName))
         {
            head=head.next;
            return;
         }

         Node prev=head;
         Node current=head.next;

         while(current!=null && !current.name.equals(NodeName))
         {
            prev=current;
            current=current.next;

         }
         if(current==null)
            {
                System.out.println("name "+NodeName+" is note found");
            }

         prev.next=current.next;   

    }

    public void findnode(String Findname)
    {
        Node temp=head;

        while(temp!=null&& !temp.name.equals(Findname))
        {
            temp=temp.next;
        }
        if(temp==null)
        {
            System.out.println(Findname +"is not found");
            return;
        }
       
        System.out.println(Findname+ "is found");
        return;


    }




public static void main(String[]args)
{

    LinkedList list=new LinkedList();
    list.InsertEnd("James");
      list.InsertEnd("sams");
          list.InsertEnd("zion");
          System.out.println("Initial LinkedList");

          list.printList();

        System.out.println("Adding Rubi after James");
          list.InsertAfter("James","Rubi");
             list.printList();

         System.out.println("\nDeleting Zion...");
        list.DeleteNode("zion");
        list.printList();





}




}