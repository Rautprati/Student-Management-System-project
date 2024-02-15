package edu.cjc.main.controller;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import edu.cjc.main.model.Student;
import edu.cjc.main.model.User;
import edu.cjc.main.service.StudentServiceI;
import edu.cjc.main.service.UserService;

@Controller
public class AdminController {

	@Autowired
	private StudentServiceI ssi;
	
	@Autowired
	private UserService us;
	
	@RequestMapping("/")
	public String prelogin() {
		return "login";
	}
	
	@GetMapping("/login")
	public String onLogin(@RequestParam String username,@RequestParam String password,Model m) {
	        User user = us.loginUserDetails(username,password);
		
		if(username.equals("Admin") && password.equals("Admin123")) {
			List<Student> student = ssi.getAllStudentDetails();
			m.addAttribute("data", student);
			return "adminscreen";
			
		}
		else if(username.equals(user.getUsername()) && password.equals(user.getPassword())) {
			System.out.println(user.getUsername());
			System.out.println(user.getPassword());
		
			return "studentDetails";
		}
		
		else {
			m.addAttribute("login_fail", "Please enter correct username and password....");
			return "login";
		}
	}
	
	@GetMapping("/sign_up")
	public String enrollStudent() {
		return "userRegistration";
	}
	
	@RequestMapping("/reset_reg")
	public String resetReg() {
		return "registration";
	}
	
	@RequestMapping("/register_student")
	public String saveStudent(@ModelAttribute Student student,Model m) {
	
		ssi.saveStudentDetails(student);
		List<Student> list = ssi.getAllStudentDetails();
		m.addAttribute("data", list);
		return "adminscreen";
		
	}
	
	@RequestMapping("/view")
	public String viewStudent(Model m) {
		 List<Student> student = ssi.getAllStudentDetails();
		 m.addAttribute("data", student);
		 return"adminscreen";
	}
	
	@RequestMapping("/enroll")
	public String addStudent() {
		return "registration";
	}
	
	@RequestMapping("/delete")
	public String deleteStudentDetails(@RequestParam int studentId, Model m) {
		List<Student> stu = ssi.deleteStudent(studentId);
		m.addAttribute("data", stu);
		return "adminscreen";
	}
	
	
	@RequestMapping("/search")
	public String searchStudentByBatchNumber(@RequestParam String studentBatchNumber,Model m) {
		System.out.println(studentBatchNumber);
		List<Student> result = ssi.searchStudentByBatch(studentBatchNumber);
		if(result.size()>0) {
			m.addAttribute("data", result);
		}
		else {
			List<Student> students = ssi.getAllStudentDetails();
			m.addAttribute("data", students);
		}
		return "adminscreen";
	}
	
	@RequestMapping("/fees")
	public String payFees(@RequestParam int studentId, Model m) {
		
		Student stu = ssi.getSingleStudent(studentId);
		m.addAttribute("st", stu);
		return "fees";
	}
	
	@RequestMapping("/payfees")
	public String updateFeespaid(@RequestParam int studentId,@RequestParam double amount,Model m) {
		
		ssi.updateStudentFees(studentId,amount);
		
		List<Student> list = ssi.getAllStudentDetails();
		m.addAttribute("data", list);
		return "adminscreen";
	}
	
	
	@RequestMapping("/shiftbatch")
	public String shiftBatch(@RequestParam int studentId,Model m) {
		
		Student stu = ssi.getSingleStudent(studentId);
		m.addAttribute("st", stu);
		return "shiftBatch";
	}
	
	@RequestMapping("/shift")
	public String updateShiftBatch(@RequestParam int studentId,@RequestParam String studentBatchNumber,Model m) {
		
	    ssi.updateStudentBatchNumber(studentId,studentBatchNumber);
	    List<Student> list = ssi.getAllStudentDetails();
	    m.addAttribute("data", list);
		return "adminscreen";
	}
	
	@RequestMapping("/sign")
	public String signUpUser(@ModelAttribute User u) {
		us.getUserDetails(u);
		return "login";
	}
	
}
