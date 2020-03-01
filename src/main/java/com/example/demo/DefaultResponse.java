package com.example.demo;

import java.time.LocalTime;

public class DefaultResponse {
	private boolean isvalid;
	private String record;
	private long time = System.currentTimeMillis();

	public boolean isIsvalid() {
		return isvalid;
	}

	public DefaultResponse setIsvalid(boolean isvalid) {
		this.isvalid = isvalid;
		return this;
	}

	public String getRecord() {
		return record;
	}

	public DefaultResponse setRecord(String record) {
		this.record = record;
		return this;
	}

	public long getTime() {
		return time;
	}

	public DefaultResponse setTime(long time) {
		this.time = time;
		return this;
	}
}
