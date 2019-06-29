package com.feechan.footballclub.adapter

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.bumptech.glide.Glide
import com.feechan.footballclub.R
import com.feechan.footballclub.entity.FootBallClub
import kotlinx.android.extensions.LayoutContainer
import kotlinx.android.synthetic.main.footbal_club_list_item.*

/**
 * Created by Feechan on 9/6/2018.
 */
class RecyclerViewAdapter(private val context: Context, private val items: List<FootBallClub>, private val listener: (FootBallClub) -> Unit)
    : RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder>()  {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
            ViewHolder(LayoutInflater.from(context).inflate(R.layout.footbal_club_list_item, parent, false))

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindItem(items[position], listener)
    }

    override fun getItemCount(): Int = items.size

    class ViewHolder(override val containerView: View) : RecyclerView.ViewHolder(containerView),
            LayoutContainer {
        fun bindItem(footBallClub: FootBallClub, listener: (FootBallClub) -> Unit) {
            name.text = footBallClub.name
            Glide.with(itemView.context).load(footBallClub.image).into(image)
            itemView.setOnClickListener {
                listener(footBallClub)
            }
        }
    }
}