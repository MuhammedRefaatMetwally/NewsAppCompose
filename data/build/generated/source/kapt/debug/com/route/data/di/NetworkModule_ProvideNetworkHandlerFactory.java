package com.route.data.di;

import com.route.data.NetworkHandler;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;

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
public final class NetworkModule_ProvideNetworkHandlerFactory implements Factory<NetworkHandler> {
  @Override
  public NetworkHandler get() {
    return provideNetworkHandler();
  }

  public static NetworkModule_ProvideNetworkHandlerFactory create() {
    return InstanceHolder.INSTANCE;
  }

  public static NetworkHandler provideNetworkHandler() {
    return Preconditions.checkNotNullFromProvides(NetworkModule.INSTANCE.provideNetworkHandler());
  }

  private static final class InstanceHolder {
    private static final NetworkModule_ProvideNetworkHandlerFactory INSTANCE = new NetworkModule_ProvideNetworkHandlerFactory();
  }
}
