package tnsif.day5;

public class Person {
	
		
		private String name;
		private Address address;
		
		public Person(String name2, Address address2) {
			// TODO Auto-generated constructor stub
		}

		//getter and setter
		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public Address getAddress() {
			return address;
		}

		public void setAddress(Address address) {
			this.address = address;
		}
		
		
		//method to display person info
		public void displayInfo()
		{
			System.out.println("Name :"+ name );
			System.out.println("Address : "+ address.getStreet()+ 
					",  "+ address.getCity()+", "+address.getState()+
					", "+address.getPostlcode());
		}

		//to String 
		@Override
		public String toString() {
			return "Person [name=" + name + ", address=" + address + "]";
		}
		
		
		
		

	
}
