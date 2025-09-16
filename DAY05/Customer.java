import.java util*;

class Item{
	
	private String Description;
	private String name;
	private int UnitPrice;
	private int QuantityAvailable;
	
	updateQuantity(int Amount){
		
		QuantityAvailable+=Amount;
	}
	
	
	public String getDescription(){
		return Description;
		
	}
	
	public String getName(){
		return name;
	}
	
	public int getUnitPrice(){
		return unitPrice;
	}
	
	printDetails(){
		System.out.println("Description"+description);
		System.out.println("Name="+description);
		System.out.println("UnitPrice"+UnitPrice);
		System.out.println("Available Quantity is"+QuantityAvailable);
		
		
	}
	
    public void setName(String name){
		
		this.name=name;
		
	}
	
	public void setUnitPrice(int UnitPrice){
		
		this.UnitPrice=UnitPrice;
		
	}
	
	public void setName(String name){
		
		this.UnitPrice=UnitPrice;
		
	}
	
	public void setName(int QuantityAvailable){
		
		this.QuantityAvailable=QuantityAvailable;
		
	}
	
	
	
}

class Customer{
	
	
	private String name;
	private String ContactDetails;
	
	
	
	private String getName(){
		
		return name;
		
	}
	
	public void setName(String name){
		
		this.name=name;
	}
	
	public void setContactDetails(String ContactDetails)
	{
		
		this.ContactDetails=ContactDetails;
	
	}
	
	public void printDetails(){
		
	System.out.println("Customer Name"+name);
   	System.out.println("Contact Details"+contactDetails);
   	
	}
	
}
class Database{

    private ArrayList<Customer>customers=new ArrayList<>();
	private ArrayList<Item>Items=new ArrayList<>();
	
	
	public void addItem(Item item){
		items.add(item);
	}
	
	
    public void removeItem(String itemName){
	 items.removeIf(item ->item.getName().equalsIgnoreCase(itemName));
	}		
	
	public searchItem(String name){
		
		
	}11
	
	updateItemQuantity(String itemName, int amount){
		
		
		
	}
	
class Main