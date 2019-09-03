import java.util.Scanner;
class Item
{
private int price;

public int getPrice() {
	return price;
}

public void setPrice(int price) {
	this.price = price;
}
//create various method to return attribute value(s)
}
 
class Customer
{
private String product;
public String getProduct() {
	return product;
}
public void setProduct(String product) {
	this.product = product;
}
private int quantity;
//create various method to return attribute value(s)
public int getQuantity() {
	return quantity;
}
public void setQuantity(int quantity) {
	this.quantity = quantity;
}
}

class Bill
{ 
	public void amount(int price,int quantity) {
		int amount;
		amount=(price)*(quantity);
	System.out.println("Total Price is : "+amount);
	
	}
//implement your logic to calculate total price
}
class Main
{
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	String  product=sc.nextLine();
	int price=sc.nextInt();
	int quantity=sc.nextInt();
	Item i = new Item();
    Customer c = new Customer();
    Bill obj = new Bill();
    obj.amount(price,quantity);
  //write the logic here
}
}
