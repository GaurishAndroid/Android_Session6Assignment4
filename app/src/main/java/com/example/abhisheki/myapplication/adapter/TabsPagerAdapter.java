package com.example.abhisheki.myapplication.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.example.abhisheki.myapplication.AudioFragment;
import com.example.abhisheki.myapplication.VideoFragment;



public class TabsPagerAdapter extends FragmentStatePagerAdapter {

	int mNumOfTabs=2;

	public TabsPagerAdapter(FragmentManager fm) {
		super(fm);
	}


	@Override
	public Fragment getItem(int index) {

		switch (index) {
		case 0:
			// Buttons fragment activity
			return new AudioFragment();
		case 1:
			// Colors fragment activity
			return new VideoFragment();

		}

		return null;
	}

	@Override
	public int getCount() {
		// get item count - equal to number of tabs
		return mNumOfTabs;
	}

}
