package com.s10plus.demos10plus.areas.meals

import android.view.ViewGroup
import com.s10plus.demos10plus.core.BaseAdapter
import com.s10plus.demos10plus.core.BaseViewHolder
import com.s10plus.demos10plus.databinding.AreaItemBinding
import com.s10plus.demos10plus.meal.remote.entities.ItemMealArea

class AreasMealsAdapter:BaseAdapter<ItemMealArea,BaseViewHolder<AreaItemBinding,ItemMealArea>>() {
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): BaseViewHolder<AreaItemBinding, ItemMealArea> {
        return AreaMealsItem(parent)
    }

    override fun onBindViewHolder(
        holder: BaseViewHolder<AreaItemBinding, ItemMealArea>,
        position: Int
    ) {
        holder.setup(items[position])
    }
}