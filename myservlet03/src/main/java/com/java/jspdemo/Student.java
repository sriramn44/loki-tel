package com.java.jspdemo;

public class Student {
	int Id=6765;
	String Name="java";
	
	public Student() {
		
	}
	public Student(int Id,String  Name){
		
		this.Id=Id;
		this.Name=Name;	
	}
	
	
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		this.Id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String Name) {
		this.Name = Name;
	}
	
	public String toString() {
		return "Student [Id=" + Id + ", Name=" + Name + "]";
	}
	
	
		
	}

