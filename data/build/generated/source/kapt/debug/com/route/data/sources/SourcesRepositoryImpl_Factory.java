package com.route.data.sources;

import com.route.data.NetworkHandler;
import com.route.domain.repos.OfflineSourcesDataSource;
import com.route.domain.repos.OnlineSourcesDataSource;
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
public final class SourcesRepositoryImpl_Factory implements Factory<SourcesRepositoryImpl> {
  private final Provider<OnlineSourcesDataSource> onlineSourcesDataSourceProvider;

  private final Provider<OfflineSourcesDataSource> offlineSourcesDataSourceProvider;

  private final Provider<NetworkHandler> networkHandlerProvider;

  public SourcesRepositoryImpl_Factory(
      Provider<OnlineSourcesDataSource> onlineSourcesDataSourceProvider,
      Provider<OfflineSourcesDataSource> offlineSourcesDataSourceProvider,
      Provider<NetworkHandler> networkHandlerProvider) {
    this.onlineSourcesDataSourceProvider = onlineSourcesDataSourceProvider;
    this.offlineSourcesDataSourceProvider = offlineSourcesDataSourceProvider;
    this.networkHandlerProvider = networkHandlerProvider;
  }

  @Override
  public SourcesRepositoryImpl get() {
    return newInstance(onlineSourcesDataSourceProvider.get(), offlineSourcesDataSourceProvider.get(), networkHandlerProvider.get());
  }

  public static SourcesRepositoryImpl_Factory create(
      Provider<OnlineSourcesDataSource> onlineSourcesDataSourceProvider,
      Provider<OfflineSourcesDataSource> offlineSourcesDataSourceProvider,
      Provider<NetworkHandler> networkHandlerProvider) {
    return new SourcesRepositoryImpl_Factory(onlineSourcesDataSourceProvider, offlineSourcesDataSourceProvider, networkHandlerProvider);
  }

  public static SourcesRepositoryImpl newInstance(OnlineSourcesDataSource onlineSourcesDataSource,
      OfflineSourcesDataSource offlineSourcesDataSource, NetworkHandler networkHandler) {
    return new SourcesRepositoryImpl(onlineSourcesDataSource, offlineSourcesDataSource, networkHandler);
  }
}
