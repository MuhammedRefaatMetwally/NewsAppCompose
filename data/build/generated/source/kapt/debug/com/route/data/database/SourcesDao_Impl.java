package com.route.data.database;

import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.route.data.models.SourceItem;
import java.lang.Class;
import java.lang.Exception;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import javax.annotation.processing.Generated;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

@Generated("androidx.room.RoomProcessor")
@SuppressWarnings({"unchecked", "deprecation"})
public final class SourcesDao_Impl implements SourcesDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<SourceItem> __insertionAdapterOfSourceItem;

  public SourcesDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfSourceItem = new EntityInsertionAdapter<SourceItem>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR IGNORE INTO `SourceItem` (`country`,`name`,`description`,`language`,`id`,`category`,`url`) VALUES (?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, SourceItem value) {
        if (value.getCountry() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getCountry());
        }
        if (value.getName() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getName());
        }
        if (value.getDescription() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getDescription());
        }
        if (value.getLanguage() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getLanguage());
        }
        if (value.getId() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getId());
        }
        if (value.getCategory() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getCategory());
        }
        if (value.getUrl() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, value.getUrl());
        }
      }
    };
  }

  @Override
  public Object insertSourceToDB(final List<SourceItem> list,
      final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfSourceItem.insert(list);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public Object getSourcesFromDB(final Continuation<? super List<SourceItem>> continuation) {
    final String _sql = "SELECT * FROM SourceItem";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<List<SourceItem>>() {
      @Override
      public List<SourceItem> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfCountry = CursorUtil.getColumnIndexOrThrow(_cursor, "country");
          final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
          final int _cursorIndexOfDescription = CursorUtil.getColumnIndexOrThrow(_cursor, "description");
          final int _cursorIndexOfLanguage = CursorUtil.getColumnIndexOrThrow(_cursor, "language");
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfCategory = CursorUtil.getColumnIndexOrThrow(_cursor, "category");
          final int _cursorIndexOfUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "url");
          final List<SourceItem> _result = new ArrayList<SourceItem>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final SourceItem _item;
            final String _tmpCountry;
            if (_cursor.isNull(_cursorIndexOfCountry)) {
              _tmpCountry = null;
            } else {
              _tmpCountry = _cursor.getString(_cursorIndexOfCountry);
            }
            final String _tmpName;
            if (_cursor.isNull(_cursorIndexOfName)) {
              _tmpName = null;
            } else {
              _tmpName = _cursor.getString(_cursorIndexOfName);
            }
            final String _tmpDescription;
            if (_cursor.isNull(_cursorIndexOfDescription)) {
              _tmpDescription = null;
            } else {
              _tmpDescription = _cursor.getString(_cursorIndexOfDescription);
            }
            final String _tmpLanguage;
            if (_cursor.isNull(_cursorIndexOfLanguage)) {
              _tmpLanguage = null;
            } else {
              _tmpLanguage = _cursor.getString(_cursorIndexOfLanguage);
            }
            final String _tmpId;
            if (_cursor.isNull(_cursorIndexOfId)) {
              _tmpId = null;
            } else {
              _tmpId = _cursor.getString(_cursorIndexOfId);
            }
            final String _tmpCategory;
            if (_cursor.isNull(_cursorIndexOfCategory)) {
              _tmpCategory = null;
            } else {
              _tmpCategory = _cursor.getString(_cursorIndexOfCategory);
            }
            final String _tmpUrl;
            if (_cursor.isNull(_cursorIndexOfUrl)) {
              _tmpUrl = null;
            } else {
              _tmpUrl = _cursor.getString(_cursorIndexOfUrl);
            }
            _item = new SourceItem(_tmpCountry,_tmpName,_tmpDescription,_tmpLanguage,_tmpId,_tmpCategory,_tmpUrl);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
          _statement.release();
        }
      }
    }, continuation);
  }

  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
