package com.example.dogs.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Dog(
    @StringRes val stringResourceId: Int,
    @DrawableRes val imageResourceId: Int
)
