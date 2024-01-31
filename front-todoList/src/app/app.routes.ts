import { Routes } from '@angular/router';
import { HomeComponent } from './components/home/home.component';

export const routes: Routes = [
    {path: '', component: HomeComponent, title: 'Todo List'},
    {path: '', redirectTo: '/', pathMatch: 'full'},
    {path: '**', component: HomeComponent}
];
