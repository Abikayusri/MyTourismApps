package abika.sinau.mytourismapp.home

import abika.sinau.mytourismapp.core.domain.usecase.TourismUseCase
import androidx.lifecycle.ViewModel

class HomeViewModel(tourismUseCase: TourismUseCase) : ViewModel() {
    val tourism = tourismUseCase.getAllTourism()
}

