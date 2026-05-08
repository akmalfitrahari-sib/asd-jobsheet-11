public class Mahasiswa {
    String nim;
    String nama;
    String jurusan;

    public Mahasiswa(String nim, String nama, String jurusan) {
        this.nim = nim;
        this.nama = nama;
        this.jurusan = jurusan;
    }

    public void tampilData() {
        System.out.printf("%-12s %-15s %-10s\n",
                nim, nama, jurusan);
    }
}

