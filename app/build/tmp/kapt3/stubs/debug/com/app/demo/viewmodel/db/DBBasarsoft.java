package com.app.demo.viewmodel.db;

import java.lang.System;

@androidx.room.Database(entities = {com.munevver.basarsoft.model.User.class, com.app.demo.model.Work.class}, version = 3)
@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\'\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&J\b\u0010\u0005\u001a\u00020\u0006H&\u00a8\u0006\b"}, d2 = {"Lcom/app/demo/viewmodel/db/DBBasarsoft;", "Landroidx/room/RoomDatabase;", "()V", "userDAO", "Lcom/app/demo/viewmodel/db/UserDAO;", "workDAO", "Lcom/app/demo/viewmodel/db/WorkDAO;", "Companion", "app_debug"})
public abstract class DBBasarsoft extends androidx.room.RoomDatabase {
    private static volatile com.app.demo.viewmodel.db.DBBasarsoft instance;
    private static final java.lang.Object lock = null;
    @org.jetbrains.annotations.NotNull()
    private static androidx.room.migration.Migration MIGRATION_1_2;
    public static final com.app.demo.viewmodel.db.DBBasarsoft.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.app.demo.viewmodel.db.UserDAO userDAO();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.app.demo.viewmodel.db.WorkDAO workDAO();
    
    public DBBasarsoft() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000eH\u0002J\u0011\u0010\u000f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000eH\u0086\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0001X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lcom/app/demo/viewmodel/db/DBBasarsoft$Companion;", "", "()V", "MIGRATION_1_2", "Landroidx/room/migration/Migration;", "getMIGRATION_1_2", "()Landroidx/room/migration/Migration;", "setMIGRATION_1_2", "(Landroidx/room/migration/Migration;)V", "instance", "Lcom/app/demo/viewmodel/db/DBBasarsoft;", "lock", "createDB", "context", "Landroid/content/Context;", "invoke", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final androidx.room.migration.Migration getMIGRATION_1_2() {
            return null;
        }
        
        public final void setMIGRATION_1_2(@org.jetbrains.annotations.NotNull()
        androidx.room.migration.Migration p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.app.demo.viewmodel.db.DBBasarsoft invoke(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
            return null;
        }
        
        private final com.app.demo.viewmodel.db.DBBasarsoft createDB(android.content.Context context) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}