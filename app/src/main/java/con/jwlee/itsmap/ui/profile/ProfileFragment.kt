package con.jwlee.itsmap.ui.profile

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import con.jwlee.itsmap.ui.BaseActivity
import con.jwlee.itsmap.ui.BaseFragment

class ProfileFragment : BaseFragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val root = inflater.inflate(con.jwlee.itsmap.R.layout.fragment_profile, container, false)
        return root
    }

    override fun onBack() {
        super.onBack()
        BaseActivity().onBackPressed()
    }

    companion object {

        fun newInstance(): ProfileFragment {
            return ProfileFragment()
        }
    }




    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        init(view)
    }



    fun init(root : View) {

    }
}