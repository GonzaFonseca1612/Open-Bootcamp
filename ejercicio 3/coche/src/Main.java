public class Main {
    public static void main(String[] args) {
        coche miCoche = new coche();
        miCoche.incrementarPuertas();
        System.out.println(miCoche.puertas);
    }
}
class coche {
    public int puertas = 4;

    public void incrementarPuertas() {
        this.puertas++;
    }
}