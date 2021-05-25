package tugas10oop;
public class Dosen extends Civitas {
    private String nip;
    
    public Dosen(String nama, String prodi, String fakultas, String nip){
        super (nama, prodi, fakultas);
        this.nip = nip;
    }
    public String getNIP(){
        return this.nip;
    }
    public void setNIP(String a){
        this.nip = a;
    }
}
