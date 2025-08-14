package com.example;

import java.util.Collection;

public class Jogo {
    protected Monte monte = new Monte();
    protected Jogador jogador = new Jogador();
    protected Jogador computador = new Computador();

    public Jogo(){
        monte.embaralhar();
    }

        public Carta distribuicartaparajogador (Jogador jogador){
            var carta = monte.virat();
            if(!jogador.parou()== false){
                jogador.receberCarta(carta);
                return carta;
            }
            return null;
        }

        public boolean acabou(){
            if (jogador.parou() && computador.parou()) {
                return true;
            }
            if(jogador.getPontos() > 21 || computador.getPontos()> 21){
                return true;
            }
            return false;

        }
     

}
