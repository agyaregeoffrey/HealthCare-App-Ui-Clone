package com.gka.healthcareapp

import androidx.fragment.app.Fragment

interface NavigationHost {
    /**
     * Navigate to the specified fragment, optionally adding a transaction to the back
     * stack to make this navigation reversible
     */
    fun navigateTo(fragment: Fragment, addToBackstack: Boolean)
}