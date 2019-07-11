package com.keylesspalace.tuskymoderationcompanion.util

import android.os.Build
import android.text.Html
import android.text.Spanned


object HtmlUtils {
        fun trimTrailingWhitespace(s: CharSequence): CharSequence {
                var i = s.length
                do {
                        i--
                } while (i >= 0 && Character.isWhitespace(s[i]))
                return s.subSequence(0, i + 1)
        }

        fun fromHtml(html: String): Spanned {
                return when {
                        Build.VERSION.SDK_INT >= Build.VERSION_CODES.N -> Html.fromHtml(
                                html,
                                Html.FROM_HTML_MODE_LEGACY
                        )
                        else -> Html.fromHtml(html)
                }
        }

        fun toHtml(text: Spanned): String {
                return when {
                        Build.VERSION.SDK_INT >= Build.VERSION_CODES.N -> Html.toHtml(
                                text,
                                Html.TO_HTML_PARAGRAPH_LINES_CONSECUTIVE
                        )
                        else -> Html.toHtml(text)
                }
        }
}