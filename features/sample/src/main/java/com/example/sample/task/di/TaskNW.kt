package com.example.sample.task.di

import android.content.Context
import com.evaph.network.BuildConfig
import com.evaph.network.network.Endpoints
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit
import javax.inject.Singleton

/*
@InstallIn(SingletonComponent::class)
@Module
class TaskNW {

        @Provides
        @Singleton
        fun provideRetrofit(okHttpClient: OkHttpClient): Retrofit {
            return Retrofit.Builder()
                .baseUrl(Endpoints.TASK_BASE_URL)
                .client(okHttpClient)
                .addConverterFactory(GsonConverterFactory.create())
                .build()
        }

        @Provides
        @Singleton
        fun provideOkHttpClient(
            interceptor: HttpLoggingInterceptor,
            @ApplicationContext appContext: Context,
        ): OkHttpClient {
            val okHttpClient = OkHttpClient.Builder()
                .connectTimeout(30, TimeUnit.SECONDS)
                .writeTimeout(30, TimeUnit.SECONDS)
                .readTimeout(30, TimeUnit.SECONDS)
               // .addInterceptor(ChuckInterceptor(appContext))

            if (BuildConfig.DEBUG)
                okHttpClient.addInterceptor(interceptor)

            return okHttpClient.build()
        }

        @Provides
        fun provideInterceptor(): HttpLoggingInterceptor {
            return HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY)
        }
    }

 */

