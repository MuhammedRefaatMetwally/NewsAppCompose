package com.route.data.database;

import androidx.annotation.NonNull;
import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomOpenHelper;
import androidx.room.RoomOpenHelper.Delegate;
import androidx.room.RoomOpenHelper.ValidationResult;
import androidx.room.migration.AutoMigrationSpec;
import androidx.room.migration.Migration;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.room.util.TableInfo.Column;
import androidx.room.util.TableInfo.ForeignKey;
import androidx.room.util.TableInfo.Index;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Callback;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.annotation.processing.Generated;

@Generated("androidx.room.RoomProcessor")
@SuppressWarnings({"unchecked", "deprecation"})
public final class NewsLocalDatabase_Impl extends NewsLocalDatabase {
  private volatile SourcesDao _sourcesDao;

  private volatile NewsDao _newsDao;

  @Override
  protected SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration configuration) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(configuration, new RoomOpenHelper.Delegate(1) {
      @Override
      public void createAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("CREATE TABLE IF NOT EXISTS `ArticlesItem` (`id` INTEGER PRIMARY KEY AUTOINCREMENT, `publishedAt` TEXT, `author` TEXT, `urlToImage` TEXT, `description` TEXT, `title` TEXT, `url` TEXT, `content` TEXT)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `SourceItem` (`country` TEXT, `name` TEXT, `description` TEXT, `language` TEXT, `id` TEXT NOT NULL, `category` TEXT, `url` TEXT, PRIMARY KEY(`id`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        _db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '3cc410a25a2accde6a0eed963a90f034')");
      }

      @Override
      public void dropAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("DROP TABLE IF EXISTS `ArticlesItem`");
        _db.execSQL("DROP TABLE IF EXISTS `SourceItem`");
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onDestructiveMigration(_db);
          }
        }
      }

      @Override
      public void onCreate(SupportSQLiteDatabase _db) {
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onCreate(_db);
          }
        }
      }

      @Override
      public void onOpen(SupportSQLiteDatabase _db) {
        mDatabase = _db;
        internalInitInvalidationTracker(_db);
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onOpen(_db);
          }
        }
      }

      @Override
      public void onPreMigrate(SupportSQLiteDatabase _db) {
        DBUtil.dropFtsSyncTriggers(_db);
      }

      @Override
      public void onPostMigrate(SupportSQLiteDatabase _db) {
      }

      @Override
      public RoomOpenHelper.ValidationResult onValidateSchema(SupportSQLiteDatabase _db) {
        final HashMap<String, TableInfo.Column> _columnsArticlesItem = new HashMap<String, TableInfo.Column>(8);
        _columnsArticlesItem.put("id", new TableInfo.Column("id", "INTEGER", false, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsArticlesItem.put("publishedAt", new TableInfo.Column("publishedAt", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsArticlesItem.put("author", new TableInfo.Column("author", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsArticlesItem.put("urlToImage", new TableInfo.Column("urlToImage", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsArticlesItem.put("description", new TableInfo.Column("description", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsArticlesItem.put("title", new TableInfo.Column("title", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsArticlesItem.put("url", new TableInfo.Column("url", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsArticlesItem.put("content", new TableInfo.Column("content", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysArticlesItem = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesArticlesItem = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoArticlesItem = new TableInfo("ArticlesItem", _columnsArticlesItem, _foreignKeysArticlesItem, _indicesArticlesItem);
        final TableInfo _existingArticlesItem = TableInfo.read(_db, "ArticlesItem");
        if (! _infoArticlesItem.equals(_existingArticlesItem)) {
          return new RoomOpenHelper.ValidationResult(false, "ArticlesItem(com.route.data.models.ArticlesItem).\n"
                  + " Expected:\n" + _infoArticlesItem + "\n"
                  + " Found:\n" + _existingArticlesItem);
        }
        final HashMap<String, TableInfo.Column> _columnsSourceItem = new HashMap<String, TableInfo.Column>(7);
        _columnsSourceItem.put("country", new TableInfo.Column("country", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSourceItem.put("name", new TableInfo.Column("name", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSourceItem.put("description", new TableInfo.Column("description", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSourceItem.put("language", new TableInfo.Column("language", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSourceItem.put("id", new TableInfo.Column("id", "TEXT", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSourceItem.put("category", new TableInfo.Column("category", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSourceItem.put("url", new TableInfo.Column("url", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysSourceItem = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesSourceItem = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoSourceItem = new TableInfo("SourceItem", _columnsSourceItem, _foreignKeysSourceItem, _indicesSourceItem);
        final TableInfo _existingSourceItem = TableInfo.read(_db, "SourceItem");
        if (! _infoSourceItem.equals(_existingSourceItem)) {
          return new RoomOpenHelper.ValidationResult(false, "SourceItem(com.route.data.models.SourceItem).\n"
                  + " Expected:\n" + _infoSourceItem + "\n"
                  + " Found:\n" + _existingSourceItem);
        }
        return new RoomOpenHelper.ValidationResult(true, null);
      }
    }, "3cc410a25a2accde6a0eed963a90f034", "0a126a3816f689c30b719b74da9f0ec2");
    final SupportSQLiteOpenHelper.Configuration _sqliteConfig = SupportSQLiteOpenHelper.Configuration.builder(configuration.context)
        .name(configuration.name)
        .callback(_openCallback)
        .build();
    final SupportSQLiteOpenHelper _helper = configuration.sqliteOpenHelperFactory.create(_sqliteConfig);
    return _helper;
  }

  @Override
  protected InvalidationTracker createInvalidationTracker() {
    final HashMap<String, String> _shadowTablesMap = new HashMap<String, String>(0);
    HashMap<String, Set<String>> _viewTables = new HashMap<String, Set<String>>(0);
    return new InvalidationTracker(this, _shadowTablesMap, _viewTables, "ArticlesItem","SourceItem");
  }

  @Override
  public void clearAllTables() {
    super.assertNotMainThread();
    final SupportSQLiteDatabase _db = super.getOpenHelper().getWritableDatabase();
    try {
      super.beginTransaction();
      _db.execSQL("DELETE FROM `ArticlesItem`");
      _db.execSQL("DELETE FROM `SourceItem`");
      super.setTransactionSuccessful();
    } finally {
      super.endTransaction();
      _db.query("PRAGMA wal_checkpoint(FULL)").close();
      if (!_db.inTransaction()) {
        _db.execSQL("VACUUM");
      }
    }
  }

  @Override
  protected Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
    final HashMap<Class<?>, List<Class<?>>> _typeConvertersMap = new HashMap<Class<?>, List<Class<?>>>();
    _typeConvertersMap.put(SourcesDao.class, SourcesDao_Impl.getRequiredConverters());
    _typeConvertersMap.put(NewsDao.class, NewsDao_Impl.getRequiredConverters());
    return _typeConvertersMap;
  }

  @Override
  public Set<Class<? extends AutoMigrationSpec>> getRequiredAutoMigrationSpecs() {
    final HashSet<Class<? extends AutoMigrationSpec>> _autoMigrationSpecsSet = new HashSet<Class<? extends AutoMigrationSpec>>();
    return _autoMigrationSpecsSet;
  }

  @Override
  public List<Migration> getAutoMigrations(
      @NonNull Map<Class<? extends AutoMigrationSpec>, AutoMigrationSpec> autoMigrationSpecsMap) {
    return Arrays.asList();
  }

  @Override
  public SourcesDao getSourcesDao() {
    if (_sourcesDao != null) {
      return _sourcesDao;
    } else {
      synchronized(this) {
        if(_sourcesDao == null) {
          _sourcesDao = new SourcesDao_Impl(this);
        }
        return _sourcesDao;
      }
    }
  }

  @Override
  public NewsDao getNewsDao() {
    if (_newsDao != null) {
      return _newsDao;
    } else {
      synchronized(this) {
        if(_newsDao == null) {
          _newsDao = new NewsDao_Impl(this);
        }
        return _newsDao;
      }
    }
  }
}
