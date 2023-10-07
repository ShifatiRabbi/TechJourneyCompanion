package com.example.techjourneycompanion;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.firestore.FirebaseFirestore;

import java.util.HashMap;
import java.util.Map;

public class uploder extends AppCompatActivity {
    private EditText titleEditText, categoryEditText, descriptionEditText;
    private Button uploadButton;
    private FirebaseFirestore db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_uploder);

        titleEditText = findViewById(R.id.uptitle);
        categoryEditText = findViewById(R.id.upcategory);
        descriptionEditText = findViewById(R.id.updescription);
        uploadButton = findViewById(R.id.uploadButton);

        // Initialize Firebase Firestore
        db = FirebaseFirestore.getInstance();

        uploadButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                uploadData();
            }
        });
    }

    private void uploadData() {
        final String title = titleEditText.getText().toString();
        final String category = categoryEditText.getText().toString();
        final String description = descriptionEditText.getText().toString();

        Map<String, Object> blogData = new HashMap<>();
        blogData.put("title", title);
        blogData.put("category", category);
        blogData.put("description", description);

        db.collection("Blogs")
                .add(blogData)
                .addOnSuccessListener(new OnSuccessListener() {
                    @Override
                    public void onSuccess(Object o) {
                        Toast.makeText(uploder.this, "Blog data uploaded successfully", Toast.LENGTH_SHORT).show();
                        clearFields();
                    }
                })
                .addOnFailureListener(new OnFailureListener() {
                    @Override
                    public void onFailure(@NonNull Exception e) {
                        Toast.makeText(uploder.this, "Error uploading Blog data to Firestore", Toast.LENGTH_SHORT).show();
                    }
                });
    }

    private void clearFields() {
        titleEditText.setText("");
        categoryEditText.setText("");
        descriptionEditText.setText("");
    }
}
