package com.route.data.news;

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
public final class NewsOnlineDataSourceImpl_Factory implements Factory<NewsOnlineDataSourceImpl> {
  private final Provider<NewsServices> newsServicesProvider;

  public NewsOnlineDataSourceImpl_Factory(Provider<NewsServices> newsServicesProvider) {
    this.newsServicesProvider = newsServicesProvider;
  }

  @Override
  public NewsOnlineDataSourceImpl get() {
    return newInstance(newsServicesProvider.get());
  }

  public static NewsOnlineDataSourceImpl_Factory create(
      Provider<NewsServices> newsServicesProvider) {
    return new NewsOnlineDataSourceImpl_Factory(newsServicesProvider);
  }

  public static NewsOnlineDataSourceImpl newInstance(NewsServices newsServices) {
    return new NewsOnlineDataSourceImpl(newsServices);
  }
}
