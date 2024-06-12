package Wallmert;
import java.util.Scanner;
public class UserInterface 
{
	
	public static WalmartBillInfo extractDetails(String Details)
	{
		//Fill the code here
		String a[]= Details.split(":");
		long b = Long.parseLong(a[1]);
		double p = Double.parseDouble(a[4]);
		int q = Integer.parseInt(a[5]);
		WalmartBillInfo w = new WalmartBillInfo(a[0], b, a[2], a[3], p, q, a[6]);
		return w;
		
//		return null;
	}
	
	
	
	public static void main(String args[]) 
	{
		Scanner sc =new Scanner(System.in);
		//Fill the code here
		System.out.println("Enter the Shopping Details");
		String s = sc.next();
		WalmartBillInfo wall = extractDetails(s);
		double bill = wall.calculateTotalBill();
		if(bill<0)
		{
			System.out.println("Invalid Details");
		}
		else
		{
			System.out.println("Name:"+wall.getName());
			System.out.println("Barcode:"+wall.getBarcode());
			System.out.println("Product Type:"+wall.getProductType());
			System.out.println("Product Cost:"+wall.getProductCost());
			System.out.println("Product Name:"+wall.getProductName());
			System.out.println("Quantity:"+wall.getQuantity());
			System.out.println("Membership Card:"+wall.getMembershipCard());
			System.out.println("Bill Amount:"+"$"+bill);
		}
	}
	
}	