package bildirim_sistemi;

public class BildirimSistemi {

    public void mesajGonder(String tip, String alici, String icerik) {
        if (tip.equals("EMAIL")) {
            System.out.println("[LOG] Email gönderiliyor.");
            System.out.println("SMTP bağlantısı kuruluyor.");
            System.out.println("Email gönderildi -> " + alici + ": " + icerik);
            System.out.println("[LOG] Email tamamlandı.");
        } else if (tip.equals("SMS")) {
            System.out.println("[LOG] SMS gönderiliyor.");
            System.out.println("GSM API'ye bağlanılıyor.");
            System.out.println("SMS gönderildi -> " + alici + ": " + icerik);
            System.out.println("[LOG] SMS tamamlandı.");
        } else if (tip.equals("PUSH")) {
            System.out.println("[LOG] Push bildirimi gönderiliyor.");
            System.out.println("Firebase'e bağlanılıyor.");
            System.out.println("Push gönderildi -> " + alici + ": " + icerik);
            System.out.println("[LOG] Push tamamlandı.");
        } else {
            System.out.println("Bilinmeyen bildirim tipi: " + tip);
        }
    }

    public static void main(String[] args) {
        BildirimSistemi sistem = new BildirimSistemi();
        sistem.mesajGonder("EMAIL", "ali@gmail.com", "Siparişiniz alındı.");
        sistem.mesajGonder("SMS", "+905001234567", "Kodunuz: 1234");
        sistem.mesajGonder("PUSH", "device-token-abc", "Yeni mesajınız var.");
    }
}