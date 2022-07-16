package com.company.qrcode2

data class Response(
    val status: Int,
    val message: String,
    val data: DataMahasiswa? = null
)