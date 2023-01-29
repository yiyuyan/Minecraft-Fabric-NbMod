package nbmod.ksmcbrigade.Meaterial;

import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;

public class NbArmorMaterial {
    public static class NbHeartMaterial implements ArmorMaterial {

        private static final int[] BASE_DURABILITY = new int[] {999, 999, 999, 999};

        @Override
        public int getDurability(EquipmentSlot slot) {
            return 999999999;
        }

        @Override
        public int getProtectionAmount(EquipmentSlot slot) {
            return BASE_DURABILITY[slot.getEntitySlotId()] * 99999999;
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
            return Ingredient.ofItems(Items.NETHER_STAR);
        }

        @Override
        public String getName() {
            return "nb_heart";
        }

        @Override
        public float getToughness() {
            return 999999999.9f;
        }

        @Override
        public float getKnockbackResistance() {
            return 999999999.9f;
        }
    }
}
