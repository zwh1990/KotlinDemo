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

//        forItor()
//        whiles()
        interrupt()

    }


    //for 遍历
    fun forItor() {

        val items = listOf("apple", "orange", "kiwi")
//        for (item in items){
//            Log.w(TAG,"item--->" + item)
//        }

        for (index in items.indices) {
            Log.w(TAG, "index--->" + items[index])
        }

    }


    //while 的使用   x和y的值都是5 输出结果相同，都为0 则只有y输出值
    fun whiles() {

        var x = 0
        while (x > 0) {
            Log.w(TAG, "x--->" + x)
            x --
        }

        var y = 0
        do {
            Log.w(TAG, "y--->" + y)
            y --
        } while (y > 0)

    }

    //终止字符的使用
    fun interrupt() {
        for (i in 1..10) {
            for (j in 2..5) {
                if (j == 4) {
                    //return 是终止两层循环
//                    return
                    //break 是终止内部循环
//                    break

                    //continue 是跳过内部j == 4循环
                    continue
                }
                Log.w(TAG, "j--->" + j)
            }
            Log.w(TAG, "i--->" + i)
        }
    }


}
