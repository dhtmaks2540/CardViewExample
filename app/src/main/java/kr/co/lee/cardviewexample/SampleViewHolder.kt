package kr.co.lee.cardviewexample

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class SampleViewHolder(view: View): RecyclerView.ViewHolder(view) {
    val sampleView = view.findViewById<TextView>(R.id.sample_view)
}