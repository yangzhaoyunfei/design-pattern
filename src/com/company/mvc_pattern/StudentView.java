package com.company.mvc_pattern;

/**
 * @author tang.zhong.wei
 * @date 2021/11/15 9:53
 */
public class StudentView {
	public void printStudentDetails(String studentName, String studentRollNo) {
		System.out.println("Student: ");
		System.out.println("Name: " + studentName);
		System.out.println("Roll No: " + studentRollNo);
	}
}
