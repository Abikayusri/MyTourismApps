package abika.sinau.mytourismapp.home

import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import abika.sinau.mytourismapp.core.domain.usecase.TourismUseCase

class HomeViewModel(tourismUseCase: TourismUseCase) : ViewModel() {
    val tourism = tourismUseCase.getAllTourism().asLiveData()
}

