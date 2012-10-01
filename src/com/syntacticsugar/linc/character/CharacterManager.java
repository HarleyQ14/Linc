package com.syntacticsugar.linc.character;

import java.util.ArrayList;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import com.syntacticsugar.linc.database.DatabaseOpenHelper;
import com.syntacticsugar.linc.database.DatabaseValues;

/**
 * Responsible for interacting with the database to retrieve and store information
 * related to the characters as well as managing the associated character objects.
 * 
 * @author HarleyQ14
 * @date 2012-09-29
 */
public class CharacterManager {
	
	private DatabaseOpenHelper databaseHelper;
	
	public CharacterManager(Context context) {
		databaseHelper = new DatabaseOpenHelper(context);
	}
	
	/**
	 * Retrieves a list of the names of all characters
	 * currently stored in the database.
	 * 
	 * @return a list of strings
	 */
	public ArrayList<String> getCharacterList() {
		
		ArrayList<String> characterNames = new ArrayList<String>();
		
		SQLiteDatabase db = databaseHelper.getWritableDatabase();
		Cursor cursor = db.rawQuery(DatabaseValues.QUERY_ALL_CHAR_NAMES, null);
		
		if (cursor.moveToFirst()) {
			do {
				
				characterNames.add(cursor.getString(0));
				
			} while (cursor.moveToNext());
		}
		
		return characterNames;
	}
	
	public Character LoadCharacter(String characterName) {
		return null;
	}
	
	public boolean StoreCharacter(Character character) {
		return false;
	}
}
