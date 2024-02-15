package edu.cjc.main.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.cjc.main.model.*;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer>{

	List<Student> findAllBystudentBatchNumber(String studentBatchNumber);

	

//	List<Student> findAllBystudentBatchNumber(String studentBatchNumber);
	
	
}
