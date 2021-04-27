package edu.kaleb.r.cosgrave.tp02_blueteam.Adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import edu.kaleb.r.cosgrave.tp02_blueteam.Models.Schools
import edu.kaleb.r.cosgrave.tp02_blueteam.R
import edu.kaleb.r.cosgrave.tp02_blueteam.SchoolFragment

//author: Tristan

//Create Class with Inputs Needed to Create View
class SchoolAdapter (
    var schools: ArrayList<Schools>,
    var schoolFragment: SchoolFragment
): RecyclerView.Adapter<SchoolAdapter.ViewHolder>() {

    //Create ViewHolder
    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var textViewSchoolName: TextView = itemView.findViewById(R.id.textViewSchoolName)
        var textViewSchoolAddress: TextView = itemView.findViewById(R.id.textViewSchoolAddress)
    }

    //implement RecyclerView Methods
    //Return # of Rows
    override fun getItemCount(): Int {
        return schools.size
    }

    //Set Layout for View
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.activity_school, parent, false)
        return ViewHolder(view)
    }

    //Assign Text Views their Values
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.textViewSchoolName.text = "${schools[position].schoolName}"
        holder.textViewSchoolAddress.text = "${schools[position].schoolAddress}"

        //Author: Kaleb
        holder.itemView.setOnClickListener{
            schoolFragment.onSchoolClick(schools[position])
        }
    }
}
