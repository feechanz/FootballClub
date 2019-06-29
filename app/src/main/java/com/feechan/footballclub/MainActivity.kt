package com.feechan.footballclub

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import com.feechan.footballclub.adapter.RecyclerViewAdapter
import com.feechan.footballclub.entity.FootBallClub
import kotlinx.android.synthetic.main.activity_main_layout.*
import org.jetbrains.anko.startActivity

class MainActivity : AppCompatActivity() {

    private var footBallClubs: MutableList<FootBallClub> = mutableListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_layout)

        initData()

        clubRecycleView.layoutManager = LinearLayoutManager(this)
        clubRecycleView.adapter = RecyclerViewAdapter(this, footBallClubs){ footBallClub ->
            this.progressFootballClub(footBallClub)
        }
    }

    private fun progressFootballClub(footBallClub: FootBallClub){
        startActivity<DetailFootBallClubActivity>("footBallClub" to footBallClub)
    }

    private fun initData(){
        val names = resources.getStringArray(R.array.club_name)
        val images = resources.obtainTypedArray(R.array.club_image)
        val descriptions = resources.getStringArray(R.array.club_description)
        footBallClubs.clear()
        for (i in names.indices) {
            footBallClubs.add(FootBallClub(names[i],
                    images.getResourceId(i, 0), descriptions[i]))
        }
        images.recycle()
    }
}
