package org.College;

public class Dept extends Hostel {
	private void deptName() {
		System.out.println("Dept Name :BCA ");
		
		
	}
	public static void main(String[] args) {
		Dept d=new Dept();
		d.deptName();
		d.studentDept();
		d.studentId();
		d.hostelName();
		d.collegeName();
		d.collegeCode();
		d.collegeRank();
	}

}
