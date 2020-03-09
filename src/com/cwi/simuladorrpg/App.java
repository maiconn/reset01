package com.cwi.simuladorrpg;

public class App {
    public static void main(String[] args) {
        Barbaro conar = new Barbaro("Conar O Barbaro", 300, 30, 20, new Arma("Espada", 4));
        Clerigo legolas = new Clerigo("Légolas", 220, 20, 15, 100, new PoderDivino("flexa sagrada", 2,15));
        Druida santoGraal = new Druida("Santo Graal", 200, 20, 10, 100, new PoderDivino("luz iluminati", 3,30));
        Feiticeiro gandalf = new Feiticeiro("Gandalf", 200, 30, 15, 120, new Magia("cajado mágico", 3,30));
        Guerreiro ragnar = new Guerreiro("Ragnar", 230, 25, 10, new Arma("Machado", 3));
        Mago merlin = new Mago("Merlin", 100, 20, 20, 90, new Magia("Askabunts", 3, 40));

        conar.imprimir();
        legolas.imprimir();
        santoGraal.imprimir();
        gandalf.imprimir();
        ragnar.imprimir();
        merlin.imprimir();

        conar.atacar(santoGraal);
        conar.atacar(ragnar);

        legolas.atacar(gandalf);
        legolas.atacar(merlin);

        santoGraal.atacar(conar);
        santoGraal.atacar(gandalf);

        gandalf.atacar(ragnar);
        gandalf.atacar(merlin);

        ragnar.atacar(legolas);
        ragnar.atacar(conar);

        merlin.atacar(santoGraal);
        merlin.atacar(conar);

        conar.imprimir();
        legolas.imprimir();
        santoGraal.imprimir();
        gandalf.imprimir();
        ragnar.imprimir();
        merlin.imprimir();
    }
}
