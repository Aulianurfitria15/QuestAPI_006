@file:OptIn(InternalSerializationApi::class)

package com.example.questapi_006.viewmodel

import android.annotation.SuppressLint
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.questapi_006.model.DataSiswa
import com.example.questapi_006.repository.RepositoryDataSiswa
import com.example.questapi_006.uicontroller.route.DestinasiDetail
import kotlinx.coroutines.launch
import kotlinx.serialization.InternalSerializationApi
import retrofit2.HttpException
import retrofit2.Response
import java.io.IOException

sealed interface StatusUiDetail {
    data class Success(val satusiswa: DataSiswa) : StatusUiDetail
    object Error : StatusUiDetail
    object Loading : StatusUiDetail
}

