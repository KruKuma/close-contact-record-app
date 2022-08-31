package application;

public class People {
	
	private String name;
	private String fName;
	private String lName;
	private int id;
	private int phone;
	
	public People(String f, String l, int i, int p) {
		fName = f;
		lName = l;
		id = i;
		phone = p;
		
	}
	
	public String getName() {
		name = fName + " " + lName;
		return name;
	}
	
	public int getID() {
		return id;
	}
	
	public int getPhone() {
		return phone;
	}
	
	public void setName(String n) {
		name = n;
	}
	
	public void setID(int j) {
		id = j;
	}
	
	public void setPhone(int k) {
		phone = k;
	}
	
	public String toString() {
		return fName + "," + lName + "," + id + "," + phone + "\n";
	}

}
