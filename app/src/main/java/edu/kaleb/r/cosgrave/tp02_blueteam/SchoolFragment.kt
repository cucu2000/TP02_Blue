package edu.kaleb.r.cosgrave.tp02_blueteam

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

//author: Tristan

/**
 * A simple [Fragment] subclass.
 * Use the [SchoolFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class SchoolFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_school, container, false)
    }

    companion object {

        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance() =
            SchoolFragment().apply {

            }
    }
}