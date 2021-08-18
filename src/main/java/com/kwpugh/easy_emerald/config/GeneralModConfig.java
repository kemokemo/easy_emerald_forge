package com.kwpugh.easy_emerald.config;

import net.minecraftforge.common.ForgeConfigSpec;

public class GeneralModConfig
{ 
	public static ForgeConfigSpec.IntValue EMERALD_TOOL_DURABILITY;
	public static ForgeConfigSpec.DoubleValue EMERALD_TOOL_EFFICIENCY;
	public static ForgeConfigSpec.DoubleValue EMERALD_TOOL_ATTACK;
	public static ForgeConfigSpec.IntValue EMERALD_TOOL_MINING_LEVEL;
	public static ForgeConfigSpec.IntValue EMERALD_TOOL_ENCHANTABILITY;
	
	public static ForgeConfigSpec.IntValue RUBY_TOOL_DURABILITY;
	public static ForgeConfigSpec.DoubleValue RUBY_TOOL_EFFICIENCY;
	public static ForgeConfigSpec.DoubleValue RUBY_TOOL_ATTACK;
	public static ForgeConfigSpec.IntValue RUBY_TOOL_MINING_LEVEL;
	public static ForgeConfigSpec.IntValue RUBY_TOOL_ENCHANTABILITY;
	
	public static ForgeConfigSpec.IntValue OBSIDIAN_TOOL_DURABILITY;
	public static ForgeConfigSpec.DoubleValue OBSIDIAN_TOOL_EFFICIENCY;
	public static ForgeConfigSpec.DoubleValue OBSIDIAN_TOOL_ATTACK;
	public static ForgeConfigSpec.IntValue OBSIDIAN_TOOL_MINING_LEVEL;
	public static ForgeConfigSpec.IntValue OBSIDIAN_TOOL_ENCHANTABILITY;

    public static ForgeConfigSpec.IntValue AMETHYST_TOOL_DURABILITY;
    public static ForgeConfigSpec.DoubleValue AMETHYST_TOOL_EFFICIENCY;
    public static ForgeConfigSpec.DoubleValue AMETHYST_TOOL_ATTACK;
    public static ForgeConfigSpec.IntValue AMETHYST_TOOL_MINING_LEVEL;
    public static ForgeConfigSpec.IntValue AMETHYST_TOOL_ENCHANTABILITY;

	public static ForgeConfigSpec.IntValue EMERALD_ARMOR_DURABILITY_MULTIPLIER;
	public static ForgeConfigSpec.IntValue EMERALD_ARMOR_ENCHANTABILITY;
	public static ForgeConfigSpec.DoubleValue EMERALD_ARMOR_TOUGHNESS;
	public static ForgeConfigSpec.DoubleValue EMERALD_ARMOR_KNOCKBACK_RESISTANCE;
	
	public static ForgeConfigSpec.IntValue RUBY_ARMOR_DURABILITY_MULTIPLIER;
	public static ForgeConfigSpec.IntValue RUBY_ARMOR_ENCHANTABILITY;
	public static ForgeConfigSpec.DoubleValue RUBY_ARMOR_TOUGHNESS;
	public static ForgeConfigSpec.DoubleValue RUBY_ARMOR_KNOCKBACK_RESISTANCE;
	
	public static ForgeConfigSpec.IntValue OBSIDIAN_ARMOR_DURABILITY_MULTIPLIER;
	public static ForgeConfigSpec.IntValue OBSIDIAN_ARMOR_ENCHANTABILITY;
	public static ForgeConfigSpec.DoubleValue OBSIDIAN_ARMOR_TOUGHNESS;
	public static ForgeConfigSpec.DoubleValue OBSIDIAN_ARMOR_KNOCKBACK_RESISTANCE;

    public static ForgeConfigSpec.IntValue AMETHYST_ARMOR_DURABILITY_MULTIPLIER;
    public static ForgeConfigSpec.IntValue AMETHYST_ARMOR_ENCHANTABILITY;
    public static ForgeConfigSpec.DoubleValue AMETHYST_ARMOR_TOUGHNESS;
    public static ForgeConfigSpec.DoubleValue AMETHYST_ARMOR_KNOCKBACK_RESISTANCE;

