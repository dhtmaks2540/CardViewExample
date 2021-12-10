package kr.co.lee.cardviewexample

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class SampleAdapter(val list: List<String>): RecyclerView.Adapter<SampleViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SampleViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.test_item, parent, false)
        return SampleViewHolder(view)
    }

    override fun onBindViewHolder(holder: SampleViewHolder, position: Int) {
        val item = list[position]
        holder.sampleView.text = item
    }

    override fun getItemCount(): Int = list.size
}