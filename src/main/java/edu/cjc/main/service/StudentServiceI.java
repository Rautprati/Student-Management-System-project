package edu.cjc.main.service;


import java.util.List;
import java.util.Optional;

import edu.cjc.main.model.Student;
import edu.cjc.main.model.User;


public interface StudentServiceI {

	public void saveStudentDetails(Student s);

	public List<Student> getAllStudentDetails();

	public List<Student> deleteStudent(int studentId);

	public List<Student> searchStudentByBatch(String studentBatchNumber);

	public Student getSingleStudent(int studentId);

	public void updateStudentFees(int studentId, double amount);

	public void updateStudentBatchNumber(int studentId, String studentBatchNumber);

	

}
