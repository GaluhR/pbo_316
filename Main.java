public class Main {
    public static void main(String[] args) {
        Kucing kucing = new Kucing();
        Kambing kambing = new Kambing();
        Ayam ayam = new Ayam();

        System.out.print("Suara Kucing: ");
        kucing.ciriSuara();

        System.out.print("Suara Kambing: ");
        kambing.ciriSuara();

        System.out.print("Suara Ayam: ");
        ayam.ciriSuara();
    }
}