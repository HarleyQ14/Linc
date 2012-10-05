package com.syntacticsugar.linc.database;

/**
 * Holds all database relevant values.
 * 
 * @author HarleyQ14
 * @date 2012-09-28
 */
public class DatabaseValues {

	public static final int DATABASE_VERSION = 1;
	public static final String DATABASE_NAME = "dnd";

	public static final String TABLE_CHARACTER = "tbl_char";
	public static final String TABLE_CHARACTER_CREATE =
			"CREATE TABLE " + TABLE_CHARACTER + " ( " +
			"char_name TEXT, " +
			"char_race TEXT, " +
			"char_player TEXT, " +
			"char_template TEXT, " +
			"char_size TEXT, " +
			"char_gender TEXT, " +
			"char_alignment TEXT, " +
			"char_religion TEXT, " +
			"char_height TEXT, " +
			"char_weight TEXT, " +
			"char_description TEXT, " +
			"PRIMARY KEY (char_name ASC);";
    
	public static final String TABLE_CLASS = "tbl_char_class";
	public static final String TABLE_CLASS_CREATE = 
			"CREATE TABLE " + TABLE_CLASS + " ( " +
			"char_name TEXT, " +
			"char_race TEXT, " +
			"char_player TEXT, " +
			"char_class_name TEXT, " +
			"char_class_level INTEGER, " +
			"char_class_notes TEXT, " +
			"PRIMARY KEY (char_name ASC" + 
			"char_class_name, char_class_level));";
    
	public static final String TABLE_ABILITIES = "tbl_char_abilities";
	public static final String TABLE_ABILITIES_CREATE = 
			"CREATE TABLE " + TABLE_ABILITIES + " ( " +
			"char_name TEXT, " +
			"char_race TEXT, " +
			"char_player TEXT, " +
			"char_abil_stat TEXT, " +
			"char_abil_value INTEGER, " +
			"char_abil_type TEXT, " +
			"PRIMARY KEY (char_name ASC" +
			"char_abil_Stat, char_abil_value, char_abil_type));";
    
	public static final String TABLE_COMBAT = "tbl_char_combat";
	public static final String TABLE_COMBAT_CREATE = 
			"CREATE TABLE " + TABLE_COMBAT + " ( " +
			"char_name TEXT, " +
			"char_race TEXT, " +
			"char_player TEXT, " +
			"char_combat_temp_hp INTEGER, " +
			"char_combat_speed INTEGER, " +
			"char_combat_init INTEGER, " +
			"char_combat_grapple_misc INTEGER, " +
			"PRIMARY KEY (char_name ASC));";
    
	public static final String TABLE_ATTACK = "tbl_char_attack";
	public static final String TABLE_ATTACK_CREATE = 
			"CREATE TABLE " + TABLE_ATTACK + " ( " +
			"char_name TEXT, " +
			"char_race TEXT, " +
			"char_player TEXT, " +
			"char_attack_bonus INT, " +
			"char_attack_type TEXT, " +
			"PRIMARY KEY (char_name ASC, char_attack_type));";
    
	public static final String TABLE_SAVES = "tbl_char_saves";
	public static final String TABLE_SAVES_CREATE = 
			"CREATE TABLE " + TABLE_SAVES + " ( " +
			"char_name TEXT, " +
			"char_race TEXT, " + 
			"char_player TEXT, " + 
			"char_saves_throw TEXT, " + 
			"char_saves_value INTEGER, " +
			"char_saves_type TEXT, " +
			"PRIMARY KEY (char_name ASC, char_saves_throw, char_saves_type));";
    
	public static final String TABLE_WEAPON = "tbl_char_weapon";
	public static final String TABLE_WEAPON_CREATE = 
			"CREATE TABLE " + TABLE_WEAPON + " ( " + 
			"char_name TEXT, " + 
			"char_race TEXT, " + 
			"char_player TEXT, " +
			"char_weapon_name TEXT, " + 
			"char_weapon_attack_bonus INTEGER, " +
			"char_weapon_damage TEXT, " + 
			"char_weapon_crit TEXT, " + 
			"char_weapon_range INTEGER, " +
			"char_weapon_type TEXT, " +
			"char_weapon_notes TEXT );";
    
	public static final String TABLE_HEALTH = "tbl_char_health";
	public static final String TABLE_HEALTH_CREATE = 
			"CREATE TABLE " + TABLE_HEALTH + " ( " + 
			"char_name TEXT, " + 
			"char_race TEXT, " +
			"char_player TEXT, " + 
			"char_health_hit_dice_roll TEXT, " +
			"char_health_hit_dice_num INTEGER, " +
			"char_health_total_health INTEGER, " +
			"PRIMARY KEY (char_name ASC " +
			"char_health_hit_dice_roll, char_health_hit_dice_num));";
    
	public static final String TABLE_CONDITIONS = "tbl_char_conditions";
	public static final String TABLE_CONDITIONS_CREATE = 
			"CREATE TABLE " + TABLE_CONDITIONS + " ( " +
			"char_name TEXT, " +
			"char_race TEXT, " +
			"char_player TEXT, " +
			"char_condition TEXT );";
    
