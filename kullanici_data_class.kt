data class Person(
        val name: String,
        val age: Int,
        val email: String
) {
        fun isYoung(): Boolean = age <= 30
}

fun main() {
        val person = Person("Beyza", 22, "Beyzakrcbn.7@gmail.com")
        println("Genç mi? ${person.isYoung()}")
}