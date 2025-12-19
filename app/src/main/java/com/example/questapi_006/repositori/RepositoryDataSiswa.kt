package com.example.questapi_006.repositori

import com.example.questapi_006.apiservice.ServiceApiSiswa
import com.example.questapi_006.modeldata.DataSiswa
import retrofit2.Response

interface RepositoryDataSiswa {
    suspend fun getDataSiswa(): List<DataSiswa>
    suspend fun postDataSiswa(dataSiswa : DataSiswa) : retrofit2.Response<Void>
}
