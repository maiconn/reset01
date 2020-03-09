package com.cwi.simuladorrpg;

public class Mago {
    String nome;
    int vida;
    int ataque;
    int defesa;
    int mana;
    Magia magia;

    int recuperarDano(int defesa) {
        int poderAtaque = this.magia.poder * this.ataque;
        this.mana -= this.magia.custoMana;
        return poderAtaque - defesa;
    }

    void atacar(Barbaro barbaro){
        int dano = recuperarDano(barbaro.defesa);
        barbaro.vida -= dano;
        System.out.println(this.nome +  " atacou " + barbaro.nome + " com " + this.magia.nome + " causando " + dano + " de dano.");
    }

    void atacar(Clerigo clerigo){
        int dano = recuperarDano(clerigo.defesa);
        clerigo.vida -= dano;
        System.out.println(this.nome +  " atacou " + clerigo.nome + " com " + this.magia.nome + " causando " + dano + " de dano.");
    }

    void atacar(Druida druida){
        int dano = recuperarDano(druida.defesa);
        druida.vida -= dano;
        System.out.println(this.nome +  " atacou " + druida.nome + " com " + this.magia.nome + " causando " + dano + " de dano.");
    }

    void atacar(Feiticeiro feiticeiro){
        int dano = recuperarDano(feiticeiro.defesa);
        feiticeiro.vida -= dano;
        System.out.println(this.nome +  " atacou " + feiticeiro.nome + " com " + this.magia.nome + " causando " + dano + " de dano.");
    }

    void atacar(Guerreiro guerreiro){
        int dano = recuperarDano(guerreiro.defesa);
        guerreiro.vida -= dano;
        System.out.println(this.nome +  " atacou " + guerreiro.nome + " com " + this.magia.nome + " causando " + dano + " de dano.");
    }

    void atacar(Mago mago){
        int dano = recuperarDano(mago.defesa);
        mago.vida -= dano;
        System.out.println(this.nome +  " atacou " + mago.nome + " com " + this.magia.nome + " causando " + dano + " de dano.");
    }

    void imprimir(){
        System.out.println(this.nome + " com vida " + this.vida + " com mana " + this.mana + ".");
    }

    public Mago(String nome, int vida, int ataque, int defesa, int mana, Magia magia) {
        this.nome = nome;
        this.vida = vida;
        this.ataque = ataque;
        this.defesa = defesa;
        this.mana = mana;
        this.magia = magia;
    }
}
