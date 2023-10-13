package com.route.data.sources;

import com.route.data.api.NewsServices;
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
public final class OnlineSourcesDataSourceImpl_Factory implements Factory<OnlineSourcesDataSourceImpl> {
  private final Provider<NewsServices> newsServicesProvider;

  public OnlineSourcesDataSourceImpl_Factory(Provider<NewsServices> newsServicesProvider) {
    this.newsServicesProvider = newsServicesProvider;
  }

  @Override
  public OnlineSourcesDataSourceImpl get() {
    return newInstance(newsServicesProvider.get());
  }

  public static OnlineSourcesDataSourceImpl_Factory create(
      Provider<NewsServices> newsServicesProvider) {
    return new OnlineSourcesDataSourceImpl_Factory(newsServicesProvider);
  }

  public static OnlineSourcesDataSourceImpl newInstance(NewsServices newsServices) {
    return new OnlineSourcesDataSourceImpl(newsServices);
  }
}
