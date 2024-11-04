package com.example.emailrecycleview

import EmailAdapter
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.emailrecycleview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val adapterEmail = EmailAdapter(generateDummy()) { Email ->
            val intent = Intent(this, DetailActivity::class.java)
            intent.putExtra("Name", Email.name)
            intent.putExtra("date", Email.date)
            intent.putExtra("description", Email.description)
            startActivity(intent)
        }


    with(binding){
            recyclerView.apply {
                adapter = adapterEmail
                layoutManager = LinearLayoutManager(this@MainActivity)

            }
        }

    }
    private fun generateDummy(): List<Email> {
        return listOf(
            Email("InfoHotel", "1 Nov", "Pemberitahuan: Kolam renang akan dibuka mulai pukul 07:00 pagi. Silakan menikmati fasilitas ini selama Anda menginap."),
            Email("JohnDoe", "1 Nov", "Terima kasih atas layanan luar biasa di hotel Anda! Saya sangat menikmati waktu menginap di sini."),
            Email("MarketingTeam", "1 Nov", "Promo Terbatas: Diskon 15% untuk pemesanan selanjutnya. Jangan lewatkan kesempatan ini!"),
            Email("Manager", "1 Nov", "Catatan: Rapat staf akan diadakan pada pukul 09:00 besok di ruang pertemuan utama."),
            Email("Ronaldo", "1 Nov", "Saya kembali menjadi pencetak gol terbanyak di liga ini. Terima kasih atas dukungan semua fans!"),
            Email("Messi", "1 Nov", "Selamat kepada semua fans atas kemenangan kami di pertandingan terakhir!"),
            Email("InfoHotel", "1 Nov", "Pemberitahuan: Layanan spa tersedia mulai pukul 10:00 hingga 20:00. Silakan kunjungi resepsionis untuk reservasi."),
            Email("Admin", "1 Nov", "Pengumuman: Sistem reservasi online akan diperbarui pada pukul 23:00 malam ini."),
            Email("Sara", "1 Nov", "Terima kasih atas pelayanan kamar yang cepat dan ramah! Sangat membantu saat saya butuh."),
            Email("InfoHotel", "1 Nov", "Pemberitahuan: Menu makan malam spesial akan disajikan malam ini. Silakan datang ke restoran hotel."),
            Email("Leo", "1 Nov", "Film yang diputar di bioskop hotel malam ini sangat bagus! Terima kasih telah menambah pengalaman menginap saya."),
            Email("Chef", "1 Nov", "Menu sarapan besok termasuk hidangan baru yang segar dan sehat. Pastikan untuk mencobanya!"),
            Email("Linda", "1 Nov", "Saya kehilangan dompet di area kolam renang. Mohon bantuannya untuk menemukan."),
            Email("TravelAgency", "1 Nov", "Penawaran Spesial: Paket wisata hari ini dengan harga diskon! Hubungi resepsionis untuk detail."),
            Email("InfoHotel", "1 Nov", "Pemberitahuan: Wi-Fi gratis tersedia di semua area hotel. Silakan tanyakan kata sandi di resepsionis."),
            Email("Ronaldo", "1 Nov", "Fans saya yang terbaik di dunia! Terima kasih telah mendukung saya setiap pertandingan."),
            Email("Messi", "1 Nov", "Pengumuman: Kompetisi sepak bola amal akan diadakan pekan depan. Kami mengundang semua untuk hadir."),
            Email("ITSupport", "1 Nov", "Pemberitahuan: Perbaikan sistem Wi-Fi akan dilakukan malam ini mulai pukul 23:00."),
            Email("FitnessTrainer", "1 Nov", "Kelas yoga akan diadakan besok pagi pukul 06:30 di area gym. Ayo bergabung untuk sesi menyegarkan!"),
            Email("Reception", "1 Nov", "Pengingat: Layanan check-out tersedia hingga pukul 12:00 siang. Terima kasih telah menginap bersama kami."),
        )
    }
}