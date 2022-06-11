package com.prodapt.weeklytest1;

public class SchoolRecords {
	String schoolName;
	int schoolId;
	String schoolAddress;
	void ddRecords(int schoolId,String schoolName,String schoolAddress) {
		System.out.println("Add school id = " +schoolId);
		System.out.println("Add school name = " +schoolName);
		System.out.println("Add school address = " +schoolAddress);
	}
	void dispRecords() {
		System.out.println("Display school id = " +schoolId);
		System.out.println("Display school name = " +schoolName);
		System.out.println("Display school address = " +schoolAddress);
	}
	

}
