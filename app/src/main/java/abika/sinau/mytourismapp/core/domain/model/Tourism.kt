package abika.sinau.mytourismapp.domain.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize


/**
 * @author by Abika Chairul Yusri on 9/13/2022
 */
// TODO: 1. Tambahkan response pada module domain

@Parcelize
data class Tourism(
    val tourismId: String,
    val name: String,
    val description: String,
    val address: String,
    val latitude: Double,
    val longitude: Double,
    val like: Int,
    val image: String,
    val isFavorite: Boolean
) : Parcelable
