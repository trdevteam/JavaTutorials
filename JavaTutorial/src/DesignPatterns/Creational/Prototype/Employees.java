package DesignPatterns.Creational.Prototype;

import java.util.ArrayList;

public class Employees implements Cloneable{

	private ArrayList<String> empList;
	
	public Employees(){
		empList = new ArrayList<String>();
	}
	
	public Employees(ArrayList<String> list){
		this.empList=list;
	}
	public void loadData(){
		//read all employees from database and put into the list
		empList.add("Pankaj");
		empList.add("Raj");
		empList.add("David");
		empList.add("Lisa");
	}
	
	public ArrayList<String> getEmpList() {
		return empList;
	}

	@Override
	public Object clone() throws CloneNotSupportedException{
	   ArrayList<String> temp = new ArrayList<String>();
			for(String s : this.getEmpList()){
				temp.add(s);
			}
	   return new Employees(temp);
	}
	
}