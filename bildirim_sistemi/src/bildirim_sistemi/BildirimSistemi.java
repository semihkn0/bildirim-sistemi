package bildirim_sistemi;

public class BildirimSistemi {

    public static void main(String[] args) {
        BildirimFacade facade = new BildirimFacade();
        
        facade.emailGonder("ali@gmail.com", "Siparişiniz alındı.");
        System.out.println();
        facade.smsGonder("+905001234567", "Kodunuz: 1234");
        System.out.println();
        facade.pushGonder("device-token-abc", "Yeni mesajınız var.");
    }
}