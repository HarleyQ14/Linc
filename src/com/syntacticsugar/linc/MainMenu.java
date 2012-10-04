package com.syntacticsugar.linc;

import java.util.ArrayList;

import com.syntacticsugar.linc.R;
import com.syntacticsugar.linc.activity.Abilities;
import com.syntacticsugar.linc.activity.BasicInfo;
import com.syntacticsugar.linc.activity.Combat;
import com.syntacticsugar.linc.character.CharacterManager;

import android.os.Bundle;
import android.app.Activity;
import android.app.TabActivity;
import android.content.Intent;
import android.content.res.Resources;
import android.view.Menu;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TabHost;

public class MainMenu extends TabActivity {

	private CharacterManager charManager = new CharacterManager(this);
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        /*super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);

        ArrayList<String> characters = charManager.getCharacterList();
        
        ListView listView = (ListView) findViewById(R.id.characterList);
        listView.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, characters));*/
    	
    	super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main_menu);
 
		Resources ressources = getResources(); 
		TabHost tabHost = getTabHost();
		TabHost.TabSpec spec;
		Intent intent;
		
		intent = new Intent().setClass(this, BasicInfo.class);
		
		spec = tabHost.newTabSpec("Info").setIndicator("Info").setContent(intent);
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
