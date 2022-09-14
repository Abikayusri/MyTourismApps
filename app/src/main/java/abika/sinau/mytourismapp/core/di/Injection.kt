package abika.sinau.mytourismapp.core.di

import abika.sinau.mytourismapp.core.data.TourismRepository
import abika.sinau.mytourismapp.core.data.source.local.LocalDataSource
import abika.sinau.mytourismapp.core.data.source.local.room.TourismDatabase
import abika.sinau.mytourismapp.core.data.source.remote.RemoteDataSource
import abika.sinau.mytourismapp.core.data.source.remote.network.ApiConfig
import abika.sinau.mytourismapp.core.domain.repository.ITourismRepository
import abika.sinau.mytourismapp.core.utils.AppExecutors
import abika.sinau.mytourismapp.core.utils.JsonHelper
import android.content.Context
import abika.sinau.mytourismapp.core.domain.usecase.TourismInteractor
import abika.sinau.mytourismapp.core.domain.usecase.TourismUseCase

object Injection {
    private fun provideRepository(context: Context): ITourismRepository {
        val database = TourismDatabase.getInstance(context)

        val remoteDataSource = RemoteDataSource.getInstance(ApiConfig.provideApiService())
        val localDataSource = LocalDataSource.getInstance(database.tourismDao())
        val appExecutors = AppExecutors()

        return TourismRepository.getInstance(remoteDataSource, localDataSource, appExecutors)
    }

    fun provideTourismUseCase(context: Context): TourismUseCase {
        val repository = provideRepository(context)
        return TourismInteractor(repository)
    }
}
