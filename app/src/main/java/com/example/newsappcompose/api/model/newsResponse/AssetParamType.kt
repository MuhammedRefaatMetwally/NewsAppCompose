package com.example.newsappcompose.api.model.newsResponse

import android.os.Bundle
import androidx.navigation.NavType
import com.google.gson.Gson

class AssetParamType : NavType<News>(isNullableAllowed = false) {
    override fun get(bundle: Bundle, key: String): News? {
        return bundle.getParcelable(key)
    }

    override fun parseValue(value: String): News {
        return Gson().fromJson(value, News::class.java)
    }

    override fun put(bundle: Bundle, key: String, value: News) {
        bundle.putParcelable(key, value)
    }
}