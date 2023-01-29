package nbmod.ksmcbrigade.Meaterial;

import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class NbItemMaterial{

    public static ToolMaterial getMaterial() {
        return new ToolMaterial() {
            @Override
            public int getDurability() {
                return 999999999;
            }

            @Override
            public float getMiningSpeedMultiplier() {
                return 999999999.0F;
            }

            @Override
            public float getAttackDamage() {
                return 999999999;
            }

            @Override
            public int getMiningLevel() {
                return 999999999;
            }

            @Override
            public int getEnchantability() {
                return 255;
            }

            @Override
            public Ingredient getRepairIngredient() {
                return null;
            }
        };
    }
}
