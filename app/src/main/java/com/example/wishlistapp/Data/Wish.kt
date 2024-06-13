package com.example.wishlistapp.Data

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "wish-table")
data class Wish(
    @PrimaryKey(autoGenerate = true)
    val id : Long = 0L,
    @ColumnInfo(name = "wish-title")
    val title: String = "",
    @ColumnInfo(name = "wish-desc")
    val description : String = ""
)

object DummyWish{
    val wishList = listOf(
        Wish(title = "Apple Watch Ultra 2",
            description = "An Apple Watch"),
        Wish(title = "Macbook Air M3",
            description = "Powerful laptop form Apple"),
        Wish(title = "Continental GT 650",
            description = "Twin cylinder bike from Royal Enfield"),
        Wish(title = "Iphone 16 Pro",
            description = "Best Phone under 1,20,000"),
        Wish(title = "Ford Endeavour",
            description = "best Suv Under 50,00,000"),
    )
}