package bildirim_sistemi;

public class SmsBildirim implements Bildirim {

    @Override
    public void gonder(String alici, String icerik) {
        System.out.println("[LOG] SMS gönderiliyor.");
        System.out.println("GSM API'ye bağlanılıyor.");
        System.out.println("SMS gönderildi -> " + alici + ": " + icerik);
        System.out.println("[LOG] SMS tamamlandı.");
    }
}