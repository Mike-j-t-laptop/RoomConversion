package aso.roomconversion;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;

@Entity(tableName = "worksites_table")
public class Worksites {

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "w_id")
    private long worksite_id;

    @NonNull
    @ColumnInfo(name = "w_name")
    private String worksiteName;

    @ColumnInfo(name = "w_description")
    private String worksiteDescription;

    @Ignore
    @ColumnInfo(name = "amountRelays")
    private long amountRelays;

    @Ignore
    @ColumnInfo(name = "amountRelayGroups")
    private long amountRelayGroups;

    public long getWorksite_id() {
        return worksite_id;
    }

    public void setWorksite_id(long worksite_id) {
        this.worksite_id = worksite_id;
    }

    @NonNull
    public String getWorksiteName() {
        return worksiteName;
    }

    public void setWorksiteName(@NonNull String worksiteName) {
        this.worksiteName = worksiteName;
    }

    public long getAmountRelays() {
        return amountRelays;
    }

    public void setAmountRelays(long amountRelays) {
        this.amountRelays = amountRelays;
    }

    public String getWorksiteDescription() {
        return worksiteDescription;
    }

    public void setWorksiteDescription(String worksiteDescription) {
        this.worksiteDescription = worksiteDescription;
    }

    public long getAmountRelayGroups() {
        return amountRelayGroups;
    }

    public void setAmountRelayGroups(long amountRelayGroups) {
        this.amountRelayGroups = amountRelayGroups;
    }
}
