package com.feechan.footballclub.anko

import android.graphics.Color
import android.view.Gravity
import android.view.Gravity.CENTER
import android.widget.ImageView
import android.widget.TextView
import com.feechan.footballclub.DetailFootBallClubActivity
import com.feechan.footballclub.MainActivity
import com.feechan.footballclub.R
import org.jetbrains.anko.*

/**
 * Created by Feechan on 9/6/2018.
 */

open class DetailFootBallClubActivityUI : AnkoComponent<DetailFootBallClubActivity> {

    lateinit var imageView: ImageView
    lateinit var nameTextView: TextView
    lateinit var descriptionTextView: TextView

    override fun createView(ui: AnkoContext<DetailFootBallClubActivity>) = with(ui) {
       verticalLayout{
           padding = dip(16)
           verticalLayout{

               imageView = imageView(){
                   backgroundColor = Color.TRANSPARENT
                   adjustViewBounds = true
                   setImageResource(R.drawable.img_arsenal)
               }.lparams(width = dip(75), height = dip(75)){
                   gravity = Gravity.CENTER
               }
               nameTextView = textView{
                   text = "CHELSEA"
                   textSize = 18f
               }.lparams(width = wrapContent){
                   gravity = Gravity.CENTER
                   topMargin = 7
               }
           }
           descriptionTextView = textView{
               text = "DESCRIPTION DESCRIPTION DESCRIPTION DESCRIPTION DESCRIPTION DESCRIPTION DESCRIPTION"
               textSize = 16f
           }.lparams(width = wrapContent){
               gravity = Gravity.CENTER
               topMargin = 32
           }
       }
    }
}