	public static final String TABLE_ARMOR_CLASS = "tbl_char_ac";
	public static final String TABLE_ARMOR_CLASS_CREATE = 
			"CREATE TABLE " + TABLE_ARMOR_CLASS + " ( " +
			"char_name TEXT, " +
			"char_race TEXT, " +
			"char_player TEXT, " +
			"char_armor_class_value INTEGER, " +
			"char_armor_class_type TEXT, " +
			"char_armor_class_source TEXT);";
    
	public static final String TABLE_INVENTORY = "tbl_char_inventory";
	public static final String TABLE_INVENTORY_CREATE = 
			"CREATE TABLE " + TABLE_INVENTORY + " ( " +
			"char_name TEXT, " + 
			"char_race TEXT, " + 
			"char_player TEXT, " +
			"char_inv_item_name TEXT, " +
			"char_inv_weight INTEGER, " +
			"char_inv_location TEXT, " +
			"char_inv_magic INTEGER, " +
			"char_inv_equipped INTEGER, " +
			"char_inv_notes TEXT );";
    
	public static final String TABLE_LOCATON = "tbl_inv_location";
    public static final String TABLE_LOCATION_CREATE = 
    		"CREATE TABLE " + TABLE_LOCATON + " ( " +
    		"location TEXT, " +
    		"PRIMARY KEY (location ASC));";
    
    public static final String TABLE_SKILLS = "tbl_char_skills";
    public static final String TABLE_SKILLS_CREATE = 
    		"CREATE TABLE " + TABLE_SKILLS + " ( " +
    		"char_name TEXT, " +
    		"char_race TEXT, " +
    		"char_player TEXT, " +
    		"char_skill_name TEXT, " +
    		"char_skill_key_ab TEXT, " +
    		"char_skill_ranks INTEGER, " +
    		"char_skill_misc INTEGER, " +
    		"char_skill_class INTEGER, " +
    		"PRIMARY KEY (char_name ASC " +
    		"char_skill_name));";
    
    public static final String TABLE_FEATS = "tbl_char_feats";
    public static final String TABLE_FEATS_CREATE = 
    		"CREATE TABLE " + TABLE_FEATS + " ( " +
    		"char_name TEXT, " +
    		"char_race TEXT, " +
    		"char_player TEXT, " +
    		"char_feat_name TEXT, " +
    		"char_feat_notes TEXT, " +
    		"PRIMARY KEY (char_name " +
    		"char_feat_name));";
    
    public static final String TABLE_CASTING = "tbl_char_casting";
    public static final String TABLE_CASTING_CREATE = 
    		"CREATE TABLE " + TABLE_CASTING + " ( " +
    		"char_name TEXT, " +
    		"char_race TEXT, " +
    		"char_player TEXT, " +
    		"char_casting_level INTEGER, " +
    		"char_casting_per_day INTEGER, " +
    		"char_casting_bonus TEXT, " +
    		"char_casting_save INTEGER, " +
    		"char_casting_failure INTEGER, " +
    		"PRIMARY KEY (char_name ASC, " +
    		"char_casting_level, char_casting_per_day));";
    
    public static final String TABLE_SPELLS = "tbl_spells";
    public static final String TABLE_SPELLS_CREATE = 
    		"CREATE TABLE " + TABLE_SPELLS + " ( " +
    		"char_name TEXT, " +
    		"char_race TEXT, " +
    		"char_player TEXT, " +
    		"char_spell_name TEXT, " +
    		"char_spell_level INTEGER, " +
    		"char_spell_damage TEXT, " +
    		"char_spell_type TEXT, " +
    		"char_spell_domain TEXT, " +
    		"char_spell_notes TEXT, " +
    		"PRIMARY KEY (char_name ASC, " +
    		"char_spell_name));";
    
    public static final String TABLE_CLERIC = "tbl_char_cleric";
    public static final String TABLE_CLERIC_CREATE = 
    		"CREATE TABLE " + TABLE_CLERIC + " ( " +
    		"char_name TEXT, " +
    		"char_race TEXT, " +
    		"char_player TEXT, " +
    		"char_cleric_domain TEXT, " +
    		"char_cleric_greater_power TEXT, " +
    		"PRIMARY KEY (char_name ASC, " +
    		"char_cleric_domain, char_cleric_greater_power));";
     
    public static final String TABLE_RAGE = "tbl_char_rage";
    public static final String TABLE_RAGE_CREATE = 
    		"CREATE TABLE " + TABLE_RAGE + " ( " +
    		"char_name TEXT, " +
    		"char_race TEXT, " +
    		"char_player TEXT, " +
    		"char_rage_per_day INTEGER, " +
    		"char_rage_duration TEXT, " +
    		"char_rage_ac_penalty INTEGER, " +
    		"char_rage_used INTEGER, " +
    		"PRIMARY KEY (char_name ASC));";
    
    public static final String QUERY_ALL_CHAR_NAMES = 
    		"SELECT char_name FROM tbl_char";
}
