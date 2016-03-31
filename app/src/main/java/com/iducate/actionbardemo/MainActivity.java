package com.iducate.actionbardemo;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		getActionBar().setHomeButtonEnabled(true); //this means we can click "home"
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		//We we set that we want to use the xml file
		//under the menu directory in the resources and
		// that we want to use the specific file called "main.xml"
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	//Here we put the code for what should happen in the app once
	//the user selects one of our menu items (regardless of whether
	//it is in the actionbar or in the overflow menu.
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {

		switch (item.getItemId()) {

		case android.R.id.home:
			Toast.makeText(this, "Application icon clicked!",
					Toast.LENGTH_SHORT).show();
			return true; //return true, means we have handled the event
		case R.id.item_about:
			Toast.makeText(this, "About item clicked!", Toast.LENGTH_SHORT)
					.show();
			return true;
		case R.id.item_delete:
			Toast.makeText(this, "Delete item clicked!", Toast.LENGTH_SHORT)
					.show();
			return true;
		case R.id.item_help:
			Toast.makeText(this, "Help item clicked!", Toast.LENGTH_SHORT)
					.show();
			return true;
		case R.id.item_refresh:
			Toast.makeText(this, "Refresh item clicked!", Toast.LENGTH_SHORT)
					.show();
			return true;
		}

		return false; //we did not handle the event
	}

}
