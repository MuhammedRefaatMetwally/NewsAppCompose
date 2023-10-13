package com.route.data.di;

import com.route.data.database.NewsDao;
import com.route.data.database.NewsLocalDatabase;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@ScopeMetadata("javax.inject.Singleton")
@QualifierMetadata
@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class DatabaseModule_ProvideNewsDAOFactory implements Factory<NewsDao> {
  private final Provider<NewsLocalDatabase> newsLocalDatabaseProvider;

  public DatabaseModule_ProvideNewsDAOFactory(
      Provider<NewsLocalDatabase> newsLocalDatabaseProvider) {
    this.newsLocalDatabaseProvider = newsLocalDatabaseProvider;
  }

  @Override
  public NewsDao get() {
    return provideNewsDAO(newsLocalDatabaseProvider.get());
  }

  public static DatabaseModule_ProvideNewsDAOFactory create(
      Provider<NewsLocalDatabase> newsLocalDatabaseProvider) {
    return new DatabaseModule_ProvideNewsDAOFactory(newsLocalDatabaseProvider);
  }

  public static NewsDao provideNewsDAO(NewsLocalDatabase newsLocalDatabase) {
    return Preconditions.checkNotNullFromProvides(DatabaseModule.INSTANCE.provideNewsDAO(newsLocalDatabase));
  }
}
