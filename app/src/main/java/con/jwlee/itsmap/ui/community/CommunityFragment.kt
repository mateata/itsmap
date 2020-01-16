package con.jwlee.itsmap.ui.community

import android.content.Context
import android.content.Context.INPUT_METHOD_SERVICE
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.inputmethod.InputMethodManager
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import con.jwlee.itsmap.R


class CommunityFragment : Fragment(), View.OnClickListener {


    lateinit var mContext : Context
    lateinit var imm : InputMethodManager

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val root = inflater.inflate(R.layout.fragment_dashboard, container, false)
        return root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        mContext = this.requireContext()
        init(view)
    }

    fun init(root : View) {
        val linearLayoutManager = LinearLayoutManager(mContext, RecyclerView.VERTICAL,false)
        imm = mContext.getSystemService(INPUT_METHOD_SERVICE) as InputMethodManager

    }

    override fun onClick(v: View) {
        when(v.id) {

        }
    }


    companion object {

        fun newInstance(): CommunityFragment {
            return CommunityFragment()
        }
    }

}