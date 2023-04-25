import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { AuthenticationService } from '../authentication.service';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit{
  username = '';
  password = '';
  invalidLogin = false
  errorpassword!: string;
  errorname!: string;

  constructor(private router: Router,
    private loginservice: AuthenticationService) { }

  ngOnInit() {
  }

  checkLogin() {
    if (this.loginservice.authenticate(this.username, this.password)
    ) {
      this.router.navigate(['home']);
      console.log("navigate..");
      this.invalidLogin = false;
    } else
      this.invalidLogin = true;
       if(this.username.length===0||this.password.length===0)
      {
        this.errorname="UserName is required";
        this.errorpassword="Password is required";
      }
  }
}

