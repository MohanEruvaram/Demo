package com.example.demo;

import org.json.JSONObject;

public class MohanTest extends JSONObject {
	// public JSONObject super = new JSONObject();
	public int sno;
	public String name;
	public String mailid;

	public int getSno() {
		return sno;
	}

	public MohanTest() {

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

	public String getMailid() {
		return mailid;
	}

	public void setMailid(String mailid) {

		this.mailid = mailid;
	}

}
