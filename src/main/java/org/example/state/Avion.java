package org.example.state;

public interface Avion {
    void sortirDuGarage(); //opération de transition d'état
    void entrerAuGarage();
    void decoller();
    void atterir();
    void doActivity();  //Activité
}
