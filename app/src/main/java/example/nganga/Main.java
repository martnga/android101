package example.nganga;

import android.app.Activity;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
/*import android.support.v7.app.ActionBarActivity;*/
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.view.View.OnClickListener;


public class Main extends Activity  {

    Button B1,B2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView mRecyclerView = (RecyclerView) findViewById(R.id.rvStoryList);
        mRecyclerView.setHasFixedSize(true);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        mRecyclerView.setAdapter(new StoryListAdapter(8));


        //accessing buttons from view to give them functionality
        B1 = (Button)findViewById(R.id.b1);
        B2 = (Button)findViewById(R.id.b2);

        B1.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentManager FM = getFragmentManager();
                FragmentTransaction FT = FM.beginTransaction();
                FragmentOne F1 = new FragmentOne();
                FT.add(R.id.fr1_id, F1);
                FT.addToBackStack("f1");
                FT.commit();
            }
        });

        B2.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentManager FM = getFragmentManager();
                FragmentTransaction FT = FM.beginTransaction();
                FragmentTwo F2 = new FragmentTwo();
                FT.add(R.id.fr2_id, F2);
                FT.addToBackStack("f2");
                FT.commit();
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }


}
