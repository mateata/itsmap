package con.jwlee.itsmap

import android.content.Intent
import android.content.SharedPreferences
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import com.bumptech.glide.request.target.GlideDrawableImageViewTarget
import com.google.firebase.firestore.FirebaseFirestore
import con.jwlee.itsmap.ui.splash.SplashActivity
import kotlinx.android.synthetic.main.intro_act.*


class IntroAct : AppCompatActivity() {

    val db = FirebaseFirestore.getInstance()
    lateinit var pref : SharedPreferences;
    lateinit var edit : SharedPreferences.Editor;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.intro_act)

    }

    override fun onResume() {
        super.onResume()
        window.decorView.postDelayed({
            val intent = Intent(this, SplashActivity::class.java)
            intent.flags = Intent.FLAG_ACTIVITY_NO_HISTORY
            startActivity(intent)
            // 액티비티 이동시 페이드인/아웃 효과를 보여준다. 즉, 인트로 화면이 부드럽게 사라진다.
            overridePendingTransition(
                android.R.anim.fade_in,
                android.R.anim.fade_out
            )
        }, 3200)

    }


}