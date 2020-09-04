package com.example.cheatsbibleforgames;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;




public class Sanandreas extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sanandreas);


    }
}


/**
public class Sanandreas extends AppCompatActivity {

    private RecyclerView recyclerview_sanandreas;

    private PostAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sanandreas);

        recyclerview_sanandreas = (RecyclerView)findViewById(R.id.recyclerview_sanandreas);

        recyclerview_sanandreas.setLayoutManager(new LinearLayoutManager(this));


        //FirebaseRecyclerOptions<Post> options = new FirebaseRecyclerOptions<.Builder<Post>().setQuery(FirebaseDatabase.getInstance().getReference().child("Post"),
          //      Post.class).build();

        FirebaseRecyclerOptions<Post> options =
                new FirebaseRecyclerOptions.Builder<Post>()
                        .setQuery(FirebaseDatabase.getInstance().getReference().child("Post"), Post.class)
                        .build();

        PostAdapter adapter = new PostAdapter(options);
        recyclerview_sanandreas.setAdapter(adapter);

    }

    @Override
    protected void onStart() {
        super.onStart();
        adapter.startListening();
    }

    @Override
    protected void onStop() {
        super.onStop();
        adapter.stopListening();
    }




}
**/