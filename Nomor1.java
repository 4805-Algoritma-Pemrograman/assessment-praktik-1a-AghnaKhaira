import java.util.Scanner;

public class Nomor1{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Total jam lembur: ");
        int jamLembur = scanner.nextInt();
        double honorLembur;

        if (jamLembur <= 16) {
            honorLembur = jamLembur * 10000;
        } else {
            honorLembur = (16 * 10000) + ((jamLembur - 16) * 15000);
        }

        System.out.println("Honor lembur: " + honorLembur);;
}
}


ALGORITMA
INPUT jumlah jam libur
Jika jam lembur <= 16:
Honor lembur = jam lembur * 10.000
Jika jam lembur > 16:
Honor lembur = (16 * 10.000) + ((jam lembur - 16) * 15.000)
Tampilkan total jam lembur dan honor lembur
