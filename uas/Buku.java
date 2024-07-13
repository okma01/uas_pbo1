public class Buku {
    private int id;
    private String judul;
    private String pengarang;
    private double harga;

    
    public Buku() {
        System.out.println("Object Buku telah diciptakan, constructor berjalan");
    }

    
    public int getId() {
        return this.id;
    }

    
    public void setId(int id) {
        this.id = id;
    }

    
    public String getJudul() {
        return this.judul;
    }

    
    public void setJudul(String judul) {
        this.judul = judul;
    }

    
    public String getPengarang() {
        return this.pengarang;
    }

   
    public void setPengarang(String pengarang) {
        this.pengarang = pengarang;
    }

    
    public double getHarga() {
        return this.harga;
    }

    
    public void setHarga(double harga) {
        this.harga = harga;
    }

   
    public void tampilkanInfo() {
        System.out.println("ID: " + this.id);
        System.out.println("Judul: " + this.judul);
        System.out.println("Pengarang: " + this.pengarang);
        System.out.println("Harga: " + this.harga);
    }

    
    public void naikkanHarga() {
        this.harga += 10000; 
        System.out.println("Harga setelah kenaikan: " + this.harga);
    }

    public void naikkanHarga(double kenaikan) {
        this.harga += kenaikan;
        System.out.println("Harga setelah kenaikan: " + this.harga);
    }
}
