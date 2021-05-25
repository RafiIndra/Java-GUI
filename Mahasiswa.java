package tugas10oop;
public class Mahasiswa extends Civitas {
    private String nim;
    
    public Mahasiswa(String nama, String prodi, String fakultas, String nim){
        super (nama, prodi, fakultas);
        this.nim = nim;
    }
    
    public String getNIM(){
        return this.nim;
    }
    public void setNIM(String a){
        this.nim = a;
    }
}
