package com.app.demo;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.app.demo.databinding.ActivityMainBindingImpl;
import com.app.demo.databinding.ActivityMapsBindingImpl;
import com.app.demo.databinding.FragmentFormBindingImpl;
import com.app.demo.databinding.FragmentLoginBindingImpl;
import com.app.demo.databinding.FragmentMenuBindingImpl;
import com.app.demo.databinding.FragmentRegisterBindingImpl;
import com.app.demo.databinding.ListGroupBindingImpl;
import com.app.demo.databinding.ListItemBindingImpl;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_ACTIVITYMAIN = 1;

  private static final int LAYOUT_ACTIVITYMAPS = 2;

  private static final int LAYOUT_FRAGMENTFORM = 3;

  private static final int LAYOUT_FRAGMENTLOGIN = 4;

  private static final int LAYOUT_FRAGMENTMENU = 5;

  private static final int LAYOUT_FRAGMENTREGISTER = 6;

  private static final int LAYOUT_LISTGROUP = 7;

  private static final int LAYOUT_LISTITEM = 8;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(8);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.app.demo.R.layout.activity_main, LAYOUT_ACTIVITYMAIN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.app.demo.R.layout.activity_maps, LAYOUT_ACTIVITYMAPS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.app.demo.R.layout.fragment_form, LAYOUT_FRAGMENTFORM);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.app.demo.R.layout.fragment_login, LAYOUT_FRAGMENTLOGIN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.app.demo.R.layout.fragment_menu, LAYOUT_FRAGMENTMENU);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.app.demo.R.layout.fragment_register, LAYOUT_FRAGMENTREGISTER);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.app.demo.R.layout.list_group, LAYOUT_LISTGROUP);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.app.demo.R.layout.list_item, LAYOUT_LISTITEM);
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case  LAYOUT_ACTIVITYMAIN: {
          if ("layout/activity_main_0".equals(tag)) {
            return new ActivityMainBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_main is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYMAPS: {
          if ("layout/activity_maps_0".equals(tag)) {
            return new ActivityMapsBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_maps is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTFORM: {
          if ("layout/fragment_form_0".equals(tag)) {
            return new FragmentFormBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_form is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTLOGIN: {
          if ("layout/fragment_login_0".equals(tag)) {
            return new FragmentLoginBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_login is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTMENU: {
          if ("layout/fragment_menu_0".equals(tag)) {
            return new FragmentMenuBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_menu is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTREGISTER: {
          if ("layout/fragment_register_0".equals(tag)) {
            return new FragmentRegisterBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_register is invalid. Received: " + tag);
        }
        case  LAYOUT_LISTGROUP: {
          if ("layout/list_group_0".equals(tag)) {
            return new ListGroupBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for list_group is invalid. Received: " + tag);
        }
        case  LAYOUT_LISTITEM: {
          if ("layout/list_item_0".equals(tag)) {
            return new ListItemBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for list_item is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(1);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(1);

    static {
      sKeys.put(0, "_all");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(8);

    static {
      sKeys.put("layout/activity_main_0", com.app.demo.R.layout.activity_main);
      sKeys.put("layout/activity_maps_0", com.app.demo.R.layout.activity_maps);
      sKeys.put("layout/fragment_form_0", com.app.demo.R.layout.fragment_form);
      sKeys.put("layout/fragment_login_0", com.app.demo.R.layout.fragment_login);
      sKeys.put("layout/fragment_menu_0", com.app.demo.R.layout.fragment_menu);
      sKeys.put("layout/fragment_register_0", com.app.demo.R.layout.fragment_register);
      sKeys.put("layout/list_group_0", com.app.demo.R.layout.list_group);
      sKeys.put("layout/list_item_0", com.app.demo.R.layout.list_item);
    }
  }
}
