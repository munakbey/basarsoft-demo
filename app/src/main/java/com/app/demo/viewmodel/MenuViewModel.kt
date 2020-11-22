package com.app.demo.viewmodel

import android.app.Application
import androidx.lifecycle.MutableLiveData
import com.app.demo.model.Work
import com.app.demo.viewmodel.db.DBBasarsoft
import com.munevver.basarsoft.viewmodel.db.BaseViewModel
import kotlinx.coroutines.launch

class MenuViewModel(application: Application) : BaseViewModel(application) {
    val work = MutableLiveData<List<Work>>()
    var dao = DBBasarsoft(getApplication()).workDAO()

    fun getWorkById(id : Int){
        launch {
            work.value = dao.getWorkById(id)
        }
    }

    fun getWorkByUserId(id : Int){
        launch {
            work.value = dao.getWorkByUserId(id)
        }
    }
}