package penilaian;
public class main {
    public static void main (String []args){
        NilaiAkhir sufyan = new NilaiAkhir("sufyan Nor","2110010181",85,90,92);
        System.out.println("Nama \t    = "+ sufyan.getNama());
        System.out.println("Npm \t    = "+ sufyan.getNpm()); 
        System.out.println("Nilai Akhir = "+ sufyan.hitungNilaiAkhir());
        

    }
    
}
