package id.infinitelearning.KotlinSubmission.exercise1

/**
Latihan 1
Lengkapi fungsi myProfile di bawah ini dengan membuat variabel dengan ketentuan dibawah ini:
- Variable bertipe data string yang menyimpan nilai nama depan Anda.
- Variable bertipe data string yang menyimpan nilai nama belakang Anda.
- Variable bertipe data number yang menyimpan nilai umur Anda.
- Variable bertipe data boolean yang menyimpan nilai status Anda (single atau tidak)
Dan Cetak setiap variabel ke layar saat variable myProfile di panggil
 */

fun myProfile(namaDepan : String, namaBelakang : String, umur : Number, status : Boolean) {
    println("Nama saya : $namaDepan $namaBelakang")
    println("Umur saya : $umur tahun")
    if (status == true){
        println("Status saya : single")
    }else{
        println("Status saya : tidak single")
    }
}

/**
 *  Latihan 2
 *  Lengkapi fungsi di bawah ini agar dapat mencetak nilai dari parameter-parameter yang ada dengan fungsi println
 */

fun groupDetail(groupId: String, groupMember: List<Any>, session: String): Any {
    println("Group id :  $groupId")
    println("Group member :  $groupMember")
    println("Session :  $session")
    return ""
}

/**
 * Latihan 3
 * Buat variable yang berisi daftar anggota group kamu,
 * Kemudian akses item yang berisi nama Anda dari variable tersebut, lalu jadikan nilai kembalian untuk fungsi myTeam ini
 *
 */

fun myTeam(): List<Any> {
    val anggotaGroup = listOf("Ikhsan", "Kimberly", "Faza", "Dzikri", "Irfan")
    val myName = listOf(anggotaGroup[0])
    return myName
}

/**
 * Latihan 4
 * Lengkapi dan perbaiki isi fungsi totalMember() ini dengan rumus:
 *
 *      total mentor + jumlah anggota group
 *
 */

fun totalMember(): Int {
    val mentor = arrayOf<String>("Ayat", "Reza", "Widya")
    val countOfGroup = arrayOf<String>("Ikhsan", "Kimberly", "Faza", "Dzikri", "Irfan")
    val totalMentor = mentor.size
    val totalGroup = countOfGroup.size

    return totalMentor + totalGroup
}

fun main() {

    myProfile("al ikhsan akbar", "fatahillah", 20, true)

    val myTeam = myTeam()
    println("My team is: $myTeam")

    val totalMember = totalMember()
    println("Total Member group : $totalMember")

    /**
     *  Latihan 5
     *  Ubah nilai argumen-argumen dari fungsi groupDetail di bawah ini sesuai dengan data group kamu
     *
     */

    groupDetail("Akatsuki", listOf("Ikhsan", "Kimberly", "Faza", "Dzikri", "Irfan"), "Morning")

}