package com.example.user.HealeApps;

import android.app.SearchManager;
import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.SearchView;
import android.support.v7.widget.SwitchCompat;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.FrameLayout;
import android.widget.Toast;

import com.example.user.HealeApps.Alarm.Alarm;
import com.example.user.HealeApps.MedicineList.Medicine;
import com.example.user.HealeApps.MedicineNote.daftarobat;
import com.example.user.HealeApps.disease.penyakit;
import com.example.user.HealeApps.fragment.about.aboutFragment;
import com.example.user.HealeApps.fragment.news.NewsFragment;


public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    private Toolbar toolbar;
    private DrawerLayout drawerLayout;
    private FrameLayout frameLayout;
    private NavigationView navigationView;
    private SwitchCompat darkModeSwitch;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar myToolbar = (Toolbar) findViewById(R.id.toolbar_id);
        setSupportActionBar(myToolbar);
        initializeViews();
        toggleDrawer();
        initializeDefaultFragment(savedInstanceState,0);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
    }



    private void initializeViews() {
        toolbar = findViewById(R.id.toolbar_id);
        toolbar.setTitle(R.string.toolbar_title);
        setSupportActionBar(toolbar);
        drawerLayout = findViewById(R.id.drawer_layout_id);
        frameLayout = findViewById(R.id.framelayout_id);
        navigationView = findViewById(R.id.navigationview_id);
        navigationView.setNavigationItemSelectedListener(this);

    }


    private void initializeDefaultFragment(Bundle savedInstanceState, int itemIndex){
        if (savedInstanceState == null){
            MenuItem menuItem = navigationView.getMenu().getItem(itemIndex).setChecked(true);
            onNavigationItemSelected(menuItem);
        }
    }


    private void toggleDrawer() {
        ActionBarDrawerToggle drawerToggle = new ActionBarDrawerToggle(this, drawerLayout, toolbar,
                R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawerLayout.addDrawerListener(drawerToggle);
        drawerToggle.syncState();
    }

    @Override
    public void onBackPressed() {

        if (drawerLayout.isDrawerOpen(GravityCompat.START)) {
            drawerLayout.closeDrawer(GravityCompat.START);
        }

        else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
        switch (menuItem.getItemId()){
            case R.id.nav_medicine_id:
                Intent intent1= new Intent(MainActivity.this, Medicine.class);
                startActivity(intent1);
                closeDrawer();
                break;

            case R.id.nav_disease_id:
                Intent intent2= new Intent(MainActivity.this, penyakit.class);
                startActivity(intent2);
                closeDrawer();
                break;

            case R.id.nav_profile_id:
                getSupportFragmentManager().beginTransaction().replace(R.id.framelayout_id, new NewsFragment())
                        .commit();
                closeDrawer();
                break;

            case R.id.nav_health_id:
                Intent intent= new Intent(MainActivity.this, daftarobat.class);
                startActivity(intent);
                closeDrawer();
                break;

            case R.id.nav_alarm:
                Intent intenta= new Intent(MainActivity.this, Alarm.class);
                startActivity(intenta);
                closeDrawer();
                break;


            case R.id.nav_about:
                getSupportFragmentManager().beginTransaction().replace(R.id.framelayout_id,new aboutFragment())                  .commit();
                closeDrawer();

                break;

            case R.id.nav_exit:
                System.exit(0);
        }

        return true;
    }




    private void closeDrawer(){
        if (drawerLayout.isDrawerOpen(GravityCompat.START)){
            drawerLayout.closeDrawer(GravityCompat.START);
        }
    }


    private void deSelectCheckedState(){
        int noOfItems = navigationView.getMenu().size();
        for (int i=0; i<noOfItems;i++){
            navigationView.getMenu().getItem(i).setChecked(false);
        }
    }

}
