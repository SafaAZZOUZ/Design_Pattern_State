package org.example;

import org.example.state.Avion;
import org.example.state.AvionImpl;

public class Test {
    public static void main(String[] args) {

        Avion avion=new AvionImpl();
        avion.doActivity();
        System.out.println("----------------");
        avion.sortirDuGarage();
        System.out.println("-----------------");
        avion.doActivity();
        System.out.println("------------------");
        avion.entrerAuGarage();
        System.out.println("------------------");
        avion.doActivity();
        System.out.println("------------------");
        avion.decoller();
        System.out.println("------------------");
        avion.atterir();
        avion.sortirDuGarage();
        avion.doActivity();
        avion.decoller();
        avion.atterir();
        avion.doActivity();
    }
}
