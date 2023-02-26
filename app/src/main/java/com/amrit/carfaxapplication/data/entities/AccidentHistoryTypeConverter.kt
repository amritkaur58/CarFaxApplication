package com.amrit.carfaxapplication.data.entities

import androidx.room.TypeConverter
import org.json.JSONObject

class AccidentHistoryTypeConverter {
    @TypeConverter
    fun fromSource(source: AccidentHistory): String {
        return JSONObject().apply {
            put("accidentSummary", source.accidentSummary)
            put("icon", source.icon)
        }.toString()
    }


}
