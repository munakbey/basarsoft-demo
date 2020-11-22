package com.app.demo.view.activity;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00162\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001\u0016B\u0005\u00a2\u0006\u0002\u0010\u0005J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fJ\u0012\u0010\r\u001a\u00020\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0014J\u0012\u0010\u0010\u001a\u00020\n2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0016J\u0010\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u0015H\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"}, d2 = {"Lcom/app/demo/view/activity/MapsActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Lcom/google/android/gms/maps/OnMapReadyCallback;", "Lcom/google/android/gms/maps/GoogleMap$OnInfoWindowClickListener;", "Ljava/io/Serializable;", "()V", "click", "", "clickCount", "onAlertDialog", "", "view", "Landroid/view/View;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onInfoWindowClick", "p0", "Lcom/google/android/gms/maps/model/Marker;", "onMapReady", "googleMap", "Lcom/google/android/gms/maps/GoogleMap;", "Companion", "app_debug"})
public final class MapsActivity extends androidx.appcompat.app.AppCompatActivity implements com.google.android.gms.maps.OnMapReadyCallback, com.google.android.gms.maps.GoogleMap.OnInfoWindowClickListener, java.io.Serializable {
    private int clickCount = 0;
    private int click = 0;
    @org.jetbrains.annotations.NotNull()
    private static java.util.ArrayList<java.lang.Double> coordinats;
    @org.jetbrains.annotations.NotNull()
    public static com.google.android.gms.maps.GoogleMap mMap;
    @org.jetbrains.annotations.NotNull()
    public static com.app.demo.databinding.ActivityMapsBinding mapBinding;
    public static final com.app.demo.view.activity.MapsActivity.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onMapReady(@org.jetbrains.annotations.NotNull()
    com.google.android.gms.maps.GoogleMap googleMap) {
    }
    
    @java.lang.Override()
    public void onInfoWindowClick(@org.jetbrains.annotations.Nullable()
    com.google.android.gms.maps.model.Marker p0) {
    }
    
    public final void onAlertDialog(@org.jetbrains.annotations.NotNull()
    android.view.View view) {
    }
    
    public MapsActivity() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R*\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\fX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\u0012X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016\u00a8\u0006\u0017"}, d2 = {"Lcom/app/demo/view/activity/MapsActivity$Companion;", "", "()V", "coordinats", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "getCoordinats", "()Ljava/util/ArrayList;", "setCoordinats", "(Ljava/util/ArrayList;)V", "mMap", "Lcom/google/android/gms/maps/GoogleMap;", "getMMap", "()Lcom/google/android/gms/maps/GoogleMap;", "setMMap", "(Lcom/google/android/gms/maps/GoogleMap;)V", "mapBinding", "Lcom/app/demo/databinding/ActivityMapsBinding;", "getMapBinding", "()Lcom/app/demo/databinding/ActivityMapsBinding;", "setMapBinding", "(Lcom/app/demo/databinding/ActivityMapsBinding;)V", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.ArrayList<java.lang.Double> getCoordinats() {
            return null;
        }
        
        public final void setCoordinats(@org.jetbrains.annotations.NotNull()
        java.util.ArrayList<java.lang.Double> p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.google.android.gms.maps.GoogleMap getMMap() {
            return null;
        }
        
        public final void setMMap(@org.jetbrains.annotations.NotNull()
        com.google.android.gms.maps.GoogleMap p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.app.demo.databinding.ActivityMapsBinding getMapBinding() {
            return null;
        }
        
        public final void setMapBinding(@org.jetbrains.annotations.NotNull()
        com.app.demo.databinding.ActivityMapsBinding p0) {
        }
        
        private Companion() {
            super();
        }
    }
}