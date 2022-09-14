package abika.sinau.mytourismapp.core.domain.usecase

import abika.sinau.mytourismapp.core.domain.repository.ITourismRepository
import abika.sinau.mytourismapp.domain.model.Tourism

class TourismInteractor(private val tourismRepository: ITourismRepository) : TourismUseCase {

    override fun getAllTourism() = tourismRepository.getAllTourism()

    override fun getFavoriteTourism() = tourismRepository.getFavoriteTourism()

    override fun setFavoriteTourism(tourism: Tourism, state: Boolean) =
        tourismRepository.setFavoriteTourism(tourism, state)
}