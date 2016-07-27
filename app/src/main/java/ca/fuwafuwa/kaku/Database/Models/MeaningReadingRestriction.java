package ca.fuwafuwa.kaku.Database.Models;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

/**
 * Created by 0x1bad1d3a on 7/25/2016.
 */
@DatabaseTable
public class MeaningReadingRestriction {

    @DatabaseField(generatedId = true)
    private int id;

    @DatabaseField(foreign = true)
    private Meaning fkMeaning;

    @DatabaseField
    private String readingRestriction;

    public String getReadingRestriction() {
        return readingRestriction;
    }

    public void setReadingRestriction(String readingRestriction) {
        this.readingRestriction = readingRestriction;
    }
}
