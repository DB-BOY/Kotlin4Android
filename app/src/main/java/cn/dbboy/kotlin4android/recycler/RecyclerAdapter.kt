package cn.dbboy.kotlin4android.book.recycler

import android.view.ViewGroup
import android.widget.TextView

/**
 * Created by db.boy on 2017/6/28.
 */

class RecyclerAdapter(val items: List<String>): RecyclerView.Adapter<RecyclerAdapter.ViewHolder>(){
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.textView.text= items[position]
    }

    override fun getItemCount(): Int = items.size

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(TextView(parent.context))
    }

    class ViewHolder(val textView: TextView) : RecyclerView.ViewHolder(textView)
}