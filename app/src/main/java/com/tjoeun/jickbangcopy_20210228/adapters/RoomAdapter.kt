package com.tjoeun.jickbangcopy_20210228.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView
import com.tjoeun.jickbangcopy_20210228.R
import com.tjoeun.jickbangcopy_20210228.datas.Room

class RoomAdapter(
    val mContext: Context,
    val resId: Int,
    val mList: ArrayList<Room>) : ArrayAdapter<Room>(mContext, resId, mList) {


    val inf = LayoutInflater.from(mContext)

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

        var tempRow = convertView
        if (tempRow == null) {
            tempRow = inf.inflate(R.layout.room_list_item, null)
        }

        val row = tempRow!!

//        row의 내용물을 변경하고 나서 => return

        val data = mList[position]

        val priceTxt = row.findViewById<TextView>(R.id.priceTxt)
        val addressAndFloorTxt = row.findViewById<TextView>(R.id.addressAndFloorTxt)
        val descriptionTxt = row.findViewById<TextView>(R.id.descriptionTxt)

//        설명 문구 : 있는 그대로.
        descriptionTxt.text = data.description

        return row
    }


}