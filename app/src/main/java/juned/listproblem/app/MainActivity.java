package juned.listproblem.app;

import android.app.Activity;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;

import java.util.ArrayList;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ArrayList<DbItem> items=new ArrayList<DbItem>();
        for(int i=0;i<50;i++)
        {
            if(i==2)
            {
                DbItem item= new DbItem("Item "+i,i*1.0,false);
                items.add(item);
            }
            else
            {
                DbItem item= new DbItem("Item "+i,i*1.0,true);
                items.add(item);
            }

        }

        CustomListAdapter adapter=new CustomListAdapter(this.getApplicationContext(),items);
        ListView listView=(ListView) findViewById(R.id.MainList);
        listView.setAdapter(adapter);
        adapter.notifyDataSetChanged();




    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

}
