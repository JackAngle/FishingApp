package my.fishingapp.ui.starting_port

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class StartingPortViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is starting_port Fragment"
    }
    val text: LiveData<String> = _text
}