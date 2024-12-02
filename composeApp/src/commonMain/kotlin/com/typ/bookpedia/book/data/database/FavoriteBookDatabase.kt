package com.typ.bookpedia.book.data.database

import androidx.room.ConstructedBy
import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters

@Database(
    entities = [BookEntity::class],
    version = 1
)

@TypeConverters(
    StringListTypeConverter::class
)

@ConstructedBy(BookDatabaseConstructor::class)
abstract class FavoriteBookDatabase: RoomDatabase() {
    abstract val favoriteBooksDao: FavoriteBookDao

    companion object {
        const val DB_NAME = "book.db"
    }
}