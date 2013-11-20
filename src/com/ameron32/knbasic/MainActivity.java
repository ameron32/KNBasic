package com.ameron32.knbasic;

import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends MasterActivity {

	@Override
	protected void onPostResume() {
		super.onPostResume();
		
		TextView tv = (TextView) findViewById(R.id.tvHello);
		tv.setTypeface(Loader.fonts.get("temphisdirty"));
		
		// Testing commands (comment out or delete prior to production)
		performTest();
	}
    
	// ------------------------------------------------------------------------------------------------
	// DUMMY DATA FOR LISTVIEW
	// ------------------------------------------------------------------------------------------------

	private void performTest() {
		fillDummyData();
	}
	
	private void fillDummyData() {
		final String[] dummyList = new String[] { "Item 1", "Item 2",
				"Item 3", "Item 4", "Item 5" };
		
		ListView listView = (ListView) findViewById(R.id.listView1);
		listView.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, dummyList));
		
		listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
			@Override
			public void onItemClick(AdapterView<?> parent, View view, int position,
					long id) {
				final String item = (String) parent.getItemAtPosition(position);
				showMessage(item, false);
			}
		});
	}
}
