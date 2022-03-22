fun main()
{
    class Teknologi
    {
        val barang = "Laptop"
        val aplikasi = "Visual Studio"
        fun Menyalakan()
        {
            println("$barang Sedang dinyalakan")
        }

        fun Membuka()
        {
            println("$aplikasi Sedang dibuka")
        }

        fun Menutup()
        {
            println("$aplikasi ditutup")
        }

        fun Mematikan()
        {
            println("$barang Dimatikan")
        }
    }

    val teknologi = Teknologi()
    teknologi.Menyalakan()
    teknologi.Membuka()
    teknologi.Menutup()
    teknologi.Mematikan()
}