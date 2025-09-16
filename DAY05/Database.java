

import java.util.ArrayList;
import java.util.Scanner;

class Item{
    String name, description;
    double unitPrice;
    int quantity;
    public Item(String name, String description, double unitPrice, int quantity) {
        this.name = name;
        this.description = description;
        this.unitPrice = unitPrice;
        this.quantity = quantity;
    }
    public String getName() {
        return name;
    }
    public String getDescription() {
        return description;
    }
    public double getUnitPrice() {
        return unitPrice;
    }
    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}

class Customer{
    String name, contactDetails;
    public Customer(String name, String contactDetails) {
        this.name = name;
        this.contactDetails = contactDetails;
    }
    public String getName() {
        return name;
    }
    public String getContactDetails() {
        return contactDetails;
    }
    public void setContactDetails(String contactDetails) {
        this.contactDetails = contactDetails;
    }
}

public class Database{
    static ArrayList<Customer> customers=new ArrayList<>();
    static ArrayList<Item> items=new ArrayList<>();
  

    static void printMenu(){
        System.out.println("------ Inventory Management ------");
        System.out.println("1. Add Item");
        System.out.println("2. Remove Item");
        System.out.println("3. Update Item Quantity");
        System.out.println("4. List all items");
        System.out.println("5. Add Customer");
        System.out.println("6. List all Customers");
        System.out.println("7. Search Item by Name");
        System.out.println("0. Exit");
        System.out.println("Choose an Option");   
    }

    static void listItems(){
        System.out.println("Items in the Inventory:");
        System.out.println("---------------------------------");
        if(items.isEmpty()){
            System.out.println("No items available in the inventory.");
            return;
        }
        System.out.printf("%-20s %-30s %-10s %-10s%n", "Name", "Description", "Price", "Quantity");

        System.out.println("---------------------------------");
       
        for(Item item : items){
            System.out.printf("%-20s %-30s Rs. %-9.2f %-10d%n", item.getName(), item.getDescription(), item.getUnitPrice(), item.getQuantity());            
        }
    }

    static void addItem(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter Item Name           :");
        String name = scan.nextLine();
        System.out.print("Please enter Description         :");
        String description = scan.nextLine();
        System.out.print("Please enter Unit Price          :");
        double unitPrice = Double.parseDouble(scan.nextLine());
        System.out.print("Please enter Quantity Available  :");
        int quantity = Integer.parseInt(scan.nextLine());
        
        Item item = new Item(name, description, unitPrice, quantity);
        items.add(item);
        System.out.println("Item added successfully.");
     //   scan.close();
    }

    static void removeItem(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter Item Name to remove :"); 
        String itemName = scan.nextLine();
        for(Item item : items){
            if(item.getName().equalsIgnoreCase(itemName)){
                items.remove(item);
                System.out.println("Item removed successfully.");
                return;
            }
        }
        System.out.println("Item not found.");
    }

    public static void select(int choice){
        switch(choice){
    		case 1:
        			addItem();
                    break;
      					
      		case 2:
                    removeItem();
                    break;

            case 3:
                    //Add method here
                    break;

            case 4:
                    listItems();
                    break;
                
            case 5:
                    //Add method here
                    break;

            case 6:
                    //Add method here
                    break;

            case 7:
                    //Add method here
                    break;
                
            case 0:
                    System.out.println("Exiting the program.");
                    break;
            default:
                    System.out.println("Invalid option. Please try again.");
                    break;
      			}

        }
    

    public static void main(String [] arg){
        Scanner sc=new Scanner(System.in);
        int option;
        do{
            printMenu();
            option=sc.nextInt();
      		select(option);
        }while(option!=0);

    }
}
