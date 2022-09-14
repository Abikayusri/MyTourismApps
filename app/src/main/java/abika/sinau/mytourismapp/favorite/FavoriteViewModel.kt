package abika.sinau.mytourismapp.favorite

import abika.sinau.mytourismapp.core.domain.usecase.TourismUseCase
import androidx.lifecycle.ViewModel

class FavoriteViewModel(tourismUseCase: TourismUseCase) : ViewModel() {
    val favoriteTourism = tourismUseCase.getFavoriteTourism()
}

