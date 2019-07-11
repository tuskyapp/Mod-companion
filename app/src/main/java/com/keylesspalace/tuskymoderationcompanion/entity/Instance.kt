package com.keylesspalace.tuskymoderationcompanion.entity

import com.google.gson.annotations.SerializedName

data class Instance (
    val uri: String,
    val title: String,
    val description: String,
    val email: String,
    val version: String,
    val thumbnail: String?,
    val urls: Map<String, String>,
    val stats: Map<String, String>,
    val languages: List<String>,
    @SerializedName("contact_account") val contactAccount: Account,
    @SerializedName("max_toot_chars") val maxTootChars: Int?
) {
    override fun hashCode(): Int {
        return uri.hashCode()
    }

    override fun equals(other: Any?): Boolean {
        if (other !is Instance) {
            return false
        }
        val instance = other as Instance?
        return instance?.uri.equals(uri)
    }
}

