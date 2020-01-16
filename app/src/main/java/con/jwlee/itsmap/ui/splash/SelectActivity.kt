package con.jwlee.itsmap.ui.splash

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import con.jwlee.itsmap.R
import kotlinx.android.synthetic.main.select_ac.*

class SelectActivity : AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.select_ac)
    }

    override fun onResume() {
        super.onResume()
        init()
    }

    fun init() {
        loginbtn.setOnClickListener {
            var intent = Intent(this, LoginActivity::class.java);
            intent.flags = Intent.FLAG_ACTIVITY_CLEAR_TOP
            startActivity(intent)
        }

        joinbtn.setOnClickListener {
            var intent = Intent(this, JoinActivity::class.java);
            intent.flags = Intent.FLAG_ACTIVITY_CLEAR_TOP
            startActivity(intent)
        }
    }
}