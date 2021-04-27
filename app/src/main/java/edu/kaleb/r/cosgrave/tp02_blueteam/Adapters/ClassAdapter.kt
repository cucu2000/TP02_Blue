package edu.kaleb.r.cosgrave.tp02_blueteam.Adapters
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import edu.kaleb.r.cosgrave.tp02_blueteam.ClassActivity
import edu.kaleb.r.cosgrave.tp02_blueteam.Models.Classes
import edu.kaleb.r.cosgrave.tp02_blueteam.R

//Author: Milan

//Create Class with Inputs Needed to Create View
class ClassAdapter(var classes: ArrayList<Classes>, var classActivity: ClassActivity): RecyclerView.Adapter<ClassAdapter.ViewHolder>() {

    //Create ViewHolder
    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var txtName: TextView = itemView.findViewById(R.id.textViewClassName)
        var txtId: TextView = itemView.findViewById(R.id.TextViewId)

    }

    //implement RecyclerView Methods
    //Set the Layour for the View
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.activity_classes_details, parent, false)
        return ViewHolder(view)
    }

    //Set the # of Rows
    override fun getItemCount(): Int {
        return classes.size
    }

    //Assign Text Views their Values
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.txtName.text = "${classes[position].classname}"
        holder.txtId.text = "${classes[position].classid}"
    }
}