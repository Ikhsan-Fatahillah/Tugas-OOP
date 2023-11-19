package id.infinitelearning.KotlinSubmission.exercise4
import java.lang.Exception

fun main() {
    example(10)
}
    /**
     * Buatlah contoh code penggunaan try catch untuk menangani suatu kasus sesuai keinginan teman-teman
     *
     */
    // Buat di bawah sini

    fun example(num:Int){
        val arr = arrayOf("ikhsan", "kimberly", "dzikri", "faza", "irfan")
        try{
            println(arr[num])
        }catch (e: Exception){
            println("error : cek index array")
        }finally {
            println("program selesai")
        }
    }