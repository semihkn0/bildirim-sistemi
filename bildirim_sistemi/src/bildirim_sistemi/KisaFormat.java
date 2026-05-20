package bildirim_sistemi;

public class KisaFormat implements MesajFormatlayici {

    @Override
    public String formatla(String mesaj) {
        if (mesaj.length() > 50) {
            return mesaj.substring(0, 50) + "...";
        }
        return mesaj;
    }
}