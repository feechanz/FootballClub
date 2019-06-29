package com.feechan.footballclub

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.feechan.footballclub.anko.DetailFootBallClubActivityUI
import com.feechan.footballclub.entity.FootBallClub
import org.jetbrains.anko.setContentView

class DetailFootBallClubActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val contentUI = DetailFootBallClubActivityUI()
        contentUI.setContentView(this)

        val intent = intent
        val footBallClub : FootBallClub? = intent.extras.getParcelable<FootBallClub>("footBallClub")
        if(footBallClub != null) {
            contentUI.nameTextView.text = footBallClub.name
            contentUI.imageView.setImageResource(footBallClub.image!!)
            contentUI.descriptionTextView.text = footBallClub.description
        }
    }
}
