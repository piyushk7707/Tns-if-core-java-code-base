package tnsif.scanner.constructor;

public class customer
{

   private String CustomerName;
   private int customerid;
   private String customercity;
   public customer() {
	   System.out.println("hello this is default constructor ");
	   
   }
   public customer(String customerName, int customerid, String customercity) {
System.out.println("hello this is parameterised constructor ");
	this.CustomerName = customerName;
	this.customerid = customerid;
	this.customercity = customercity;
   }
  

   public String getCustomerName() {
	return CustomerName;
   }
   public void setCustomerName(String customerName) {
	CustomerName = customerName;
   }
   public int getCustomerid() {
	return customerid;
   }
   public void setCustomerid(int customerid) {
	this.customerid = customerid;
   }
   public String getCustomercity() {
	return customercity;
   }
   public void setCustomercity(String customercity) {
	this.customercity = customercity;
   }
   
	   
   public String toString() {
		return "customer [CustomerName=" + CustomerName + ", customerid=" + customerid + ", customercity=" + customercity
				+ "]";
	}

}
