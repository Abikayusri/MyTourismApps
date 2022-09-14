package abika.sinau.mytourismapp.core.domain.usecase

import abika.sinau.mytourismapp.core.data.Resource
import abika.sinau.mytourismapp.domain.model.Tourism
import androidx.lifecycle.LiveData

interface TourismUseCase {
    fun getAllTourism(): LiveData<Resource<List<Tourism>>>
    fun getFavoriteTourism(): LiveData<List<Tourism>>
    fun setFavoriteTourism(tourism: Tourism, state: Boolean)
}