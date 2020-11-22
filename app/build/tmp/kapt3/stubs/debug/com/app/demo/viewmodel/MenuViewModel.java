package com.app.demo.viewmodel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014J\u000e\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001d\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010\u00a8\u0006\u0016"}, d2 = {"Lcom/app/demo/viewmodel/MenuViewModel;", "Lcom/munevver/basarsoft/viewmodel/db/BaseViewModel;", "application", "Landroid/app/Application;", "(Landroid/app/Application;)V", "dao", "Lcom/app/demo/viewmodel/db/WorkDAO;", "getDao", "()Lcom/app/demo/viewmodel/db/WorkDAO;", "setDao", "(Lcom/app/demo/viewmodel/db/WorkDAO;)V", "work", "Landroidx/lifecycle/MutableLiveData;", "", "Lcom/app/demo/model/Work;", "getWork", "()Landroidx/lifecycle/MutableLiveData;", "getWorkById", "", "id", "", "getWorkByUserId", "app_debug"})
public final class MenuViewModel extends com.munevver.basarsoft.viewmodel.db.BaseViewModel {
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.app.demo.model.Work>> work = null;
    @org.jetbrains.annotations.NotNull()
    private com.app.demo.viewmodel.db.WorkDAO dao;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.util.List<com.app.demo.model.Work>> getWork() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.app.demo.viewmodel.db.WorkDAO getDao() {
        return null;
    }
    
    public final void setDao(@org.jetbrains.annotations.NotNull()
    com.app.demo.viewmodel.db.WorkDAO p0) {
    }
    
    public final void getWorkById(int id) {
    }
    
    public final void getWorkByUserId(int id) {
    }
    
    public MenuViewModel(@org.jetbrains.annotations.NotNull()
    android.app.Application application) {
        super(null);
    }
}