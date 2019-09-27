package iteso.mx.tarea05.fragments.home

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import iteso.mx.tarea05.R

class FragmentHome : Fragment(), HomeContract.View {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_home, container, false)
        val title = view.findViewById<TextView>(R.id.fragment_recipes_rv_recipes)
        title.setOnClickListener {
            Log.d("FragmentHome", "Clicked on Home Title")
        }
        return view
    }
}