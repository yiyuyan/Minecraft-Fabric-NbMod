package nbmod.ksmcbrigade.ArmorItem;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Rarity;
import net.minecraft.world.World;

public class fly_chest extends ArmorItem {
    public fly_chest(ArmorMaterial armorMaterial, EquipmentSlot slot, Settings settings){
        super(armorMaterial, slot, settings.fireproof().rarity(Rarity.UNCOMMON).maxCount(1));
    }

    @Override
    public void inventoryTick(ItemStack stack, World world, Entity entity, int slot, boolean selected) {
        LivingEntity livingEntity = (LivingEntity) entity;
        PlayerEntity playerEntity = (PlayerEntity) livingEntity;
        playerEntity.getAbilities().allowFlying = true;
        livingEntity.addStatusEffect(new StatusEffectInstance(StatusEffects.NIGHT_VISION,999999999,0,false,false));
        //super.inventoryTick(stack, world, entity, slot, selected);
    }
}
