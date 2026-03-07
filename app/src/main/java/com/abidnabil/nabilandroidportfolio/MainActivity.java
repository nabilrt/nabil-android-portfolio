package com.abidnabil.nabilandroidportfolio;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView projectList;
    EditText searchText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        projectList = findViewById(R.id.recycler_view_projects);
        searchText = findViewById(R.id.edit_text_search);

        ProjectsAdapter adapter = new ProjectsAdapter(AppData.projects);
        projectList.setAdapter(adapter);

        searchText.addTextChangedListener(new TextWatcher() {
            @Override
            public void afterTextChanged(Editable s) {

            }

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                String searchKey = s.toString().toLowerCase();

                ArrayList<Project> searchResults = new ArrayList<>();

                for (int i = 0; i < AppData.projects.length; i++) {
                    if (AppData.projects[i].name.toLowerCase().contains(searchKey)) {
                        searchResults.add(AppData.projects[i]);
                    }

                }

                Project[] searchResult = searchResults.toArray(new Project[0]);

                if (searchKey.isEmpty()) {
                    adapter.projects = AppData.projects;
                } else {
                    adapter.projects = searchResult;
                }
                adapter.notifyDataSetChanged();

            }
        });


    }
}