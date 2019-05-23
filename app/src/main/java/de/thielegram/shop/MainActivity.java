package de.thielegram.shop;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;

import de.thielegram.shop.Fragments.Ingredients;
import de.thielegram.shop.Fragments.Settings;
import de.thielegram.shop.Fragments.Shopping;

public class MainActivity extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        View defaultView = findViewById(R.id.navigation_shopping);
        defaultView.performClick();
        loadFragment(new Shopping());

        //getting bottom navigation view and attaching the listener
        BottomNavigationView navigation = findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(this);


    }

    private boolean loadFragment(Fragment fragment) {
        //switching fragment
        if (fragment != null) {
            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.fragment_container, fragment)
                    .commit();
            return true;
        }
        return false;
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        Fragment fragment = null;

        switch (item.getItemId()) {
            case R.id.navigation_shopping:
                fragment = new Shopping();
                break;

            case R.id.navigation_settings:
                fragment = new Settings();
                break;

            case R.id.navigation_ingredients:
                fragment = new Ingredients();
                break;
        }

        return loadFragment(fragment);
    }
}