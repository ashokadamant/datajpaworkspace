package com.nt.model;

public class Student {
    private int id;
    private String name;
    private String clg;
	public Student(int id, String name, String clg) {
		super();
		this.id = id;
		this.name = name;
		this.clg = clg;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getClg() {
		return clg;
	}

	public void setClg(String clg) {
		this.clg = clg;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", clg=" + clg + "]";
	}
    
}
