package com.oleksii.android_app_005_personal_bucket_list;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.RecyclerView;

import com.oleksii.android_app_005_personal_bucket_list.objects.ActionAdapter;
import com.oleksii.android_app_005_personal_bucket_list.objects.ActionObject;

public class GoalsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_goals);
        RecyclerView recyclerViewGoals;
        recyclerViewGoals = findViewById(R.id.recycler_view_goals);

        ActionObject[] actionObjects = {
                new ActionObject("Complete android education", R.drawable.graduation,"Acquire enough skills to get the job"),
                new ActionObject("Get a job", R.drawable.offer,"Successfully start working as an android developer"),
                new ActionObject("Continue improving skills", R.drawable.studying,"Do not stop educational processes to reach higher seniority"),
                new ActionObject("Create my own app", R.drawable.cello,"Develop an educational application for studying cello")
        };

        ActionAdapter adapter = new ActionAdapter(actionObjects);
        recyclerViewGoals.setAdapter(adapter);
    }
}