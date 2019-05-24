package aso.roomconversion;

import android.provider.BaseColumns;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;

/**
 * Type Affinity values
 *
 * 1 UNDEFINED
 * 2 TEXT
 * 3 INTEGER
 * 4 REAL
 * 5 BLOB
 *
 */

@Entity
public class EntityTestTable {

    public static final String COLUMN_ID = BaseColumns._ID;
    public static final String COLUMN_BOOLEANPRIMATIVE = "booleanPrimative";
    public static final String COLUMN_CHARPRIMIATIVE = "charPrimative";
    public static final String COLUMN_BYTEPRIMATIVE = "bytePrimative";
    public static final String COLUMN_SHORTPRIMATIVE = "shortPrimative";
    public static final String COLUMN_INTPRIMATIVE = "intPrimative";
    public static final String COLUMN_LONGPRIMATIVE = "longPrimative";
    public static final String COLUMN_FLOATPRIMATIVE = "floatPrimative";
    public static final String COLUMN_DOUBLEPRIMATIVE = "doublePrimative";

    public static final String COLUMN_BOOLEANPRIMATIVETYPE = "booleanPrimativeType";
    public static final String COLUMN_CHARPRIMIATIVETYPE = "charPrimativeType";
    public static final String COLUMN_BYTEPRIMATIVETYPE = "bytePrimativeType";
    public static final String COLUMN_SHORTPRIMATIVETYPE = "shortPrimativeType";
    public static final String COLUMN_INTPRIMATIVETYPE = "intPrimativeType";
    public static final String COLUMN_LONGPRIMATIVETYPE = "longPrimativeType";
    public static final String COLUMN_FLOATPRIMATIVETYPE = "floatPrimativeType";
    public static final String COLUMN_DOUBLEPRIMATIVETYPE = "doublePrimativeType";

    public static final String COLUMN_STRINGOBJ = "stringObj";
    public static final String COLUMN_BOOLEANOBJ = "booleanObj";
    public static final String COLUMN_CHARACTEROBJ = "characterObj";
    public static final String COLUMN_BYTEOBJ = "byteObj";
    public static final String COLUMN_SHORTOBJ = "shortObj";
    public static final String COLUMN_INTOBJ = "intObj";
    public static final String COLUMN_LONGOBJ = "longObj";
    public static final String COLUMN_DOUBLEOBJ = "doubleObj";
    public static final String COLUMN_FLOATOBJ = "floatObj";


    public static final String COLUMN_STRINGOBJTYPE = "stringObjType";
    public static final String COLUMN_BOOLEANOBJTYPE = "booleanObjType";
    public static final String COLUMN_CHARACTEROBJTYPE = "characterObjType";
    public static final String COLUMN_BYTEOBJTYPE = "byteObjType";
    public static final String COLUMN_SHORTOBJTYPE = "shortObjType";
    public static final String COLUMN_INTOBJTYPE = "intObjType";
    public static final String COLUMN_LONGOBJTYPE = "longObjType";
    public static final String COLUMN_DOUBLEOBJTYPE = "doubleObjType";
    public static final String COLUMN_FLOATOBJTYPE = "floatObjType";



    @ColumnInfo(name = COLUMN_ID)
    @PrimaryKey
    private long id;
    @ColumnInfo(name = COLUMN_BOOLEANPRIMATIVE)
    private boolean booleanPrimative;
    @ColumnInfo(name = COLUMN_CHARPRIMIATIVE)
    private char charPrimative;
    @ColumnInfo(name = COLUMN_BYTEPRIMATIVE)
    private byte bytePrimative;
    @ColumnInfo(name = COLUMN_SHORTPRIMATIVE)
    private short shortPrimative;
    @ColumnInfo(name = COLUMN_INTPRIMATIVE)
    private int intPrimative;
    @ColumnInfo(name = COLUMN_LONGPRIMATIVE)
    private long longPrimative;
    @ColumnInfo(name = COLUMN_DOUBLEPRIMATIVE)
    private double doublePrimative;
    @ColumnInfo(name = COLUMN_FLOATPRIMATIVE)
    private float floatPrimative;

    @ColumnInfo(name = COLUMN_STRINGOBJ)
    private String stringObj;
    @ColumnInfo(name = COLUMN_BOOLEANOBJ)
    private Boolean booleanObj;
    @ColumnInfo(name = COLUMN_CHARACTEROBJ)
    private Character characterObj;
    @ColumnInfo(name = COLUMN_BYTEOBJ)
    private Byte byteObj;
    @ColumnInfo(name = COLUMN_SHORTOBJ)
    private Short shortObj;
    @ColumnInfo(name = COLUMN_INTOBJ)
    private Integer intObj;
    @ColumnInfo(name = COLUMN_LONGOBJ)
    private Long longObj;
    @ColumnInfo(name = COLUMN_FLOATOBJ)
    private Float floatObj;
    @ColumnInfo(name = COLUMN_DOUBLEOBJ)
    private Double doubleObj;


