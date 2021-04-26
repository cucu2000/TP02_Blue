package edu.kaleb.r.cosgrave.tp02_blueteam

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import edu.kaleb.r.cosgrave.tp02_blueteam.Models.Schools

//author: Tristan

/**
 * A simple [Fragment] subclass.
 * Use the [SchoolDetails.newInstance] factory method to
 * create an instance of this fragment.
 */
class SchoolDetails : Fragment() {
    var schoolBuildings: ArrayList<Schools> = ArrayList()

    lateinit var layoutManager: RecyclerView.LayoutManager
    lateinit var adapter: RecyclerView.Adapter<schoolAdapter.ViewHolder>
    lateinit var recyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        schools()


    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        schools()
        val view = inflater.inflate(R.layout.fragment_school, container, false)

        this.layoutManager = LinearLayoutManager(activity)
        this.adapter = schoolAdapter(schoolBuildings)

        return view
    }



    fun createSchools (schoolName: String, schoolAddress: String) {
        schoolBuildings.add(Schools(schoolName, schoolAddress))
    }

    fun schools () {
        createSchools("Petree College of Arts and Sciences",
                "2501 N Blackwelder Ave, Oklahoma City, OK 73106")
        createSchools("Meinders School of Business",
                "NW 26th St, Oklahoma City, OK 73106")
        createSchools("Ann Lacy School of American Dance and Entertainment",
                "NW 23rd St, Oklahoma City, OK 73106")
    }

    companion object {

        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance() =
            SchoolDetails().apply {

            }
    }
}