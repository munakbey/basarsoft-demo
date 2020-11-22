package com.app.demo.viewmodel.db;

import android.database.Cursor;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.app.demo.model.Work;
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
public final class WorkDAO_Impl implements WorkDAO {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<Work> __insertionAdapterOfWork;

  public WorkDAO_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfWork = new EntityInsertionAdapter<Work>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR ABORT INTO `Work` (`id`,`workOder`,`workOrderDetail`,`latitude`,`longitude`,`userId`) VALUES (nullif(?, 0),?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Work value) {
        stmt.bindLong(1, value.getId());
        if (value.getWorkOder() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getWorkOder());
        }
        if (value.getWorkOrderDetail() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getWorkOrderDetail());
        }
        stmt.bindDouble(4, value.getLatitude());
        stmt.bindDouble(5, value.getLongitude());
        stmt.bindLong(6, value.getUserId());
      }
    };
  }

  @Override
  public Object addWork(final Work work, final Continuation<? super Unit> p1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfWork.insert(work);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, p1);
  }

  @Override
  public Object getWorkById(final int id, final Continuation<? super List<Work>> p1) {
    final String _sql = "SELECT * FROM work WHERE id = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, id);
    return CoroutinesRoom.execute(__db, false, new Callable<List<Work>>() {
      @Override
      public List<Work> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfWorkOder = CursorUtil.getColumnIndexOrThrow(_cursor, "workOder");
          final int _cursorIndexOfWorkOrderDetail = CursorUtil.getColumnIndexOrThrow(_cursor, "workOrderDetail");
          final int _cursorIndexOfLatitude = CursorUtil.getColumnIndexOrThrow(_cursor, "latitude");
          final int _cursorIndexOfLongitude = CursorUtil.getColumnIndexOrThrow(_cursor, "longitude");
          final int _cursorIndexOfUserId = CursorUtil.getColumnIndexOrThrow(_cursor, "userId");
          final List<Work> _result = new ArrayList<Work>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final Work _item;
            final String _tmpWorkOder;
            _tmpWorkOder = _cursor.getString(_cursorIndexOfWorkOder);
            final String _tmpWorkOrderDetail;
            _tmpWorkOrderDetail = _cursor.getString(_cursorIndexOfWorkOrderDetail);
            final double _tmpLatitude;
            _tmpLatitude = _cursor.getDouble(_cursorIndexOfLatitude);
            final double _tmpLongitude;
            _tmpLongitude = _cursor.getDouble(_cursorIndexOfLongitude);
            final int _tmpUserId;
            _tmpUserId = _cursor.getInt(_cursorIndexOfUserId);
            _item = new Work(_tmpWorkOder,_tmpWorkOrderDetail,_tmpLatitude,_tmpLongitude,_tmpUserId);
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

  @Override
  public Object getWorkByUserId(final int id, final Continuation<? super List<Work>> p1) {
    final String _sql = "SELECT * FROM work WHERE userId = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, id);
    return CoroutinesRoom.execute(__db, false, new Callable<List<Work>>() {
      @Override
      public List<Work> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfWorkOder = CursorUtil.getColumnIndexOrThrow(_cursor, "workOder");
          final int _cursorIndexOfWorkOrderDetail = CursorUtil.getColumnIndexOrThrow(_cursor, "workOrderDetail");
          final int _cursorIndexOfLatitude = CursorUtil.getColumnIndexOrThrow(_cursor, "latitude");
          final int _cursorIndexOfLongitude = CursorUtil.getColumnIndexOrThrow(_cursor, "longitude");
          final int _cursorIndexOfUserId = CursorUtil.getColumnIndexOrThrow(_cursor, "userId");
          final List<Work> _result = new ArrayList<Work>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final Work _item;
            final String _tmpWorkOder;
            _tmpWorkOder = _cursor.getString(_cursorIndexOfWorkOder);
            final String _tmpWorkOrderDetail;
            _tmpWorkOrderDetail = _cursor.getString(_cursorIndexOfWorkOrderDetail);
            final double _tmpLatitude;
            _tmpLatitude = _cursor.getDouble(_cursorIndexOfLatitude);
            final double _tmpLongitude;
            _tmpLongitude = _cursor.getDouble(_cursorIndexOfLongitude);
            final int _tmpUserId;
            _tmpUserId = _cursor.getInt(_cursorIndexOfUserId);
            _item = new Work(_tmpWorkOder,_tmpWorkOrderDetail,_tmpLatitude,_tmpLongitude,_tmpUserId);
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
