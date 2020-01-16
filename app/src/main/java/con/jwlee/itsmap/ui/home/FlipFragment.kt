package con.jwlee.itsmap.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.MotionEvent
import android.view.View
import android.view.ViewGroup
import android.view.animation.AnimationUtils
import android.widget.ViewFlipper
import androidx.navigation.fragment.findNavController
import con.jwlee.itsmap.R
import con.jwlee.itsmap.ui.BaseActivity
import con.jwlee.itsmap.ui.BaseFragment
import kotlinx.android.synthetic.main.fragment_flip.*

class FlipFragment : BaseFragment(), View.OnClickListener {

    lateinit var flipper: ViewFlipper

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val root = inflater.inflate(R.layout.fragment_flip, container, false)
        return root
    }

    override fun onBack() {
        super.onBack()
        BaseActivity().onBackPressed()
    }

    companion object {

        fun newInstance(): FlipFragment {
            return FlipFragment()
        }
    }




    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        init(view)
    }



    fun init(root : View) {
        flipper = flip_view


        //ViewFlipper가 View를 교체할 때 애니메이션이 적용되도록 설정
        //애니메이션은 안드로이드 시스템이 보유하고 있는  animation 리소스 파일 사용.
        //ViewFlipper의 View가 교체될 때 새로 보여지는 View의 등장 애니메이션
        //AnimationUtils 클래스 : 트윈(Tween) Animation 리소스 파일을 Animation 객체로 만들어 주는 클래스
        //AnimationUtils.loadAnimaion() - 트윈(Tween) Animation 리소스 파일을 Animation 객체로 만들어 주는 메소드
        //첫번째 파라미터 : Context
        //두번재 파라미터 : 트윈(Tween) Animation 리소스 파일(여기서는 안드로이드 시스템의 리소스 파일을 사용
        //(왼쪽에서 슬라이딩되며 등장)


        flipper.setOnClickListener(this)
    }

    var idx = 0
    override fun onClick(v: View) {
        moveNextView()
    }

    fun moveNextView() {
        if(idx == 3) {
            findNavController().navigate(R.id.navigation_home)
        }
        flipper.inAnimation = AnimationUtils.loadAnimation(this.requireContext(), R.anim.anim_slide_in_right)
        flipper.outAnimation = AnimationUtils.loadAnimation(this.requireContext(), R.anim.anim_slide_out_left)
        flipper.showNext()
        idx++
    }


}