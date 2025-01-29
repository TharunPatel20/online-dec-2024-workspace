package mybeans;

public class Person {
	private int personId;
	private String personFirstname;
	private String personLastname;

	public Person() {}

	public Person(int personId, String personFirstname, String personLastname) {
		super();
		this.personId = personId;
		this.personFirstname = personFirstname;
		this.personLastname = personLastname;
	}

	public int getPersonId() {
		return personId;
	}

	public void setPersonId(int personId) {
		this.personId = personId;
	}

	public String getPersonFirstname() {
		return personFirstname;
	}

	public void setPersonFirstname(String personFirstname) {
		this.personFirstname = personFirstname;
	}

	public String getPersonLastname() {
		return personLastname;
	}

	public void setPersonLastname(String personLastname) {
		this.personLastname = personLastname;
	}

	@Override
	public String toString() {
		return "Person [personId=" + personId + ", personFirstname=" + personFirstname + ", personLastName="
				+ personLastname + "]";
	}
}
