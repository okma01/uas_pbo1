public class Mobil extends Kendaraan {
    private int kapasitasMesin;

   
    public Mobil() {
        super();
        System.out.println("Object Mobil telah diciptakan, constructor berjalan");
    }

    
    public int getKapasitasMesin() {
        return this.kapasitasMesin;
    }

    
    public void setKapasitasMesin(int kapasitasMesin) {
        this.kapasitasMesin = kapasitasMesin;
    }

   
    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Kapasitas Mesin: " + this.kapasitasMesin + " cc");
    }

    
    @Override
    public void naikkanHarga() {
        
        this.setHarga(this.getHarga() + 10000);
        System.out.println("Harga Mobil setelah kenaikan: " + this.getHarga());
    }

    
    @Override
    public void naikkanHarga(double kenaikan) {
        this.setHarga(this.getHarga() + kenaikan);
        System.out.println("Harga Mobil setelah kenaikan: " + this.getHarga());
    }
}
