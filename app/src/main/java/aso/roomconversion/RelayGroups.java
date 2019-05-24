package aso.roomconversion;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.PrimaryKey;

import static androidx.room.ForeignKey.CASCADE;

@Entity(tableName = "relay_groups",
        foreignKeys = @ForeignKey(entity = Worksites.class,
                parentColumns = "w_id",
                childColumns = "worksite_id",
                onDelete = CASCADE))
public class RelayGroups {

    public RelayGroups() {

    }

    public RelayGroups(String name) {
        this.groupName = name;
    }

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "group_id")
    private long group_id;

    @NonNull
    @ColumnInfo(name = "group_name")
    private String groupName;

    @ColumnInfo(name = "description")
    private String description;

    @NonNull
    @ColumnInfo(name = "worksite_id")
    private long worksiteId;

    @NonNull
    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(@NonNull String groupName) {
        this.groupName = groupName;
    }

    public long getGroup_id() {
        return group_id;
    }

    public void setGroup_id(long group_id) {
        this.group_id = group_id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public long getWorksiteId() {
        return worksiteId;
    }

    public void setWorksiteId(long worksiteId) {
        this.worksiteId = worksiteId;
    }
}
