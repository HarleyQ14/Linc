package com.syntacticsugar.linc;

import com.syntacticsugar.linc.R;
import com.syntacticsugar.linc.activity.Abilities;
import com.syntacticsugar.linc.activity.BasicInfo;
import com.syntacticsugar.linc.activity.Characters;
import com.syntacticsugar.linc.activity.Combat;

import android.os.Bundle;
import android.app.TabActivity;
import android.content.Intent;
import android.view.Menu;
import android.widget.TabHost;

public class MainMenu extends TabActivity {
	
	public static int TAB_INDEX_CHARACTER_LIST = 0;
	public static int TAB_INDEX_CHARACTER_DESCRIPTION = 1;
	
	
	/**
	 * Sets up the Tab list that acts as a header throughout the entire
	 * application.
	 */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        /*super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);

        ArrayList<String> characters = charManager.getCharacterList();
        
        ListView listView = (ListView) findViewById(R.id.characterList);
        listView.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, characters));*/
    	
    	super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main_menu);
 
		TabHost tabHost = getTabHost();
		TabHost.TabSpec spec;
		Intent intent;
		
		intent = new Intent().setClass(this, Characters.class);
		
		spec = tabHost.newTabSpec("Character").setIndicator("Characters").setContent(intent);
		tabHost.addTab(spec);
		
		intent = new Intent().setClass(this, BasicInfo.class);
		
		spec = tabHost.newTabSpec("Description").setIndicator("Description").setContent(intent);
		tabHost.addTab(spec);
		
		intent = new Intent().setClass(this, Abilities.class);
		
		spec = tabHost.newTabSpec("Abilities").setIndicator("Abilities").setContent(intent);
		tabHost.addTab(spec);
		
		intent = new Intent().setClass(this, Combat.class);
		
		spec = tabHost.newTabSpec("Combat").setIndicator("Combat").setContent(intent);
		tabHost.addTab(spec);
 
		//set Windows tab as default (zero based)
		tabHost.setCurrentTab(0);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main_menu, menu);
        return true;
    }
}
