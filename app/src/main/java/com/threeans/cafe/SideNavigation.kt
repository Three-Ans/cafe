package com.threeans.cafe

import android.content.Intent
import android.icu.number.Scale.none
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class SideNavigation : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_side_navigation)




    }

    override fun onBackPressed() {
        super.onBackPressed()
        if(isFinishing){
            overridePendingTransition(R.anim.none,R.anim.slide_left)
            //뒤로가기 눌렀을때 슬라이드하며 나가는 애니매이션
            //anim.none을 넣어야 검은화면이 안떠요.
        }
    }

}