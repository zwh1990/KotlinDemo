package test.com.jzd.kotlintestapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

/**
 * @Created by zwh.
 * @description：数据类型
 * @date 2018/9/26 17:45
 *@邮箱：zhaowh@zgjzd.cn
 */
class DataTypeActivity : AppCompatActivity() {

    private val  TAG = "DataTypeActivity";

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_data_type)

        compare()
//        arrays()
//        strings()
//        template()

    }

    //比较大小
    fun compare(){

        var num :Long= 100000
        Log.w(TAG,"1--->" + (num == num)); //true

        val a :Long = num;
        val b :Long = num;
        Log.w(TAG,"2--->" + (a == b)); //true
        Log.w(TAG,"3--->" + (a === b)); //true

    }

    //数组
    fun arrays(){
        val a = arrayOf(1,2,3)
        val b = Array(3, { i -> (i * 2) })

        Log.w(TAG,"a[0]--->" + a[0]);  //1
        Log.w(TAG,"b[1]--->" + b[1]);  //2

        val c = intArrayOf(1,2,3)
        c[0] = c[1] + c[2]
        Log.w(TAG,"c[0]--->" + c[0]);  //5
    }

    //字符串
    fun strings(){
        val str = """
            hdajkdfk
            djdaksdfk
            """.trimMargin()
        Log.w(TAG,"str--->" + str);  //2
    }

    //模板
    fun template(){
        val a = "100"
        Log.w(TAG,"a is $a");

        Log.w(TAG,"a length is ${a.length}");

    }

}
