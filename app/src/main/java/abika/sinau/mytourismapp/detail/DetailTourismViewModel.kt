package abika.sinau.mytourismapp.detail

import abika.sinau.mytourismapp.core.domain.usecase.TourismUseCase
import abika.sinau.mytourismapp.domain.model.Tourism
import androidx.lifecycle.ViewModel

class DetailTourismViewModel(private val tourismUseCase: TourismUseCase) : ViewModel() {
    fun setFavoriteTourism(tourism: Tourism, newStatus: Boolean) =
        tourismUseCase.setFavoriteTourism(tourism, newStatus)
}

