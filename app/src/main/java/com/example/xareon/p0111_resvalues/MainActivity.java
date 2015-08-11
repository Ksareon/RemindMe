package com.example.xareon.p0111_resvalues;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;


public class MainActivity extends ActionBarActivity {

    Button button;
    Button button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        ImageView imageView = (ImageView) findViewById(R.id.imageView);
        imageView.setImageDrawable(getResources().getDrawable(R.drawable.ic_camera_black_48dp));

        ImageView i = (ImageView) findViewById(R.id.imageView1);

        /*try {
            URL url = new URL("http://ioe.edu.np/exam/notices/8560Result%20Diploma%20I_I.jpg");
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setDoInput(true);
            connection.connect();
            InputStream input = connection.getInputStream();
            Bitmap myBitmap = BitmapFactory.decodeStream(input);
            i.setImageBitmap(myBitmap);
        } catch (IOException e) {
            e.printStackTrace();
        }*/

        button = (Button) findViewById(R.id.button);
        button2 = (Button) findViewById(R.id.button2);

        View.OnClickListener onClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ImageView imageView = (ImageView) findViewById(R.id.imageView);
                switch (view.getId()) {
                    case R.id.button:
                        imageView.setImageDrawable(getResources().getDrawable(R.drawable.ic_camera_alt_black_48dp));
                        break;
                    case R.id.button2:
                        imageView.setImageDrawable(getResources().getDrawable(R.drawable.ic_camera_black_48dp));
                        break;
                }
            }
        };

        button.setOnClickListener(onClickListener);
        button2.setOnClickListener(onClickListener);
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
