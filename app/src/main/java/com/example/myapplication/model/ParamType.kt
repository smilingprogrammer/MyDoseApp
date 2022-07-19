package com.example.myapplication.model

import android.os.Bundle
import androidx.navigation.NavType
import com.google.gson.Gson

class ParamType: NavType<Medication>(isNullableAllowed = false) {
    override fun get(bundle: Bundle, key: String): Medication? {
        return bundle.getParcelable(key)
    }

    override fun parseValue(value: String): Medication {
        return Gson().fromJson(value, Medication::class.java)
    }

    override fun put(bundle: Bundle, key: String, value: Medication) {
        bundle.putParcelable(key, value)
    }
}