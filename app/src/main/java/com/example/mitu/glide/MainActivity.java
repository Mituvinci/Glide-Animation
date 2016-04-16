package com.example.mitu.glide;

/*import android.app.Fragment;*/
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;



public class MainActivity extends AppCompatActivity {
    FragmentPagerAdapter adapterViewPager;
    ViewPager vpPager;
    FragmentManager fm;
    Fragment[] pages = new Fragment[]{new FirstFragment(),new SecondFragment()};
    String[] title = {"Cartoon","Nature"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fm =getSupportFragmentManager();
        vpPager = (ViewPager) findViewById(R.id.vpPager);
        adapterViewPager = new MyAdapter(fm);
        vpPager.setAdapter(adapterViewPager);


    }



   /* public static class MyPagerAdapter extends FragmentPagerAdapter {
        private static int NUM_ITEMS = 1;

        public MyPagerAdapter(FragmentManager fragmentManager) {
            super(fragmentManager);
        }

        @Override
        public Fragment getItem(int position) {
            switch (position) {
                case 0: // Fragment # 0 - This will show FirstFragment
                    return FirstFragment.newInstance(0, "Page # 1");


                case 1: // Fragment # 0 - This will show FirstFragment different title
                    return SecondFragment.newInstance(1, "Page # 2");
               *//* case 2: // Fragment # 1 - This will show SecondFragment
                   // return SecondFragment.newInstance(2, "Page # 3");
                    return SecondFragment.newInstance(2, "Page # 3");*//*
                default:
                    return null;
            }
        }

        // Returns total number of pages
        @Override
        public int getCount() {
            return pages.length;
        }



        // Returns the page title for the top indicator
        @Override
        public CharSequence getPageTitle(int position) {
            return "Page " + position;
        }

    }*/


    private class MyAdapter extends FragmentPagerAdapter {
        public MyAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {

            return  pages[position];
        }

        @Override
        public int getCount() {
            return pages.length;
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return title[position];
        }
    }

}


