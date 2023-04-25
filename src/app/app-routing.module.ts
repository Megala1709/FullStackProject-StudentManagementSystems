import { Component, NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { StudentListComponent } from './student-list/student-list.component';
import { CreateStudentComponent } from './create-student/create-student.component';
import { UpdateStudentComponent } from './update-student/update-student.component';
import { StudentDetailsComponent } from './student-details/student-details.component';
import { LoginComponent } from './login/login.component';
import { LogoutComponent } from './logout/logout.component';
import {AuthGaurdService} from './auth-gaurd.service';
import { SignupComponent } from './signup/signup.component';
import { HomeComponent } from './home/home.component';
import { AboutusComponent } from './aboutus/aboutus.component';
import { ContactusComponent } from './contactus/contactus.component';




const routes: Routes = [
  {path: 'students', component: StudentListComponent,canActivate:[AuthGaurdService]},
  {path: 'create-student', component: CreateStudentComponent,canActivate:[AuthGaurdService]},
  {path:'student-list',component:StudentListComponent,canActivate:[AuthGaurdService]},
  {path: '', redirectTo: 'login', pathMatch: 'full'},
  {path: 'login', component: LoginComponent},
  {path:'aboutus',component:AboutusComponent,canActivate:[AuthGaurdService]},
{path:'contactus',component:ContactusComponent,canActivate:[AuthGaurdService]},
{path:'signup',component:SignupComponent},
 {path:'home',component:HomeComponent,canActivate:[AuthGaurdService]},
  {path: 'update-student/:id', component: UpdateStudentComponent},
  {path: 'student-details/:id', component: StudentDetailsComponent},
  { path: 'logout', component: LogoutComponent},

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],                                                                                                                                                                                                                                                                                                          
  exports: [RouterModule]
})
export class AppRoutingModule { }