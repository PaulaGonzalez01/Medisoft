package paula.espol.pasantias.medisoft.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import paula.espol.pasantias.medisoft.R
import paula.espol.pasantias.medisoft.model.OptionMenu

class OptionAdapter (var context: Context, var arrayList: ArrayList<OptionMenu>) :
    RecyclerView.Adapter<OptionAdapter.ItemHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemHolder {
        val itemHolder = LayoutInflater.from(parent.context).inflate(R.layout.grid_list_layout,parent,false)
        return ItemHolder(itemHolder)
    }

    override fun getItemCount(): Int {
        return arrayList.size
    }

    override fun onBindViewHolder(holder: ItemHolder, position: Int) {
        val option: OptionMenu = arrayList.get(position)

        holder.optionImage.setImageResource(option.iconNum!!) //Sets a drawable as the content
        holder.title.text = option.optionTitle

        holder.optionImage.setOnClickListener{
            Toast.makeText(context, option.optionTitle, Toast.LENGTH_SHORT).show()
        }
    }

    class ItemHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        var optionImage = itemView.findViewById<ImageView>(R.id.options_image)
        var title : TextView = itemView.findViewById<TextView>(R.id.text_option_title)

    }


}