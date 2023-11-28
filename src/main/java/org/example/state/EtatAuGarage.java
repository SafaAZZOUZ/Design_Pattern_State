package org.example.state;

public  class EtatAuGarage extends State{


    public EtatAuGarage(AvionImpl avion) {
        super(avion);
    }

    @Override
    void executeSortirDuGarage() {
        System.out.println("Transistion d'état de Garage =>Piste");
        avion.setState(new EtatEnPiste(avion));
    }

    @Override
    void executeEntrerAuGarage() {
        System.out.println("Impossible, je suis déjà en garage");

    }

    @Override
    void executeDecoller() {
        System.out.println("Impossible de decoller, je suis au garage");

    }

    @Override
    void executeAtterir() {
        System.out.println("Impossible d'atterir, je suis au garage");

    }

    @Override
    void executeDoActivity() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Activité de l'état en garage ..."+i);
        }
    }
}
