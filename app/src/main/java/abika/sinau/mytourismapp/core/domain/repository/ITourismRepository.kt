package abika.sinau.mytourismapp.core.domain.repository

import abika.sinau.mytourismapp.core.data.Resource
import abika.sinau.mytourismapp.core.domain.model.Tourism
import kotlinx.coroutines.flow.Flow

interface ITourismRepository {

    fun getAllTourism(): Flow<Resource<List<Tourism>>>

    fun getFavoriteTourism(): Flow<List<Tourism>>

    fun setFavoriteTourism(tourism: Tourism, state: Boolean)

}