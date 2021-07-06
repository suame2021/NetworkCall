//Program to Remove vowels from a set of string
fun main() {
    var a= vowelRemoval("He is going to school today")

    println("THe String After Removing the Vowel is:")
    println(a)
}


fun vowelRemoval(v: String): String {
    val remove = StringBuilder()
    for (c in v) {
        if (c != 'A' && c != 'a'
            && c != 'E' && c != 'e'
            && c != 'I' && c != 'i'
            && c != 'O' && c != 'o'
            && c != 'U' && c != 'u') {
            remove.append(c)
        }
    }
    return remove.toString()
}
