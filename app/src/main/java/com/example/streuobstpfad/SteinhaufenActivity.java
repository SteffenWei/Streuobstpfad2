package com.example.streuobstpfad;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class SteinhaufenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_steinhaufen);

        TextView sHTv1 = findViewById(R.id.sHTv1);
        TextView sHTv2 = findViewById(R.id.sHTv2);
        TextView sHTv3 = findViewById(R.id.sHtv3);
        TextView sHTv4 = findViewById(R.id.sHTv4);
        TextView sHTv5 = findViewById(R.id.sHTv5);

        ImageView sHIv1 = findViewById(R.id.sHIv1);
        ImageView sHIv2 = findViewById(R.id.sHIv2);

        Button sHBtn1 = findViewById(R.id.sHBtn1);
        Button sHBtn2 = findViewById(R.id.sHBtn2);
    }

    @Override
    public boolean onCreateOptionsMenu (Menu menu){
        // return super.onCreateOptionsMenu(menu);

        getMenuInflater().inflate(R.menu.main_menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();
        if(id== R.id.Main){
            Intent intent=new Intent( this,MainActivity.class);
            Toast.makeText(this, "click on Main Activity", Toast.LENGTH_LONG).show();
            this.startActivity(intent);
            return true;
        }

        if(id== R.id.settings){
            Intent intent=new Intent( this,settingActivity.class);
            Toast.makeText(this, "click on setting Activity", Toast.LENGTH_LONG).show();
            this.startActivity(intent);
            return true;
        }

        if(id== R.id.search){
            Intent intent=new Intent( this, searchActivity.class);
            this.startActivity(intent);
            Toast.makeText(this, "click on Search Activity", Toast.LENGTH_LONG).show();
            return true;
        }

        if(id== R.id.felsberg){
            Intent intent=new Intent(this, SteinhaufenActivity.class);
            this.startActivity(intent);
            Toast.makeText(this, "click on FelsBerg Activity", Toast.LENGTH_LONG).show();
            return true;
        }

        if(id== R.id.hoch_stamm){
            Intent intent=new Intent(this, HochStammActivity.class);
            this.startActivity(intent);
            Toast.makeText(this, "click on Der Hochstamm Activity", Toast.LENGTH_LONG).show();
            return true;
        }

        if(id== R.id.fr_brummer){
            Intent intent=new Intent(this, FrBrummerActivity.class);
            this.startActivity(intent);
            Toast.makeText(this, "click on Friedliche Brummer Activity", Toast.LENGTH_LONG).show();
            return true;
        }

        if(id== R.id.schleiereule){
            Intent intent=new Intent(this, SchleiereuleActivity.class);
            this.startActivity(intent);
            Toast.makeText(this, "click on Die Schleiereule Activity", Toast.LENGTH_LONG).show();
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

}
