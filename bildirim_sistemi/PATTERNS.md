# Uygulanan Tasarım Örüntüleri

## Faz 1: Creational — Factory Method

### Nerede uygulandı?
`BildirimFactory` sınıfında.

### Neden uygulandı?
`BildirimSistemi` sınıfı hangi bildirim nesnesini oluşturacağını bilmemeli.
Nesne yaratma sorumluluğu ana iş mantığından ayrılmalıydı.

### Ne kazanıldı?
- `BildirimSistemi` içindeki if-else zincirleri tamamen silindi.
- Yeni bir bildirim tipi eklemek için sadece yeni bir sınıf yazmak yeterli,
  mevcut kod değişmiyor.
- Polimorfizm sayesinde tüm bildirimler tek bir `gonder()` arayüzü 
  üzerinden çalışıyor.
  
  
  
  
## Faz 2: Structural — Decorator Pattern

### Nerede uygulandı?
`BildirimDecorator` ve `LoglamaBildirim` sınıflarında.

### Neden uygulandı?
Loglama işlemi her bildirim sınıfına gömülüydü. Mevcut sınıfları 
değiştirmeden loglama özelliği eklemek için Decorator kullanıldı.

### Ne kazanıldı?
- Email, SMS, Push sınıfları değiştirilmedi.
- Loglama ayrı bir katmana taşındı.
- İleride şifreleme, önbellek gibi özellikler de aynı yöntemle eklenebilir.

## Faz 2: Structural — Facade Pattern

### Nerede uygulandı?
`BildirimFacade` sınıfında.

### Neden uygulandı?
Factory ve Decorator'ı her seferinde birlikte kullanmak karmaşık.
Facade bu karmaşıklığı gizleyip tek bir basit arayüz sunuyor.

### Ne kazanıldı?
- Dışarıdan kullanan kod sadece facade.emailGonder() yazıyor.
- Factory ve Decorator detayları gizlendi.
- Sistem genişlese bile dış arayüz değişmiyor.




## Faz 3: Behavioral — Observer Pattern

### Nerede uygulandı?
`BildirimYayinci`, `BildirimGozlemci`, `EmailGozlemci`, `SmsGozlemci` sınıflarında.

### Neden uygulandı?
Bir event olduğunda (sipariş onayı gibi) tüm kanalların tek tek 
çağrılması gerekiyordu. Observer ile yayıncı gözlemcileri tanımadan 
hepsini tetikliyor.

### Ne kazanıldı?
- Yeni kanal eklemek için sadece yeni gözlemci yazılıyor, mevcut kod değişmiyor.
- OCP sağlandı: BildirimYayinci hiç değişmeden genişletilebilir.

## Faz 3: Behavioral — Strategy Pattern

### Nerede uygulandı?
`MesajFormatlayici`, `KisaFormat`, `HtmlFormat`, 
`FormatliBildirimGonderici` sınıflarında.

### Neden uygulandı?
Mesaj formatı runtime'da değişmesi gerekiyordu. 
if-else ile format seçmek yerine Strategy ile algoritma 
dışarıdan enjekte edildi.

### Ne kazanıldı?
- setFormatlayici() ile format runtime'da değiştirilebildi.
- Yeni format eklemek için mevcut kod değişmiyor, sadece 
  yeni sınıf yazılıyor. OCP tam olarak burada gösterildi.