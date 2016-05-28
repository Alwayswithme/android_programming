package com.bignerdranch.android.criminalintent;

import android.content.Context;
import android.content.Intent;
import android.support.v4.app.Fragment;

import java.util.UUID;

public class CrimeActivity extends SingleFragmentActivity {

    private static final String EXTRA_CRIME_ID = "com.bignerdranch.android.criminalintent.crime_id";
    private static final String EXTRA_CRIME_POS = "com.bignerdranch.android.criminalintent.crime_position";

    public static Intent newIntent(Context context, UUID crimeId, int position) {
        Intent intent = new Intent(context, CrimeActivity.class);
        intent.putExtra(EXTRA_CRIME_ID, crimeId);
        intent.putExtra(EXTRA_CRIME_POS, position);
        return intent;
    }

    @Override
    protected Fragment createFragment() {
        UUID crimeId = (UUID) getIntent().getSerializableExtra(EXTRA_CRIME_ID);
        return CrimeFragment.newInstance(crimeId);
    }

    @Override
    public void finish() {
        int position =  getIntent().getIntExtra(EXTRA_CRIME_POS, 0);
        Intent intent = CrimeListFragment.resultIntent(position);
        setResult(RESULT_OK, intent);
        super.finish();
    }
}
