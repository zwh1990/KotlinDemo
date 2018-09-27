package test.com.jzd.kotlintestapplication

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Button

class MainActivity : AppCompatActivity() {

    private val TAG = "MainActivity"


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.bt_grammar).setOnClickListener {
            startActivity(Intent(this, GrammarActivity::class.java))
        }

        findViewById<Button>(R.id.bt_data_type).setOnClickListener {
            startActivity(Intent(this, DataTypeActivity::class.java))
        }

        findViewById<Button>(R.id.bt_if_control).setOnClickListener {
            startActivity(Intent(this, IfControlActivity::class.java))
        }

        findViewById<Button>(R.id.bt_for).setOnClickListener {
            startActivity(Intent(this, ForActivity::class.java))
        }

    }

}
