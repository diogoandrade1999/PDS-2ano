package P5_3;

public class Person {
	
	private final String lastName;
	private final String firstName;
	private final String middleName;
	private final String salutation;
	private final String suffix;
	private final String streetAddress;
	private final String city;
	private final String state;
	private final boolean isFemale;
	private final boolean isEmployed;
	private final boolean isHomewOwner;
	
	public static class Builder {
		private final String lastName;
		private final String firstName;
		private final String middleName;
		private String salutation = null;
		private String suffix = null;
		private String streetAddress = null;
		private String city = null;
		private String state = null;
		private boolean isFemale = false;
		private boolean isEmployed = false;
		private boolean isHomewOwner = false;
		
		
		public Builder(String newLastName, String newFirstName, String newMiddleName) {
			lastName = newLastName;
			firstName = newFirstName;
			middleName = newMiddleName;			
		}
		
		public Builder salutation(String val) {
			this.salutation = val;
			return this;
		}
		
		public Builder suffix(String val) {
			this.suffix = val;
			return this;
		}
		public Builder streetAddress(String val) {
			this.streetAddress = val;
			return this;
		}
		public Builder city(String val) {
			this.city = val;
			return this;
		}
		public Builder state(String val) {
			this.state = val;
			return this;
		}
		public Builder isFemale(boolean val) {
			this.isFemale = val;
			return this;
		}
		public Builder isEmployed(boolean val) {
			this.isEmployed = val;
			return this;
		}
		public Builder isHomewOwner(boolean val) {
			this.isHomewOwner = val;
			return this;
		}

		public Person build() {
			return new Person(this);
			}
	}
	
	public Person(Builder builder) {
		lastName =  builder.lastName;
		firstName =  builder.firstName;
		middleName =  builder.middleName;
		salutation = builder.salutation;
		suffix = builder.suffix;
		streetAddress = builder.streetAddress;
		city = builder.city;
		state = builder.state;
		isFemale = builder.isFemale;
		isEmployed = builder.isEmployed;
		isHomewOwner = builder.isHomewOwner;
	}

	@Override
	public String toString() {
		return "Person [lastName=" + lastName + ", firstName=" + firstName + ", middleName=" + middleName
				+ ", salutation=" + salutation + ", suffix=" + suffix + ", streetAddress=" + streetAddress + ", city="
				+ city + ", state=" + state + ", isFemale=" + isFemale + ", isEmployed=" + isEmployed
				+ ", isHomewOwner=" + isHomewOwner + "]";
	}
	
	
	public static void main(String[] args) {
		Person person = new Person.Builder("do Nordeste", "Tia", "Maria")
				.salutation("Dona").city("Porto").isFemale(true).isHomewOwner(true).build();
		
		System.out.println(person.toString());
	}
}
