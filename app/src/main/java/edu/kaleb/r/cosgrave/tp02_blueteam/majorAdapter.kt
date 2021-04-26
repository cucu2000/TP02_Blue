package edu.kaleb.r.cosgrave.tp02_blueteam

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import edu.kaleb.r.cosgrave.tp02_blueteam.Models.Major

//Author: Kaleb

class majorAdapter(
    var majors: ArrayList<Major>,
    var mainActivity: MainActivity
): RecyclerView.Adapter<majorAdapter.ViewHolder>() {

    class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        var txtMajor: TextView = itemView.findViewById(R.id.textViewMajor)
        var txtHead: TextView = itemView.findViewById(R.id.textViewHead)
    }

    override fun getItemCount(): Int {
       return 3
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.activity_majors, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.txtMajor.text = "${majors[position].majorName}"
        holder.txtHead.text = "${
            majors[position].Head.personName +
            majors[position].Head.personPosition + 
            majors[position].Head.personEmail + 
                    majors[position].Head.personRoom
        }"
    }
}