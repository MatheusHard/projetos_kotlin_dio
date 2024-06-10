package com.example.dio_kotlin.models

import android.os.Parcelable
import kotlinx.parcelize.IgnoredOnParcel
import kotlinx.parcelize.Parcelize

@Parcelize
data class PersonModel(
    val nome : String =  "",
    val idade: Int = 0,
    val rua: String = "",
    val numero: Int = 0
) : Parcelable{

    @IgnoredOnParcel
    val pessoa = "Nome -> $nome Idade -> $idade"

    @IgnoredOnParcel
    val endereco = "Rua -> $rua , nº $numero"
}