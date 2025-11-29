package proje4;

public class Main {
    public static void main(String[] args) {
        // 1. Önce Havaalanlarını oluştur
        Airlenescompanies istanbul = new Airlenescompanies(34, "İstanbul Havalimanı");
       Airlenescompanies ankara = new Airlenescompanies(06, "Esenboğa Havalimanı");

        // 2. Pilotları oluştur
        Pilot ahmetKaptan = new Pilot("Ahmet", "Senior");
        Pilot mehmetYrd = new Pilot("Mehmet", "Junior");

        // 3. Uçağı oluştur
        ucak ucak1 = new ucak("Boeing 737", UcakDurumu.CALISIYOR, 2);

        // 4. Şirketi oluştur ve kaynakları ekle
        şirket thy = new şirket(1, "THY");
        thy.ucakFilosu.add(ucak1);
        thy.pilotKadrosu.add(ahmetKaptan);
        thy.pilotKadrosu.add(mehmetYrd);
        ucus sefer101 = new ucus(101,  istanbul, ankara,ucak1, ahmetKaptan, mehmetYrd);

        System.out.println("Uçuş Oluşturuldu: " + sefer101.getId());
        System.out.println("Kalkış: " + sefer101.kalkisYeri.isim);
        System.out.println("Kaptan: " + sefer101.kaptanPilot.isim);
    }
}