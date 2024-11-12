package jeniavrilia.polbeng.ac.id.viewdata

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import jeniavrilia.polbeng.ac.id.viewdata.databinding.ActivityRecylerBinding

class RecylerActivity : AppCompatActivity() {
    private lateinit var binding: ActivityRecylerBinding

    // Data declaration
    private val dataBuah = arrayOf("Alpukat", "Durian", "Jambu Air", "Manggis", "Strawberry")
    private val dataGambar = arrayOf(
        R.drawable.alpukat,
        R.drawable.durian,
        R.drawable.jambuair,
        R.drawable.manggis,
        R.drawable.strawberry
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRecylerBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Initialize the custom adapter
        val adapter = BuahAdapter(this, dataBuah, dataGambar)

        // Set up the RecyclerView with a layout manager and the adapter
        binding.recylerView.layoutManager = LinearLayoutManager(applicationContext)
        binding.recylerView.adapter = adapter
    }
}
