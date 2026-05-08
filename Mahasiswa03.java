public class Mahasiswa03 {
    String nim;
    String nama;
    String kelas;
    double ipk;
    
    public Mahasiswa03(){
    }

    public Mahasiswa03(String nm, String name, String kls, double ip){
        nim = nm;
        nama = name;
        kelas = kls;
        ipk = ip;
    }

    public void tampilInformasi(){
        System.out.printf("%-10s %-10s %-5s %-3.1f\n",
        nama, nim, kelas, ipk);
    }
}
