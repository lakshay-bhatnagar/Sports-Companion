package com.example.sportscompanion;

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

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home, container, false);

        // Initialize CardViews and TextViews
        tabToday = view.findViewById(R.id.tab_today_card);
        tabWeekly = view.findViewById(R.id.tab_weekly_card);
        tabTodayText = view.findViewById(R.id.tab_today_text);
        tabWeeklyText = view.findViewById(R.id.tab_weekly_text);

        // Set default states (optional, assuming 'Today' is the default selected)
        setSelectedTab(tabToday, tabTodayText, tabWeekly, tabWeeklyText);

        // Set click listeners for each tab
        tabToday.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Set "Today" as selected and "Weekly" as unselected
                setSelectedTab(tabToday, tabTodayText, tabWeekly, tabWeeklyText);
            }
        });

        tabWeekly.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Set "Weekly" as selected and "Today" as unselected
                setSelectedTab(tabWeekly, tabWeeklyText, tabToday, tabTodayText);
            }
        });

        return view;
    }

    // Method to handle the selected/unselected tab states
    private void setSelectedTab(CardView selectedTab, TextView selectedText, CardView unselectedTab, TextView unselectedText) {
        // Set the selected tab's appearance
        selectedTab.setCardBackgroundColor(Color.WHITE);
        selectedTab.setCardElevation(4f); // Elevation for the selected card
        selectedText.setTextColor(Color.BLACK); // Black text for selected tab

        // Set the unselected tab's appearance
        unselectedTab.setCardBackgroundColor(Color.parseColor("#1E1E1E")); // Gray background
        unselectedTab.setCardElevation(0f); // No elevation for unselected
        unselectedText.setTextColor(Color.parseColor("#F5F5F5")); // Gray text for unselected tab
    }
}
