package org.example.state;

public class  EtatEnPiste extends State {

    public EtatEnPiste(AvionImpl avion) {
        super(avion);
    }

    @Override
    void executeSortirDuGarage() {
        System.out.println("Impossible de sortir du garage, je suis déjà en piste ");
    }

    @Override
    void executeEntrerAuGarage() {
        System.out.println("Transition d'état En piste => Garage");
        avion.setState(new EtatAuGarage(avion));
    }

    @Override
    void executeDecoller() {
        System.out.println("Transition d'état En piste => Décollage");
        avion.setState(new EtatEnLair(avion));
    }

    @Override
    void executeAtterir() {
        System.out.println("Impossible, je suis déjà en piste");
    }

    @Override
    void executeDoActivity() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Activité de l'état en piste ..."+i);
        }
    }
}
