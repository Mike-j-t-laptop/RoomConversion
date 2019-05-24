package aso.roomconversion;

import androidx.appcompat.app.AppCompatActivity;
import androidx.room.Room;

import android.database.Cursor;
import android.os.Bundle;
import android.provider.BaseColumns;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    Database mRoomDB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRoomDB = Room.databaseBuilder(this,Database.class,"mytestdb").allowMainThreadQueries().build();

        EntityTestTable e_to_add = new EntityTestTable();
        e_to_add.setBooleanPrimative(true);
        e_to_add.setCharPrimative('a');
        e_to_add.setShortPrimative((short)100);
        e_to_add.setBytePrimative((byte) 101);
        e_to_add.setIntPrimative(102);
        e_to_add.setLongPrimative(103L);
        e_to_add.setFloatPrimative(104F);
        e_to_add.setDoubleObj(105D);
        e_to_add.setBooleanObj(true);
        e_to_add.setCharacterObj('b');
        e_to_add.setShortObj((short)200);
        e_to_add.setByteObj((byte)201);
        e_to_add.setIntObj(202);
        e_to_add.setLongObj(203L);
        e_to_add.setFloatObj(204F);
        e_to_add.setDoubleObj(205D);
        e_to_add.setStringObj("RumpleStiltskin");

        logEntityTableObject(e_to_add,0);
        mRoomDB.Dao().inertEntityTestTable(e_to_add);
        List<EntityTestTable> elist = mRoomDB.Dao().getAllWithTypes();
        int position = 1;
        for (EntityTestTable e: elist) {
            logEntityTableObject(e,position++);
        }
        Cursor csr = mRoomDB.Dao().getAllAsCursorWithTypes();
        ArrayList<EntityTestTable> elistfromCursor = new ArrayList<>();
        while (csr.moveToNext()) {
            EntityTestTable e = new EntityTestTable();
            e.setId(csr.getLong(csr.getColumnIndex(BaseColumns._ID)));
            e.setBooleanPrimative(csr.getInt(csr.getColumnIndex(EntityTestTable.COLUMN_BOOLEANPRIMATIVE)) > 0);
            e.setCharPrimative(Character.valueOf (csr.getString(csr.getColumnIndex(EntityTestTable.COLUMN_CHARPRIMIATIVE)).charAt(0)));
            e.setBytePrimative((byte)csr.getInt(csr.getColumnIndex(EntityTestTable.COLUMN_INTPRIMATIVE)));
            e.setShortPrimative((short) csr.getInt(csr.getColumnIndex(EntityTestTable.COLUMN_SHORTPRIMATIVE)));
            e.setIntPrimative(csr.getInt(csr.getColumnIndex(EntityTestTable.COLUMN_INTPRIMATIVE)));
            e.setLongPrimative(csr.getLong(csr.getColumnIndex(EntityTestTable.COLUMN_LONGPRIMATIVE)));
            e.setFloatPrimative(csr.getFloat(csr.getColumnIndex(EntityTestTable.COLUMN_FLOATPRIMATIVE)));
            e.setDoubleObj(csr.getDouble(csr.getColumnIndex(EntityTestTable.COLUMN_DOUBLEPRIMATIVE)));

            e.setBooleanObj(csr.getInt(csr.getColumnIndex(EntityTestTable.COLUMN_BOOLEANOBJ)) > 0);
            e.setCharacterObj(Character.valueOf(csr.getString(csr.getColumnIndex(EntityTestTable.COLUMN_CHARACTEROBJ)).charAt(0)));
            e.setByteObj((byte)csr.getInt(csr.getColumnIndex(EntityTestTable.COLUMN_BYTEOBJ)));
            e.setShortObj((short)csr.getInt(csr.getColumnIndex(EntityTestTable.COLUMN_SHORTOBJ)));
            e.setIntObj(csr.getInt(csr.getColumnIndex(EntityTestTable.COLUMN_INTOBJ)));
            e.setLongObj(csr.getLong(csr.getColumnIndex(EntityTestTable.COLUMN_LONGOBJ)));
            e.setFloatObj(csr.getFloat(csr.getColumnIndex(EntityTestTable.COLUMN_FLOATOBJ)));
            e.setDoubleObj(csr.getDouble(csr.getColumnIndex(EntityTestTable.COLUMN_DOUBLEOBJ)));

            e.setBooleanPrimativeType(csr.getString(csr.getColumnIndex(EntityTestTable.COLUMN_BOOLEANPRIMATIVETYPE)));
            e.setCharPrimativeType(csr.getString(csr.getColumnIndex(EntityTestTable.COLUMN_CHARPRIMIATIVETYPE)));
            e.setBytePrimativeType(csr.getString(csr.getColumnIndex(EntityTestTable.COLUMN_BYTEPRIMATIVETYPE)));
            e.setShortPrimativeType(csr.getString(csr.getColumnIndex(EntityTestTable.COLUMN_SHORTPRIMATIVETYPE)));
            e.setIntPrimativeType(csr.getString(csr.getColumnIndex(EntityTestTable.COLUMN_INTPRIMATIVETYPE)));
            e.setLongPrimativeType(csr.getString(csr.getColumnIndex(EntityTestTable.COLUMN_LONGPRIMATIVETYPE)));
            e.setFloatPrimativeType(csr.getString(csr.getColumnIndex(EntityTestTable.COLUMN_FLOATPRIMATIVETYPE)));
            e.setDoublePrimativeType(csr.getString(csr.getColumnIndex(EntityTestTable.COLUMN_DOUBLEPRIMATIVETYPE)));

            e.setStringObjType(csr.getString(csr.getColumnIndex(EntityTestTable.COLUMN_STRINGOBJTYPE)));
            e.setBooleanObjType(csr.getString(csr.getColumnIndex(EntityTestTable.COLUMN_BOOLEANOBJTYPE)));
            e.setCharacterObjType(csr.getString(csr.getColumnIndex(EntityTestTable.COLUMN_CHARACTEROBJTYPE)));
            e.setByteObjType(csr.getString(csr.getColumnIndex(EntityTestTable.COLUMN_BYTEOBJTYPE)));
            e.setShortObjType(csr.getString(csr.getColumnIndex(EntityTestTable.COLUMN_SHORTOBJTYPE)));
            e.setIntObjType(csr.getString(csr.getColumnIndex(EntityTestTable.COLUMN_INTOBJTYPE)));
            e.setLongObjType(csr.getString(csr.getColumnIndex(EntityTestTable.COLUMN_LONGOBJTYPE)));
            e.setFloatObjType(csr.getString(csr.getColumnIndex(EntityTestTable.COLUMN_FLOATOBJTYPE)));
            e.setDoubleObjType(csr.getString(csr.getColumnIndex(EntityTestTable.COLUMN_DOUBLEOBJTYPE)));

            elistfromCursor.add(e);
        }
        position = 1;
        for (EntityTestTable e: elistfromCursor) {
            logEntityTableObject(e,position++);
        }
        mRoomDB.close();

        Worksites w = new Worksites();
        w.setWorksiteName("Test");
        w.setWorksiteDescription("testing worksite");
        mRoomDB.Dao().insertWorkSite(w);
        mRoomDB.close();
    }

    private void logEntityTableObject(EntityTestTable e, int position) {
        StringBuilder sb = new StringBuilder();
        sb.append("\nEntityTestTable Object at " + String.valueOf(position++));
        sb.append("\n\tBOOLPrim = ").append(String.valueOf(e.isBooleanPrimative())).append(" Type is ").append(e.getBooleanPrimativeType());
        sb.append("\n\tCHARPrim = ").append(String.valueOf(e.getCharPrimative())).append(" Type is ").append(e.getCharPrimativeType());
        sb.append("\n\tBYTEPrim = ").append(String.valueOf(e.getBytePrimative())).append(" Type is").append(e.getBytePrimativeType());
        sb.append("\n\tSHORTPrim = ").append(String.valueOf(e.getShortPrimative())).append(" Type is ").append(e.getShortPrimativeType());
        sb.append("\n\tINTPrim = ").append(String.valueOf(e.getIntPrimative())).append(" Type is ").append(e.getIntPrimativeType());
        sb.append("\n\tLONGPrim = ").append(String.valueOf(e.getLongPrimative())).append(" Type is ").append(e.getLongPrimativeType());
        sb.append("\n\tFLOATPrim = ").append(String.valueOf(e.getFloatPrimative())).append(" Type is ").append(e.getFloatPrimativeType());
        sb.append("\n\tDOUBLEPrim = ").append(String.valueOf(e.getDoublePrimative())).append(" Type is ").append(e.getDoublePrimativeType());
        sb.append("\n\tSTRINOBJ = ").append(e.getStringObj()).append(" Type is ").append(e.getStringObjType());
        sb.append("\n\tBOOLOBJ = ").append(String.valueOf(e.getBooleanObj())).append(" Type is ").append(e.getBooleanObjType());
        sb.append("\n\tBYTEOBJ = ").append(String.valueOf(e.getByteObj())).append(" Type is ").append(e.getByteObjType());
        sb.append("\n\tCHAROBJ = ").append(String.valueOf(e.getCharacterObj())).append(" Type is ").append(e.getCharacterObjType());
        sb.append("\n\tSHORTOBJ = ").append(String.valueOf(e.getShortObj())).append(" Type is ").append(e.getShortObjType());
        sb.append("\n\tINTOBJ = ").append(String.valueOf(e.getIntObj())).append(" Type is ").append(e.getIntObjType());
        sb.append("\n\tLONGOBJ = ").append(String.valueOf(e.getLongObj())).append(" Type is ").append(e.getLongObjType());
        sb.append("\n\tFLOATOBJ = ").append(String.valueOf(e.getFloatObj())).append(" Type is ").append(e.getFloatObjType());
        sb.append("\n\tDOUBLEOBJ = ").append(String.valueOf(e.getDoubleObj())).append(" Type is ").append(e.getDoubleObjType());
        Log.d("RESULTS",sb.toString());
    }
}
