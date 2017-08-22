package training.roomdb;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;

/**
 * Created by hindahmed on 19/08/17.
 */


@Database(entities = {User.class}, version = 1)

public abstract class AppDatabase extends RoomDatabase {

    public abstract UserDao userDao();

}
