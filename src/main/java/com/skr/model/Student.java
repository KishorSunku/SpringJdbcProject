package com.skr.model;

public class Student {
	private int sid;
	private String sName;
	private float sMarks;
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getsName() {
		return sName;
	}
	public void setsName(String sName) {
		this.sName = sName;
	}
	public float getsMarks() {
		return sMarks;
	}
	public void setsMarks(float sMarks) {
		this.sMarks = sMarks;
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sName=" + sName + ", sMarks=" + sMarks + "]";
	}

}
