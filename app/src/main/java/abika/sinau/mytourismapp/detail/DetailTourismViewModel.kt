package abika.sinau.mytourismapp.detail

import androidx.lifecycle.ViewModel
import abika.sinau.mytourismapp.core.domain.model.Tourism
import abika.sinau.mytourismapp.core.domain.usecase.TourismUseCase

class DetailTourismViewModel(private val tourismUseCase: TourismUseCase) : ViewModel() {
    fun setFavoriteTourism(tourism: Tourism, newStatus:Boolean) =
        tourismUseCase.setFavoriteTourism(tourism, newStatus)
}

