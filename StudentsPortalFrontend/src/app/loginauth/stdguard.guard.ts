import { Injectable } from '@angular/core';
import { CanActivate, ActivatedRouteSnapshot, RouterStateSnapshot, UrlTree, Router } from '@angular/router';
import { Observable } from 'rxjs';
import { AuthService } from './auth.service';

@Injectable({
  providedIn: 'root'
})
export class StdguardGuard implements CanActivate {

  constructor(private auth: AuthService, private route:Router) {} 
  canActivate(
    route: ActivatedRouteSnapshot,
    state: RouterStateSnapshot): Observable<boolean | UrlTree> | Promise<boolean | UrlTree> | boolean | UrlTree {
      if (this.auth.isLogged()) {
        console.log("Checking user login")
        return true;
      }
      window.alert("You don't have permission to view this page");
      this.route.navigate(['/home']);
      return false;
  }
}
  

