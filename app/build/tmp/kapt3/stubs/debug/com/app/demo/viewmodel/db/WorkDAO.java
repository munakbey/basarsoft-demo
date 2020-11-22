package com.app.demo.viewmodel.db;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0019\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\u001f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\b2\u0006\u0010\t\u001a\u00020\nH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bJ\u001f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\b2\u0006\u0010\t\u001a\u00020\nH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000b\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\r"}, d2 = {"Lcom/app/demo/viewmodel/db/WorkDAO;", "", "addWork", "", "work", "Lcom/app/demo/model/Work;", "(Lcom/app/demo/model/Work;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getWorkById", "", "id", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getWorkByUserId", "app_debug"})
public abstract interface WorkDAO {
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Insert()
    public abstract java.lang.Object addWork(@org.jetbrains.annotations.NotNull()
    com.app.demo.model.Work work, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "SELECT * FROM work WHERE id = :id")
    public abstract java.lang.Object getWorkById(int id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.app.demo.model.Work>> p1);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "SELECT * FROM work WHERE userId = :id")
    public abstract java.lang.Object getWorkByUserId(int id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.app.demo.model.Work>> p1);
}