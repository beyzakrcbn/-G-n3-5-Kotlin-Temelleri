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

Değişkenler:

`var`       Değişken değeri sonradan değiştirilebilir.
`val`       Değişken değeri sonradan değiştirilemez ve tek değer tanımlanabilir.
`fun`       Fonksiyon tanımlanır.
`if-else`   
`when`      Javadaki switch-case fonksiyonun kotlindeki karşılığı.
`for`
`while`
`arrayOf()` Dizi tanımlanır.
`list`
`//`

