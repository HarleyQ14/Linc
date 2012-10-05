package com.syntacticsugar.linc.database;

import android.content.Context;
import android.database.sqlite.*;

public class DatabaseOpenHelper extends SQLiteOpenHelper {  
	
	public DatabaseOpenHelper(Context context) {
		super(context, DatabaseValues.DATABASE_NAME, null, DatabaseValues.DATABASE_VERSION);
	}
	
	public void onCreate(SQLiteDatabase db) {
		db.execSQL(DatabaseValues.TABLE_CHARACTER_CREATE);
		db.execSQL(DatabaseValues.TABLE_CLASS_CREATE);
		db.execSQL(DatabaseValues.TABLE_ABILITIES_CREATE);
		db.execSQL(DatabaseValues.TABLE_COMBAT_CREATE);
		db.execSQL(DatabaseValues.TABLE_ATTACK_CREATE);
		db.execSQL(DatabaseValues.TABLE_SAVES_CREATE);
		db.execSQL(DatabaseValues.TABLE_WEAPON_CREATE);
		db.execSQL(DatabaseValues.TABLE_HEALTH_CREATE);
		db.execSQL(DatabaseValues.TABLE_CONDITIONS_CREATE);
		db.execSQL(DatabaseValues.TABLE_ARMOR_CLASS_CREATE);
		db.execSQL(DatabaseValues.TABLE_INVENTORY_CREATE);
		db.execSQL(DatabaseValues.TABLE_LOCATION_CREATE);
		db.execSQL(DatabaseValues.TABLE_SKILLS_CREATE);
		db.execSQL(DatabaseValues.TABLE_FEATS_CREATE);
		db.execSQL(DatabaseValues.TABLE_CASTING_CREATE);
		db.execSQL(DatabaseValues.TABLE_SPELLS_CREATE);
		db.execSQL(DatabaseValues.TABLE_CLERIC_CREATE);
		db.execSQL(DatabaseValues.TABLE_RAGE_CREATE);
		
		//db.execSQL("INSERT INTO tbl_char VALUES ('Test Char','Human','Kristen','None','Medium','Female','Neutral','None','5 2', '125', 'Testing character')");
	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
		// TODO Auto-generated method stub
		db.execSQL("DROP TABLE IF EXISTS " + DatabaseValues.TABLE_CHARACTER_CREATE);
		db.execSQL("DROP TABLE IF EXISTS " + DatabaseValues.TABLE_CLASS_CREATE);
		db.execSQL("DROP TABLE IF EXISTS " + DatabaseValues.TABLE_ABILITIES_CREATE);
		db.execSQL("DROP TABLE IF EXISTS " + DatabaseValues.TABLE_COMBAT_CREATE);
		db.execSQL("DROP TABLE IF EXISTS " + DatabaseValues.TABLE_ATTACK_CREATE);
		db.execSQL("DROP TABLE IF EXISTS " + DatabaseValues.TABLE_SAVES_CREATE);
		db.execSQL("DROP TABLE IF EXISTS " + DatabaseValues.TABLE_WEAPON_CREATE);
		db.execSQL("DROP TABLE IF EXISTS " + DatabaseValues.TABLE_HEALTH_CREATE);
		db.execSQL("DROP TABLE IF EXISTS " + DatabaseValues.TABLE_CONDITIONS_CREATE);
		db.execSQL("DROP TABLE IF EXISTS " + DatabaseValues.TABLE_ARMOR_CLASS_CREATE);
		db.execSQL("DROP TABLE IF EXISTS " + DatabaseValues.TABLE_INVENTORY_CREATE);
		db.execSQL("DROP TABLE IF EXISTS " + DatabaseValues.TABLE_LOCATION_CREATE);
		db.execSQL("DROP TABLE IF EXISTS " + DatabaseValues.TABLE_SKILLS_CREATE);
		db.execSQL("DROP TABLE IF EXISTS " + DatabaseValues.TABLE_FEATS_CREATE);
		db.execSQL("DROP TABLE IF EXISTS " + DatabaseValues.TABLE_CASTING_CREATE);
		db.execSQL("DROP TABLE IF EXISTS " + DatabaseValues.TABLE_SPELLS_CREATE);
		db.execSQL("DROP TABLE IF EXISTS " + DatabaseValues.TABLE_CLERIC_CREATE);
		db.execSQL("DROP TABLE IF EXISTS " + DatabaseValues.TABLE_RAGE_CREATE);
	}
}
