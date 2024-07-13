public class Main1 {
    public static void main(String[] args) {
        Mobil mobil = new Mobil();

    
        mobil.setId(1);
        mobil.setNama("Toyota Camry");
        mobil.setTipe("Sedan");
        mobil.setHarga(300000000.0);
        mobil.setKapasitasMesin(2500);

        System.out.println("ID: " + mobil.getId());
        System.out.println("Nama: " + mobil.getNama());
        System.out.println("Tipe: " + mobil.getTipe());
        System.out.println("Harga: " + mobil.getHarga());
        System.out.println("Kapasitas Mesin: " + mobil.getKapasitasMesin() + " cc");

        mobil.tampilkanInfo();
        mobil.naikkanHarga(); 
        mobil.naikkanHarga(20000.0); 
    }
}
