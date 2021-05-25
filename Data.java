package tugas10oop;
import java.io.*;
import java.util.ArrayList;
public class Data {

    static ArrayList<Mahasiswa> mhs = new ArrayList<Mahasiswa>();
    static ArrayList<Dosen> dsn = new ArrayList<Dosen>();

    public static void initMahasiswa() {
        try {
            File newFile = new File("mhs.txt");
            newFile.createNewFile();
        } catch (IOException e) {
            System.out.println("wtf happened bro?");
        }
        try{
        FileReader read = new FileReader("mhs.txt");
        BufferedReader buffread = new BufferedReader(read);
        String a;

        while ((a = buffread.readLine()) != null) {
            pecahMahasiswa(a);
        }
        buffread.close();
        }catch(IOException a){
            
        }
    }

    public static void pecahMahasiswa(String data) {
        java.util.Scanner input = new java.util.Scanner(data);
        input.useDelimiter("-");

        String NIM = input.next();
        String nama = input.next();
        String prodi = input.next();
        String fakultas = input.next();

        Mahasiswa a = new Mahasiswa(nama, prodi, fakultas, NIM);

        mhs.add(a);
    }

    public static void simpanMhs() {
        try {
            //File newFile = new File("mhs.txt");
            new FileWriter("mhs.txt", false).close();
            FileWriter write = new FileWriter("mhs.txt");
            for (int i = 0; i < mhs.size(); i++) {
                String a = mhs.get(i).getNIM() + "-" + mhs.get(i).getNama() + "-" + mhs.get(i).getProdi() + "-" + mhs.get(i).getFakultas() + "\n";
                write.write(a);
            }
            write.close();
        } catch (IOException e) {

        }
    }

    public static void initDosen() {
        try {
            File newFile = new File("dsn.txt");
            newFile.createNewFile();
        } catch (IOException e) {
            System.out.println("wtf happened sis?");
        }
        try{
        FileReader read = new FileReader("dsn.txt");
        BufferedReader buffRead = new BufferedReader(read);
        String a;
        while ((a = buffRead.readLine()) != null){
            pecahDosen(a);
        }
        buffRead.close();
        }catch(IOException e){
            
        }
    }

    public static void pecahDosen(String data) {
        java.util.Scanner input = new java.util.Scanner(data);
        input.useDelimiter("-");

        String NIP = input.next();
        String nama = input.next();
        String prodi = input.next();
        String fakultas = input.next();

        Dosen a = new Dosen(nama, prodi, fakultas, NIP);

        dsn.add(a);
    }

    public static void simpanDosen() {
        try{
        new FileWriter("dsn.txt", false).close();
        FileWriter write = new FileWriter("dsn.txt");        
        for (int i = 0; i < dsn.size(); i++){
            String NIP = dsn.get(i).getNIP();
            String nama = dsn.get(i).getNama();
            String prodi = dsn.get(i).getProdi();
            String fakultas = dsn.get(i).getFakultas();
            
            write.write(NIP + "-" + nama + "-" + prodi + "-" + fakultas + "\n");
        }
        write.close();
        }catch (IOException e){
            
        }
    }
}
