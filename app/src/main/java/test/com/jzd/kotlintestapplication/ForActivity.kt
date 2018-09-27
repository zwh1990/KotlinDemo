package test.com.jzd.kotlintestapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

/**
 * @Created by zwh.
 * @description：循环控制
 * @Date ${DATE}-${TIME}
 *@邮箱：zhaowh@zgjzd.cn
 */
class ForActivity : AppCompatActivity() {

    private val TAG = "ForActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_for)

        forItor()
    }

    fun forItor(){

        val items = listOf("apple","orange","kiwi")
//        for (item in items){
//            Log.w(TAG,"item--->" + item)
//        }


        for (index in items.indices){
            Log.w(TAG,"index--->" + items[index])
        }
    }



}
