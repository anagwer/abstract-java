public class DoraMini extends Robot{   
    public void sayDora(){
        System.out.println("Halo, Saya Dora Mini");   
    }   
    @Override
    public void setNama(String nama){
        super.nama = nama;   
    }   
    @Override
    public void displayData(){
        System.out.println("Nama: "+super.nama);
        System.out.println("Pemilik: "+super.pemilik);
        System.out.println("Tahun Produksi: "+super.tahun);   
    }
}