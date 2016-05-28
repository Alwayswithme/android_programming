package com.bignerdranch.android.criminalintent;

import android.support.v4.app.Fragment;

/**
 * Created by phoenix on 5/28/16.
 */
public class CrimeListActivity extends SingleFragmentActivity {

    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }
}
