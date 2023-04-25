package com.example.demo.controller;
	import java.io.Console;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
	import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
	import org.springframework.web.bind.annotation.GetMapping;
	import org.springframework.web.bind.annotation.PathVariable;
	import org.springframework.web.bind.annotation.PostMapping;
	import org.springframework.web.bind.annotation.PutMapping;
	import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

	import com.example.demo.model.Student;
import com.example.demo.repository.StudentRepo;
import com.example.demo.service.StudentServerImp;

	@CrossOrigin(origins = "http://localhost:4200")
	@RestController
	@RequestMapping("/api/v1/")
	public class StudentController {
	public StudentServerImp stdServ;
	public StudentRepo studentRepo;
		
		@Autowired
		public StudentController(StudentRepo stdRepo ,StudentServerImp stdServ ) {
			this.stdServ =  stdServ;
		 	this.studentRepo=stdRepo;
		}

		
		
		@GetMapping("/students")
		public ResponseEntity<List<Student>> getAllStudents(@RequestParam(required=false) String studentName)
		{
			try
			{
				List<Student> studentList=new ArrayList<Student>();
				if(studentName!=null)
				{
					studentRepo.findByStudentNameContaining(studentName).forEach(studentList::add);
					return new ResponseEntity<>(studentList,HttpStatus.OK);
					}
				else
				{
					studentList=studentRepo.findAll();
					return new ResponseEntity<>(studentList,HttpStatus.OK);
				}
			}
				catch(Exception e)
				{
					return new ResponseEntity<>(null,HttpStatus.INTERNAL_SERVER_ERROR);
				}
			}
		


		@PostMapping("/students")
		
		public ResponseEntity<Student> saveStd(@RequestBody Student std){
		
			return new ResponseEntity<Student>(stdServ.saveStd(std), HttpStatus.CREATED);
			
				
			}
		
		
		
		@PutMapping("/students/{id}")
		public ResponseEntity<Student> updateStdDetailsById(@PathVariable("id") int id,
				@RequestBody Student std){
			return new ResponseEntity<Student>(stdServ.updateStdDetails(std, id), HttpStatus.OK);
			
		}
		
		
		@GetMapping("/students/{id}")
		public ResponseEntity<Student>  getStudentById(@PathVariable("id")  int id){
			return new ResponseEntity<Student>(stdServ.getStudentById(id), HttpStatus.OK);
		}
		
		
		@GetMapping("/students/fetchByStd6")
		public ResponseEntity<List<Student>> findByPublished6() {
			try {
				List<Student> studentStandardList = studentRepo.findByStandard(6);

				if (studentStandardList.isEmpty()) {
					return new ResponseEntity<>(HttpStatus.NO_CONTENT);
				}
				return new ResponseEntity<>(studentStandardList, HttpStatus.OK);
			} catch (Exception e) {
				return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
			}
		}
		@GetMapping("/students/fetchByStd7")
		public ResponseEntity<List<Student>> findByPublished7() {
			try {
				List<Student> studentStandardList = studentRepo.findByStandard(7);

				if (studentStandardList.isEmpty()) {
					return new ResponseEntity<>(HttpStatus.NO_CONTENT);
				}
				return new ResponseEntity<>(studentStandardList, HttpStatus.OK);
			} catch (Exception e) {
				return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
			}
		}
		@GetMapping("/students/fetchByStd8")
		public ResponseEntity<List<Student>> findByPublished8() {
			try {
				List<Student> studentStandardList = studentRepo.findByStandard(8);

				if (studentStandardList.isEmpty()) {
					return new ResponseEntity<>(HttpStatus.NO_CONTENT);
				}
				return new ResponseEntity<>(studentStandardList, HttpStatus.OK);
			} catch (Exception e) {
				return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
			}
		}
		@GetMapping("/students/fetchByStd9")
		public ResponseEntity<List<Student>> findByPublished9() {
			try {
				List<Student> studentStandardList = studentRepo.findByStandard(9);

				if (studentStandardList.isEmpty()) {
					return new ResponseEntity<>(HttpStatus.NO_CONTENT);
				}
				return new ResponseEntity<>(studentStandardList, HttpStatus.OK);
			} catch (Exception e) {
				return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
			}
		}
		@GetMapping("/students/fetchByStd10")
		public ResponseEntity<List<Student>> findByPublished10() {
			try {
				List<Student> studentStandardList = studentRepo.findByStandard(10);

				if (studentStandardList.isEmpty()) {
					return new ResponseEntity<>(HttpStatus.NO_CONTENT);
				}
				return new ResponseEntity<>(studentStandardList, HttpStatus.OK);
			} catch (Exception e) {
				return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
			}
		}
		@GetMapping("/students/fetchByStd11")
		public ResponseEntity<List<Student>> findByPublished11() {
			try {
				List<Student> studentStandardList = studentRepo.findByStandard(11);

				if (studentStandardList.isEmpty()) {
					return new ResponseEntity<>(HttpStatus.NO_CONTENT);
				}
				return new ResponseEntity<>(studentStandardList, HttpStatus.OK);
			} catch (Exception e) {
				return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
			}
		}
		@GetMapping("/students/fetchByStd12")
		public ResponseEntity<List<Student>> findByPublished12() {
			try {
				List<Student> studentStandardList = studentRepo.findByStandard(12);

				if (studentStandardList.isEmpty()) {
					return new ResponseEntity<>(HttpStatus.NO_CONTENT);
				}
				return new ResponseEntity<>(studentStandardList, HttpStatus.OK);
			} catch (Exception e) {
				return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
			}
		}
		
		

		
		@DeleteMapping("/students/{id}")
		public ResponseEntity<String> deleteStudentById(@PathVariable("id")  int id){
			System.out.println(id);
			stdServ.deleteStdById(id);
			System.out.println("deleted..");
			return new ResponseEntity<String>("deleted successfully", HttpStatus.OK);
		}
		
		@DeleteMapping("/students")
			public ResponseEntity<HttpStatus> deleteAllEmp()
			{
				try
				{
					studentRepo.deleteAll();
					return new ResponseEntity<>(HttpStatus.NO_CONTENT);
					
		
				}catch(Exception e)
				{
					return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
				}
			}
		}
	
	
	
	
	
	
	