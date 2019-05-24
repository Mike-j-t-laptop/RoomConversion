package aso.roomconversion;

import android.os.Parcelable;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.PrimaryKey;

import static androidx.room.ForeignKey.CASCADE;

@Entity(tableName = "relays_table",
        foreignKeys = @ForeignKey(entity = Worksites.class,
                parentColumns = "w_id",
                childColumns = "worksite_id",
                onDelete = CASCADE))
public class Relays {

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "relay_id")
    private long relayId;

    @NonNull
    @ColumnInfo(name = "relay_name")
    private String relayName;

    @NonNull
    @ColumnInfo(name = "relay_number")
    private String relayNumber;

    @ColumnInfo(name = "relay_started")
    private boolean relayOnOff;

    @NonNull
    @ColumnInfo(name = "relay_type")
    private String relayType;

    @ColumnInfo(name = "registered_master")
    private boolean registeredMaster;

    @ColumnInfo(name = "registered_user")
    private boolean registeredUser;

    @ColumnInfo(name = "security_code")
    private String securityCode;

    @ColumnInfo(name = "groups_string")
    private String groupsString;

    @NonNull
    @ColumnInfo(name = "worksite_id")
    private long worksiteId;

    @ColumnInfo(name = "description")
    private String relayDescription;

    public long getWorksiteId() {
        return worksiteId;
    }

    public void setWorksiteId(long worksiteId) {
        this.worksiteId = worksiteId;
    }

    public long getRelayId() {
        return relayId;
    }

    public void setRelayId(long relayId) {
        this.relayId = relayId;
    }

    @NonNull
    public String getRelayName() {
        return relayName;
    }

    public void setRelayName(@NonNull String relayName) {
        this.relayName = relayName;
    }

    @NonNull
    public String getRelayNumber() {
        return relayNumber;
    }

    public void setRelayNumber(@NonNull String relayNumber) {
        this.relayNumber = relayNumber;
    }

    public boolean isRelayOnOff() {
        return relayOnOff;
    }

    public void setRelayOnOff(boolean relayOnOff) {
        this.relayOnOff = relayOnOff;
    }

    @NonNull
    public String getRelayType() {
        return relayType;
    }

    public void setRelayType(@NonNull String relayType) {
        this.relayType = relayType;
    }

    public boolean isRegisteredMaster() {
        return registeredMaster;
    }

    public void setRegisteredMaster(boolean registeredMaster) {
        this.registeredMaster = registeredMaster;
    }

    public boolean isRegisteredUser() {
        return registeredUser;
    }

    public void setRegisteredUser(boolean registeredUser) {
        this.registeredUser = registeredUser;
    }

    public String getSecurityCode() {
        return securityCode;
    }

    public void setSecurityCode(String securityCode) {
        this.securityCode = securityCode;
    }

    public String getGroupsString() {
        return groupsString;
    }

    public void setGroupsString(String groupsString) {
        this.groupsString = groupsString;
    }

    public String getRelayDescription() {
        return relayDescription;
    }

    public void setRelayDescription(String relayDescription) {
        this.relayDescription = relayDescription;
    }
}
