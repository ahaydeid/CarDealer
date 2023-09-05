package CarDealer;
class Kendaraan {
    private String merek;
    private String warna;

    public Kendaraan(String merek, String warna) {
        this.merek = merek;
        this.warna = warna;
    }

    public String getMerek() {
        return merek;
    }

    public String getWarna() {
        return warna;
    }

    public void info() {
        System.out.println("Merek: " + merek);
        System.out.println("Warna: " + warna);
    }
}
