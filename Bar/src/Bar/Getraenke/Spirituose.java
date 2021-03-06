package Bar.Getraenke;

import Bar.Getraenk;

public abstract class Spirituose extends Getraenk {
    // Attribute
    private double alkoholGehalt;

    // Konstruktor
    public Spirituose(double alkoholGehalt, int volumen) {
        // Konstruktor der Superklasse aufrufen
        super(volumen);
        // Alkoholgehalt setzen
        this.alkoholGehalt = alkoholGehalt;
    }


    // Methoden
    public double getAlkoholGehalt() {
        return alkoholGehalt;
    }

}
