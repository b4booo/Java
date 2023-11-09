package in.to;

class Person
	{
		String firstName = "Kirk";
		String lastName = "Tecling";
		String middleName = "Rubin";
		String sex = "male";
		int birthdate = 0101023;

		String fullname = firstName + " " + middleName +" "+ lastName;

		void introduceYourself()
			{
				System.out.println("Hello, I am " + fullname);
			}
	}