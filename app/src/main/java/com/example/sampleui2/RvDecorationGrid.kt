package com.example.sampleui2

import android.graphics.Rect
import android.view.View
import androidx.recyclerview.widget.RecyclerView

class RvDecorationGrid(private var spancount:Int, private var spacing:Int, private var includeEdge :Boolean) : RecyclerView.ItemDecoration() {


    override fun getItemOffsets(
            outRect: Rect,
            view: View,
            parent: RecyclerView,
            state: RecyclerView.State
    ) {
        val position :Int=parent.getChildAdapterPosition(view)    //item Position
        val column:Int=position%spancount
        if (includeEdge) {
            outRect.left =
                    spacing - column * spacing / spancount // spacing - column * ((1f / spanCount) * spacing)
            outRect.right =
                    (column + 1) * spacing / spancount  // (column + 1) * ((1f / spanCount) * spacing)

            if (position < spancount) { // top edge
                outRect.top = spacing
            }
            outRect.bottom = spacing  //item Bottom
        }
        else{
            outRect.left = column * spacing / spancount // column * ((1f / spanCount) * spacing)
            outRect.right = spacing - (column + 1) * spacing / spancount // spacing - (column + 1) * ((1f /    spanCount) * spacing)
            if (position >= spancount) {
                outRect.top = spacing // item top
            }
        }
    }
}