import java.util.Scanner;

public class BioskopWithScannerModif2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int baris, kolom;
        String nama;
        String[][] penonton = new String[4][2]; 

        while (true) {
            System.out.println("\n=== Menu ===");
            System.out.println("1. Input data penonton");
            System.out.println("2. Tampilkan daftar penonton");
            System.out.println("3. Exit");
            System.out.print("Pilih menu (1/2/3): ");
            int pilihan = sc.nextInt();
            sc.nextLine(); 

            switch (pilihan) {
                case 1:
                   
                    System.out.print("Masukkan nama: ");
                    nama = sc.nextLine();

                    while (true) {
                        System.out.print("Masukkan baris (1-4): ");
                        baris = sc.nextInt();
                        if (baris < 1 || baris > 4) {
                            System.out.println("Baris tidak tersedia. Silakan pilih baris antara 1-4.");
                        } else {
                            break; 
                        }
                    }

                    while (true) {
                        System.out.print("Masukkan kolom (1-2): ");
                        kolom = sc.nextInt();
                        if (kolom < 1 || kolom > 2) {
                            System.out.println("Kolom tidak tersedia. Silakan pilih kolom antara 1-2.");
                        } else {
                            break; 
                        }
                    }

                    if (penonton[baris - 1][kolom - 1] != null) {
                        System.out.println("Tempat duduk sudah terisi!");
                    } else {
                        penonton[baris - 1][kolom - 1] = nama;
                        System.out.println("Tempat duduk telah diisi oleh " + nama);
                    }
                    break;

                case 2:
                    System.out.println("\nTata Letak Kursi: ");
                    for (int i = 0; i < 4; i++) {
                        for (int j = 0; j < 2; j++) {
                            System.out.print((penonton[i][j] == null ? "null" : penonton[i][j]) + "\t");
                        }
                        System.out.println();
                    }
                    break;

                case 3:
                    System.out.println("Terima kasih! Program selesai.");
                    sc.close();
                    return;

                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih menu yang benar.");
            }
        }
    }
}