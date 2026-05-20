package bildirim_sistemi;

public class BildirimFactory {

    public static Bildirim olustur(String tip) {
        switch (tip.toUpperCase()) {
            case "EMAIL":
                return new EmailBildirim();
            case "SMS":
                return new SmsBildirim();
            case "PUSH":
                return new PushBildirim();
            default:
                throw new IllegalArgumentException("Bilinmeyen bildirim tipi: " + tip);
        }
    }
}