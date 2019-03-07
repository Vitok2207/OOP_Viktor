package Bar.Getraenke.Saefte;

import Bar.Getraenke.Saft;

public class Apfelsaft extends Saft {

    // Attribute
    private boolean trueb;

    // Konstruktor
    public Apfelsaft(boolean hatFruchtFleisch, int volumen) {
        // Konstruktor der Superklasse aufrufen
        super(hatFruchtFleisch, volumen);

        // Trueb setzen
        this.trueb = trueb;
    }

    // Methoden
    public boolean getTrueb() {
        return this.trueb;
    }

    @Override
    public void gebeInfo() {
        // Dieser Apfelsaft ist naturtrüb
        // Dieser Apfelsaft ist klar
        System.out.println("Dieser Apfelsaft ist " +
                (trueb ? "naturtrüb" : "klar") +
                " und hat " + (super.hatFruchtFleisch ? "" : "kein") + " Fruchtfleisch.");
        System.out.println("Das Volumen beträgt " + super.volumen + "ml.");
    }
}
