package abika.sinau.mytourismapp.core.data.source.local.room

import abika.sinau.mytourismapp.core.data.source.local.entity.TourismEntity
import androidx.lifecycle.LiveData
import androidx.room.*

@Dao
interface TourismDao {

    @Query("SELECT * FROM tourism")
    fun getAllTourism(): LiveData<List<TourismEntity>>

    @Query("SELECT * FROM tourism where isFavorite = 1")
    fun getFavoriteTourism(): LiveData<List<TourismEntity>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertTourism(tourism: List<TourismEntity>)

    @Update
    fun updateFavoriteTourism(tourism: TourismEntity)
}
