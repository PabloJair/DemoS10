package com.s10plus.demos10plus.core

import androidx.recyclerview.widget.RecyclerView
import androidx.viewbinding.ViewBinding

abstract class BaseAdapter<M, I: BaseViewHolder<*, M>>: RecyclerView.Adapter<I>() {

    var onClickItem:((item: M,view: ViewBinding)->Unit)?=null

    protected var  items: ArrayList<M> = arrayListOf()

    private lateinit var recyclerView: RecyclerView

    fun setupItems(items:ArrayList<M>){
        this.items = items.ifEmpty { arrayListOf() }
        notifyDataSetChanged()
    }

    fun clearItems(){
        items = arrayListOf()
    }

    fun insertNewElement(addElement:M){
        items.add(addElement)
        notifyItemRangeInserted(items.size+1,items.size)
        recyclerView.smoothScrollToPosition(items.size+1)
    }

    override fun onAttachedToRecyclerView(recyclerView: RecyclerView) {
        super.onAttachedToRecyclerView(recyclerView)
        this.recyclerView= recyclerView;
    }

    override fun getItemCount(): Int = items.size


}