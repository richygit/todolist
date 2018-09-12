package com.example.rich.todo_list

import android.app.ActionBar
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.support.design.widget.Snackbar
import android.support.design.widget.FloatingActionButton
import android.support.design.widget.TextInputEditText
import android.support.design.widget.TextInputLayout
import android.util.Log
import android.view.ViewGroup
import android.view.ViewParent
import android.widget.CheckBox
import android.widget.EditText
import android.widget.LinearLayout
import android.widget.TableRow
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        fab.setOnClickListener(View.OnClickListener { view -> add(view) })
    }

    fun add(view: View) {
        //TODO create new todo item
        Log.i("MAIN", "add new todo item")
        val row = TableRow(this)
        val checkbox = CheckBox(this)
        checkbox.setOnClickListener(View.OnClickListener { view -> buttonChecked(view)})
        row.addView(checkbox)

        val editText = EditText(this)
        row.addView(editText)

        tableLayout.addView(row)
    }

    fun buttonChecked(view: View) {
        //remove button and text
        Log.i("MAIN", "Button checked!")
        var parentView: View = view.parent as View
        tableLayout.removeView(parentView)
    }
}
