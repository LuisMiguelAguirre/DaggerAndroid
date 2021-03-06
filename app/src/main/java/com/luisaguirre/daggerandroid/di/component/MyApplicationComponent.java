package com.luisaguirre.daggerandroid.di.component;

import android.app.Application;

import com.luisaguirre.daggerandroid.MyApplication;
import com.luisaguirre.daggerandroid.di.module.MyApplicationModule;

import dagger.BindsInstance;
import dagger.Component;
import dagger.android.AndroidInjectionModule;
import dagger.android.AndroidInjector;

@Component(modules = {AndroidInjectionModule.class, MyApplicationModule.class})
public interface MyApplicationComponent extends AndroidInjector<MyApplication> {
    @Component.Builder
    interface Builder {

        @BindsInstance
        MyApplicationComponent.Builder application(Application application);

        MyApplicationComponent build();
    }
}
