package bildirim_sistemi;

public class BildirimSistemi {

    public static void main(String[] args) {
        Bildirim email = BildirimFactory.olustur("EMAIL");
        email.gonder("ali@gmail.com", "Siparişiniz alındı.");

        Bildirim sms = BildirimFactory.olustur("SMS");
        sms.gonder("+905001234567", "Kodunuz: 1234");

        Bildirim push = BildirimFactory.olustur("PUSH");
        push.gonder("device-token-abc", "Yeni mesajınız var.");
    }
}