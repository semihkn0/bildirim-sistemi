package bildirim_sistemi;

public class PushBildirim implements Bildirim {

    @Override
    public void gonder(String alici, String icerik) {
        System.out.println("[LOG] Push bildirimi gönderiliyor.");
        System.out.println("Firebase'e bağlanılıyor.");
        System.out.println("Push gönderildi -> " + alici + ": " + icerik);
        System.out.println("[LOG] Push tamamlandı.");
    }
}