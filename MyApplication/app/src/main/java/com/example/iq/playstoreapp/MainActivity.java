package com.example.iq.playstoreapp;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import com.example.iq.playstoreapp.adapters.CategoryAdapter;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    private TabLayout mTabLayout;
    private ViewPager mViewPager;
    String className;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (mViewPager.getCurrentItem()) {
                    case 0:
                        className = "Top Cart Class";
//                    Toast.makeText(MainActivity.this, "temp", Toast.LENGTH_SHORT).show();
                        break;
                    case 1:
                        className = "Game Class";
                        break;
                    case 2:
                        className = "Category Class";
                        break;
                    case 3:
                        className = "Early Access Class";
                        break;
                    case 4:
                        className = "Family Class";
                        break;
                    default:
                        className = "Editor Choice Class";
                }

                Snackbar.make(view, "" + className, Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        mTabLayout = (TabLayout) findViewById(R.id.tab);
        mViewPager = (ViewPager) findViewById(R.id.viewPager);
        CategoryAdapter categoryAdapter = new CategoryAdapter(this, getSupportFragmentManager());

        mViewPager.setAdapter(categoryAdapter);
        mTabLayout.setupWithViewPager(mViewPager);


        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.cart) {
            Toast.makeText(this, "Cart Selected", Toast.LENGTH_SHORT).show();
//            new carts();
            mViewPager.setCurrentItem(0);
        } else if (id == R.id.games) {
            Toast.makeText(this, "Games Selected", Toast.LENGTH_SHORT).show();
//            new game();
            mViewPager.setCurrentItem(1);
        } else if (id == R.id.categories) {
            Toast.makeText(this, "Categories Selected", Toast.LENGTH_SHORT).show();
//            new category();
            mViewPager.setCurrentItem(2);
        } else if (id == R.id.earlyAcess) {
            Toast.makeText(this, "Early Access Selected", Toast.LENGTH_SHORT).show();
//            new early();
            mViewPager.setCurrentItem(3);
        } else if (id == R.id.family) {
            Toast.makeText(this, "Family Selected", Toast.LENGTH_SHORT).show();
//            new family();
            mViewPager.setCurrentItem(4);
        } else if (id == R.id.editor_choice) {
            Toast.makeText(this, "Editor Choice Selected", Toast.LENGTH_SHORT).show();
//            new editor();
            mViewPager.setCurrentItem(5);
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
