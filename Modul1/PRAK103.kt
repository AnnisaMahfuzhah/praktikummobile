fun main()
{
    println("Input Bilangan = ")
    var nilai = Integer.valueOf(readLine())
    val nilai2 = nilai
    var jumlah = 5
    for(a in 1..jumlah)
    {
        if (nilai % 2 == 0 || nilai % 3 == 0) {
            println(" " + nilai)
            nilai = nilai + nilai2
        }
        else
        {
            nilai = nilai + nilai2
            jumlah = jumlah + 1
        }
    }
}