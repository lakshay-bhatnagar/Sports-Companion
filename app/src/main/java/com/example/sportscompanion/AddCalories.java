package com.example.sportscompanion;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class AddCalories extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_calories);
        Intent intent = getIntent();

        // Initialize views
        Button addCalories = findViewById(R.id.add_calories_btn);
        EditText addedCaloriesEdttxt = findViewById(R.id.track_calorie_edttxt);

        // Set click listener on the button
        addCalories.setOnClickListener(v -> {
            String caloriesInput = addedCaloriesEdttxt.getText().toString();
            if (!caloriesInput.isEmpty()) {
                // Show a toast with the entered calories
                Toast.makeText(AddCalories.this, "Calories added successfully", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(AddCalories.this, "Please enter a valid value", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
