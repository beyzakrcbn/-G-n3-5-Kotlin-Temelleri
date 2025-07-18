fun main() {
    println("=== Hesap Makinesi ===")

    print("İlk sayı: ")
    val num1 = readLine()?.toDoubleOrNull() ?: 0.0  //readLine:Konsoldan kullanıcıdan string girişi alır.
                                                    //toDoubleOrNull:String olarak alınanı,Double tipine dönüştürür.
    print("İşlem (+, -, *, /): ")
    val operation = readLine()

    print("İkinci sayı: ")
    val num2 = readLine()?.toDoubleOrNull() ?: 0.0

    val result = when (operation) {                 
        "+" -> num1 + num2
        "-" -> num1 - num2
        "*" -> num1 * num2
        "/" -> if (num2 != 0.0) num1 / num2 else {
            println("Bir sayı sıfıra bölünemez!")
            return
        }
        else -> {
            println("Geçersiz işlem!")
            return
        }
    }

    println("Sonuç: $result")
}
