package inheritance

class CleaningService :  KaryawanSekolah(){
    var sma: String = ""

    fun membersihkan(){
        println("Saya yang bertanggungjawab atas kebersihan lingkungan sekolah $sma")
    }
}
