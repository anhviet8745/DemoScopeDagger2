package com.frogermcs.recipes.dagger_userscope;

import com.frogermcs.recipes.dagger_userscope.di.scopes.ActivityScope;

import dagger.Module;
import dagger.Provides;

@Module
public abstract class BaseActivityModule<T extends BaseActivity> {
    protected final T activity;

    public BaseActivityModule(T activity) {
        this.activity = activity;
    }

    @Provides
    @ActivityScope
    public T provideActivity() {
        return activity;
    }
}
