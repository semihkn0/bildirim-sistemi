# Faz 3 AI Kaydı

## Pair Programming Özeti

### Ne Tartıştık?
Observer ve Strategy'nin bildirim sistemine nasıl uyacağını tartıştık.
Önce Observer'ın publisher-subscriber yapısını, sonra Strategy'nin
runtime davranış değişimini konuştuk.

### Nasıl İlerledi?
AI önce temel yapıyı önerdi. Ben BildirimYayinci içinde gözlemci 
listesini ArrayList ile yönetmeyi kendim karar verdim. 
FormatliBildirimGonderici'de setFormatlayici() metodunu 
OCP'yi göstermek için ben ekledim.

### AI Olmadan Ne Kadar Sürerdi?
Observer için doğru publisher-subscriber yapısını kurmak 
2-3 saat sürebilirdi. AI ile 30 dakikada oturdu.

### AI Bizi Nerede Yanılttı?
AI başta Strategy için ayrı bir context sınıfı önermedi,
doğrudan bildirim sınıfına gömmek istedi. Ben ayrı bir
FormatliBildirimGonderici sınıfı yapmanın daha temiz 
olduğuna karar verdim.