package edu.cjc.main.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int studentId;
	private String studentFullName;
	private String studentAddress;
	private String studentEmailId;
	private String studentGender;
	private String studentBatchNumber;
	private String studentBatchMode;
	private String studentCourse;
	private double studentFeesPaid;
	
	
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentFullName() {
		return studentFullName;
	}
	public void setStudentFullName(String studentFullName) {
		this.studentFullName = studentFullName;
	}
	public String getStudentAddress() {
		return studentAddress;
	}
	public void setStudentAddress(String studentAddress) {
		this.studentAddress = studentAddress;
	}
	public String getStudentEmailId() {
		return studentEmailId;
	}
	public void setStudentEmailId(String studentEmailId) {
		this.studentEmailId = studentEmailId;
	}
	public String getStudentGender() {
		return studentGender;
	}
	public void setStudentGender(String studentGender) {
		this.studentGender = studentGender;
	}
	public String getStudentBatchNumber() {
		return studentBatchNumber;
	}
	public void setStudentBatchNumber(String studentBatchNumber) {
		this.studentBatchNumber = studentBatchNumber;
	}
	public String getStudentBatchMode() {
		return studentBatchMode;
	}
	public void setStudentBatchMode(String studentBatchMode) {
		this.studentBatchMode = studentBatchMode;
	}
	public String getStudentCourse() {
		return studentCourse;
	}
	public void setStudentCourse(String studentCourse) {
		this.studentCourse = studentCourse;
	}
	public double getStudentFeesPaid() {
		return studentFeesPaid;
	}
	public void setStudentFeesPaid(double studentFeesPaid) {
		this.studentFeesPaid = studentFeesPaid;
	}

	

//	private String studentCollegeName;
//	private int studentAge;
//	private String batchNumber;
//	private String batchMode;
//	private String feesPaid;

}
