# Tasarım Sorunları (Faz 0)

## Kendi Tespitlerim

1. **Açık/Kapalı Prensibi İhlali:** Yeni bir bildirim tipi (WhatsApp, Telegram gibi) 
eklemek için mevcut if-else bloğunu değiştirmek zorundayız. Bu mevcut kodu bozma riskini artırıyor.

2. **Tek Sorumluluk Prensibi İhlali:** BildirimSistemi sınıfı hem bağlantı kuruyor, 
hem mesaj gönderiyor hem de loglama yapıyor. Tek sınıf çok fazla iş yapıyor.

3. **Sıkı Bağımlılık:** Loglama işlemi doğrudan mesajGonder metoduna gömülmüş, 
ayrı bir yapıya taşınamıyor.

4. **Nesne Yaratma Karmaşası:** Tüm bildirim tipleri tek bir metotta yönetiliyor, 
her tip için nesne yönelimli bir yapı yok.

5. **Okunabilirlik Sorunu:** if-else zincirleri büyüdükçe kod spagetti hale geliyor, 
yeni geliştirici kodu anlamakta zorlanır.

## AI Değerlendirmesi

**Prompt:** "Bu kodda hangi tasarım sorunlarını görüyorsun? Hangi tasarım örüntüleri 
bu sorunları çözebilir?"

**AI'ın Tespitleri:**
1. Open/Closed Principle ihlali → Factory Method + Interface ile çözülebilir
2. Single Responsibility ihlali → Her bildirim tipi kendi sınıfına taşınmalı
3. Polimorfizm kullanılmıyor → Ortak Bildirim interface'i tanımlanmalı
4. Loglama iş mantığına karışmış → Decorator Pattern ile ayrıştırılabilir