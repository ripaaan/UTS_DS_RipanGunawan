import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner masuk = new Scanner(System.in);
        int pilih;
        System.out.println("Daftar Mahasiswa;:");
        System.out.println(" 1.  Doni  ");
        System.out.println(" 2.  rizal");
        System.out.println(" 3.  Angga");
        System.out.println(" 4.  Alexa");
        System.out.println(" 5.  Indara ");
        System.out.println("masukan nama anda:");
        pilih = masuk.nextInt();
        if (pilih == 1)
            System.out.println("id anda adalah : 04");
        else if (pilih == 2)
            System.out.println("id anda adalah : 18");
        else if (pilih == 3)
            System.out.println("id anda adalah : 01a");
        else if (pilih == 4)
            System.out.println("id anda adalah : 01b");
        else if (pilih == 5)
            System.out.println("id anda adalah : 09");

        for (int i = 1; i > 0; i--) {
            for (int j = 1; j > 0; j++) {
                System.out.println("kelas anda adalah : teknik informatika a1 ");
                System.out.println("Tanggal anda masuk adalah : 22-07-2022");
                System.out.println("apakah data anda sesuai ?");
                System.out.println("1. ya");
                System.out.println("2. coba lagi");
                System.out.println("pilih:");
                pilih = masuk.nextInt();
                if (pilih == 1)
                    System.out.println("terima kasih");
                else if (pilih == 2)
                    System.out.println("masukan nama anda: ");
                pilih = masuk.nextInt();
                if (pilih == 1)
                    System.out.println("id anda adalah 04");
                else if (pilih == 2)
                    System.out.println("id anda adalah 18");
                else if (pilih == 3)
                    System.out.println("id anda adalah 01a");
                else if (pilih == 4)
                    System.out.println("id anda adalah 01b");
                else if (pilih == 5)
                    System.out.println("id anda adalah 09");

            }
        }
    }
}