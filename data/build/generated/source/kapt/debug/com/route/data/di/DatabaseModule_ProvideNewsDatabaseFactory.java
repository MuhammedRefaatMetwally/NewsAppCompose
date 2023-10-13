package com.route.data.di;

import android.content.Context;
import com.route.data.database.NewsLocalDatabase;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@ScopeMetadata("javax.inject.Singleton")
@QualifierMetadata("dagger.hilt.android.qualifiers.ApplicationContext")
@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class DatabaseModule_ProvideNewsDatabaseFactory implements Factory<NewsLocalDatabase> {
  private final Provider<Context> contextProvider;

  public DatabaseModule_ProvideNewsDatabaseFactory(Provider<Context> contextProvider) {
    this.contextProvider = contextProvider;
  }

  @Override
  public NewsLocalDatabase get() {
    return provideNewsDatabase(contextProvider.get());
  }

  public static DatabaseModule_ProvideNewsDatabaseFactory create(
      Provider<Context> contextProvider) {
    return new DatabaseModule_ProvideNewsDatabaseFactory(contextProvider);
  }

  public static NewsLocalDatabase provideNewsDatabase(Context context) {
    return Preconditions.checkNotNullFromProvides(DatabaseModule.INSTANCE.provideNewsDatabase(context));
  }
}
