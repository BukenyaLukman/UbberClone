package com.example.ubberclone.Utils;

import android.view.View;


import androidx.annotation.NonNull;

import com.example.ubberclone.Common;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.material.snackbar.Snackbar;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.FirebaseDatabase;

import java.util.Map;

public class UserUtils {
    public static void updateUser(View view, Map<String, Object> updateData){
        FirebaseDatabase.getInstance()
                .getReference(Common.DRIVER_INFO_REFERENCE)
                .child(FirebaseAuth.getInstance().getCurrentUser().getUid())
                .updateChildren(updateData)
                .addOnFailureListener(new OnFailureListener() {
                    @Override
                    public void onFailure(@NonNull Exception e) {
                        Snackbar.make(view,e.getMessage(),Snackbar.LENGTH_SHORT).show();

                    }
                }).addOnSuccessListener(aVoid -> Snackbar.make(view,"Update information successfully",Snackbar.LENGTH_SHORT).show());
    }
}
