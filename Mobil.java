package CarDealer;
class Mobil extends Kendaraan {
    private int jumlahPintu;

    public Mobil(String merek, String warna, int jumlahPintu) {
        super(merek, warna);
        this.jumlahPintu = jumlahPintu;
    }

    public void jenis() {
        System.out.println("Ini adalah mobil dengan " + jumlahPintu + " pintu.");
    }
}
