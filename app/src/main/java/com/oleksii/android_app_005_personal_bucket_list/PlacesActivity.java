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
        RecyclerView recyclerViewPlaces;
        recyclerViewPlaces = findViewById(R.id.recycler_view_places);

        ActionObject[] actionObjects = {
                new ActionObject("German pipe organ", R.drawable.pipe_organ,"In St. Stephen's Cathedral in Passau, Bavaria, Germany, the largest pipe organ"),
                new ActionObject("Japan", R.drawable.japan,"Travel around Japan"),
                new ActionObject("Peaceful places", R.drawable.quite_place,"Just go sometimes somewhere far away from big cities")
        };

        ActionAdapter adapter = new ActionAdapter(actionObjects);
        recyclerViewPlaces.setAdapter(adapter);
    }
}