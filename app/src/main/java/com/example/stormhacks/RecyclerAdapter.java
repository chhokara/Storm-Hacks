package com.example.stormhacks;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.ViewHolder> {

    List<Profile> profiles;

    RecyclerAdapter(List<Profile> profiles) {
        this.profiles = profiles;
    }
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.home_directory_widget, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Profile profile = profiles.get(position);
        TextView name = holder.itemView.findViewById(R.id.Username);
        TextView university = holder.itemView.findViewById(R.id.University_Abreviation);
        TextView skills = holder.itemView.findViewById(R.id.Skills);
        TextView interests = holder.itemView.findViewById(R.id.Interests);

        name.setText(profile.username);
        university.setText(profile.university);
        skills.setText(profile.skills);
        interests.setText(profile.interests);

    }

    @Override
    public int getItemCount() {
        return profiles.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
