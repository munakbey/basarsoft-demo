package com.app.demo.viewmodel.db;

import android.database.Cursor;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.munevver.basarsoft.model.User;
import java.lang.Exception;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

@SuppressWarnings({"unchecked", "deprecation"})
public final class UserDAO_Impl implements UserDAO {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<User> __insertionAdapterOfUser;

  public UserDAO_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfUser = new EntityInsertionAdapter<User>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR ABORT INTO `User` (`id`,`username`,`password`) VALUES (nullif(?, 0),?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, User value) {
        stmt.bindLong(1, value.getId());
        if (value.getUsername() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getUsername());
        }
        if (value.getPassword() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getPassword());
        }
      }
    };
  }

  @Override
  public Object addUser(final User[] user, final Continuation<? super Unit> p1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfUser.insert(user);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, p1);
  }

  @Override
  public Object getUser(final String username, final Continuation<? super List<User>> p1) {
    final String _sql = "SELECT * FROM user WHERE username = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (username == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, username);
    }
    return CoroutinesRoom.execute(__db, false, new Callable<List<User>>() {
      @Override
      public List<User> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfUsername = CursorUtil.getColumnIndexOrThrow(_cursor, "username");
          final int _cursorIndexOfPassword = CursorUtil.getColumnIndexOrThrow(_cursor, "password");
          final List<User> _result = new ArrayList<User>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final User _item;
            final String _tmpUsername;
            _tmpUsername = _cursor.getString(_cursorIndexOfUsername);
            final String _tmpPassword;
            _tmpPassword = _cursor.getString(_cursorIndexOfPassword);
            _item = new User(_tmpUsername,_tmpPassword);
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            _item.setId(_tmpId);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
          _statement.release();
        }
      }
    }, p1);
  }
}
