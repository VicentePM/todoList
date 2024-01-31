import { Component } from '@angular/core';
import { MenuComponent } from '../menu/menu.component';
import { Task } from '../../model/Task';
import { TaskService } from '../../services/task.service';
import { Router } from '@angular/router';


@Component({
  selector: 'app-home',
  standalone: true,
  imports: [MenuComponent],
  templateUrl: './home.component.html',
  styleUrl: './home.component.css',
})
export class HomeComponent {

  tasks: [Task] | null = null

  constructor(private taskService: TaskService, private router: Router) {

  }

  showAllTasks(): void {
    this.taskService.getAllTasks().subscribe({
      next: res=> {
        this.tasks = res
      },
      error: err => {
        console.error(err)
      }
    })
  }


}
