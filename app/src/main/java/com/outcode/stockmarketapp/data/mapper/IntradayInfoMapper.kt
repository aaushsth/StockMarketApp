package com.outcode.stockmarketapp.data.mapper

import com.outcode.stockmarketapp.data.remote.dto.IntradayInfoDto
import com.outcode.stockmarketapp.domain.model.IntradayInfo
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter
import java.util.*

fun IntradayInfoDto.toIntradayInfo(): IntradayInfo {
    val pattern = "yyyy-MM-dd HH:mm:ss"
    val formatter = DateTimeFormatter.ofPattern(pattern, Locale.getDefault())
    val localDateTime = LocalDateTime.parse(timestamp, formatter)
    return IntradayInfo(
        date = localDateTime,
        close = close
    )
}