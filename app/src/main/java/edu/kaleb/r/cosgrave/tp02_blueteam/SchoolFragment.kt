package edu.kaleb.r.cosgrave.tp02_blueteam

import android.content.Intent
import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import edu.kaleb.r.cosgrave.tp02_blueteam.Adapters.SchoolAdapter
import edu.kaleb.r.cosgrave.tp02_blueteam.Models.Major
import edu.kaleb.r.cosgrave.tp02_blueteam.Models.Schools

//Author: Tristan

class SchoolFragment : Fragment(), OnClickListener {

    //Initialize variables
    var schoolBuildings: ArrayList<Schools> = ArrayList()
    lateinit var layoutManager: RecyclerView.LayoutManager
    lateinit var adapter: RecyclerView.Adapter<SchoolAdapter.ViewHolder>

    //Make instance of School Fragment
    companion object {
        fun newInstance() = SchoolFragment()
    }

    //Base var for ViewModel
    private lateinit var viewModel: SchoolViewModel

    //Base onCreateView Method
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.school_fragment, container, false)
        schools()
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        //Create School Arrays
        schools()

        //Set RecyclerView variables
        layoutManager = LinearLayoutManager(activity)
        var recyclerView = view!!.findViewById<RecyclerView>(R.id.schoolRecyclerView)
        recyclerView.layoutManager = layoutManager

        //set the adapter
        adapter = SchoolAdapter(schoolBuildings, this)
        recyclerView.adapter = adapter

        //set ViewModel
        viewModel = ViewModelProvider(this).get(SchoolViewModel::class.java)

    }

    //Function to create Schools
    fun createSchools (schoolName: String, schoolAddress: String) {
        schoolBuildings.add(Schools(schoolName, schoolAddress))
    }

    //Create Schools
    fun schools () {
        createSchools("Petree College of Arts and Sciences",
                "2501 N Blackwelder Ave, Oklahoma City, OK 73106")
        createSchools("Meinders School of Business",
                "NW 26th St, Oklahoma City, OK 73106")
        createSchools("Ann Lacy School of American Dance and Entertainment",
                "NW 23rd St, Oklahoma City, OK 73106")
    }

    //Author: Kaleb

    //Intent to Majors
    override fun onSchoolClick(data: Schools) {
        val activityIntent = Intent(activity?.baseContext, MajorDetail::class.java)
        activityIntent.putExtra("School", "${data.schoolName}")
        activity?.startActivity(activityIntent)
    }
}
