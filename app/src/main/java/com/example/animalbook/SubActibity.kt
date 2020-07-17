package com.example.animalbook

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_sub_actibity.*

class SubActibity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sub_actibity)

        //ライオンボタンを押した時
        lionButton.setOnClickListener {
            //ライオンを表示するインスタンスを定数fragmentに代入
            val fragment=LionFragment()
            //suppportFragmentManagerのインスタンを取得
            val fragmentManager=this.supportFragmentManager
            //トランサクションを取得してcommitするまで猶予される
            val fragmentTransaciton=fragmentManager.beginTransaction()
            fragmentTransaciton.replace(R.id.container,fragment)
                .addToBackStack(null)
                .commit()
        }
        //カバボタンを押した時
        hippoButton.setOnClickListener {
            val fragment=HippoFragment()
            val fragmentManager=this.supportFragmentManager
            val fragmentTransaciton=fragmentManager.beginTransaction()
            fragmentTransaciton.replace(R.id.container,fragment)
                .addToBackStack(null)
                .commit()
        }
        //麒麟ボタンを押した時
        giraffeButton.setOnClickListener {
            val fragment=GiraffeFragment()
            val fragmentManager=this.supportFragmentManager
            val fragmentTransaciton=fragmentManager.beginTransaction()
            fragmentTransaciton.replace(R.id.container,fragment)
                .addToBackStack(null)
                .commit()
        }
        //タイトル用のフラグメントに文字列を作成
        val fragment=titleFragment as? TitleFragment
        fragment?.setTitle("図鑑画面")
    }
}