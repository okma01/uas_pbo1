public class Tamu {
    private int id;
    private String nama;
    private String alamat;
    private double tagihan;

    
    public Tamu() {
        System.out.println("Object Tamu telah diciptakan, constructor berjalan");
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

    
    public String getAlamat() {
        return this.alamat;
    }

   
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    
    public double getTagihan() {
        return this.tagihan;
    }

    
    public void setTagihan(double tagihan) {
        this.tagihan = tagihan;
    }

    
    public void tampilkanInfo() {
        System.out.println("ID: " + this.id);
        System.out.println("Nama: " + this.nama);
        System.out.println("Alamat: " + this.alamat);
        System.out.println("Tagihan: " + this.tagihan);
    }

    
    public void naikkanTagihan() {
        this.tagihan += 10000; 
        System.out.println("Tagihan setelah kenaikan: " + this.tagihan);
    }

    public void naikkanTagihan(double kenaikan) {
        this.tagihan += kenaikan;
        System.out.println("Tagihan setelah kenaikan: " + this.tagihan);
    }
}
