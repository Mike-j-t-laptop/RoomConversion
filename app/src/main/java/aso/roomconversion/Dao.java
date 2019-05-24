package aso.roomconversion;

import android.database.Cursor;

import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;

import java.util.List;

@androidx.room.Dao
public interface Dao {

    @Query("SELECT *, " +
            "typeof(booleanPrimative) AS booleanPrimativeType, " +
            "typeof(charPrimative) AS charPrimativeType," +
            "typeof(bytePrimative) AS bytePrimativeType," +
            "typeof(shortPrimative) AS shortPrimativeType," +
            "typeof(intPrimative) AS intPrimativeType," +
            "typeof(longPrimative) AS longPprimativeType," +
            "typeof(doublePrimative) AS doublePprimativeType," +
            "typeof(floatPrimative) AS floatPprimativeType," +
            "typeof(stringObj) AS stringObjType," +
            "typeof(booleanObj) AS booleanObjType," +
            "typeof(characterObj) AS characterObjType," +
            "typeof(byteObj) AS byteObjType," +
            "typeof(shortObj) AS shortObjType," +
            "typeof(intObj) AS intObjType," +
            "typeof(longObj) AS longObjType," +
            "typeof(floatObj) AS floatObjType," +
            "typeof(doubleObj) AS doubleObjType" +
            " FROM EntityTestTable")
    List<EntityTestTable> getAllWithTypes();

    @Query("SELECT *, " +
            "typeof(booleanPrimative) AS " + EntityTestTable.COLUMN_BOOLEANPRIMATIVETYPE + ", " +
                    "typeof(charPrimative) AS " + EntityTestTable.COLUMN_CHARPRIMIATIVETYPE + "," +
                    "typeof(bytePrimative) AS " + EntityTestTable.COLUMN_BYTEPRIMATIVETYPE + "," +
                    "typeof(shortPrimative) AS " + EntityTestTable.COLUMN_SHORTPRIMATIVETYPE + "," +
                    "typeof(intPrimative) AS " + EntityTestTable.COLUMN_INTPRIMATIVETYPE + "," +
                    "typeof(longPrimative) AS " + EntityTestTable.COLUMN_LONGPRIMATIVETYPE + "," +
                    "typeof(doublePrimative) AS " + EntityTestTable.COLUMN_DOUBLEPRIMATIVETYPE + "," +
                    "typeof(floatPrimative) AS " + EntityTestTable.COLUMN_FLOATPRIMATIVETYPE + "," +

                    "typeof(stringObj) AS " + EntityTestTable.COLUMN_STRINGOBJTYPE + "," +
                    "typeof(booleanObj) AS " + EntityTestTable.COLUMN_BOOLEANOBJTYPE + "," +
                    "typeof(characterObj) AS " + EntityTestTable.COLUMN_CHARACTEROBJTYPE + "," +
                    "typeof(byteObj) AS " + EntityTestTable.COLUMN_BYTEOBJTYPE + "," +
                    "typeof(shortObj) AS " + EntityTestTable.COLUMN_SHORTOBJTYPE + "," +
                    "typeof(intObj) AS " + EntityTestTable.COLUMN_INTOBJTYPE + "," +
                    "typeof(longObj) AS " + EntityTestTable.COLUMN_LONGOBJTYPE + "," +
                    "typeof(floatObj) AS "  + EntityTestTable.COLUMN_FLOATOBJTYPE + "," +
                    "typeof(doubleObj) AS " + EntityTestTable.COLUMN_DOUBLEOBJTYPE + "" +
                    " FROM EntityTestTable")
    public Cursor getAllAsCursorWithTypes();

    @Query("SELECT *, " +
            "(SELECT COUNT(*) FROM relay_groups WHERE worksite_id=a.w_id) AS amountRelayGroups," +
            "(SELECT COUNT(*) FROM relays_table WHERE worksite_id=a.w_id) AS amountRelays" +
            " FROM (SELECT DISTINCT * FROM worksites_table) a")
    List<Worksites> fetchAllWorksites();

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    public void insertEntityTestTable(EntityTestTable... entityTestTables);

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    public void inertEntityTestTable(EntityTestTable entityTestTable);

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    public void insertWorksites(Worksites... worksites);

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    public void insertWorkSite(Worksites worksite);

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    public void insertRelays(Relays... relays);

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    public void insertRealy(Relays relay);

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    public void insertRelayGroups(RelayGroups... relayGroups);

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    public void insertRealyGroup(RelayGroups relayGroups);
    @Delete
    public void deleteEntityTestTable(EntityTestTable... entityTestTables);

    @Delete
    public void deleteEntityTestTable(EntityTestTable entityTestTable);

}
