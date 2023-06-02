/*
 * Copyright (C) 2023 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.dogs.data

import com.example.affirmations.R
import com.example.dogs.model.Dog

/**
 * [Datasource] generates a list of [Dog]
 */
class Datasource {
    fun loadDogs(): List<Dog> {
        return listOf(
            Dog(R.string.rottweiler, R.drawable.rottweiler),
            Dog(R.string.beagle, R.drawable.beagle),
            Dog(R.string.boxer, R.drawable.boxer),
            Dog(R.string.bulldog, R.drawable.bulldog),
            Dog(R.string.chow_chow, R.drawable.chowchow),
            Dog(R.string.cocker_spaniel, R.drawable.cocker_spaniel),
            Dog(R.string.corgi, R.drawable.corgi),
            Dog(R.string.german_shepherd, R.drawable.german_shepherd),
            Dog(R.string.sheep_dog, R.drawable.sheep_dog),
            Dog(R.string.golden_retrievers, R.drawable.golden_retrievers))
    }
}
