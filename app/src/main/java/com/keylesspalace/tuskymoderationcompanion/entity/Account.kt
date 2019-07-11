package com.keylesspalace.tuskymoderationcompanion.entity

import com.google.gson.annotations.SerializedName

data class Account (
    val local: String,
    val remote: String,
    @SerializedName("by_domain") val byDomain: String,
    val active: String,
    val pending: String,
    val disabled: String,
    val silenced: String,
    val suspended: String,
    val username: String,
    @SerializedName("display_name") val displayName: String,
    val email: String,
    val ip: String,
    val staff: String
)