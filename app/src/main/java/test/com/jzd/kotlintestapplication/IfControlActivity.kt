package test.com.jzd.kotlintestapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.util.Log.w

/**
 * @Created by zwh.
 * @description：
 * @Date ${DATE}-${TIME}
 *@邮箱：zhaowh@zgjzd.cn
 */
class IfControlActivity : AppCompatActivity() {

    private val TAG =  "IfControlActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_if_control)

//        ifControl()
//        ins()
//        whens1()
//        whens2()
        whenIs()


    }

    //条件判断
    fun ifControl(){
        val a = 0
        val b = 1

        val c = if(a > b) a else b
        Log.w(TAG,"C--->" + c)

    }

    //检测是否在区间内
    fun ins(){
        val a = 0
        val b = 5
        if(a in 2..8)  Log.w(TAG,"a在区间内") else Log.w(TAG,"a不在区间内")
        if(b in 2..8)  Log.w(TAG,"b在区间内") else Log.w(TAG,"b不在区间内")
    }

    //When 表达式  when的使用与java中的switch似乎相似
    fun whens1(){
        val x = 5
        when(x){

            1 -> Log.w(TAG,"x的值是1")
            2 -> Log.w(TAG,"x的值是2")

            else ->
                Log.w(TAG,"x的值不是1也不是2")

        }

    }

    //when 中使用in
    fun whens2(){

        val x = 5;
        when(x){
            in 1..10 -> Log.w(TAG,"x在1-10区间范围内")
            !in 10..20 ->Log.w(TAG,"x在10-20区间范围内")
            else ->
                Log.w(TAG,"x不在上面范围内")
        }
    }

    //when 中使用is
    fun whenIs(){
        val str : Any = "100"
        when(str){
            is String ->Log.w(TAG,"str是字符串")
            else ->
                Log.w(TAG,"str不是字符串")
        }
    }

}
