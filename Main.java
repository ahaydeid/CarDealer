package CarDealer;
public class Main {
    public static void main(String[] args) {
        Kendaraan kendaraan1 = new Kendaraan("Kendaraan", "Hitam");
        kendaraan1.info();
        System.out.println();

        Mobil mobil1 = new Mobil("Toyota", "Merah", 4);
        mobil1.info();
        mobil1.jenis();
        System.out.println();

        Motor motor1 = new Motor("Honda", "Biru", true);
        motor1.info();
        motor1.jenis();
        System.out.println();

        Motor motor2 = new Motor("Yamaha", "Hijau", false);
        motor2.info();
        motor2.jenis();
    }
}
