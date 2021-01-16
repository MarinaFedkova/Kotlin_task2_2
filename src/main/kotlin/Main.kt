fun main() {
    val likes = 2
    if (likes % 100 == 11)
        println("Понравилось $likes людям")
    else if (likes == 1 || (likes > 11 && likes % 10 == 1))
        println("Понравилось $likes человеку")
    else
        println("Понравилось $likes людям")
}