package bildirim_sistemi;

public class SmsGozlemci implements BildirimGozlemci {

    private String telefon;

    public SmsGozlemci(String telefon) {
        this.telefon = telefon;
    }

    @Override
    public void bildirimAl(String mesaj) {
        Bildirim b = BildirimFactory.olustur("SMS");
        b.gonder(telefon, mesaj);
    }
}