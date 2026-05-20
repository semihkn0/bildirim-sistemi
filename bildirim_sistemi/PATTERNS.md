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