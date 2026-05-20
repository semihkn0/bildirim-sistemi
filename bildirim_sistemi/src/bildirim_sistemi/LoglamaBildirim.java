package bildirim_sistemi;

public class LoglamaBildirim extends BildirimDecorator {

    public LoglamaBildirim(Bildirim bildirim) {
        super(bildirim);
    }

    @Override
    public void gonder(String alici, String icerik) {
        System.out.println("=== LOGLAMA BAŞLADI ===");
        System.out.println("Alici: " + alici);
        System.out.println("Icerik: " + icerik);
        bildirim.gonder(alici, icerik);
        System.out.println("=== LOGLAMA BİTTİ ===");
    }
}