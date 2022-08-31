package application;

import java.util.ArrayList;

public class PeopleList {
	private ArrayList <People> peoples;
	
	public PeopleList() {
		
		peoples = new ArrayList<People>();
	}
	
	public ArrayList<People> getList(){
		
		return peoples;
	}
	
	public void addPeople(People p) {
		
		peoples.add(p);
	}
	
	public void removePeople(int i) {
		
		if ((i > -1) && (i < peoples.size())) {
			peoples.remove(i);
		}
	}
	
	public void removePeopleByName(String name) {
		
		for (int i = 0; i < peoples.size(); i++) {
			if (getPeople(i).getName().equals(name)) {
				peoples.remove(i);
			}
		}
	}
	
	public People getPeople(int i) {
		
		if ((i > -1) && (i < peoples.size())) {
			return peoples.get(i);
			}
		
		return null;
	}
	
	public int getSize() {
		return peoples.size();
	}
}
