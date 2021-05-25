package tugas10oop;
public class Civitas {
    private String nama;
    private String prodi;
    private String fakultas;
    
    public Civitas(String nama, String prodi, String fakultas){
        this.nama = nama;
        this.prodi = prodi;
        this.fakultas = fakultas;
    }
    
    public String getNama(){
        return this.nama;
    }
    
    public void setNama(String a){
        this.nama = a;
    }
    
    public String getProdi(){
        return this.prodi;
    }
    
    public void setProdi(String a){
        this.prodi = a;
    }
    
    public String getFakultas(){
        return this.fakultas;
    }
    public void setFakultas(String a){
        this.fakultas = a;
    }
}
