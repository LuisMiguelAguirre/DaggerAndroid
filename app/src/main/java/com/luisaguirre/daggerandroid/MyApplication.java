package com.luisaguirre.daggerandroid;

import com.luisaguirre.daggerandroid.di.component.DaggerMyApplicationComponent;

import dagger.android.AndroidInjector;
import dagger.android.DaggerApplication;

public class MyApplication extends DaggerApplication {

    @Override
    protected AndroidInjector<? extends DaggerApplication> applicationInjector() {
        return DaggerMyApplicationComponent.builder().application(this).build();
    }
}
