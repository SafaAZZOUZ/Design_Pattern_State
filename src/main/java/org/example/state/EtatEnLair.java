package org.example.state;

public   class EtatEnLair extends State{


    public EtatEnLair(AvionImpl avion) {
        super(avion);
    }

    @Override
    void executeSortirDuGarage() {
        System.out.println("Impossible de sortir du garage, je suis  en l'air ");

    }

    @Override
    void executeEntrerAuGarage() {
        System.out.println("Impossible d'entrer du garage, je suis  en l'air ");
    }
    @Override
    void executeDecoller() {
        System.out.println("Impossible décoller, je suis déjà en l'air ");

    }

    @Override
    void executeAtterir() {
        System.out.println("Transistion d'état de Garage =>Piste");
        avion.setState(new EtatEnPiste(avion));
    }

    @Override
    void executeDoActivity() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Activité de l'état en l'air ...");
        }
    }
}
