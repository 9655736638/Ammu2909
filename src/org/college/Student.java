package org.college;

public class Student extends College {
public void studentName() {
	System.out.println("Student Name is Amritha");

}
public static void main(String[] args) {
	Student s =new Student();
     s.studentName();
     s.collegeName();
     s.hostelName();
     s.depName();
     
     
}
}
