package com.example;

import java.util.Collection;

public class Jogo {
    protected Monte monte = new Monte();
    protected Jogador jogador = new Jogador();
    protected Jogador computador = new Computador();

    public Jogo() {
        monte.embaralhar();
    }

    public Carta distribuicartaparajogador(Jogador jogador) {
        var carta = monte.virat();
        if (!jogador.parou() == false) {
            jogador.receberCarta(carta);
            return carta;
        }
        return null;
    }

    public boolean acabou() {
        var osDoisParaeam = jogador.parou() && computador.parou();
        return osDoisParaeam || estourou(jogador) || estourou(computador);

    }

    private boolean estourou(Jogador jogador) {
        return jogador.getPontos() > 21;
    }

    public String resultado() {
        var estourou = estourou(jogador) && estourou(computador) ||
                jogador.getPontos() == computador.getPontos();
        if (estourou) {
            return "empatou";
        }
        if (jogador.getPontos() < computador.getPontos() || estourou(computador)) {
            return "voce ganhou";
        }
        return "voce perdeu";

    }

}
