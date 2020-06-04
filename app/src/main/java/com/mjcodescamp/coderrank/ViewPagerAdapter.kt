package com.mjcodescamp.coderrank

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.viewpager.widget.PagerAdapter
import androidx.viewpager.widget.ViewPager

class ViewPagerAdapter (private val cont: Context) : PagerAdapter() {

    val items = arrayOf<Int>(R.drawable.banner1, R.drawable.banner2, R.drawable.banner3)
    override fun isViewFromObject(view: View, `object`: Any): Boolean {
        return view == `object`
    }
    override fun getCount(): Int {
        return items.size
    }
    override fun instantiateItem(container: ViewGroup, position: Int): Any {
        val layoutInflater: LayoutInflater = cont.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        val x = layoutInflater.inflate(R.layout.custom_activity,null)
        val image = x.findViewById<ImageView>(R.id.sliderImage)
        image.setImageResource(items[position])
        container.addView(x,0)
        return x
    }
    override fun destroyItem(container: ViewGroup, position: Int, `object`: Any) {
        val viewP = container as ViewPager
        val x = `object` as View
        viewP.removeView(x)
    }
}
