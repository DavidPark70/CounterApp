package aero.panasonic.counterapp

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel

class CounterViewModel : ViewModel() {
    var _count = mutableStateOf(0)
    val count = _count

    fun increment() {
        _count.value++
    }

    fun decrement() {
        _count.value--
    }
}