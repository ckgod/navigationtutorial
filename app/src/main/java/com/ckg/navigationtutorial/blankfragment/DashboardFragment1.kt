package com.ckg.navigationtutorial.blankfragment

import android.os.Bundle
import android.view.View
import androidx.navigation.fragment.findNavController
import com.ckg.navigationtutorial.R
import com.ckg.navigationtutorial.databinding.FragmentDashboard1Binding

class DashboardFragment1 : BaseDataBindingFragment<FragmentDashboard1Binding>() {

    override fun getLayoutRes(): Int = R.layout.fragment_dashboard1

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val binding = dataBinding!!

        binding!!.btnNextPage.setOnClickListener {
            findNavController().navigate(R.id.action_dashboardFragment1_to_dashboardFragment2)
        }
    }
}
