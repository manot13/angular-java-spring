import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { CalculadoraModule } from './calculadora';
// import { ConversorModule } from './conversor';
import { DashboardModule } from './dashboard';
import { JogoDaVelhaModule } from './jogo-da-velha';
import { TarefasModule } from './tarefas';


@NgModule({
  declarations: [
    AppComponent
  ],
  imports: [
    BrowserModule,
    DashboardModule,
    CalculadoraModule,
    TarefasModule,
    JogoDaVelhaModule,
    // ConversorModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
