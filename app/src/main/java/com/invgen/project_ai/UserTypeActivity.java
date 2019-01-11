package com.invgen.project_ai;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Toast;

public class UserTypeActivity extends AppCompatActivity {
    private Toolbar mToolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_type);

        mToolbar = findViewById(R.id.toolbar);
        setSupportActionBar(mToolbar);
        getSupportActionBar().setTitle("AI Eye");
    }

    public void viewerClicked(View view) {
        startActivity(new Intent(getApplicationContext(), MainActivityViewer.class));
//        AppConstants.setUserType("viewer");
//        Toast.makeText(mContext, "Users Type Viewer!", Toast.LENGTH_LONG).show();
//        AppUtils.finishActivity(UserTypeActivity.this);
    }

    public void controllerClicked(View view) {
        startActivity(new Intent(getApplicationContext(), MainActivityController.class));
//        AppConstants.setUserType("controller");
//        Toast.makeText(mContext, "Users Type Controller!", Toast.LENGTH_LONG).show();
//        AppUtils.finishActivity(UserTypeActivity.this);
    }
}
