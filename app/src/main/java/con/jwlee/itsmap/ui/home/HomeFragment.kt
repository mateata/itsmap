package con.jwlee.itsmap.ui.home

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.navigation.fragment.findNavController
import com.google.firebase.firestore.DocumentSnapshot
import com.google.firebase.firestore.FirebaseFirestore
import con.jwlee.itsmap.R
import con.jwlee.itsmap.data.AppControl
import con.jwlee.itsmap.data.Mvalue
import con.jwlee.itsmap.ui.BaseActivity
import con.jwlee.itsmap.ui.BaseFragment
import con.jwlee.itsmap.ui.splash.SetLocalActivity
import con.jwlee.itsmap.util.DLog
import kotlinx.android.synthetic.main.fragment_home.*
import kotlinx.android.synthetic.main.fragment_home.view.*
import kotlinx.android.synthetic.main.title_toolbar.*


class HomeFragment : BaseFragment() {

    val db = FirebaseFirestore.getInstance()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val root = inflater.inflate(con.jwlee.itsmap.R.layout.fragment_home, container, false)
        return root
    }

    override fun onBack() {
        super.onBack()
        BaseActivity().onBackPressed()
    }

    companion object {

        fun newInstance(): HomeFragment {
            return HomeFragment()
        }
    }




    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        init(view)
    }



    fun init(root : View) {

        // 상단 지역버튼 세팅
        var locBtnId = R.drawable.bar_yeonsu
        when(AppControl.sLocation) {
            1 -> {locBtnId = R.drawable.bar_middle}
            2 -> {locBtnId = R.drawable.bar_east}
            3 -> {locBtnId = R.drawable.bar_michuhol}
            4 -> {locBtnId = R.drawable.bar_yeonsu}
            5 -> {locBtnId = R.drawable.bar_southeast}
            6 -> {locBtnId = R.drawable.bar_bupyong}
            7 -> {locBtnId = R.drawable.bar_geyang}
            8 -> {locBtnId = R.drawable.bar_west}
        }
        bt_calc.setOnClickListener {
            findNavController().navigate(R.id.navigation_calc)
        }

    }
}