    @Ignore
    @ColumnInfo(name = COLUMN_BOOLEANPRIMATIVETYPE)
    private String booleanPrimativeType;
    @Ignore
    @ColumnInfo(name = COLUMN_CHARPRIMIATIVETYPE)
    private String charPrimativeType;
    @Ignore
    @ColumnInfo(name = COLUMN_BYTEPRIMATIVETYPE)
    private String bytePrimativeType;
    @Ignore
    @ColumnInfo(name = COLUMN_SHORTPRIMATIVETYPE)
    private String shortPrimativeType;
    @Ignore
    @ColumnInfo(name = COLUMN_INTPRIMATIVETYPE)
    private String intPrimativeType;
    @Ignore
    @ColumnInfo(name = COLUMN_LONGPRIMATIVETYPE)
    private String longPrimativeType;
    @Ignore
    @ColumnInfo(name = COLUMN_DOUBLEPRIMATIVETYPE)
    private String doublePrimativeType;
    @Ignore
    @ColumnInfo(name = COLUMN_FLOATPRIMATIVETYPE)
    private String floatPrimativeType;
    @Ignore
    @ColumnInfo(name = COLUMN_STRINGOBJTYPE)
    private String stringObjType;
    @Ignore
    @ColumnInfo(name = COLUMN_BOOLEANOBJTYPE)
    private String booleanObjType;
    @Ignore
    @ColumnInfo(name = COLUMN_CHARACTEROBJTYPE)
    private String characterObjType;
    @Ignore
    @ColumnInfo(name = COLUMN_BYTEOBJTYPE)
    private String byteObjType;
    @Ignore
    @ColumnInfo(name = COLUMN_SHORTOBJTYPE)
    private String shortObjType;
    @Ignore
    @ColumnInfo(name = COLUMN_INTOBJTYPE)
    private String intObjType;
    @Ignore
    @ColumnInfo(name = COLUMN_LONGOBJTYPE)
    private String longObjType;
    @Ignore
    @ColumnInfo(name = COLUMN_FLOATOBJTYPE)
    private String floatObjType;
    @Ignore
    @ColumnInfo(name = COLUMN_DOUBLEOBJTYPE)
    private String doubleObjType;

    public EntityTestTable() {

    }

    public EntityTestTable(boolean booleanPrimative, char charPrimative, byte bytePrimative,
                           short shortPrimative, int intPrimative, long longPrimative, float floatPrimative, double doublePrimative,
                           String stringObj,
                           Boolean booleanObj, Character characterObj, Byte byteObj, Short shortObj, Integer intObj, Long longObj, Float floatObj, Double doubleObj,
                           String booleanPrimativeType, String charPrimativeType, String bytePrimativeType,
                           String shortPrimativeType, String intPrimativeType, String longPrimativeType, String floatPrimativeType, String doublePrimativeType,
                           String stringObjType,
                           String booleanObjType, String characterObjType, String byteObjType, String shortObjType, String intObjType, String longObjType, String floatObjType, String doubleObjType) {

        this.booleanPrimative = booleanPrimative;
        this.charPrimative = charPrimative;
        this.bytePrimative = bytePrimative;
        this.shortPrimative = shortPrimative;
        this.intPrimative = intPrimative;
        this.longPrimative = longPrimative;
        this.floatPrimative = floatPrimative;
        this.doublePrimative = doublePrimative;

        this.stringObj = stringObj;
        this.booleanObj = booleanObj;
        this.characterObj = characterObj;
        this.byteObj = byteObj;
        this.shortObj = shortObj;
        this.intObj = intObj;
        this.longObj = longObj;
        this.floatObj = floatObj;
        this.doubleObj = doubleObj;

        this.booleanPrimativeType = booleanPrimativeType;
        this.charPrimativeType = charPrimativeType;
        this.bytePrimativeType = bytePrimativeType;
        this.shortPrimativeType = shortPrimativeType;
        this.intPrimativeType = intPrimativeType;
        this.longPrimativeType = longPrimativeType;
        this.floatPrimativeType = floatPrimativeType;
        this.doublePrimativeType = doublePrimativeType;
        this.stringObjType = stringObjType;
        this.booleanObjType = booleanObjType;
        this.characterObjType = characterObjType;
        this.byteObjType = byteObjType;
        this.shortObjType = shortObjType;
        this.intObjType = intObjType;
        this.longObjType = longObjType;
        this.floatObjType = floatObjType;
        this.doubleObjType = doubleObjType;
    }


    public boolean isBooleanPrimative() {
        return booleanPrimative;
    }

    public void setBooleanPrimative(boolean booleanPrimative) {
        this.booleanPrimative = booleanPrimative;
    }

    public char getCharPrimative() {
        return charPrimative;
    }

    public void setCharPrimative(char charPrimative) {
        this.charPrimative = charPrimative;
    }

    public byte getBytePrimative() {
        return bytePrimative;
    }

    public void setBytePrimative(byte bytePrimative) {
        this.bytePrimative = bytePrimative;
    }

    public short getShortPrimative() {
        return shortPrimative;
    }

    public void setShortPrimative(short shortPrimative) {
        this.shortPrimative = shortPrimative;
    }

