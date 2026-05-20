package bildirim_sistemi;

public class BildirimSistemi {

    public static void main(String[] args) {
        
        // === OBSERVER ===
        System.out.println("=== OBSERVER PATTERN ===");
        BildirimYayinci yayinci = new BildirimYayinci();
        yayinci.ekle(new EmailGozlemci("ali@example.com"));
        yayinci.ekle(new SmsGozlemci("+905001234567"));
        
        yayinci.bildirimGonder("Siparişiniz onaylandı!");
        
        System.out.println();
        
        // === STRATEGY ===
        System.out.println("=== STRATEGY PATTERN ===");
        Bildirim email = BildirimFactory.olustur("EMAIL");
        
        FormatliBildirimGonderici gonderici = 
            new FormatliBildirimGonderici(new KisaFormat());
        gonderici.gonder(email, "ali@example.com", 
            "Bu mesaj çok uzun olduğu için kısaltılacak, " +
            "sadece ilk 50 karakter görünecek.");
        
        System.out.println();
        
        // Runtime'da format değişiyor — OCP gösterimi
        gonderici.setFormatlayici(new HtmlFormat());
        gonderici.gonder(email, "ali@example.com", "Yeni mesajınız var.");
    }
}