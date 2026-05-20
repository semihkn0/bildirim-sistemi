package bildirim_sistemi;

public class EmailGozlemci implements BildirimGozlemci {

    private String email;

    public EmailGozlemci(String email) {
        this.email = email;
    }

    @Override
    public void bildirimAl(String mesaj) {
        Bildirim b = BildirimFactory.olustur("EMAIL");
        b.gonder(email, mesaj);
    }
}