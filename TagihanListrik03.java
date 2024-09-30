import java.util.Scanner;
public class TagihanListrik03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double totalTagihan, tarifListrik = 1500;

        System.out.println("Masukkan jumlah penggunaan listrik dalam kWh: ");
        double jumlahListrik = input.nextDouble();

        totalTagihan = jumlahListrik * tarifListrik;
        System.out.println("Total tagihan listrik Rp" + totalTagihan);

        if (jumlahListrik>500) {
            System.out.println("Penggunaan listrik melebihi 500kWh");
        }

    }
}
