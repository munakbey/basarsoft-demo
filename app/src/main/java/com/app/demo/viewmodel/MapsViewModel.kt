package com.app.demo.viewmodel

import android.app.Application
import androidx.lifecycle.MutableLiveData
import com.app.demo.model.Work
import com.app.demo.viewmodel.db.DBBasarsoft
import com.munevver.basarsoft.viewmodel.db.BaseViewModel
import kotlinx.coroutines.launch

class MapsViewModel(application: Application) : BaseViewModel(application) {
    val work = MutableLiveData<List<Work>>()

    fun addWork(work: Work){
        launch {
            var dao = DBBasarsoft(getApplication()).workDAO()
            dao.addWork(work)
        }
    }

    fun getWorkByUserId(id : Int){
        launch {
            var dao = DBBasarsoft(getApplication()).workDAO()
            work.value = dao.getWorkByUserId(id)
        }
    }
}