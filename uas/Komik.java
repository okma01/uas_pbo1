public class Komik extends Buku {
    private int volume;

   
    public Komik() {
        super();
        System.out.println("Object Komik telah diciptakan, constructor berjalan");
    }

    
    public int getVolume() {
        return this.volume;
    }

 
    public void setVolume(int volume) {
        this.volume = volume;
    }

    
    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Volume: " + this.volume);
    }

    
    @Override
    public void naikkanHarga() {
       
        this.setHarga(this.getHarga() + 5000);
        System.out.println("Harga Komik setelah kenaikan: " + this.getHarga());
    }

   
    @Override
    public void naikkanHarga(double kenaikan) {
        this.setHarga(this.getHarga() + kenaikan);
        System.out.println("Harga Komik setelah kenaikan: " + this.getHarga());
    }
}
