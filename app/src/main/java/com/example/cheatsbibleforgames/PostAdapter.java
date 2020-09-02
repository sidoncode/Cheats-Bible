package com.example.cheatsbibleforgames;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.firebase.ui.database.FirebaseRecyclerOptions;

public class PostAdapter extends FirebaseRecyclerAdapter<Post, PostAdapter.PostViewHolder> {

    public PostAdapter(@NonNull FirebaseRecyclerOptions<Post> options) {
        super(options);
    }

    @Override
    protected void onBindViewHolder(@NonNull PostViewHolder holder, int position, @NonNull Post model) {

    }

    @NonNull
    @Override
    public PostViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.post, parent, false);

        return null;
    }

    class PostViewHolder extends RecyclerView.ViewHolder{

        public PostViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
