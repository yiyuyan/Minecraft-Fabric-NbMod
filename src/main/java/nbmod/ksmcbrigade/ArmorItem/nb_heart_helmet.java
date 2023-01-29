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
import net.minecraft.world.World;

public class nb_heart_helmet extends ArmorItem {
    public nb_heart_helmet(ArmorMaterial armorMaterial, EquipmentSlot slot, Settings settings) {
        super(armorMaterial, slot, settings);
    }

    @Override
    public void inventoryTick(ItemStack stack, World world, Entity entity, int slot, boolean selected) {
        LivingEntity entity1 = (LivingEntity) entity;
        PlayerEntity player = (PlayerEntity) entity1;
        player.getAbilities().allowFlying = true;
        entity1.addStatusEffect(new StatusEffectInstance(StatusEffects.REGENERATION,999999999,255,false,false));
        entity1.addStatusEffect(new StatusEffectInstance(StatusEffects.SPEED,999999999,1,false,false));
        entity1.addStatusEffect(new StatusEffectInstance(StatusEffects.JUMP_BOOST,999999999,3,false,false));
        entity1.addStatusEffect(new StatusEffectInstance(StatusEffects.NIGHT_VISION,999999999,0,false,false));
        entity1.addStatusEffect(new StatusEffectInstance(StatusEffects.INSTANT_HEALTH,999999999,255,false,false));
        entity1.addStatusEffect(new StatusEffectInstance(StatusEffects.INVISIBILITY,999999999,255,false,false));
        entity1.addStatusEffect(new StatusEffectInstance(StatusEffects.LUCK,999999999,255,false,false));
        entity1.addStatusEffect(new StatusEffectInstance(StatusEffects.SLOW_FALLING,999999999,5,false,false));
        entity1.addStatusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE,999999999,255,false,false));
        entity1.addStatusEffect(new StatusEffectInstance(StatusEffects.FIRE_RESISTANCE,999999999,255,false,false));
        //super.inventoryTick(stack, world, entity, slot, selected);
    }
}