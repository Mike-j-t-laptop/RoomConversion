package aso.roomconversion;

import androidx.room.RoomDatabase;

@androidx.room.Database(entities = {EntityTestTable.class,Worksites.class,RelayGroups.class,Relays.class}, version = 1)
public abstract class Database extends RoomDatabase {
    public abstract Dao Dao();
}
