package com.route.data.sources;

import com.route.data.database.SourcesDao;
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
public final class OfflineSourcesDataSourceImpl_Factory implements Factory<OfflineSourcesDataSourceImpl> {
  private final Provider<SourcesDao> sourcesDaoProvider;

  public OfflineSourcesDataSourceImpl_Factory(Provider<SourcesDao> sourcesDaoProvider) {
    this.sourcesDaoProvider = sourcesDaoProvider;
  }

  @Override
  public OfflineSourcesDataSourceImpl get() {
    return newInstance(sourcesDaoProvider.get());
  }

  public static OfflineSourcesDataSourceImpl_Factory create(
      Provider<SourcesDao> sourcesDaoProvider) {
    return new OfflineSourcesDataSourceImpl_Factory(sourcesDaoProvider);
  }

  public static OfflineSourcesDataSourceImpl newInstance(SourcesDao sourcesDao) {
    return new OfflineSourcesDataSourceImpl(sourcesDao);
  }
}
