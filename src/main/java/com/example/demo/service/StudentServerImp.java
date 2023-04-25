package com.example.demo.service;



	import java.util.List;
	import java.util.Optional;

	
	import org.springframework.stereotype.Service;

	import com.example.demo.StudentInterface.StudentInterfaceServ;
	import com.example.demo.model.Student;
	import com.example.demo.repository.StudentRepo;
	
	@Service
	public class StudentServerImp implements StudentInterfaceServ{
		
		 StudentRepo stdRepo;
		    public StudentServerImp(StudentRepo stdRepo) {
			this.stdRepo = stdRepo;
			}

			
			@Override
			public List<Student> getStdsFromDb() {
				// TODO Auto-generated method stub
				return stdRepo.findAll();
				
			}

			@Override
			public Student getStudentById(int stdId) {
				// TODO Auto-generated method stub
				Optional<Student> std = stdRepo.findById(stdId);
				if(std.isPresent()) {
					return std.get();
				}
				else {
					return null;
				}
				
			}

			@Override
			public Student updateStdDetails(Student newVal, int stdId) {
				// TODO Auto-gener2ated method stub
				Optional<Student> std = stdRepo.findById(stdId);
				if(std.isPresent()) {
					Student existingStd = std.get();  //'2', 'mny@123', 'abc', 'xyz'

					existingStd.setStudentName(newVal.getStudentName());
					existingStd.setStandard(newVal.getStandard());
					existingStd.setDob(newVal.getDob());
					existingStd.setParentName(newVal.getParentPhoneNo());
					existingStd.setStdAttendence(newVal.getStdAttendence());
					stdRepo.save(existingStd);
					return existingStd;
				}
				else {
					return null;
				}
				
			}

			@Override
			public void deleteStdById(int stdId) {
				// TODO Auto-generated method stub
				Optional<Student> std = stdRepo.findById(stdId);
				if(std.isPresent()) {
					stdRepo.deleteById(stdId);
			}
			
		}


			@Override
			public Student saveStd(Student std) {
				// TODO Auto-generated method stub
				
					return stdRepo.save(std);

}
	}
