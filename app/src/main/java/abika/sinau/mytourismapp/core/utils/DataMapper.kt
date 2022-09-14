package abika.sinau.mytourismapp.core.utils

import abika.sinau.mytourismapp.core.data.source.local.entity.TourismEntity
import abika.sinau.mytourismapp.domain.model.Tourism
import abika.sinau.mytourismapp.core.data.source.remote.response.TourismResponse


/**
 * @author by Abika Chairul Yusri on 9/13/2022
 */

// TODO: 2. Tambahkan object mapper
object DataMapper {

    // TODO: 3. Tambahkan funtion convertion
    // region tambahkan function convertion

    fun mapEntitiesToDomain(input: List<TourismEntity>): List<Tourism> =
        input.map {
            Tourism(
                tourismId = it.tourismId,
                description = it.description,
                name = it.name,
                address = it.address,
                latitude = it.latitude,
                longitude = it.longitude,
                like = it.like,
                image = it.image,
                isFavorite = it.isFavorite
            )
        }

    fun mapDomainToEntity(input: Tourism) = TourismEntity(
        tourismId = input.tourismId,
        description = input.description,
        name = input.name,
        address = input.address,
        latitude = input.latitude,
        longitude = input.longitude,
        like = input.like,
        image = input.image,
        isFavorite = input.isFavorite
    )

    // endregion

    fun mapResponsesToEntities(input: List<TourismResponse>): List<TourismEntity> {
        val tourismList = ArrayList<TourismEntity>()
        input.map {
            val tourism = TourismEntity(
                tourismId = it.id,
                description = it.description,
                name = it.name,
                address = it.address,
                latitude = it.latitude,
                longitude = it.longitude,
                like = it.like,
                image = it.image,
                isFavorite = false
            )
            tourismList.add(tourism)
        }
        return tourismList
    }
}