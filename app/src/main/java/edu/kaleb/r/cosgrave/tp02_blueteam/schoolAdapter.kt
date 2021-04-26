package edu.kaleb.r.cosgrave.tp02_blueteam

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import edu.kaleb.r.cosgrave.tp02_blueteam.Models.Schools

//author: Tristan

class schoolAdapter (
    var schools: ArrayList<Schools>,
    var mainActivity: MainActivity
): RecyclerView.Adapter<schoolAdapter.ViewHolder>() {

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var textViewSchoolName: TextView = itemView.findViewById(R.id.textViewSchoolName)
        var textViewSchoolAddress: TextView = itemView.findViewById(R.id.textViewSchoolAddress)
    }

    override fun getItemCount(): Int {
        return 3
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): schoolAdapter.ViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.activity_school, parent, false)
        return schoolAdapter.ViewHolder(view)
    }

    override fun onBindViewHolder(holder: schoolAdapter.ViewHolder, position: Int) {
        holder.textViewSchoolName.text = "${schools[position].schoolName}"
        holder.textViewSchoolAddress.text = "${schools[position].schoolAddress}"
    }
}
