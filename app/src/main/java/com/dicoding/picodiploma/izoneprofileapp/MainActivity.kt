package com.dicoding.picodiploma.izoneprofileapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var rvIzMember: RecyclerView
    private lateinit var listMemberAdapter: ListMemberAdapter
    private var list: ArrayList<Member> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvIzMember = findViewById(R.id.rv_member)
        rvIzMember.setHasFixedSize(true)

        list.addAll(MemberData.listMember)
        showRecylerList()
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.item_about_me -> {
                val aboutMeIntent = Intent(this@MainActivity, AboutMeActivity::class.java)
                startActivity(aboutMeIntent)
            }
        }
        return super.onOptionsItemSelected(item)
    }

    private fun showRecylerList() {
        rvIzMember.layoutManager = LinearLayoutManager(this)
        listMemberAdapter = ListMemberAdapter(list)
        rvIzMember.adapter = listMemberAdapter

        listMemberAdapter.setOnItemClickCallback(object : ListMemberAdapter.OnItemClickCallback {
            override fun onItemClick(data: Member) {
                val memberDetailIntent = Intent(this@MainActivity, MemberDetailActivity::class.java).apply {
                    putExtra(MemberDetailActivity.EXTRA_NAME, data.fullName)
                    putExtra(MemberDetailActivity.EXTRA_RANK, data.rank.toString())
                    putExtra(MemberDetailActivity.EXTRA_ROLE, data.role)
                    putExtra(MemberDetailActivity.EXTRA_BIRTHDAY, data.birthday)
                    putExtra(MemberDetailActivity.EXTRA_ZODIAC, data.zodiac)
                    putExtra(MemberDetailActivity.EXTRA_HEIGHT, data.height)
                    putExtra(MemberDetailActivity.EXTRA_WEIGHT, data.weight)
                    putExtra(MemberDetailActivity.EXTRA_BLOODTYPE, data.bloodType)
                    putExtra(MemberDetailActivity.EXTRA_HOBBY, data.hobby)
                    putExtra(MemberDetailActivity.EXTRA_SPECIALITY, data.speciality)
                    putExtra(MemberDetailActivity.EXTRA_COLOR, data.color)
                    putExtra(MemberDetailActivity.EXTRA_FACTS, data.facts)
                    putExtra(MemberDetailActivity.EXTRA_AGENCY, data.agency)
                    putExtra(MemberDetailActivity.EXTRA_IMAGE_URL, data.photo)
                    putExtra(MemberDetailActivity.EXTRA_DEBUT_IMG, data.debut)
                }
                startActivity(memberDetailIntent)
            }
        })
    }
}