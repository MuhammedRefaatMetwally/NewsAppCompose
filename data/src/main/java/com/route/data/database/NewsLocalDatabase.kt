package com.route.data.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.route.data.models.ArticlesItem
import com.route.data.models.SourceItem

@Database(entities = [ArticlesItem::class, SourceItem::class], version = 1)
abstract class NewsLocalDatabase : RoomDatabase() {

    abstract fun getSourcesDao(): SourcesDao
    abstract fun getNewsDao(): NewsDao
}