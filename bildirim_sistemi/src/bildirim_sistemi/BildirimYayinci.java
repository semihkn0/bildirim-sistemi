package bildirim_sistemi;

import java.util.ArrayList;
import java.util.List;

public class BildirimYayinci {

    private List<BildirimGozlemci> gozlemciler = new ArrayList<>();

    public void ekle(BildirimGozlemci gozlemci) {
        gozlemciler.add(gozlemci);
    }

    public void cikar(BildirimGozlemci gozlemci) {
        gozlemciler.remove(gozlemci);
    }

    public void bildirimGonder(String mesaj) {
        for (BildirimGozlemci g : gozlemciler) {
            g.bildirimAl(mesaj);
        }
    }
}