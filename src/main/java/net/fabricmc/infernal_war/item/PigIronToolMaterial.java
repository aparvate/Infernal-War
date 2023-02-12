package net.fabricmc.infernal_war.item;

import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class PigIronToolMaterial implements ToolMaterial{

    public static final PigIronToolMaterial INSTANCE  = new PigIronToolMaterial();

    @Override
    public int getDurability() {
        return 0;
    }

    @Override
    public float getAttackDamage() {
        return 4.0F;
    }

    @Override
    public int getEnchantability() {
        return 8;
    }

    @Override
    public int getMiningLevel() {
        return 3;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return 6.5F;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return null;
    }

    
}
