package com.example.movieapp.data.source.local.db


import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.movieapp.models.RemoteKeys

@Dao
interface RemoteKeysDao {
 @Insert(onConflict = OnConflictStrategy.REPLACE)
 suspend fun insertAll(remoteKey: List<RemoteKeys>)

 @Query("SELECT * FROM remote_keys WHERE MovieId = :movieId")
 suspend fun remoteKeysMovieId(movieId: Int): RemoteKeys?

 @Query("DELETE FROM remote_keys")
 suspend fun clearRemoteKeys()
}