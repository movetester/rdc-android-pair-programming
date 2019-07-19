package rdc.move_test

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView

import java.util.ArrayList

import rdc.move_test.model.Property
import rdc.move_test.util.TestAdapterContract
import com.bumptech.glide.Glide

class ListAdapterKotlin(private val context: Context) : RecyclerView.Adapter<ListAdapterKotlin.ListItemHolder>(), TestAdapterContract {
    private var listItems: List<Property> = ArrayList()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListItemHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.layout_list_item, parent, false)
        return ListItemHolder(view)
    }

    override fun onBindViewHolder(holder: ListItemHolder, position: Int) {
        val property = listItems[position]

        // Load title
        holder.titleView.text = property.presentableAddress

        // Load price
        holder.priceView.text = property.presentablePrice

        // Load image
        Glide.with(context)
            .load(property.singlePhoto)
            .centerCrop()
            .into(holder.imageView)
    }

    override fun getItemCount(): Int {
        return listItems.size
    }

    override fun setListItems(listItems: List<Property>) {
        this.listItems = listItems
    }

    class ListItemHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val titleView: TextView = itemView.findViewById(R.id.list_item_title)
        val imageView: ImageView = itemView.findViewById(R.id.list_item_image)
        val priceView: TextView = itemView.findViewById(R.id.list_item_price)
    }
}
