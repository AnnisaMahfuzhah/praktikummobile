import java.util.*

fun main()
{
    print("Nilai x = ")
    var nilai = Integer.valueOf(readLine())
    fun hitung(nilai : Int): Int
    {
        var hasil = 2*nilai*nilai+5*nilai-8
        return hasil
    }

    println(hitung(nilai))
}
