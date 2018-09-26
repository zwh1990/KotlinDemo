package test.com.jzd.kotlintestapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    private val TAG = "MainActivity"

    //变量
    var num :Int = 0;

    //常量
    val constant :Int = 0;


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



//      sum(1,1);
//        vars(1,2,3,4,5);
//        var lamNum = sumLambda(1, 2);
//        Log.w(TAG, "lamNum:" + lamNum);

        //null的判断

//        val x = parseInt("3")
//        val y = parseInt("2")
//        if(x != null && y!= null){
//            Log.w(TAG, "x*y:" + x*y)
//        }

        //获取字符串的长度
//        var length = getStringLength("74385")
//        Log.w(TAG, "length:" +length)

        //区间计算
        range()


    }

    //求和
    fun sum(a: Int, b: Int) {
        var num = a + b;
        Log.w(TAG, "num:" + num);
    }

    //变长度传参
    fun vars(vararg v: Int) {
        for (vt in v) {
            Log.w(TAG, "vt:" + vt);
        }
    }

    //lambda的使用
    val sumLambda: (Int, Int) -> Int = { x, y -> x + y }

    //null的使用
    fun parseInt(str : String) :Int?{
        var ages = str?.toInt();
        return ages;
    }

    //is 的使用相当于java中的instanceOf
    fun getStringLength(obj : Any): Int?{

        if(obj is String){
            return obj.length
        }
        return null;
    }

    fun range(){
//        for(i in 1..4){
        //输出1 2 3 4
//            Log.w(TAG,"i--->" + i);
//        }

//        for(i in 4..1){
//            Log.w(TAG,"i--->" + i);
//        }

        //指定step 步长为2
//        for(i in 1..4 step 2){
        //输出1和3
//            Log.w(TAG,"i--->" + i);
//        }

//        for(i in 4 downTo 1 step 2){
        //输出4和2
//            Log.w(TAG,"i--->" + i);
//        }

        for (i in 1 until 10){
//            输出 1- 9 是没有10 的
            Log.w(TAG,"i--->" + i);
        }

    }
}
