package bildirim_sistemi;

public class FormatliBildirimGonderici {

    private MesajFormatlayici formatlayici;

    public FormatliBildirimGonderici(MesajFormatlayici formatlayici) {
        this.formatlayici = formatlayici;
    }

    public void setFormatlayici(MesajFormatlayici formatlayici) {
        this.formatlayici = formatlayici;
    }

    public void gonder(Bildirim bildirim, String alici, String mesaj) {
        String formatliMesaj = formatlayici.formatla(mesaj);
        bildirim.gonder(alici, formatliMesaj);
    }
}