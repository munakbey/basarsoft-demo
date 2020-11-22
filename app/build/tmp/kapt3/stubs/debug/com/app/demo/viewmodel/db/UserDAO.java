package com.app.demo.viewmodel.db;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J%\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u0005\"\u00020\u0006H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0007J\u001f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\t2\u0006\u0010\n\u001a\u00020\u000bH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\f\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\r"}, d2 = {"Lcom/app/demo/viewmodel/db/UserDAO;", "", "addUser", "", "user", "", "Lcom/munevver/basarsoft/model/User;", "([Lcom/munevver/basarsoft/model/User;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getUser", "", "username", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract interface UserDAO {
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Insert()
    public abstract java.lang.Object addUser(@org.jetbrains.annotations.NotNull()
    com.munevver.basarsoft.model.User[] user, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "SELECT * FROM user WHERE username = :username")
    public abstract java.lang.Object getUser(@org.jetbrains.annotations.NotNull()
    java.lang.String username, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.munevver.basarsoft.model.User>> p1);
}