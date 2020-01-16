package con.jwlee.itsmap

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import con.jwlee.itsmap.ui.splash.SelectActivity


class IntroAct : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.intro_act)

    }

    override fun onResume() {
        super.onResume()
        window.decorView.postDelayed({
            val intent = Intent(this, SelectActivity::class.java)
            intent.flags = Intent.FLAG_ACTIVITY_NO_HISTORY
            startActivity(intent)
            // 액티비티 이동시 페이드인/아웃 효과를 보여준다. 즉, 인트로 화면이 부드럽게 사라진다.
            overridePendingTransition(
                android.R.anim.fade_in,
                android.R.anim.fade_out
            )
        }, 1200)

    }


}