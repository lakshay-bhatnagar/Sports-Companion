package com.example.sportscompanion;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.cardview.widget.CardView;

public class HomeFragment extends Fragment {

    private CardView tabToday;
    private CardView tabWeekly;
    private TextView tabTodayText;
    private TextView tabWeeklyText;
    private CardView addCaloriesBtn;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home, container, false);

        // Initialize CardViews and TextViews
        tabToday = view.findViewById(R.id.tab_today_card);
        tabWeekly = view.findViewById(R.id.tab_weekly_card);
        tabTodayText = view.findViewById(R.id.tab_today_text);
        tabWeeklyText = view.findViewById(R.id.tab_weekly_text);
        addCaloriesBtn = view.findViewById(R.id.addCalories);

        // Set default states
        setSelectedTab(tabToday, tabTodayText, tabWeekly, tabWeeklyText);

        // Set click listeners for each tab
        tabToday.setOnClickListener(v -> setSelectedTab(tabToday, tabTodayText, tabWeekly, tabWeeklyText));
        tabWeekly.setOnClickListener(v -> setSelectedTab(tabWeekly, tabWeeklyText, tabToday, tabTodayText));

        //todo : feature for adding calories need to be involved

        return view;
    }

    // Method to handle the selected/unselected tab states
    private void setSelectedTab(CardView selectedTab, TextView selectedText, CardView unselectedTab, TextView unselectedText) {
        // Set the selected tab's appearance
        selectedTab.setCardBackgroundColor(Color.WHITE);
        selectedTab.setCardElevation(4f);
        selectedText.setTextColor(Color.BLACK);

        // Set the unselected tab's appearance
        unselectedTab.setCardBackgroundColor(Color.parseColor("#1E1E1E"));
        unselectedTab.setCardElevation(0f);
        unselectedText.setTextColor(Color.parseColor("#F5F5F5"));
    }

}
