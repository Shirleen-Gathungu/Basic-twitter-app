package com.example.basictweetapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class TweetsAdapter(var tweetsList: List<Peopletweets>): RecyclerView.Adapter<PeopletweetsViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PeopletweetsViewHolder {
        var itemView = LayoutInflater.from(parent.context).inflate(R.layout.twitter_app,parent,false)
        return PeopletweetsViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: PeopletweetsViewHolder, position: Int) {
        var currentTweets = tweetsList.get(position)

        holder.tvNameOne.text =currentTweets.name
        holder.tvatOne.text =currentTweets.at
        holder.tvTimeOne.text =currentTweets.time.toString()
        holder.tvTweet.text =currentTweets.tweet


//        holder.tvName.text = currentPost.name

    }

    override fun getItemCount(): Int {
        return tweetsList.size
    }
}
class PeopletweetsViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
var tvNameOne= itemView.findViewById<TextView>(R.id.tvNameOne)
 var tvatOne = itemView.findViewById<TextView>(R.id.tvatOne)
 var  tvTimeOne =itemView.findViewById<TextView>(R.id.tvTimeOne)
var tvTweet= itemView.findViewById<TextView>(R.id.tvTweet)
var ivReply =itemView.findViewById<ImageView>(R.id.ivReply)
var ivRetweet =itemView.findViewById<ImageView>(R.id.ivRetweet)
 var ivShare =itemView.findViewById<ImageView>(R.id.ivShare)
    var ivShirleen= itemView.findViewById<ImageView>(R.id.ivShirleen)


//    var tvName = itemView.findViewById<TextView>(R.id.tvName)

    }