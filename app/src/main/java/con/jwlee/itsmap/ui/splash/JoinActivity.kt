package con.jwlee.itsmap.ui.splash

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import con.jwlee.itsmap.R

class JoinActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.join_ac)
    }

    override fun onResume() {
        super.onResume()
        init()
    }

    fun init() {

    }

    override fun onBackPressed() {
        super.onBackPressed()
        var intent = Intent(this, SelectActivity::class.java);
        intent.flags = Intent.FLAG_ACTIVITY_CLEAR_TOP
        startActivity(intent)
    }
}