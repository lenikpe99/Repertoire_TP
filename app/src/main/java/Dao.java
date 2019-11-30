package inventory.techiediaries.com.dao;

import android.content.ClipData;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Update;

@Dao
interface IndividuDAO {
    @Insert
    public void insert(ClipData.Item... items);
    @Update
    public void update(ClipData.Item... items);
    @Delete
    public void delete(ClipData.Item item);
}
