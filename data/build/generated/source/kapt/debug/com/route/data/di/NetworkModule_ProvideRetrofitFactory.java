package com.route.data.di;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

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
public final class NetworkModule_ProvideRetrofitFactory implements Factory<Retrofit> {
  private final Provider<GsonConverterFactory> gsonConverterFactoryProvider;

  private final Provider<OkHttpClient> okHttpClientProvider;

  public NetworkModule_ProvideRetrofitFactory(
      Provider<GsonConverterFactory> gsonConverterFactoryProvider,
      Provider<OkHttpClient> okHttpClientProvider) {
    this.gsonConverterFactoryProvider = gsonConverterFactoryProvider;
    this.okHttpClientProvider = okHttpClientProvider;
  }

  @Override
  public Retrofit get() {
    return provideRetrofit(gsonConverterFactoryProvider.get(), okHttpClientProvider.get());
  }

  public static NetworkModule_ProvideRetrofitFactory create(
      Provider<GsonConverterFactory> gsonConverterFactoryProvider,
      Provider<OkHttpClient> okHttpClientProvider) {
    return new NetworkModule_ProvideRetrofitFactory(gsonConverterFactoryProvider, okHttpClientProvider);
  }

  public static Retrofit provideRetrofit(GsonConverterFactory gsonConverterFactory,
      OkHttpClient okHttpClient) {
    return Preconditions.checkNotNullFromProvides(NetworkModule.INSTANCE.provideRetrofit(gsonConverterFactory, okHttpClient));
  }
}
