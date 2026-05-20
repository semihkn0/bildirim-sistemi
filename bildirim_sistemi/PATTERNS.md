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