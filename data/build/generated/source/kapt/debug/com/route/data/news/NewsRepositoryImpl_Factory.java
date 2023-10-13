package com.route.data.news;

import com.route.data.NetworkHandler;
import com.route.domain.repos.NewsOfflineDataSource;
import com.route.domain.repos.NewsOnlineDataSource;
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
public final class NewsRepositoryImpl_Factory implements Factory<NewsRepositoryImpl> {
  private final Provider<NewsOnlineDataSource> onlineDataSourceProvider;

  private final Provider<NewsOfflineDataSource> offlineDataSourceProvider;

  private final Provider<NetworkHandler> networkHandlerProvider;

  public NewsRepositoryImpl_Factory(Provider<NewsOnlineDataSource> onlineDataSourceProvider,
      Provider<NewsOfflineDataSource> offlineDataSourceProvider,
      Provider<NetworkHandler> networkHandlerProvider) {
    this.onlineDataSourceProvider = onlineDataSourceProvider;
    this.offlineDataSourceProvider = offlineDataSourceProvider;
    this.networkHandlerProvider = networkHandlerProvider;
  }

  @Override
  public NewsRepositoryImpl get() {
    return newInstance(onlineDataSourceProvider.get(), offlineDataSourceProvider.get(), networkHandlerProvider.get());
  }

  public static NewsRepositoryImpl_Factory create(
      Provider<NewsOnlineDataSource> onlineDataSourceProvider,
      Provider<NewsOfflineDataSource> offlineDataSourceProvider,
      Provider<NetworkHandler> networkHandlerProvider) {
    return new NewsRepositoryImpl_Factory(onlineDataSourceProvider, offlineDataSourceProvider, networkHandlerProvider);
  }

  public static NewsRepositoryImpl newInstance(NewsOnlineDataSource onlineDataSource,
      NewsOfflineDataSource offlineDataSource, NetworkHandler networkHandler) {
    return new NewsRepositoryImpl(onlineDataSource, offlineDataSource, networkHandler);
  }
}
