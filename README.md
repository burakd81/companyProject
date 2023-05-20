## Proje Yapısı

Proje, MVC (Model-View-Controller) tasarım deseni üzerine kuruludur. Aşağıda, proje yapısının ana bileşenleri mevcut:

### Model
  Projede, şirketler ve çalışanlar tablolarını temsil eden Java Entity sınıflarını içeriyor. 
  Bu sınıflar, veritabanı tablolarıyla uyumlu olarak tasarlanmıştır ve veri işlemleri için kullanılır.

### Controller
  Gelen istekleri karşılaması ve işlemleri gerçekleştirmesi için oluşturulmuştur.
  Proje, şirket ve çalışanlarla ilgili işlemleri gerçekleştiren ayrı controller sınıfları içerir. 
  Controller sınıfları, uygun servisleri çağırarak işlemleri gerçekleştirir ve sonuçları döndürür.
  
### Service
  İş mantığını içeriyor.
  Controller sınıfları tarafından çağrılan servisler, veri işlemlerini gerçekleştirir ve gerekli dönüş değerlerini sağlar. 
  Proje, şirket ve çalışanlarla ilgili ayrı servis sınıflarını içerir.

### Repository
  Veritabanı işlemlerini gerçekleştirmek için kullanıldı.
  Proje, şirket ve çalışanlar için ayrı repository sınıflarını içerir.
  Spring Data JPA kullanarak veri erişimi sağlar.
  
## Proje Ayağa Kaldırma
  1- Projenin kaynak kodunu indirin.
  2- Bir IDE 'de projeyi açın.
  3- Proje bağımlılıkları yöneten Maven dosyasından bağımlılıkların yüklendiğinden emin olun.
  4- Veritabanı ayarları için "application.properties" dosyasını yapılandırın.
  5- Proje başlatma sınıfını (Application.java gibi) bulun ve çalıştırın. Bu, projeyi başlatacaktır.
  
## API Kullanımı
  API'nin sağladığı servisleri kullanmak için aşağıdaki adımları izleyebilirsiniz:

  1- Şirket Ekleme:
    URL: POST /api/company
    Request Body: Şirket bilgilerini içeren JSON verisi
    Response: Ekleme işleminin başarılı olup olmadığına dair bir mesaj ve oluşturulan şirketin detayları
  
  2- Şirket Güncelleme:

    URL: PUT /api/company/{id}
    Request Body: Güncellenen şirket bilgilerini içeren JSON verisi
    Response: Güncelleme işleminin başarılı olup olmadığına dair bir mesaj ve güncellenen şirketin detayları
    
  3- Şirket Silme:
  
    URL: DELETE /api/company/{id}
    Response: Silme işleminin başarılı olup olmadığına dair bir mesaj
    
  4- Şirket Listeleme:
  
    URL: GET /api/company
    Response: Şirketlerin listesi
    
  5- Çalışan Ekleme:

    URL: POST /api/employee
    Request Body: Çalışan bilgilerini içeren JSON verisi
    Response: Ekleme işleminin başarılı olup olmadığına dair bir mesaj ve oluşturulan çalışanın detayları
    
  6- Çalışan Güncelleme:

    URL: PUT /api/employee/{id}
    Request Body: Güncellenen çalışan bilgilerini içeren JSON verisi
    Response: Güncelleme işleminin başarılı olup olmadığına dair bir mesaj ve güncellenen çalışanın detayları
    
  7- Çalışan Silme:

    URL: DELETE /api/employee/{id}
    Response: Silme işleminin başarılı olup olmadığına dair bir mesaj
  
  8- Çalışan Listeleme:

    URL: GET /api/employee
    Response: Çalışanların listesi

  
