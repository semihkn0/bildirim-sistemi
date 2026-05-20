package bildirim_sistemi;

public class HtmlFormat implements MesajFormatlayici {

    @Override
    public String formatla(String mesaj) {
        return "<html><body><p>" + mesaj + "</p></body></html>";
    }
}