    public int getIntPrimative() {
        return intPrimative;
    }

    public void setIntPrimative(int intPrimative) {
        this.intPrimative = intPrimative;
    }

    public long getLongPrimative() {
        return longPrimative;
    }

    public void setLongPrimative(long longPrimative) {
        this.longPrimative = longPrimative;
    }

    public float getFloatPrimative() {
        return floatPrimative;
    }

    public void setFloatPrimative(float floatPrimative) {
        this.floatPrimative = floatPrimative;
    }

    public double getDoublePrimative() {
        return doublePrimative;
    }

    public void setDoublePrimative(double doublePrimative) {
        this.doublePrimative = doublePrimative;
    }

    public Boolean getBooleanObj() {
        return booleanObj;
    }

    public void setBooleanObj(Boolean booleanObj) {
        this.booleanObj = booleanObj;
    }

    public Character getCharacterObj() {
        return characterObj;
    }

    public void setCharacterObj(Character characterObj) {
        this.characterObj = characterObj;
    }

    public Byte getByteObj() {
        return byteObj;
    }

    public void setByteObj(Byte byteObj) {
        this.byteObj = byteObj;
    }

    public Short getShortObj() {
        return shortObj;
    }

    public void setShortObj(Short shortObj) {
        this.shortObj = shortObj;
    }

    public Integer getIntObj() {
        return intObj;
    }

    public void setIntObj(Integer intObj) {
        this.intObj = intObj;
    }

    public Long getLongObj() {
        return longObj;
    }

    public void setLongObj(Long longObj) {
        this.longObj = longObj;
    }

    public Float getFloatObj() {
        return floatObj;
    }

    public void setFloatObj(Float floatObj) {
        this.floatObj = floatObj;
    }

    public Double getDoubleObj() {
        return doubleObj;
    }

    public void setDoubleObj(Double doubleObj) {
        this.doubleObj = doubleObj;
    }

    public String getStringObj() {
        return stringObj;
    }

    public void setStringObj(String stringObj) {
        this.stringObj = stringObj;
    }

    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }

    public String getBooleanObjType() {
        return booleanObjType;
    }

    public void setBooleanObjType(String booleanObjType) {
        this.booleanObjType = booleanObjType;
    }

    public String getBooleanPrimativeType() {
        return booleanPrimativeType;
    }

    public void setBooleanPrimativeType(String booleanPrimativeType) {
        this.booleanPrimativeType = booleanPrimativeType;
    }

    public String getByteObjType() {
        return byteObjType;
    }

    public void setByteObjType(String byteObjType) {
        this.byteObjType = byteObjType;
    }

    public String getBytePrimativeType() {
        return bytePrimativeType;
    }

    public void setBytePrimativeType(String bytePrimitveType) {
        this.bytePrimativeType = bytePrimitveType;
    }

    public String getCharacterObjType() {
        return characterObjType;
    }

    public void setCharacterObjType(String characterObjType) {
        this.characterObjType = characterObjType;
    }

    public String getCharPrimativeType() {
        return charPrimativeType;
    }

    public void setCharPrimativeType(String charPrimitveType) {
        this.charPrimativeType = charPrimitveType;
    }

    public String getStringObjType() {
        return stringObjType;
    }

    public void setStringObjType(String stringObjType) {
        this.stringObjType = stringObjType;
    }

    public String getShortObjType() {
        return shortObjType;
    }

    public void setShortObjType(String shortObjType) {
        this.shortObjType = shortObjType;
    }

    public String getShortPrimativeType() {
        return shortPrimativeType;
    }

    public void setShortPrimativeType(String shortPrimitveType) {
        this.shortPrimativeType = shortPrimitveType;
    }

    public String getIntObjType() {
        return intObjType;
    }

    public void setIntObjType(String intObjType) {
        this.intObjType = intObjType;
    }

    public String getIntPrimativeType() {
        return intPrimativeType;
    }

    public void setIntPrimativeType(String intPrimitveType) {
        this.intPrimativeType = intPrimitveType;
    }

    public String getLongObjType() {
        return longObjType;
    }

    public void setLongPrimativeType(String longPrimitveType) {
        this.longPrimativeType = longPrimitveType;
    }

    public String getLongPrimativeType() {
        return longPrimativeType;
    }

    public void setLongObjType(String longObjType) {
        this.longObjType = longObjType;
    }

    public String getFloatObjType() {
        return floatObjType;
    }

    public void setFloatObjType(String floatObjType) {
        this.floatObjType = floatObjType;
    }

    public String getFloatPrimativeType() {
        return floatPrimativeType;
    }

    public void setFloatPrimativeType(String floatPrimitveType) {
        this.floatPrimativeType = floatPrimitveType;
    }

    public String getDoubleObjType() {
        return doubleObjType;
    }

    public void setDoubleObjType(String doubleObjType) {
        this.doubleObjType = doubleObjType;
    }

    public String getDoublePrimativeType() {
        return doublePrimativeType;
    }

    public void setDoublePrimativeType(String doublePrimitveType) {
        this.doublePrimativeType = doublePrimitveType;
    }
}
