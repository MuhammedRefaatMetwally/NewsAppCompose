package com.example.newsappcompose.ui.screens.home;

import com.route.domain.repos.NewsRepository;
import com.route.domain.repos.SourcesRepository;
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
public final class NewsViewModel_Factory implements Factory<NewsViewModel> {
  private final Provider<SourcesRepository> sourceRepoProvider;

  private final Provider<NewsRepository> newsRepoProvider;

  public NewsViewModel_Factory(Provider<SourcesRepository> sourceRepoProvider,
      Provider<NewsRepository> newsRepoProvider) {
    this.sourceRepoProvider = sourceRepoProvider;
    this.newsRepoProvider = newsRepoProvider;
  }

  @Override
  public NewsViewModel get() {
    return newInstance(sourceRepoProvider.get(), newsRepoProvider.get());
  }

  public static NewsViewModel_Factory create(Provider<SourcesRepository> sourceRepoProvider,
      Provider<NewsRepository> newsRepoProvider) {
    return new NewsViewModel_Factory(sourceRepoProvider, newsRepoProvider);
  }

  public static NewsViewModel newInstance(SourcesRepository sourceRepo, NewsRepository newsRepo) {
    return new NewsViewModel(sourceRepo, newsRepo);
  }
}
