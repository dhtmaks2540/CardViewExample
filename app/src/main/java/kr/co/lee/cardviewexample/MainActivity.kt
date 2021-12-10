package kr.co.lee.cardviewexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    lateinit var recycler: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recycler = findViewById(R.id.recycler)
        recycler.layoutManager = LinearLayoutManager(this)

        makeAdapter()
    }

    private fun makeAdapter() {
        val list = ArrayList<String>()
        for(i in 1..100) {
            list.add(i.toString())
        }
        val adapter = SampleAdapter(list)
        recycler.adapter = adapter
    }
}