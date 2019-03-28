package com.luisaguirre.daggerandroid.di.module;

import com.luisaguirre.daggerandroid.MainActivity;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class MyApplicationModule {

    @ContributesAndroidInjector
    abstract MainActivity contributeActivityInjector();
}
