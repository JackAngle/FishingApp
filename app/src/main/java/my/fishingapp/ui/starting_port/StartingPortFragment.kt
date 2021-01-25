package my.fishingapp.ui.starting_port

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import my.fishingapp.R

class StartingPortFragment : Fragment() {

    private lateinit var startingPortViewModel: StartingPortViewModel

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        startingPortViewModel =
                ViewModelProvider(this).get(StartingPortViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_starting_port, container, false)
        return root
    }
}