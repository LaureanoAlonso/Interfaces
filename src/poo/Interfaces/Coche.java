package poo.Interfaces;

public class Coche {

    String DeQuien;
    String fabricante;
    String modelo;
    double cc;
    int year;
    boolean sedan;
    int MaxSpeed;

    public Coche (Coche mio){
    }

    public Coche(String fabricante, String modelo, double cc, int year, boolean sedan, int speed) {
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.cc = cc;
        this.year = year;
        this.sedan = sedan;
        this.MaxSpeed = speed;
    }

    public Coche(String mio, String renault, String fluence, double v, int i, boolean b, int i1) {
    }


    @Override
    public String toString() {
        return "Coche{" +
                "DeQuien='" + DeQuien + '\'' +
                ", fabricante='" + fabricante + '\'' +
                ", modelo='" + modelo + '\'' +
                ", cc=" + cc +
                ", year=" + year +
                ", sedan=" + sedan +
                ", MaxSpeed=" + MaxSpeed +
                '}';
    }
}

