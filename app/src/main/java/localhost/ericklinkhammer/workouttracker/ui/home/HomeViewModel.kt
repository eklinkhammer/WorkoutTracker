package localhost.ericklinkhammer.workouttracker.ui.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class HomeViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is home Fragment"
    }
    val text: LiveData<String> = _text

    private val _hello = MutableLiveData<String>().apply {
        value = "Hello World"
    }
    val hello: LiveData<String> = _hello
}