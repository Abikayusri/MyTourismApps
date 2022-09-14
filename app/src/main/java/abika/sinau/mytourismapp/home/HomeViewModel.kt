package abika.sinau.mytourismapp.home

import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import abika.sinau.mytourismapp.core.domain.usecase.TourismUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(tourismUseCase: TourismUseCase) : ViewModel() {
    val tourism = tourismUseCase.getAllTourism().asLiveData()
}

