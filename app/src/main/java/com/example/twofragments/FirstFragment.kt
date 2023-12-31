package com.example.twofragments

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button


class FirstFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_first, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val studentBtn : Button = view.findViewById(R.id.student_button)
        val professorBtn : Button = view.findViewById(R.id.professor_button)
        val soldierBtn : Button = view.findViewById(R.id.soldier_button)
        val gamerBtn : Button = view.findViewById(R.id.gamer_button)
        val sportsmanBtn : Button = view.findViewById(R.id.sportsman_button)

        studentBtn.setOnClickListener{
            val intent = SecondFragment.getIntent(requireContext(), Student())
            val frag2 = SecondFragment.newInstance(Student())


        }
        professorBtn.setOnClickListener{
            val intent = SecondFragment.getIntent(requireContext(), Student(), Professor())


        }
        soldierBtn.setOnClickListener{
            val intent = SecondFragment.getIntent(requireContext(), Student(), Professor(), Soldier())

        }
        gamerBtn.setOnClickListener{
            val intent = SecondFragment.getIntent(requireContext(), Student(), Professor(), Soldier(), Gamer())
        }
        sportsmanBtn.setOnClickListener{
            val intent = SecondFragment.getIntent(requireContext(), Student(),
                Professor(), Soldier(), Gamer(), Sportsman()
            )
        }
    }

    companion object {
        const val TAG1="stud"
        const val TAG2="prof"
        const val TAG3="soldr"
        const val TAG4="gmr"
        const val TAG5="sprtsm"

        fun newInstance() = FirstFragment()
    }
}