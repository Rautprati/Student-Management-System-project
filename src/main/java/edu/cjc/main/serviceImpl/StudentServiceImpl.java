package edu.cjc.main.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.cjc.main.model.Student;
import edu.cjc.main.model.User;
import edu.cjc.main.repository.StudentRepository;
import edu.cjc.main.repository.UserRepository;
import edu.cjc.main.service.StudentServiceI;

@Service
public class StudentServiceImpl implements StudentServiceI{

	@Autowired
     private StudentRepository sr;
	
	@Override
	public void saveStudentDetails(Student s) {
		
		sr.save(s);
		
	}

	@Override
	public List<Student> getAllStudentDetails() {
		
		return sr.findAll();
		
	}

	@Override
	public List<Student> deleteStudent(int studentId) {
		sr.deleteById(studentId);
		return sr.findAll();
	}

	@Override
	public List<Student> searchStudentByBatch(String studentBatchNumber) {
		List<Student> batchstudents = sr.findAllBystudentBatchNumber(studentBatchNumber);
		return batchstudents;
	}

	@Override
	public Student getSingleStudent(int studentId) {
		Student stu = sr.findById(studentId).get();
		return stu;
	}

	@Override
	public void updateStudentFees(int studentId, double amount) {
		
		Student stu = sr.findById(studentId).get();
		
		double updatedfees = stu.getStudentFeesPaid()+amount;
		
		stu.setStudentFeesPaid(updatedfees);
		sr.save(stu);
		
		
	}

	@Override
	public void updateStudentBatchNumber(int studentId, String studentBatchNumber) {
		
		Student stu = sr.findById(studentId).get();
		
		stu.setStudentBatchNumber(studentBatchNumber);
		
		sr.save(stu);
		
	}

	
	



	

}
