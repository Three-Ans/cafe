package com.threeans.cafe

import android.content.Intent
import android.icu.number.Scale.none
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val menuButton : ImageButton = findViewById(R.id.menuButton)
        //햄버거 아이콘
        menuButton.setOnClickListener {
            val intent= Intent(this, SideNavigation::class.java)
            startActivity(intent)

            overridePendingTransition(R.anim.slide_right, R.anim.none)
            //화면 전환 애니메이션
            //anim.none을 넣어야 검은화면이 안떠요.
        }

    }
}