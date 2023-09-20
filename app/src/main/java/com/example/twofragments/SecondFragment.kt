package com.example.twofragments

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

class SecondFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        return inflater.inflate(R.layout.fragment_second, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val textV = view.findViewById<TextView>(R.id.text_view)
        var count = 0

        val instance1 = arguments?.getSerializable(TAG1)
        if (instance1!=null){count++}
        val instance2 = arguments?.getSerializable(TAG2)
        if (instance2!=null){count++}
        val instance3 = arguments?.getSerializable(TAG3)
        if (instance3!=null){count++}
        val instance4 = arguments?.getSerializable(TAG4)
        if (instance4!=null){count++}
        val instance5 = arguments?.getSerializable(TAG5)
        if (instance5!=null){count++}
        textV.text = count.toString()

    }

    companion object {
        const val TAG1 = "student"
        const val TAG2 = "professor"
        const val TAG3 = "soldier"
        const val TAG4 = "gamer"
        const val TAG5 = "sportsman"

        fun newInstance( student: Student?=null, professor: Professor?=null,
                        soldier: Soldier?=null, gamer: Gamer?=null, sportsman: Sportsman?=null) : SecondFragment
        { val fragment = SecondFragment()
            val arguments = Bundle()
            arguments.putSerializable(TAG1, student)
            arguments.putSerializable(TAG2, professor)
            arguments.putSerializable(TAG3, soldier)
            arguments.putSerializable(TAG4, gamer)
            arguments.putSerializable(TAG5, sportsman)
            fragment.arguments = arguments
            return fragment
        }

        fun getIntent(context: Context, student: Student?=null, professor: Professor?=null,
                      soldier: Soldier?=null, gamer: Gamer?=null, sportsman: Sportsman?=null) : Intent {
                    val intent = Intent(context, SecondFragment::class.java)
                        intent.putExtra(TAG1, student)
                        intent.putExtra(TAG2, professor)
                        intent.putExtra(TAG3, soldier)
                        intent.putExtra(TAG4, gamer)
                        intent.putExtra(TAG5, sportsman)
            return intent
        }
    }
}