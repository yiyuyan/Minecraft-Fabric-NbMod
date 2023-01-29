package nbmod.ksmcbrigade.Meaterial;

import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;

public class WaterArrorMaterial {
    public static class WaterArmorMaterial implements ArmorMaterial{
        private static final int[] BASE_DURABILITY = new int[] {4, 9, 9, 4};

        @Override
        public int getDurability(EquipmentSlot slot) {
            return 4096;
        }

        @Override
        public int getProtectionAmount(EquipmentSlot slot) {
            return BASE_DURABILITY[slot.getEntitySlotId()] * 10;
        }

        @Override
        public int getEnchantability() {
            return 255;
        }

        @Override
        public SoundEvent getEquipSound() {
            return SoundEvents.ITEM_ARMOR_EQUIP_GENERIC;
        }

        @Override
        public Ingredient getRepairIngredient() {
            return Ingredient.ofItems(Items.PHANTOM_MEMBRANE);
        }

        @Override
        public String getName() {
            return "water_arror";
        }

        @Override
        public float getToughness() {
            return 25.0f;
        }

        @Override
        public float getKnockbackResistance() {
            return 1.0f;
        }
    }
}
