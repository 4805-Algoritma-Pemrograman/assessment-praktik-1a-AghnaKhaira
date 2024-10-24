import java.util.Scanner;

public class Nomor2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int totalBeliau = 0, totalMereka = 0, totalKita = 0;
        final int BiayaPerKm = 13000;
        String input;
        
        do {
          
            System.out.print("Masukan nama driver [Beliau/Mereka/Kita]: ");
            String namaDriver = scanner.nextLine();
            
      
            System.out.print("Lama trip (km): ");
            int lamaTrip = scanner.nextInt();
            scanner.nextLine(); 
            
     
            switch (namaDriver) {
                case "Beliau":
                    totalBeliau += lamaTrip;
                    break;
                case "Mereka":
                    totalMereka += lamaTrip;
                    break;
                case "Kita":
                    totalKita += lamaTrip;
                    break;
                default:
                    System.out.println("Nama driver tidak valid. Silakan coba lagi.");
                    continue;

            }} while ("input".equalsIgnoreCase("Y"));
            
        
            System.out.print("Input lagi (Y/N)?: ");
            input = scanner.nextLine();
            
        
       
        int omzetBeliau = totalBeliau * BiayaPerKm;
        int omzetMereka = totalMereka * BiayaPerKm;
        int omzetKita = totalKita * BiayaPerKm;
        
     
        System.out.println("Total trip yang dilakukan driver:");
        System.out.println("Beliau: " + totalBeliau + " km");
        System.out.println("Mereka: " + totalMereka + " km");
        System.out.println("Kita: " + totalKita + " km");
        
     
        String driverTertinggi = "Tidak ada";
        int omzetTertinggi = 0;
        
        if (omzetBeliau > omzetTertinggi) {
            omzetTertinggi = omzetBeliau;
            driverTertinggi = "Beliau";
        }
        if (omzetMereka > omzetTertinggi) {
            omzetTertinggi = omzetMereka;
            driverTertinggi = "Mereka";
        }
        if (omzetKita > omzetTertinggi) {
            omzetTertinggi = omzetKita;
            driverTertinggi = "Kita";
        }
       
        System.out.println("Omzet tertinggi diperoleh oleh " + driverTertinggi + " dengan total Omzet = " + omzetTertinggi);
        
        scanner.close();;
}
}



ALGORITMA
 Program untuk menghitung omzet driver
 Inisialisasi variabel
driver_data = {
    "Beliau": 0,
    "Mereka": 0,
    "Kita": 0
}
biaya_per_km = 13000
while True:
     Input nama driver
    nama_driver = input("Masukan nama driver [Beliau/Mereka/Kita]: ")
       Input lama trip
    lama_trip = float(input("lama trip (km): "))
    Hitung omzet
    driver_data[nama_driver] += lama_trip
     Tanya input lagi
    input_lagi = input("Input lagi (Y/N)?: ").upper()
    if input_lagi != 'Y':
        break
 Hitung total trip dan omzet tertinggi
total_trip = sum(driver_data.values())omzet_tertinggi_driver = max(driver_data, key=lambda x: driver_data[x] * biaya_per_km)
omzet_tertinggi = driver_data[omzet_tertinggi_driver] * biaya_per_km
Output hasil
PRINT(f"Total trip yang dilakukan driver = {total_trip}")
PRINT(f"Omzet tertinggi diperoleh oleh {omzet_tertinggi_driver} dengan total Omzet = {omzet_tertinggi}")
