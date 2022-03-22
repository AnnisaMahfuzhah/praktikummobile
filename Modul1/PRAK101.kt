import kotlin.random.Random

fun main()
{
    println("Waktu sekarang: ")
    val waktu = readLine()
    println("Nama anda: ")
    val nama = readLine()
    println("Umur anda: ")
    val umur = readLine()
    val suhu = (35..37)

    println("Selamat $waktu, $nama.\n" +
            "Umur anda $umur tahun.\n" +
            "Suhu tubuh anda ${suhu.random()} derajat celcius.")
}