package com.oleksii.android_app_005_personal_bucket_list;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.RecyclerView;

import com.oleksii.android_app_005_personal_bucket_list.objects.ActionAdapter;
import com.oleksii.android_app_005_personal_bucket_list.objects.ActionObject;

public class PlacesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_places);
        RecyclerView recyclerViewGoals;
        recyclerViewGoals = findViewById(R.id.recycler_view_goals);

        ActionObject[] actionObjects = {
                new ActionObject("", 5,"")
        };

        ActionAdapter adapter = new ActionAdapter(actionObjects);
        recyclerViewGoals.setAdapter(adapter);
    }
}