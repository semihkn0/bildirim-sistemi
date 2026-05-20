package bildirim_sistemi;

public abstract class BildirimDecorator implements Bildirim {

    protected Bildirim bildirim;

    public BildirimDecorator(Bildirim bildirim) {
        this.bildirim = bildirim;
    }

    @Override
    public void gonder(String alici, String icerik) {
        bildirim.gonder(alici, icerik);
    }
}