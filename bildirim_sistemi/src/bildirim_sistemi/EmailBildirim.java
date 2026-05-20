package bildirim_sistemi;

public class EmailBildirim implements Bildirim {

    @Override
    public void gonder(String alici, String icerik) {
        System.out.println("[LOG] Email gönderiliyor.");
        System.out.println("SMTP bağlantısı kuruluyor.");
        System.out.println("Email gönderildi -> " + alici + ": " + icerik);
        System.out.println("[LOG] Email tamamlandı.");
    }
}