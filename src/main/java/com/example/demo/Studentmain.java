package com.example.demo;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Studentmain {
	public Studentmain(int sno, String name, String age) {
		super();
		this.sno = sno;
		this.name = name;
		this.age = age;
	}
	public Studentmain() {
		
	}
		private int sno;

	private String name;

	private String age;
	
	public int getSno() {
		return sno;
	}
	public void setSno(int sno) {
		this.sno = sno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}

}
