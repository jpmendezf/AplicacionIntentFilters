package spa.seccionuno.aplicacionintentfilters;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onClick_IntentUno(View view){
        Intent i=new Intent("spa.seccionuno.aplicacionintentfilters.MiBrowser");
        i.setData(Uri.parse("http://developer.android.com/intl/es/index.html"));
        startActivity(Intent.createChooser(i, "Escoge una app"));
    }

    public void onClick_IntentDos(View view){
        Intent iDos=new Intent(Intent.ACTION_VIEW);
        iDos.setData(Uri.parse("http://developer.android.com/intl/es/design/index.html"));
        startActivity(Intent.createChooser(iDos,"Escoge una app"));
    }

    public void onClick_IntentTres(View view){
        Intent iTres=new Intent(Intent.ACTION_VIEW);
        iTres.setType("text/html");
        iTres.putExtra("URL","http://developer.android.com/intl/es/develop/index.html");
        startActivity(Intent.createChooser(iTres,"Escoge una app"));
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
