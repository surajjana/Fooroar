package com.fooroar.fooroar.adapter;

import com.fooroar.fooroar.CatererFragment;
import com.fooroar.fooroar.HomeFoodFragment;


import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class TabsPagerAdapter extends FragmentPagerAdapter{

	public TabsPagerAdapter(FragmentManager fm) {
		super(fm);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Fragment getItem(int index) {
		switch (index) {
		case 0:
			// Top Rated fragment activity
			return new HomeFoodFragment();
		case 1:
			// Games fragment activity
			return new CatererFragment();
		}

		return null;
	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return 2;
	}

}
