public class Kendaraan {
    private int id;
    private String nama;
    private String tipe;
    private double harga;

   
    public Kendaraan() {
        System.out.println("Object Kendaraan telah diciptakan, constructor berjalan");
    }

    public int getId() {
        return this.id;
    }

   
    public void setId(int id) {
        this.id = id;
    }

   
    public String getNama() {
        return this.nama;
    }

    
    public void setNama(String nama) {
        this.nama = nama;
    }

    
    public String getTipe() {
        return this.tipe;
    }

   
    public void setTipe(String tipe) {
        this.tipe = tipe;
    }

    public double getHarga() {
        return this.harga;
    }

    
    public void setHarga(double harga) {
        this.harga = harga;
    }

   
    public void tampilkanInfo() {
        System.out.println("ID: " + this.id);
        System.out.println("Nama: " + this.nama);
        System.out.println("Tipe: " + this.tipe);
        System.out.println("Harga: " + this.harga);
    }

  
    public void naikkanHarga() {
        this.harga += 5000; // Kenaikan default sebesar 5000
        System.out.println("Harga setelah kenaikan: " + this.harga);
    }


    public void naikkanHarga(double kenaikan) {
        this.harga += kenaikan;
        System.out.println("Harga setelah kenaikan: " + this.harga);
    }
}
