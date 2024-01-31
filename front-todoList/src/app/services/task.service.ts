import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Task } from '../model/Task';

@Injectable({
  providedIn: 'root'
})
export class TaskService {

  private BASE_URL: string = "http://localhost:8080/api/todolist"

  constructor(private http: HttpClient) { }

  getAllTasks(): Observable<[Task]> {
    return this.http.get<[Task]>(this.BASE_URL + "/all")
  }
}
