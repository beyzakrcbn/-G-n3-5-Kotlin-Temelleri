Kotlin Temelleri Notlarım:


Lambda Expressions: Anonim ismi olmayan fonksiyonlardır.

val kare = { x: Int -> x * x }  |  Bu ifadedeki `{ x: Int -> x * x }` Lambda Expressions ifadesidir.
println(kareAl(4))           

Kotlin javaya kıyasla , lambda ifadeleriyle daha sade ve okunabilir kod yazmayı sağlar.


Null Safety:

 `String`   Null olamaz.                          
 `String?`  Null olabilir.                
 `?.`       Null değilse işlemi yap, değilse null döner.
 `?:`       Null ise alternatif bir değer döndür.     
 `!!`       Eminim null değildir, çalıştır (ama riskli).

 Anahtar Kelime  Açıklama                                                  

 `var`           Değişken değeri sonradan değiştirilebilir.               
 `val`           Değişken değeri sonradan değiştirilemez. Tek sefer atanır.
 `fun`           Fonksiyon tanımlanır.                                     
 `if-else`       Koşul yapısıdır.                                          
 `when`          Java’daki switch-case’in Kotlin karşılığıdır.            
 `for`           Döngü başlatmak için kullanılır.                          
 `while`         Şart sağlandığı sürece döngü devam eder.                 
 `arrayOf()`     Dizi tanımlar.                                            
 `list`          Liste tanımlar. Tekrar eden öğelere izin verir.         
 `//`            Tek satırlık açıklama (yorum) satırı.                    


--------------------------------------------------------------------------------------------------------------

 Collections (List, Map, Set):

 Özellik           List              Set                         Map                        
 
 Sıralama          Sıralıdır      Sıralı değil                Anahtar sırasız olabilir 
 Tekrarlama var    Evet           Hayır                       Anahtarlar benzersiz    
 Erişim şekli      İndeks ile     Elemanın varlığına göre     Anahtar ile             
 Kullandığı yapı   Dizi benzeri   Küme yapısı                 Anahtar-Değer tablosu   

 -------------------------------------------------------------------------------------------------------------

# Kotlin OOP (Object-Oriented Programming) Kavramları

Kotlin dilinde Nesne Yönelimli Programlama kavramları, hem basit hem de gelişmiş seviyelerde güçlü bir yapı sunar. Aşağıdaki tablo Kotlin'deki sınıf, kalıtım, interface gibi yapıları hem temel hem de ileri seviye olarak özetler.

## 📘 Karşılaştırmalı OOP Tablosu

| **Kavram**             | **Açıklama**                                                                 | **Anahtar Kelimeler**             | **Özellikler**                                                                                   | **Örnek**                                                             |
|------------------------|------------------------------------------------------------------------------|-----------------------------------|---------------------------------------------------------------------------------------------------|------------------------------------------------------------------------|
| `Class`                | Nesne oluşturmak için temel yapı                                             | `class`                           | Property ve method içerebilir                                                                     | `class Araba(val marka: String)`                                      |
| `Object`               | Sınıftan türetilmiş nesne                                                    | `val obj = ClassName()`           | Bellekte sınıfın örneğidir                                                                         | `val araba = Araba("Ford")`                                           |
| `Constructor`          | Sınıf örneği oluşturulurken çalışan yapı                                     | `constructor`, `init`             | `primary` ve `secondary` constructor olabilir                                                      | `class Kisi(val ad: String)`                                          |
| `Init Block`           | Nesne oluşturulurken çalışan blok                                           | `init {}`                         | Yapıcıdan sonra otomatik çalışan blok                                                             | `init { println("Hazır!") }`                                          |
| `Inheritance`          | Başka sınıftan özellik alma                                                  | `open`, `:`, `super`              | Kotlin’de sınıflar varsayılan olarak `final`, miras için `open` olmalı                           | `class Kedi : Hayvan()`                                               |
| `Interface`            | Ne yapılacağını tanımlar, nasılını tanımlamaz                                | `interface`, `override`           | Çoklu kalıtım sağlar. Default fonksiyon içerebilir                                                | `interface Ucan { fun uc() }`                                         |
| `Abstract Class`       | Sadece miras için kullanılabilir, nesnesi oluşturulamaz                      | `abstract`                        | Hem gövdeli hem gövdesiz fonksiyon içerebilir                                                     | `abstract class Sekil { abstract fun alan(): Double }`               |
| `Polymorphism`         | Aynı method ismi farklı sınıflarda farklı davranış sergileyebilir             | `open`, `override`                | Fonksiyonlar override edilerek farklı davranış kazandırılır                                       | `override fun ses() { println("Hav!") }`                              |
| `Encapsulation`        | Veriyi gizler, kontrollü erişim sağlar                                       | `private`, `protected`, `public`  | Getter/Setter ile birlikte veri gizlenip yönetilebilir                                            | `private var yas = 0` + `get()` / `set(value)`                        |
| `Data Class`           | Sadece veri tutan sınıflar için                                               | `data class`                      | `toString()`, `equals()`, `hashCode()` gibi fonksiyonları otomatik üretir                        | `data class Kisi(val ad: String, val yas: Int)`                      |
| `Sealed Class`         | Alt sınıfları sınırlı olan sınıf tipi                                         | `sealed class`                    | Tüm alt sınıflar aynı dosyada bulunmalı                                                           | `sealed class Sonuc { object Basarili : Sonuc() }`                   |
| `Object Expression`    | Anlık (anonim) sınıf veya nesne oluşturma                                     | `object : Interface {}`           | Geçici sınıf veya interface implementasyonu yapılabilir                                           | `val ucan = object : Ucan { override fun uc() {} }`                  |
| `Companion Object`     | Sınıfa ait ortak üyeler (static benzeri yapı)                                | `companion object`                | Sınıf üzerinden erişilir. Static keyword'ün Kotlin karşılığıdır                                   | `Araba.sayHello()`                                                   |
| `Enum Class`           | Sabit değerleri temsil eder                                                  | `enum class`                      | Sabit veri kümeleri oluşturmak için kullanılır                                                    | `enum class Renk { KIRMIZI, MAVI }`                                  |
| `Visibility Modifier`  | Erişim kontrolü sağlar                                                       | `public`, `private`, `protected`, `internal` | Erişim düzeylerini belirler (sınıf/fonksiyon/özellik bazında)                             | `private fun hesapla()`                                              |

