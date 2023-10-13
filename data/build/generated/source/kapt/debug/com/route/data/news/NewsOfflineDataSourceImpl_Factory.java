package com.route.data.news;

import com.route.data.database.NewsDao;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@ScopeMetadata
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
public final class NewsOfflineDataSourceImpl_Factory implements Factory<NewsOfflineDataSourceImpl> {
  private final Provider<NewsDao> newsDaoProvider;

  public NewsOfflineDataSourceImpl_Factory(Provider<NewsDao> newsDaoProvider) {
    this.newsDaoProvider = newsDaoProvider;
  }

  @Override
  public NewsOfflineDataSourceImpl get() {
    return newInstance(newsDaoProvider.get());
  }

  public static NewsOfflineDataSourceImpl_Factory create(Provider<NewsDao> newsDaoProvider) {
    return new NewsOfflineDataSourceImpl_Factory(newsDaoProvider);
  }

  public static NewsOfflineDataSourceImpl newInstance(NewsDao newsDao) {
    return new NewsOfflineDataSourceImpl(newsDao);
  }
}
