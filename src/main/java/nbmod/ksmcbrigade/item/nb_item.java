package nbmod.ksmcbrigade.item;

import nbmod.ksmcbrigade.Meaterial.NbItemMaterial;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SwordItem;
import net.minecraft.sound.SoundEvents;
import net.minecraft.text.Text;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;

import java.util.List;

public class nb_item extends SwordItem {
    public nb_item(Settings settings) {
        super(NbItemMaterial.getMaterial(), 999999999, 99999999.0F, settings);
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        //final Vec3d _center = new Vec3d(user.getX(), user.getY(), user.getZ());
        //final Vec3d max_center = new Vec3d(user.getX() * 999, user.getY() * 999, user.getZ() * 999);
        //<Entity> _entfound = world.getEntitiesByClass(Entity.class, new Box(_center, _center).contract(999999 / 2d), entity -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.squaredDistanceTo(_center))).collect(Collectors.toList());
        //for (Entity allentity : _entfound) {
            //if(allentity instanceof PlayerEntity _playerHasItem
            //             ? _playerHasItem.getInventory().contains(new ItemStack(Ksmcbrigade.nb_item)) : false){
        //    if (allentity.isLiving() && allentity instanceof PlayerEntity _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(Ksmcbrigade.nb_item)) : false) {
       //         allentity.getX();
        //    }
         //   else {
          //      LivingEntity livingEntity1 = (LivingEntity) allentity;
         //       allentity.setOnFire(true);
         //       //livingEntity1.addStatusEffect(new StatusEffectInstance(StatusEffects.INSTANT_DAMAGE, 10, 255, false, false));
         //       livingEntity1.setHealth(-1);
         //       livingEntity1.detach();
         //   }
       // }
        user.playSound(SoundEvents.BLOCK_WOOL_BREAK, 25.0F, 10.0F);
        user.sendMessage(Text.of("范围秒杀因Fabric没有API导致无法实现"), true);
        return TypedActionResult.success(user.getStackInHand(hand));
    }

    @Override
    public void appendTooltip (ItemStack stack, World world, List < Text > tooltip, TooltipContext context){
        tooltip.add(Text.literal("十分nb的剑"));
        //tooltip.add(Text.literal("第二行物品信息"));
        //tooltip.add(Text.literal("\u7b2c\u4e09\u884c\u7269\u54c1\u4fe1\u606f"));
    }
}
