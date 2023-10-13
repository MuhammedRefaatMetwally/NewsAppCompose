package com.route.data.di;

import com.route.data.api.NewsServices;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import retrofit2.Retrofit;

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
public final class NetworkModule_ProvideNewsServicesFactory implements Factory<NewsServices> {
  private final Provider<Retrofit> retrofitProvider;

  public NetworkModule_ProvideNewsServicesFactory(Provider<Retrofit> retrofitProvider) {
    this.retrofitProvider = retrofitProvider;
  }

  @Override
  public NewsServices get() {
    return provideNewsServices(retrofitProvider.get());
  }

  public static NetworkModule_ProvideNewsServicesFactory create(
      Provider<Retrofit> retrofitProvider) {
    return new NetworkModule_ProvideNewsServicesFactory(retrofitProvider);
  }

  public static NewsServices provideNewsServices(Retrofit retrofit) {
    return Preconditions.checkNotNullFromProvides(NetworkModule.INSTANCE.provideNewsServices(retrofit));
  }
}
