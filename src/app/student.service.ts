import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http'
import { Observable } from 'rxjs';
import { Student} from './student';

@Injectable({
  providedIn: 'root'
})
export class StudentService {

  private baseURL = "http://localhost:8080/api/v1/students";

  constructor(private httpClient: HttpClient) { }

  getStudentList(): Observable<Student[]>{
    console.log("i came here");
    return this.httpClient.get<Student[]>(`${this.baseURL}`);
  }

  createStudent(student: Student): Observable<Object>{
    return this.httpClient.post(`${this.baseURL}`, student);
  }

  getStudentById(id: number): Observable<Student>{
    return this.httpClient.get<Student>(`${this.baseURL}/${id}`);
  }

  updateStudent(id: number, student: Student): Observable<Object>{
    console.log("came to service class..");
    return this.httpClient.put(`${this.baseURL}/${id}`, student);
  }

  deleteStudent(id: number): Observable<Object>{
    return this.httpClient.delete(`${this.baseURL}/${id}`);
  }
    deleteAll():Observable<any>
    {
      return this.httpClient.delete(`${this.baseURL}`);
    }
    findByName(studentName: any): Observable<Student[]> {
      return this.httpClient.get<Student[]>(`${this.baseURL}?studentName=${studentName}`);
    }
    findByIsStandard6(): Observable<Student[]>{
      return this.httpClient.get<Student[]>(`${this.baseURL}/fetchByStd6`);
    }
    findByIsStandard7(): Observable<Student[]>{
      return this.httpClient.get<Student[]>(`${this.baseURL}/fetchByStd7`);
    }
    findByIsStandard8(): Observable<Student[]>{
      return this.httpClient.get<Student[]>(`${this.baseURL}/fetchByStd8`);
    }
    findByIsStandard9(): Observable<Student[]>{
      return this.httpClient.get<Student[]>(`${this.baseURL}/fetchByStd9`);
    }
    findByIsStandard10(): Observable<Student[]>{
      return this.httpClient.get<Student[]>(`${this.baseURL}/fetchByStd10`);
    }
    findByIsStandard11(): Observable<Student[]>{
      return this.httpClient.get<Student[]>(`${this.baseURL}/fetchByStd11`);
    }
    findByIsStandard12(): Observable<Student[]>{
      return this.httpClient.get<Student[]>(`${this.baseURL}/fetchByStd12`);
    }
    
    
  
  }