---

## 🔎 Notlar

- `open`: Kalıtıma açık sınıf/fonksiyon.
- `override`: Üst sınıftan gelen fonksiyonu geçersiz kılmak için kullanılır.
- `abstract`: Sınıf veya fonksiyonun gövdesi yoktur, sadece alt sınıflar tarafından doldurulabilir.
- `sealed`: Miras alabilen sınıfları sınırlar ve kontrol altında tutar.
- `companion object`: Static benzeri sınıf düzeyinde ortak üyeler sağlar.

---

## 🛠️ Faydalı Kaynaklar

- Kotlin Resmi Belgeleme: https://kotlinlang.org/docs/home.html
- Kotlin Playground (Kod Denemeleri): https://play.kotlinlang.org/
   
----------------------------------------------------------------------------------------------------------

   
# Kotlin vs Java - Farklar

Kotlin ve Java, JVM üzerinde çalışan iki popüler programlama dilidir. Kotlin, modern ve daha az kodla daha fazla iş yapabilen bir dildir. Aşağıda Kotlin'in Java'ya göre farkları özetlenmiştir.

## ✅ Temel Farklar Tablosu

| Özellik/Fark                           | Java                                        | Kotlin                                      |
|----------------------------------------|---------------------------------------------|---------------------------------------------|
| Null Safety (Boş değer güvenliği)      | `NullPointerException` riski yüksek         | Nullable tipler açıkça belirtilir           |
| Daha Az Kod                            | Verbose (fazla sözdizimi)                   | Daha kısa ve sade kod                       |
| Smart Cast (Akıllı dönüşüm)            | Manuel type cast gerekir (`(ClassName)`)    | Otomatik tanır ve cast eder                |
| Extension Function (Genişletme)        | Yok                                         | Mevcut sınıflara sonradan fonksiyon eklenebilir |
| Data Class (Veri sınıfı)               | toString, equals, vs. elle yazılır          | `data class` ile otomatik üretilir         |
| Top-level Function/Variable            | Her şey bir sınıf içinde olmalı             | Fonksiyonlar sınıf dışında da tanımlanabilir |
| Functional Programming Desteği         | Sınırlı                                     | Lambda, higher-order function desteği var   |
| Default ve Named Arguments             | Yok                                         | Var                                         |
| Sealed Class                           | Yok                                         | Kontrollü miras yapılabilir                |
| Coroutines (Asenkron programlama)      | Thread/AsyncTask gerekir                    | Kolay ve hafif `coroutine` yapısı          |
| Checked Exception                      | Try-catch zorunlu                           | Checked Exception yok, daha esnek          |

---

## 🔍 Kod Üzerinden Karşılaştırmalar

### 🧩 1. Null Safety

**Kotlin:**
```kotlin
var ad: String? = null
println(ad?.length)
```

**Java:**
```java
String ad = null;
System.out.println(ad.length()); // NPE riski
```

---

### 🧩 2. Data Class

**Kotlin:**
```kotlin
data class Kisi(val ad: String, val yas: Int)
```

**Java:**
```java
public class Kisi {
    private String ad;
    private int yas;
    // constructor, getter, setter, toString, etc.
}
```

---

### 🧩 3. Extension Function

**Kotlin:**
```kotlin
fun String.tersCevir(): String = this.reversed()
println("Kotlin".tersCevir()) // "niltok"
```

**Java:**
Yoktur. Helper class yazmak gerekir.

---

### 🧩 4. Smart Cast

**Kotlin:**
```kotlin
fun yaz(t: Any) {
    if (t is String) {
        println(t.length) // Otomatik cast
    }
}
```

**Java:**
```java
void yaz(Object t) {
    if (t instanceof String) {
        String str = (String) t;
        System.out.println(str.length());
    }
}
```

---

### 🧩 5. Default ve Named Arguments

**Kotlin:**
```kotlin
fun selamla(isim: String = "Ziyaretçi") {
    println("Merhaba $isim")
}

selamla()
selamla(isim = "Beyza")
```

**Java:**
```java
void selamla() {
    selamla("Ziyaretçi");
}
void selamla(String isim) {
    System.out.println("Merhaba " + isim);
}
```

---

## 💬 Özet

- Kotlin, Java ile tamamen uyumlu çalışır.
- Daha kısa, güvenli ve modern kod yazımı sağlar.
- Android geliştirme için Google tarafından önerilmektedir.

---

## 🔗 Kaynaklar

- Kotlin Resmi Dökümantasyon: https://kotlinlang.org/docs/home.html
- Kotlin Playground: https://play.kotlinlang.org/



