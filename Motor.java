package CarDealer;
class Motor extends Kendaraan {
    private boolean adaBox;

    public Motor(String merek, String warna, boolean adaBox) {
        super(merek, warna);
        this.adaBox = adaBox;
    }

    public void jenis() {
        if (adaBox) {
            System.out.println("Ini adalah motor dengan box.");
        } else {
            System.out.println("Ini adalah motor tanpa box.");
        }
    }
}
