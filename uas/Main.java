public class Main {
    public static void main(String[] args) {
        Komik komik = new Komik();

        komik.setId(1);
        komik.setJudul("Naruto");
        komik.setPengarang("Masashi Kishimoto");
        komik.setHarga(50000.0);
        komik.setVolume(72);

        System.out.println("ID: " + komik.getId());
        System.out.println("Judul: " + komik.getJudul());
        System.out.println("Pengarang: " + komik.getPengarang());
        System.out.println("Harga: " + komik.getHarga());
        System.out.println("Volume: " + komik.getVolume());

        komik.tampilkanInfo();
        komik.naikkanHarga(); 
        komik.naikkanHarga(7000.0); 
    }
}
