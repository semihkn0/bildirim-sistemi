package bildirim_sistemi;

public class BildirimFacade {

    public void emailGonder(String alici, String icerik) {
        Bildirim email = BildirimFactory.olustur("EMAIL");
        Bildirim logluEmail = new LoglamaBildirim(email);
        logluEmail.gonder(alici, icerik);
    }

    public void smsGonder(String alici, String icerik) {
        Bildirim sms = BildirimFactory.olustur("SMS");
        Bildirim logluSms = new LoglamaBildirim(sms);
        logluSms.gonder(alici, icerik);
    }

    public void pushGonder(String alici, String icerik) {
        Bildirim push = BildirimFactory.olustur("PUSH");
        Bildirim logluPush = new LoglamaBildirim(push);
        logluPush.gonder(alici, icerik);
    }
}