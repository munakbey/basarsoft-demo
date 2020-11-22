package com.munevver.basarsoft.viewmodel.db

import android.app.Application
import androidx.lifecycle.MutableLiveData
import com.app.demo.viewmodel.db.DBBasarsoft
import com.munevver.basarsoft.model.User
import kotlinx.coroutines.launch

class LoginViewModel(application: Application) : BaseViewModel(application) {

    val user = MutableLiveData<List<User>>()

    fun addUser(user: User) {
        launch {
            var dao = DBBasarsoft(getApplication()).userDAO()
            if (dao.getUser(user.username).size == 0){
                dao.addUser(user)
            }
        }
    }

    fun getUser(username: String) {
        launch {
            var dao = DBBasarsoft(getApplication()).userDAO()
            user.value = dao.getUser(username)
        }
    }
}