    public static void init(ForgeConfigSpec.Builder SERVER_BUILDER)
    {          	        
        SERVER_BUILDER.comment("Emerald Tool Material").push("emerald_tool_material");

        EMERALD_TOOL_DURABILITY = SERVER_BUILDER.comment("Emerald Tool Durability [250-3000, default: 700]").defineInRange("emeraldToolDurability", 700, 250, 3000);
        EMERALD_TOOL_EFFICIENCY = SERVER_BUILDER.comment("Emerald Tool efficiency [1.0-7.0, default: 5.5]").defineInRange("emeraldToolEfficiency", 5.5, 0.0, 7.0);
        EMERALD_TOOL_ATTACK = SERVER_BUILDER.comment("Emerald attack damage [1-40, default: 3.0]").defineInRange("emeraldAttackDamage", 3.0, 0.0, 40.0);
        EMERALD_TOOL_MINING_LEVEL = SERVER_BUILDER.comment("Emerald tool mining level [1-5, default: 2]").defineInRange("emeraldMiningLevel", 2, 1, 5);
        EMERALD_TOOL_ENCHANTABILITY = SERVER_BUILDER.comment("Emerald tool enchantability [1-30, default: 21]").defineInRange("emeraldEnchantability", 21, 1, 30);
        
        SERVER_BUILDER.pop();
        
        
        SERVER_BUILDER.comment("Ruby Tool Material").push("ruby_tool_material");

        RUBY_TOOL_DURABILITY = SERVER_BUILDER.comment("Ruby Tool Durability [250-3000, default: 1050]").defineInRange("emeraldToolDurability", 1050, 250, 3000);
        RUBY_TOOL_EFFICIENCY = SERVER_BUILDER.comment("Ruby Tool efficiency [1.0-7.0, default: 6.5]").defineInRange("emeraldToolEfficiency", 6.5, 0.0, 7.0);
        RUBY_TOOL_ATTACK = SERVER_BUILDER.comment("Ruby attack damage [1-40, default: 4.0]").defineInRange("emeraldAttackDamage", 4.0, 0.0, 40.0);
        RUBY_TOOL_MINING_LEVEL = SERVER_BUILDER.comment("Ruby tool mining level [1-5, default: 3]").defineInRange("emeraldMiningLevel", 3, 1, 5);
        RUBY_TOOL_ENCHANTABILITY = SERVER_BUILDER.comment("Ruby tool enchantability [1-30, default: 25]").defineInRange("emeraldEnchantability", 25, 1, 30);
        
        SERVER_BUILDER.pop();
        
        
        SERVER_BUILDER.comment("Obsidian Tool Material").push("obsidian_tool_material");

        OBSIDIAN_TOOL_DURABILITY = SERVER_BUILDER.comment("Obsidian Tool Durability [250-3000, default: 525]").defineInRange("emeraldToolDurability", 525, 250, 3000);
        OBSIDIAN_TOOL_EFFICIENCY = SERVER_BUILDER.comment("Obsidian Tool efficiency [1.0-7.0, default: 5.5]").defineInRange("emeraldToolEfficiency", 5.5, 0.0, 7.0);
        OBSIDIAN_TOOL_ATTACK = SERVER_BUILDER.comment("Obsidian attack damage [1-40, default: 3.0]").defineInRange("emeraldAttackDamage", 3.0, 0.0, 40.0);
        OBSIDIAN_TOOL_MINING_LEVEL = SERVER_BUILDER.comment("Obsidian tool mining level [1-5, default: 3]").defineInRange("emeraldMiningLevel", 3, 1, 5);
        OBSIDIAN_TOOL_ENCHANTABILITY = SERVER_BUILDER.comment("Obsidian tool enchantability [1-30, default: 18]").defineInRange("emeraldEnchantability", 18, 1, 30);
        
        SERVER_BUILDER.pop();


        SERVER_BUILDER.comment("Amethyst Tool Material").push("amethyst_tool_material");

        AMETHYST_TOOL_DURABILITY = SERVER_BUILDER.comment("Amethyst Tool Durability [250-3000, default: 1404]").defineInRange("amethystToolDurability", 1404, 250, 3000);
        AMETHYST_TOOL_EFFICIENCY = SERVER_BUILDER.comment("Amethyst Tool efficiency [1.0-7.0, default: 6.8]").defineInRange("amethystToolEfficiency", 6.8, 0.0, 7.0);
        AMETHYST_TOOL_ATTACK = SERVER_BUILDER.comment("Amethyst attack damage [1-40, default: 5.0]").defineInRange("amethystAttackDamage", 5.0, 0.0, 40.0);
        AMETHYST_TOOL_MINING_LEVEL = SERVER_BUILDER.comment("Amethyst tool mining level [1-5, default: 3]").defineInRange("amethystMiningLevel", 3, 1, 5);
        AMETHYST_TOOL_ENCHANTABILITY = SERVER_BUILDER.comment("Amethyst tool enchantability [1-30, default: 25]").defineInRange("amethystEnchantability", 25, 1, 30);

        SERVER_BUILDER.pop();



        SERVER_BUILDER.comment("Emerald Armor Material").push("emerald_armor_material");

        EMERALD_ARMOR_DURABILITY_MULTIPLIER = SERVER_BUILDER.comment("Emerald armor durability multiplier [1-50, default: 31]").defineInRange("emeraldArmorDurabilityMultiplier", 31, 1, 50);
        EMERALD_ARMOR_ENCHANTABILITY = SERVER_BUILDER.comment("Emerald armor enchantability [1-31, default: 15]").defineInRange("emeraldArmorEnchantability", 15, 1, 31);
        EMERALD_ARMOR_TOUGHNESS = SERVER_BUILDER.comment("Emerald armor toughness [0.0-4.0, default: 0.0]").defineInRange("emeraldArmorToughness", 0.0, 0.0, 4.0);
        EMERALD_ARMOR_KNOCKBACK_RESISTANCE = SERVER_BUILDER.comment("Emerald armor knockback resistance [0.0-4.0, default: 0.0]").defineInRange("emeraldArmorKnockbackResistance", 0.0, 0.0, 4.0);
        
        SERVER_BUILDER.pop();
 
        
        SERVER_BUILDER.comment("Ruby Armor Material").push("ruby_armor_material");

        RUBY_ARMOR_DURABILITY_MULTIPLIER = SERVER_BUILDER.comment("Ruby armor durability multiplier [1-50, default: 33]").defineInRange("rubyArmorDurabilityMultiplier", 33, 1, 50);
        RUBY_ARMOR_ENCHANTABILITY = SERVER_BUILDER.comment("Ruby armor enchantability [1-31, default: 17]").defineInRange("rubyArmorEnchantability", 17, 1, 31);
        RUBY_ARMOR_TOUGHNESS = SERVER_BUILDER.comment("Ruby armor toughness [0.0-4.0, default: 0.5]").defineInRange("rubyArmorToughness", 0.5, 0.0, 4.0);
        RUBY_ARMOR_KNOCKBACK_RESISTANCE = SERVER_BUILDER.comment("Ruby armor knockback resistance [0.0-4.0, default: 0.1]").defineInRange("rubyArmorKnockbackResistance", 0.1, 0.0, 4.0);
        
        SERVER_BUILDER.pop();
 
        
        SERVER_BUILDER.comment("Obsidian Armor Material").push("obsidian_armor_material");

        OBSIDIAN_ARMOR_DURABILITY_MULTIPLIER = SERVER_BUILDER.comment("Obsidian armor durability multiplier [1-50, default: 29]").defineInRange("obsidianArmorDurabilityMultiplier", 29, 1, 50);
        OBSIDIAN_ARMOR_ENCHANTABILITY = SERVER_BUILDER.comment("Obsidian armor enchantability [1-31, default: 13]").defineInRange("obsidianArmorEnchantability", 13, 1, 31);
        OBSIDIAN_ARMOR_TOUGHNESS = SERVER_BUILDER.comment("Obsidian armor toughness [0.0-4.0, default: 1.0]").defineInRange("obsidianArmorToughness", 1.0, 0.0, 4.0);
        OBSIDIAN_ARMOR_KNOCKBACK_RESISTANCE = SERVER_BUILDER.comment("Obsidian armor knockback resistance [0.0-4.0, default: 0.0]").defineInRange("obsidianArmorKnockbackResistance", 0.0, 0.0, 4.0);
        
        SERVER_BUILDER.pop();


        SERVER_BUILDER.comment("Amethyst Armor Material").push("amethyst_armor_material");

        AMETHYST_ARMOR_DURABILITY_MULTIPLIER = SERVER_BUILDER.comment("Amethyst armor durability multiplier [1-50, default: 37]").defineInRange("amethystArmorDurabilityMultiplier", 33, 1, 50);
        AMETHYST_ARMOR_ENCHANTABILITY = SERVER_BUILDER.comment("Amethyst armor enchantability [1-31, default: 25]").defineInRange("amethystArmorEnchantability", 25, 1, 31);
        AMETHYST_ARMOR_TOUGHNESS = SERVER_BUILDER.comment("Amethyst armor toughness [0.0-4.0, default: 0.75]").defineInRange("amethystArmorToughness", 0.75, 0.0, 4.0);
        AMETHYST_ARMOR_KNOCKBACK_RESISTANCE = SERVER_BUILDER.comment("Amethyst armor knockback resistance [0.0-4.0, default: 0.25]").defineInRange("amethystArmorKnockbackResistance", 0.25, 0.0, 4.0);

        SERVER_BUILDER.pop();
    }
}