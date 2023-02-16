		//Name=Umut 	Surname=Bayar 	Number=150120043 
import java.util.Calendar;

public class Product {
      private String productName;
      private Calendar saleDate;
      private double price;
	public Product(String productName, Calendar saleDate, double price) {
		super();
		setProductName(productName);
		setPrice(price);
		setSaleDate(saleDate);
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public Calendar getSaleDate() {
		return saleDate;
	}
	public void setSaleDate(Calendar saleDate) {
		this.saleDate = saleDate;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Product [productName=" + productName + ", transactionDate=" + saleDate.get(Calendar.DATE)+"/"+saleDate.get(Calendar.MONTH)+"/"+saleDate.get(Calendar.YEAR)  + ", price=" + price + "]]";
	}
	
      
      
      
}