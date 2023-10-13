package com.route.data.di;

import com.route.data.database.NewsLocalDatabase;
import com.route.data.database.SourcesDao;
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
public final class DatabaseModule_ProvideSourcesDAOFactory implements Factory<SourcesDao> {
  private final Provider<NewsLocalDatabase> newsLocalDatabaseProvider;

  public DatabaseModule_ProvideSourcesDAOFactory(
      Provider<NewsLocalDatabase> newsLocalDatabaseProvider) {
    this.newsLocalDatabaseProvider = newsLocalDatabaseProvider;
  }

  @Override
  public SourcesDao get() {
    return provideSourcesDAO(newsLocalDatabaseProvider.get());
  }

  public static DatabaseModule_ProvideSourcesDAOFactory create(
      Provider<NewsLocalDatabase> newsLocalDatabaseProvider) {
    return new DatabaseModule_ProvideSourcesDAOFactory(newsLocalDatabaseProvider);
  }

  public static SourcesDao provideSourcesDAO(NewsLocalDatabase newsLocalDatabase) {
    return Preconditions.checkNotNullFromProvides(DatabaseModule.INSTANCE.provideSourcesDAO(newsLocalDatabase));
  }
}
