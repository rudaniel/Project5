package com.example.project5;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.tabs.TabLayout;

import androidx.viewpager.widget.ViewPager;
import androidx.appcompat.app.AppCompatActivity;

import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

import com.example.project5.ui.main.SectionsPagerAdapter;
import com.example.project5.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    ImageButton deluxeButton;
    ImageButton hawaiianButton;
    ImageButton pepperoniButton;
    ImageButton storeButton;
    ImageButton currentButton;
    EditText phoneNumber;
    String phoneNumberString;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        phoneNumber = (EditText) findViewById(R.id.phoneNumberText);


        deluxeButton = (ImageButton) findViewById(R.id.deluxeImage); //Sets image to DeluxePizza
        deluxeButton.setOnClickListener(new View.OnClickListener() { //When the button is clicked the method will run.
            public void onClick(View v){

                phoneNumberString = phoneNumber.getText().toString();

                if(alert(phoneNumberString)) {

                }

            }
        });



        hawaiianButton = (ImageButton) findViewById(R.id.hawaiianImage);
        hawaiianButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                phoneNumberString = phoneNumber.getText().toString();

                if(alert(phoneNumberString)) {

                }
            }
        });

        pepperoniButton = (ImageButton) findViewById(R.id.pepperoniImage);
        pepperoniButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                phoneNumberString = phoneNumber.getText().toString();

                if(alert(phoneNumberString)) {

                }
            }
        });

        storeButton = (ImageButton) findViewById(R.id.storeOrderImage);
        storeButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){

            }
        });

        currentButton = (ImageButton) findViewById(R.id.currentOrderImage);
        currentButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){

            }
        });


    }


    public boolean alert(String phoneNumberString) {
        if(!phoneCheck(phoneNumberString)) {
            Toast.makeText(MainActivity.this, "Enter Valid Phone number", Toast.LENGTH_LONG).show();
            return false;
        }
        return true;
    }

    public boolean phoneCheck(String phoneNumberString) {
        boolean result = phoneNumberString.matches("[0-9]+");

        if(result && phoneNumberString.length() == 10){
            return true;
        }
        else{
            return false;
        }
    }


}