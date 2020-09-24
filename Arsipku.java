
package arsipku;

public class Arsipku implements Biodata, Nilai {
    
    
    public static void main(String[] args) {
        Arsipku ps = new Arsipku();
        ps.Biodata();
        ps.nama();
        ps.tempatLahir();
        ps.hobi();
        ps.Nilai();
        ps.agama();
        ps.BahasaIndonesia();
        ps.matematika();
    }
    public void Biodata (){
        System.out.println("Biodata");
    }
    public void nama (){
        System.out.println("Nama         : Sukma Yunita");
    }
    public void tempatLahir (){
        System.out.println("Tempat Lahir : Jember");
    }
    public void hobi (){
        System.out.println("Hobi         : Volly");
    }
    public void Nilai (){
        System.out.println("Nilai");
    }
    public void agama (){
        System.out.println("Agama            : 80");
    }
    public void BahasaIndonesia (){
        System.out.println("Bahasa Indonesia : 85");
    }
    public void matematika () {
        System.out.println("Matematika       : 86");
    }
}
