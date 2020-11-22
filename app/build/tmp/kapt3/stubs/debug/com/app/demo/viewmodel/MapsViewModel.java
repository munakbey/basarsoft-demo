package com.app.demo.viewmodel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\bJ\u000e\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000fR\u001d\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u0010"}, d2 = {"Lcom/app/demo/viewmodel/MapsViewModel;", "Lcom/munevver/basarsoft/viewmodel/db/BaseViewModel;", "application", "Landroid/app/Application;", "(Landroid/app/Application;)V", "work", "Landroidx/lifecycle/MutableLiveData;", "", "Lcom/app/demo/model/Work;", "getWork", "()Landroidx/lifecycle/MutableLiveData;", "addWork", "", "getWorkByUserId", "id", "", "app_debug"})
public final class MapsViewModel extends com.munevver.basarsoft.viewmodel.db.BaseViewModel {
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.app.demo.model.Work>> work = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.util.List<com.app.demo.model.Work>> getWork() {
        return null;
    }
    
    public final void addWork(@org.jetbrains.annotations.NotNull()
    com.app.demo.model.Work work) {
    }
    
    public final void getWorkByUserId(int id) {
    }
    
    public MapsViewModel(@org.jetbrains.annotations.NotNull()
    android.app.Application application) {
        super(null);
    }
}