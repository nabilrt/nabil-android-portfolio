package com.abidnabil.nabilandroidportfolio;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView list = findViewById(R.id.recycler_view_projects);


        Project[] projects = {
                new Project("Getting Started App", "Our very first project the default 'Hello World' app!", R.drawable.getting_started, "com.abidnabil.gettingstarted"),
                new Project("Quote App", "The first own quote app", R.drawable.quote, "com.abidnabil.quoteapp"),
                new Project("BMI Calculator", "Simple BMI and Fat Percentage Calculator", R.drawable.calculator, "com.abidnabil.bmicalculator"),
                new Project("Inches to Meter", "Inches to Meter Converter", R.drawable.tape, "com.abidnabil.merticsconverter"),
                new Project("Starter Bucks", "A Restaurant Menu Showcase App", R.drawable.hungry_developer, "com.abidnabil.starterbucks"),
                new Project("Nabil's Bucket List", "A List of Things and Places i want to do and visit", R.drawable.bucket_list, "com.abidnabil.nabilbuckets")
        };

        ProjectsAdapter adapter = new ProjectsAdapter(projects);
        list.setAdapter(adapter);


    }
}