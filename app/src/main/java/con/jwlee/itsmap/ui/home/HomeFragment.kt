package con.jwlee.itsmap.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import con.jwlee.itsmap.ui.BaseActivity
import con.jwlee.itsmap.ui.BaseFragment


class HomeFragment : BaseFragment() {


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

    }
}