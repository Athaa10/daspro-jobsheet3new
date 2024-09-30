import java.util.Scanner;
public class KerjaKaryawan03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float bonus = 10 / 100f, pajak = 5/100f;
        double gaji, bonusan, totalGaji;

        System.out.println("Masukkan jam kerja karyawan; ");
        int jamKerja = sc.nextInt();
        System.out.println("Masukkan upah per jam karyawan; ");
        int upahPerJam = sc.nextInt();

        gaji = jamKerja * upahPerJam ;
        bonusan = gaji + (gaji * bonus) ;
        totalGaji = bonusan - (bonusan * pajak);

        System.out.println("Total gaji karyawan adalah Rp" + totalGaji);
    }
}
