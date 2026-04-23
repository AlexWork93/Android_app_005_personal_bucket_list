package com.oleksii.android_app_005_personal_bucket_list.objects;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.oleksii.android_app_005_personal_bucket_list.R;

public class ActionAdapter extends RecyclerView.Adapter<ActionAdapter.ActionViewHolder> {

    ActionObject[] actionObjects;
    public ActionAdapter(ActionObject[] actionObjects) {
        this.actionObjects = actionObjects;
    }

    @NonNull
    @Override
    public ActionViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_action, parent, false);
        return new ActionViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ActionViewHolder holder, int position) {
        holder.bind(actionObjects[position]);
    }

    @Override
    public int getItemCount() {
        return actionObjects.length;
    }

    static class ActionViewHolder extends RecyclerView.ViewHolder{

        TextView actionName;
        ImageView actionImg;
        TextView actionDescription;
        public ActionViewHolder(@NonNull View itemView) {
            super(itemView);
            actionName = itemView.findViewById(R.id.text_view_action_name);
            actionImg = itemView.findViewById(R.id.image_view_action_image);
            actionDescription = itemView.findViewById(R.id.text_view_action_description);
        }

        public void bind(ActionObject actionObject){
            actionName.setText(actionObject.getActionName());
            actionImg.setImageResource(actionObject.getActionImg());
            actionDescription.setText(actionObject.getActionDescription());
        }
    }
}
