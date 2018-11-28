package cn.dbboy.kotlin4android.book.domain.model

/**
 * Created by wang.lichen on 2017/7/3.
 */
data class ForecastList(val id: Long, val city: String, val country: String,
                        val dailyForecast: List<Forecast>) {

    val size: Int
        get() = dailyForecast.size

    operator fun get(position: Int) = dailyForecast[position]
}

data class Forecast(val id: Long, val date: Long, val description: String, val high: Int,
                    val low: Int,
                    val iconUrl: String)