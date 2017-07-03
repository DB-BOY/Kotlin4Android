package com.gin.kotlin4android.book

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import com.gin.kotlin4android.R
import com.gin.kotlin4android.book.data.Person
import com.gin.kotlin4android.custom.Utils
import kotlinx.android.synthetic.main.activity_book.*

class BookActivity : AppCompatActivity() {

    val TAG = Utils.TAG
    //一部分是静态方法的情况 : 将方法用 companion object { } 包裹即可
    companion object {
        fun getIntent(context: Context): Intent = Intent(context, BookActivity::class.java)

    }
    val items = listOf(
            "1", "2"
    )
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_book)

        var person = Person("dsadfas", 3)
        btn1.setOnClickListener {
            toast("${person.getAge(3)}")
            log("${person.getAge(3)}")
        }
        btn2.setOnClickListener {
            toast("${person.getAge()}")
            log("${person.getAge()}")
        }

        recycler.layoutManager = LinearLayoutManager(this)
        var mainAdapter = MainAdapter(items)
        recycler.adapter = mainAdapter

    }


    fun toast(message: String, length: Int = Toast.LENGTH_SHORT) {
        Toast.makeText(this, message, length).show()
    }

    fun log(msg: String = " message ") {
        Log.i(TAG, msg)
    }

    class MainAdapter(val items: List<String>) : RecyclerView.Adapter<MainAdapter.ViewHolder>() {
        override fun onBindViewHolder(holder: MainAdapter.ViewHolder, position: Int) {
            holder.textView.text = items[position]
            holder.textView.setOnClickListener {
                onClick(position)
            }
        }

        private fun onClick(position: Int) {

        }

        override fun getItemCount(): Int = items.size

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder = ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_main, parent, false))

        open class ViewHolder : RecyclerView.ViewHolder {
            var textView: TextView

            constructor(view: View) : super(view) {
                textView = view.findViewById(R.id.txt) as TextView
            }
        }
    }
}
