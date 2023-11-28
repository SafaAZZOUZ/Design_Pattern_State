package org.example.state;

public abstract class State{
    protected AvionImpl avion;
    public State(AvionImpl avion){
        this.avion=avion;
    }

    public void setAvion(AvionImpl avion) {
        this.avion = avion;
    }

    abstract void executeSortirDuGarage(); //opération de transition d'état
    abstract void executeEntrerAuGarage();
    abstract void executeDecoller();
    abstract void executeAtterir();
    abstract void executeDoActivity();  //Activité
}
