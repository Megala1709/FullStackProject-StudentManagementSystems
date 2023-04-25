import { Component, OnInit } from '@angular/core';
import { Student } from '../student'
import { StudentService } from '../student.service'
import { Router } from '@angular/router';

@Component({
  selector: 'app-student-list',
  templateUrl: './student-list.component.html',
  styleUrls: ['./student-list.component.css']
})
export class StudentListComponent implements OnInit {

   students: Student[] = [];
   studentName='';

  constructor(private studentService: StudentService,
    private router: Router) { }

  ngOnInit(): void {
    this.getStudent();
  }

  private getStudent(){
    this.studentService.getStudentList().subscribe(data => {
      this.students = data;
    });
  }

  studentDetails(id: number){
    console.log(id);
    this.router.navigate(['student-details', id]);
  }

  updateStudent(id: number){
    console.log("came in front end updae..");
    this.router.navigate(['update-student', id]);
  }

  confirmDelete(student: Student)
  {
    var status=confirm('Are You Really Want To Delete ?');
    if(status===true)
    {
      this.deleteStudent(student.id);
    }
    this.getStudent();
  }
  confirmDeleteAll()
  {
    var status=confirm('Are You Really Want To Delete All The Records ?');
    if(status===true)
    {
      this.removeAllStds();
    }
    this.getStudent();
  }

  deleteStudent(id: number){
    this.studentService.deleteStudent(id).subscribe( data => {
      console.log(data);
      this.getStudent();
    })
  }
  refreshList():void{
    this.getStudent();
  }
  removeAllStds():void{
    this.studentService.deleteAll().subscribe(
      data=>{
        console.log(data);
        this.refreshList();
      },
      error=>{
        console.log(error);
      }
    )
  }
  searchByName(){
    this.studentService.findByName(this.studentName)
    .subscribe(
      data => {
        this.students = data;
        console.log(data);
      },
      error => {
        console.log(error);
      });
 
  }
  fetchStdStandard6(){
    this.studentService.findByIsStandard6().subscribe(
      data => {
        this.students = data;
          console.log(data);
        },
        error => {
          console.log(error);
        });
  }
  fetchStdStandard7(){
    this.studentService.findByIsStandard7().subscribe(
      data => {
        this.students = data;
          console.log(data);
        },
        error => {
          console.log(error);
        });
  }
  fetchStdStandard8(){
    this.studentService.findByIsStandard8().subscribe(
      data => {
        this.students = data;
          console.log(data);
        },
        error => {
          console.log(error);
        });
  }
  fetchStdStandard9(){
    this.studentService.findByIsStandard9().subscribe(
      data => {
        this.students = data;
          console.log(data);
        },
        error => {
          console.log(error);
        });
  }
  fetchStdStandard10(){
    this.studentService.findByIsStandard10().subscribe(
      data => {
        this.students = data;
          console.log(data);
        },
        error => {
          console.log(error);
        });
  }
  fetchStdStandard11(){
    this.studentService.findByIsStandard11().subscribe(
      data => {
        this.students = data;
          console.log(data);
        },
        error => {
          console.log(error);
        });
  }
  fetchStdStandard12(){
    this.studentService.findByIsStandard12().subscribe(
      data => {
        this.students = data;
          console.log(data);
        },
        error => {
          console.log(error);
        });
  }

}