package com.deeptech.spring1;

public class Student 
{
private int studentid;
private String studName;

public int getStudentid() {
	return studentid;
}
public void setStudentid(int studentid) {
	this.studentid = studentid;
}
public String getStudName() {
	return studName;
}
public void setStudName(String studName) {
	this.studName = studName;
	
}
    void display()
    {
    	System.out.println(studentid);
    	System.out.println(studName);
    }

}
