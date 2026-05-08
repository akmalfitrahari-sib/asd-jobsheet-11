import java.util.Scanner;
public class MainQueueLL {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

        QueueLinkedList antrian = new QueueLinkedList(10);

        int pilih;

        do {
            System.out.println("\n=== ANTRIAN LAYANAN KEMAHASISWAAN ===");
            System.out.println("1. Tambah Antrian");
            System.out.println("2. Panggil Antrian");
            System.out.println("3. Tampilkan Semua Antrian");
            System.out.println("4. Tampilkan Antrian Terdepan");
            System.out.println("5. Tampilkan Antrian Terakhir");
            System.out.println("6. Cek Jumlah Antrian");
            System.out.println("7. Cek Antrian Kosong");
            System.out.println("8. Cek Antrian Penuh");
            System.out.println("9. Kosongkan Antrian");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilih = sc.nextInt();
            sc.nextLine();

            switch (pilih) {

                case 1:
                    if (antrian.isFull()) {
                        System.out.println("Antrian sudah penuh!");
                    } else {
                        System.out.print("NIM      : ");
                        String nim = sc.nextLine();
                        System.out.print("Nama     : ");
                        String nama = sc.nextLine();
                        System.out.print("Jurusan  : ");
                        String jurusan = sc.nextLine();
                        
                        Mahasiswa mhs = new Mahasiswa(nim, nama, jurusan);
                        antrian.enqueue(mhs);
                    }
                    break;

                case 2:
                    antrian.dequeue();
                    break;

                case 3:
                    antrian.printQueue();
                    break;

                case 4:
                    antrian.peekFront();
                    break;

                case 5:
                    antrian.peekRear();
                    break;

                case 6:
                    System.out.println("Jumlah mahasiswa mengantri: "+ antrian.getSize());
                    break;

                case 7:
                    if (antrian.isEmpty()) {
                        System.out.println("Antrian kosong");
                    } else {
                        System.out.println("Antrian tidak kosong");
                    }
                    break;

                case 8:
                    if (antrian.isFull()) {
                        System.out.println("Antrian penuh");
                    } else {
                        System.out.println("Antrian belum penuh");
                    }
                    break;

                case 9:
                    antrian.clear();
                    break;

                case 0:
                    System.out.println("Program selesai");
                    break;

                default:
                    System.out.println("Menu tidak valid");
            }
        } while (pilih != 0);
        sc.close();
    }
}

