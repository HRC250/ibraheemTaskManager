package gha.bahaa.ibraheemtaskmanager;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.audiofx.Equalizer;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.SearchView;

public class MainActivity extends AppCompatActivity {
    private SearchView Search;
    private ImageButton imgbtn;
    private ListView dyn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);////
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId()==R.id.itmStettings)
        {
            Intent i=new Intent(MainActivity.this,SettingsActivity.class);
            startActivity(i);

        }
        return true;





    }
    }
