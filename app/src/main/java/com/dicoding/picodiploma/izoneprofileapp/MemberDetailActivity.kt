package com.dicoding.picodiploma.izoneprofileapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_member_detail.*

class MemberDetailActivity : AppCompatActivity() {

    companion object {
        const val EXTRA_NAME = "extra_name"
        const val EXTRA_RANK = "extra_rank"
        const val EXTRA_ROLE = "extra_role"
        const val EXTRA_BIRTHDAY = "extra_birthday"
        const val EXTRA_ZODIAC = "extra_zodiac"
        const val EXTRA_HEIGHT = "extra_height"
        const val EXTRA_WEIGHT = "extra_weight"
        const val EXTRA_BLOODTYPE = "extra_bloodtype"
        const val EXTRA_HOBBY = "extra_hobby"
        const val EXTRA_SPECIALITY = "extra_speciality"
        const val EXTRA_COLOR = "extra_color"
        const val EXTRA_FACTS = "extra_facts"
        const val EXTRA_AGENCY = "extra_agency"
        const val EXTRA_IMAGE_URL = "extra_image_url"
        const val EXTRA_DEBUT_IMG = "extra_debut_img"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_member_detail)

        tv_detail_name.setText(intent.getStringExtra(EXTRA_NAME))
        tv_detail_rank.setText(intent.getStringExtra(EXTRA_RANK))
        tv_detail_role.setText(intent.getStringExtra(EXTRA_ROLE))
        tv_detail_birthday.setText(intent.getStringExtra(EXTRA_BIRTHDAY))
        tv_detail_zodiac.setText(intent.getStringExtra(EXTRA_ZODIAC))
        tv_detail_height.setText(intent.getStringExtra(EXTRA_HEIGHT))
        tv_detail_weight.setText(intent.getStringExtra(EXTRA_WEIGHT))
        tv_detail_bloodtype.setText(intent.getStringExtra(EXTRA_BLOODTYPE))
        tv_detail_hobby.setText(intent.getStringExtra(EXTRA_HOBBY))
        tv_detail_speciality.setText(intent.getStringExtra(EXTRA_SPECIALITY))
        tv_detail_color.setText(intent.getStringExtra(EXTRA_COLOR))
        tv_detail_facts.setText(intent.getStringExtra(EXTRA_FACTS))
        tv_detail_agency.setText(intent.getStringExtra(EXTRA_AGENCY))

        img_detail_member_photo.setImageResource(intent.getIntExtra(EXTRA_IMAGE_URL, 0))
        img_member_debut_photo.setImageResource(intent.getIntExtra(EXTRA_DEBUT_IMG, 0))

        btn_favorite.setOnClickListener {
            Toast.makeText(btn_favorite.context,"Added to favorite!", Toast.LENGTH_SHORT).show()
        }

        btn_share.setOnClickListener {
            Toast.makeText(btn_share.context, "Share features coming soon!", Toast.LENGTH_SHORT).show()
        }
    }



}