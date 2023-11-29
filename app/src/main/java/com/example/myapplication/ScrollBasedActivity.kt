package com.example.myapplication

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.SearchView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.viewpager2.widget.ViewPager2
import com.example.myapplication.adapter.PersonAdapter
import com.example.myapplication.adapter.ViewPagerAdapter
import com.example.myapplication.databinding.ActivityScrollBasedBinding
import com.example.myapplication.model.Person
import com.google.android.material.tabs.TabLayoutMediator

val animalsArray = arrayOf(
    "Cat",
    "Dog",
    "Bird"
)

class ScrollBasedActivity : AppCompatActivity() {
    private lateinit var binding: ActivityScrollBasedBinding
    private var people: ArrayList<Person> = arrayListOf()
    private var matchedPeople: ArrayList<Person> = arrayListOf()
    private var personAdapter: PersonAdapter = PersonAdapter(this@ScrollBasedActivity, people)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityScrollBasedBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        performSearch()
        val viewPager = binding.introViewPager
        val tabLayout = binding.intoTabLayout
        val adapter = ViewPagerAdapter(supportFragmentManager, lifecycle)
        viewPager.adapter = adapter
        TabLayoutMediator(tabLayout, viewPager) { tab, position -> }.attach()
        viewPager.registerOnPageChangeCallback(object : ViewPager2.OnPageChangeCallback() {
            override fun onPageSelected(position: Int) {
                when (position) {
                    0 -> {
                        initRecyclerView(position)
                    }

                    1 -> {
                        initRecyclerView(position)
                    }
                    2 -> {
                        initRecyclerView(position)
                    }
                }
            }
        })
    }

    @SuppressLint("NotifyDataSetChanged")
    private fun initRecyclerView(position: Int) {
        when (position) {
            0 -> people = arrayListOf(
                Person(
                    "Label 1",
                    "https://plus.unsplash.com/premium_photo-1677101221533-52b45823a2dc?w=600&auto=format&fit=crop&q=60&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MXx8Y2F0fGVufDB8fDB8fHww"
                ),
                Person("Label 2", "https://images.unsplash.com/photo-1514888286974-6c03e2ca1dba?w=600&auto=format&fit=crop&q=60&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8Mnx8Y2F0fGVufDB8fDB8fHww"),
                Person("Label 3", "https://plus.unsplash.com/premium_photo-1675188410128-08479b027489?w=600&auto=format&fit=crop&q=60&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8NXx8Y2F0fGVufDB8fDB8fHww"),
                Person("Label 4", "https://images.unsplash.com/photo-1495360010541-f48722b34f7d?w=600&auto=format&fit=crop&q=60&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8NHx8Y2F0fGVufDB8fDB8fHww"),
                Person("Label 5", "https://plus.unsplash.com/premium_photo-1687191004390-5bd34561cba8?w=600&auto=format&fit=crop&q=60&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8NXx8YmlyZHN8ZW58MHx8MHx8fDA%3D"),
                Person("Label 6", "https://images.unsplash.com/photo-1515865644861-8bedc4fb8344?w=600&auto=format&fit=crop&q=60&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MjB8fGJpcmRzfGVufDB8fDB8fHww"),                Person(
                    "Label 12",
                    "https://plus.unsplash.com/premium_photo-1677101221533-52b45823a2dc?w=600&auto=format&fit=crop&q=60&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MXx8Y2F0fGVufDB8fDB8fHww"
                ),
                Person("Label 22", "https://images.unsplash.com/photo-1514888286974-6c03e2ca1dba?w=600&auto=format&fit=crop&q=60&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8Mnx8Y2F0fGVufDB8fDB8fHww"),
                Person("Label 23", "https://plus.unsplash.com/premium_photo-1675188410128-08479b027489?w=600&auto=format&fit=crop&q=60&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8NXx8Y2F0fGVufDB8fDB8fHww"),
                Person("Label 24", "https://images.unsplash.com/photo-1495360010541-f48722b34f7d?w=600&auto=format&fit=crop&q=60&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8NHx8Y2F0fGVufDB8fDB8fHww"),
                Person("Label 25", "https://plus.unsplash.com/premium_photo-1687191004390-5bd34561cba8?w=600&auto=format&fit=crop&q=60&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8NXx8YmlyZHN8ZW58MHx8MHx8fDA%3D"),
                Person("Label 26", "https://images.unsplash.com/photo-1515865644861-8bedc4fb8344?w=600&auto=format&fit=crop&q=60&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MjB8fGJpcmRzfGVufDB8fDB8fHww"),                Person(
                    "Label 31",
                    "https://plus.unsplash.com/premium_photo-1677101221533-52b45823a2dc?w=600&auto=format&fit=crop&q=60&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MXx8Y2F0fGVufDB8fDB8fHww"
                ),
                Person("Label 32", "https://images.unsplash.com/photo-1514888286974-6c03e2ca1dba?w=600&auto=format&fit=crop&q=60&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8Mnx8Y2F0fGVufDB8fDB8fHww"),
                Person("Label 33", "https://plus.unsplash.com/premium_photo-1675188410128-08479b027489?w=600&auto=format&fit=crop&q=60&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8NXx8Y2F0fGVufDB8fDB8fHww"),
                Person("Label 34", "https://images.unsplash.com/photo-1495360010541-f48722b34f7d?w=600&auto=format&fit=crop&q=60&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8NHx8Y2F0fGVufDB8fDB8fHww"),
                Person("Label 35", "https://plus.unsplash.com/premium_photo-1687191004390-5bd34561cba8?w=600&auto=format&fit=crop&q=60&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8NXx8YmlyZHN8ZW58MHx8MHx8fDA%3D"),
                Person("Label 36", "https://images.unsplash.com/photo-1515865644861-8bedc4fb8344?w=600&auto=format&fit=crop&q=60&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MjB8fGJpcmRzfGVufDB8fDB8fHww"),

            )

            1 -> people = arrayListOf(
                Person(
                    "Label 1",
                    "https://plus.unsplash.com/premium_photo-1677542200557-3c6856cc98b1?w=600&auto=format&fit=crop&q=60&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MXx8ZG9nfGVufDB8fDB8fHww"
                ),
                Person("Label 2", "https://images.unsplash.com/photo-1530281700549-e82e7bf110d6?w=600&auto=format&fit=crop&q=60&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8Nnx8ZG9nfGVufDB8fDB8fHww"),
                Person("Label 3", "https://images.unsplash.com/photo-1552053831-71594a27632d?w=600&auto=format&fit=crop&q=60&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8M3x8ZG9nfGVufDB8fDB8fHww"),
                Person("Label 4", "https://images.unsplash.com/photo-1537151625747-768eb6cf92b2?w=600&auto=format&fit=crop&q=60&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MTF8fGRvZ3xlbnwwfHwwfHx8MA%3D%3D"),
                Person("Label 5", "https://images.unsplash.com/photo-1537151625747-768eb6cf92b2?w=600&auto=format&fit=crop&q=60&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MTF8fGRvZ3xlbnwwfHwwfHx8MA%3D%3D"),
                Person("Label 6", "https://images.unsplash.com/photo-1588943211346-0908a1fb0b01?w=600&auto=format&fit=crop&q=60&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MTJ8fGRvZ3xlbnwwfHwwfHx8MA%3D%3D"),     Person(
                    "Label 21",
                    "https://plus.unsplash.com/premium_photo-1677542200557-3c6856cc98b1?w=600&auto=format&fit=crop&q=60&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MXx8ZG9nfGVufDB8fDB8fHww"
                ),
                Person("Label 22", "https://images.unsplash.com/photo-1530281700549-e82e7bf110d6?w=600&auto=format&fit=crop&q=60&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8Nnx8ZG9nfGVufDB8fDB8fHww"),
                Person("Label 23", "https://images.unsplash.com/photo-1552053831-71594a27632d?w=600&auto=format&fit=crop&q=60&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8M3x8ZG9nfGVufDB8fDB8fHww"),
                Person("Label 24", "https://images.unsplash.com/photo-1537151625747-768eb6cf92b2?w=600&auto=format&fit=crop&q=60&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MTF8fGRvZ3xlbnwwfHwwfHx8MA%3D%3D"),
                Person("Label 25", "https://images.unsplash.com/photo-1537151625747-768eb6cf92b2?w=600&auto=format&fit=crop&q=60&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MTF8fGRvZ3xlbnwwfHwwfHx8MA%3D%3D"),
                Person("Label 26", "https://images.unsplash.com/photo-1588943211346-0908a1fb0b01?w=600&auto=format&fit=crop&q=60&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MTJ8fGRvZ3xlbnwwfHwwfHx8MA%3D%3D"),     Person(
                    "Label 31",
                    "https://plus.unsplash.com/premium_photo-1677542200557-3c6856cc98b1?w=600&auto=format&fit=crop&q=60&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MXx8ZG9nfGVufDB8fDB8fHww"
                ),
                Person("Label 32", "https://images.unsplash.com/photo-1530281700549-e82e7bf110d6?w=600&auto=format&fit=crop&q=60&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8Nnx8ZG9nfGVufDB8fDB8fHww"),
                Person("Label 33", "https://images.unsplash.com/photo-1552053831-71594a27632d?w=600&auto=format&fit=crop&q=60&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8M3x8ZG9nfGVufDB8fDB8fHww"),
                Person("Label 34", "https://images.unsplash.com/photo-1537151625747-768eb6cf92b2?w=600&auto=format&fit=crop&q=60&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MTF8fGRvZ3xlbnwwfHwwfHx8MA%3D%3D"),
                Person("Label 35", "https://images.unsplash.com/photo-1537151625747-768eb6cf92b2?w=600&auto=format&fit=crop&q=60&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MTF8fGRvZ3xlbnwwfHwwfHx8MA%3D%3D"),
                Person("Label 36", "https://images.unsplash.com/photo-1588943211346-0908a1fb0b01?w=600&auto=format&fit=crop&q=60&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MTJ8fGRvZ3xlbnwwfHwwfHx8MA%3D%3D"),

            )

            2 -> people = arrayListOf(
                Person(
                    "Label 1",
                    "https://plus.unsplash.com/premium_photo-1664543649513-c21242431e6e?w=600&auto=format&fit=crop&q=60&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MXx8YmlyZHN8ZW58MHx8MHx8fDA%3D"
                ),
                Person("Label 3", "https://images.unsplash.com/photo-1591608971362-f08b2a75731a?w=600&auto=format&fit=crop&q=60&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8M3x8YmlyZHN8ZW58MHx8MHx8fDA%3D"),
                Person("Label 4", "https://plus.unsplash.com/premium_photo-1674381523950-e63ad02ee451?w=600&auto=format&fit=crop&q=60&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8OXx8YmlyZHN8ZW58MHx8MHx8fDA%3D"),
                Person("Label 5", "https://plus.unsplash.com/premium_photo-1687191004390-5bd34561cba8?w=600&auto=format&fit=crop&q=60&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8NXx8YmlyZHN8ZW58MHx8MHx8fDA%3D"),
                Person("Label 6", "https://images.unsplash.com/photo-1515865644861-8bedc4fb8344?w=600&auto=format&fit=crop&q=60&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MjB8fGJpcmRzfGVufDB8fDB8fHww"),
                Person(
                    "Label 7",
                    "https://plus.unsplash.com/premium_photo-1677101221533-52b45823a2dc?w=600&auto=format&fit=crop&q=60&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MXx8Y2F0fGVufDB8fDB8fHww"
                ),
                Person("Label 8", "https://unsplash.com/photos/close-up-of-a-yellow-and-blue-macaw-lylCw4zcA7I"),
                Person("Label 9", "https://images.unsplash.com/photo-1591608971362-f08b2a75731a?w=600&auto=format&fit=crop&q=60&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8M3x8YmlyZHN8ZW58MHx8MHx8fDA%3D"),
                Person("Label 10", "https://plus.unsplash.com/premium_photo-1674381523950-e63ad02ee451?w=600&auto=format&fit=crop&q=60&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8OXx8YmlyZHN8ZW58MHx8MHx8fDA%3D"),
                Person("Label 11", "https://plus.unsplash.com/premium_photo-1687191004390-5bd34561cba8?w=600&auto=format&fit=crop&q=60&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8NXx8YmlyZHN8ZW58MHx8MHx8fDA%3D"),
                Person("Label 12", "https://images.unsplash.com/photo-1515865644861-8bedc4fb8344?w=600&auto=format&fit=crop&q=60&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MjB8fGJpcmRzfGVufDB8fDB8fHww"),
                Person(
                    "Label 13",
                    "https://plus.unsplash.com/premium_photo-1677101221533-52b45823a2dc?w=600&auto=format&fit=crop&q=60&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MXx8Y2F0fGVufDB8fDB8fHww"
                ),
                Person("Label 22", "https://unsplash.com/photos/close-up-of-a-yellow-and-blue-macaw-lylCw4zcA7I"),
                Person("Label 32", "https://images.unsplash.com/photo-1591608971362-f08b2a75731a?w=600&auto=format&fit=crop&q=60&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8M3x8YmlyZHN8ZW58MHx8MHx8fDA%3D"),
                Person("Label 42", "https://plus.unsplash.com/premium_photo-1674381523950-e63ad02ee451?w=600&auto=format&fit=crop&q=60&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8OXx8YmlyZHN8ZW58MHx8MHx8fDA%3D"),
                Person("Label 52", "https://plus.unsplash.com/premium_photo-1687191004390-5bd34561cba8?w=600&auto=format&fit=crop&q=60&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8NXx8YmlyZHN8ZW58MHx8MHx8fDA%3D"),
                Person("Label 62", "https://images.unsplash.com/photo-1515865644861-8bedc4fb8344?w=600&auto=format&fit=crop&q=60&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MjB8fGJpcmRzfGVufDB8fDB8fHww"),

                )
        }
        binding.recyclerviewLayout.recyclerview.layoutManager = LinearLayoutManager(this)
        personAdapter = PersonAdapter(this@ScrollBasedActivity, people).also {
            binding.recyclerviewLayout.recyclerview.adapter = it
            binding.recyclerviewLayout.recyclerview.adapter!!.notifyDataSetChanged()
        }

        binding.recyclerviewLayout.searchId.isSubmitButtonEnabled = true
    }

    override fun onResume() {
        initRecyclerView(0)
        super.onResume()
    }

    private fun performSearch() {
        binding.recyclerviewLayout.searchId.setOnQueryTextListener(object :
            SearchView.OnQueryTextListener {
            override fun onQueryTextSubmit(query: String?): Boolean {
                search(query)
                return true
            }

            override fun onQueryTextChange(newText: String?): Boolean {
                search(newText)
                return true
            }
        })
    }

    private fun search(text: String?) {
        matchedPeople = arrayListOf()

        text?.let {
            people.forEach { person ->
                if (person.name.contains(text, true)) {
                    matchedPeople.add(person)
                    updateRecyclerView()
                }
            }
            if (matchedPeople.isEmpty()) {
                Toast.makeText(this, "No match found!", Toast.LENGTH_SHORT).show()
            }
            updateRecyclerView()
        }
    }

    @SuppressLint("NotifyDataSetChanged")
    private fun updateRecyclerView() {
        binding.recyclerviewLayout.recyclerview.apply {
            personAdapter.list = matchedPeople
            personAdapter.notifyDataSetChanged()
        }
    }
}