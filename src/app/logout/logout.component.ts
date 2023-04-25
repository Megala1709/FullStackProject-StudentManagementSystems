import { Component, OnInit } from '@angular/core';
import { AuthenticationService } from '../authentication.service';
import { Router } from '@angular/router';


@Component({
  selector: 'app-logout',
  templateUrl: './logout.component.html',
  styleUrls: ['./logout.component.css']
})
export class LogoutComponent implements OnInit {

  constructor(
    private authentocationService: AuthenticationService,
    private router: Router) {

  }

  ngOnInit() {
    var status = confirm("Are You Sure Want TO Leave?");
    console.log(status);
    if (status === true) {
      this.authentocationService.logOut();
      this.router.navigate(['login']);
    }
    else {
      this.router.navigate(['home']);
    }
  }
}