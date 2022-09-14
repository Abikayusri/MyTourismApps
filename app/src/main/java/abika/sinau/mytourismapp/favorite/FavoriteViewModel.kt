package abika.sinau.mytourismapp.favorite

import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import abika.sinau.mytourismapp.core.domain.usecase.TourismUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class FavoriteViewModel @Inject constructor(tourismUseCase: TourismUseCase) : ViewModel() {
    val favoriteTourism = tourismUseCase.getFavoriteTourism().asLiveData()
}

