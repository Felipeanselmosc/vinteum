package com.example;

public class Computador extends Jogador{
   @Override
    public boolean parou(){
        return getPontos() > 16;
    }
    
    public boolean test(boolean a){
        if (a) return true;
        if (!a) return false;
    }

}
