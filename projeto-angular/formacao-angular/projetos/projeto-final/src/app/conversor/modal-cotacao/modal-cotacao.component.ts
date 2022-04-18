import { Component, Input, OnInit, Output } from '@angular/core';
import { EventEmitter } from 'stream';

import { ConversaoResponse, Conversao } from '../models';
import { ConversorService } from '../services';

@Component({
  selector: 'modal-cotacao',
  templateUrl: './modal-cotacao.component.html',
  styleUrls: ['./modal-cotacao.component.css']
})
export class ModalCotacaoComponent implements OnInit {

  @Input() id: string;
  @Input() conversaoResponse: ConversaoResponse;
  @Input() conversao: Conversao = new Conversao();
  @Output() onCofirm: EventEmitter = new EventEmitter();
  
  constructor(private conversorService: ConversorService) { }

  ngOnInit(): void {
  }

  novaConsulta(){
    //this.onCofirm.emit(); Emit não está funcionando
  }

  get valorConvertido(): string{
    if(this.conversaoResponse === undefined){
      return '0';
    }
    return (this.conversao.valor * 
      this.conversaoResponse.rates[this.conversao.moedaPara])
        .toFixed(2);
  }

  get cotacaoPara(): number{
    return this.conversorService.cotacaoPara(
      this.conversaoResponse, this.conversao
    );
  }

  get cotacaoDe(): string {
    return this.conversorService.cotacaoDe(
      this.conversaoResponse, this.conversao
    );
  }

  get dataCotacao(): string{
    return this.conversorService.dataCotacao(
      this.conversaoResponse
    );
  }

}
