package d_SetDemo;

public class Person {
		
		private String firstname;
		private String lastname;
		
		public String getFirstname() {
			return firstname;
		}
		
		public String getLastname() {
			return lastname;
		}
		
		@Override
		public String toString() {
			return "Person [firstname=" + firstname + ", lastname=" + lastname + "]";
		}
		
		public Person(String firstname, String lastname) {
			super();
			this.firstname = firstname;
			this.lastname = lastname;
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((firstname == null) ? 0 : firstname.hashCode());
			result = prime * result + ((lastname == null) ? 0 : lastname.hashCode());
			return result;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Person other = (Person) obj;
			if (firstname == null) {
				if (other.firstname != null)
					return false;
			} else if (!firstname.equals(other.firstname))
				return false;
			if (lastname == null) {
				if (other.lastname != null)
					return false;
			} else if (!lastname.equals(other.lastname))
				return false;
			return true;
		}
		
		

	}