package com.keylesspalace.tuskymoderationcompanion.entity

import com.google.gson.annotations.SerializedName

data class Report(
    val resolved: Boolean,
    @SerializedName("account_id") val accountId: String,
    @SerializedName("target_account_id") val targetAccountId: String
)