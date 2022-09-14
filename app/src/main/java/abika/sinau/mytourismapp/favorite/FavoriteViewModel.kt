package abika.sinau.mytourismapp.favorite

import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import abika.sinau.mytourismapp.core.domain.usecase.TourismUseCase

class FavoriteViewModel(tourismUseCase: TourismUseCase) : ViewModel() {
    val favoriteTourism = tourismUseCase.getFavoriteTourism().asLiveData()
}

