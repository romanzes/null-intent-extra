package com.romanzes.nullintentextra

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class FormData(val enteredText: String) : Parcelable
