package com.keylesspalace.tuskymoderationcompanion.entity.helper

import android.os.Parcel
import android.text.Spanned
import com.keylesspalace.tuskymoderationcompanion.util.HtmlUtils
import kotlinx.android.parcel.Parceler

object SpannedParceler : Parceler<Spanned> {
    override fun create(parcel: Parcel): Spanned = HtmlUtils.fromHtml(parcel.readString())

    override fun Spanned.write(parcel: Parcel, flags: Int) {
        parcel.writeString(HtmlUtils.toHtml(this))
    }
}