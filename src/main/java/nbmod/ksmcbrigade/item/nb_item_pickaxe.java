package nbmod.ksmcbrigade.item;

import nbmod.ksmcbrigade.Meaterial.NbItemMaterial;
import net.minecraft.block.Block;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.PickaxeItem;
import net.minecraft.sound.SoundEvents;
import net.minecraft.text.Text;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import java.util.List;

public class nb_item_pickaxe extends PickaxeItem {

    public nb_item_pickaxe(Settings settings){
        super(NbItemMaterial.getMaterial(),999999999,99999999.0F,settings);
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        BlockPos _pos = user.getBlockPos();
        BlockPos _pos1 = new BlockPos(user.getX() + 1,user.getY(),user.getZ());
        BlockPos _pos2 = new BlockPos(user.getX() + 2,user.getY(),user.getZ());
        BlockPos _pos3 = new BlockPos(user.getX() + 3,user.getY(),user.getZ());
        BlockPos _pos4 = new BlockPos(user.getX(),user.getY() + 1,user.getZ());
        BlockPos _pos5 = new BlockPos(user.getX(),user.getY() + 2,user.getZ());
        BlockPos _pos6 = new BlockPos(user.getX(),user.getY() + 3,user.getZ());
        BlockPos _pos7 = new BlockPos(user.getX(),user.getY(),user.getZ() + 1);
        BlockPos _pos8 = new BlockPos(user.getX(),user.getY(),user.getZ() + 2);
        BlockPos _pos9 = new BlockPos(user.getX(),user.getY(),user.getZ() + 3);
        BlockPos _pos11 = new BlockPos(user.getX() - 1,user.getY(),user.getZ());
        BlockPos _pos12 = new BlockPos(user.getX(),user.getY() + 1,user.getZ() + 1);
        BlockPos _pos22 = new BlockPos(user.getX() - 2,user.getY(),user.getZ());
        BlockPos _pos13 = new BlockPos(user.getX(),user.getY() + 1,user.getZ() - 1);
        BlockPos _pos33 = new BlockPos(user.getX() - 3,user.getY(),user.getZ());
        BlockPos _pos14 = new BlockPos(user.getX(),user.getY() + 2,user.getZ() + 1);
        BlockPos _pos44 = new BlockPos(user.getX(),user.getY() - 1,user.getZ());
        BlockPos _pos15 = new BlockPos(user.getX(),user.getY() + 2,user.getZ() - 1);
        BlockPos _pos55 = new BlockPos(user.getX(),user.getY() - 2,user.getZ());
        BlockPos _pos16 = new BlockPos(user.getX(),user.getY() + 3,user.getZ() + 1);
        BlockPos _pos66 = new BlockPos(user.getX(),user.getY() - 3,user.getZ());
        BlockPos _pos17 = new BlockPos(user.getX(),user.getY() + 3,user.getZ() - 1);
        BlockPos _pos77 = new BlockPos(user.getX(),user.getY(),user.getZ() - 1);
        BlockPos _pos88 = new BlockPos(user.getX(),user.getY(),user.getZ() - 2);
        BlockPos _pos99 = new BlockPos(user.getX(),user.getY(),user.getZ() - 3);
        Block.dropStacks(world.getBlockState(_pos),world,_pos,null);
        Block.dropStacks(world.getBlockState(_pos1),world,_pos,null);
        Block.dropStacks(world.getBlockState(_pos2),world,_pos,null);
        Block.dropStacks(world.getBlockState(_pos3),world,_pos,null);
        Block.dropStacks(world.getBlockState(_pos4),world,_pos,null);
        Block.dropStacks(world.getBlockState(_pos5),world,_pos,null);
        Block.dropStacks(world.getBlockState(_pos6),world,_pos,null);
        Block.dropStacks(world.getBlockState(_pos7),world,_pos,null);
        Block.dropStacks(world.getBlockState(_pos8),world,_pos,null);
        Block.dropStacks(world.getBlockState(_pos9),world,_pos,null);
        Block.dropStacks(world.getBlockState(_pos11),world,_pos,null);
        Block.dropStacks(world.getBlockState(_pos22),world,_pos,null);
        Block.dropStacks(world.getBlockState(_pos33),world,_pos,null);
        Block.dropStacks(world.getBlockState(_pos44),world,_pos,null);
        Block.dropStacks(world.getBlockState(_pos55),world,_pos,null);
        Block.dropStacks(world.getBlockState(_pos66),world,_pos,null);
        Block.dropStacks(world.getBlockState(_pos77),world,_pos,null);
        Block.dropStacks(world.getBlockState(_pos88),world,_pos,null);
        Block.dropStacks(world.getBlockState(_pos99),world,_pos,null);
        Block.dropStacks(world.getBlockState(_pos12),world,_pos,null);
        Block.dropStacks(world.getBlockState(_pos13),world,_pos,null);
        Block.dropStacks(world.getBlockState(_pos14),world,_pos,null);
        Block.dropStacks(world.getBlockState(_pos15),world,_pos,null);
        Block.dropStacks(world.getBlockState(_pos16),world,_pos,null);
        Block.dropStacks(world.getBlockState(_pos17),world,_pos,null);
        Block.dropStacks(world.getBlockState(_pos),world,_pos,null);
        Block.dropStacks(world.getBlockState(_pos1),world,_pos,null);
        Block.dropStacks(world.getBlockState(_pos2),world,_pos,null);
        Block.dropStacks(world.getBlockState(_pos3),world,_pos,null);
        Block.dropStacks(world.getBlockState(_pos4),world,_pos,null);
        Block.dropStacks(world.getBlockState(_pos5),world,_pos,null);
        Block.dropStacks(world.getBlockState(_pos6),world,_pos,null);
        Block.dropStacks(world.getBlockState(_pos7),world,_pos,null);
        Block.dropStacks(world.getBlockState(_pos8),world,_pos,null);
        Block.dropStacks(world.getBlockState(_pos9),world,_pos,null);
        Block.dropStacks(world.getBlockState(_pos11),world,_pos,null);
        Block.dropStacks(world.getBlockState(_pos22),world,_pos,null);
        Block.dropStacks(world.getBlockState(_pos33),world,_pos,null);
        Block.dropStacks(world.getBlockState(_pos44),world,_pos,null);
        Block.dropStacks(world.getBlockState(_pos55),world,_pos,null);
        Block.dropStacks(world.getBlockState(_pos66),world,_pos,null);
        Block.dropStacks(world.getBlockState(_pos77),world,_pos,null);
        Block.dropStacks(world.getBlockState(_pos88),world,_pos,null);
        Block.dropStacks(world.getBlockState(_pos99),world,_pos,null);
        Block.dropStacks(world.getBlockState(_pos12),world,_pos,null);
        Block.dropStacks(world.getBlockState(_pos13),world,_pos,null);
        Block.dropStacks(world.getBlockState(_pos14),world,_pos,null);
        Block.dropStacks(world.getBlockState(_pos15),world,_pos,null);
        Block.dropStacks(world.getBlockState(_pos16),world,_pos,null);
        Block.dropStacks(world.getBlockState(_pos17),world,_pos,null);
        Block.dropStacks(world.getBlockState(_pos),world,_pos,null);
        Block.dropStacks(world.getBlockState(_pos1),world,_pos,null);
        Block.dropStacks(world.getBlockState(_pos2),world,_pos,null);
        Block.dropStacks(world.getBlockState(_pos3),world,_pos,null);
        Block.dropStacks(world.getBlockState(_pos4),world,_pos,null);
        Block.dropStacks(world.getBlockState(_pos5),world,_pos,null);
        Block.dropStacks(world.getBlockState(_pos6),world,_pos,null);
        Block.dropStacks(world.getBlockState(_pos7),world,_pos,null);
        Block.dropStacks(world.getBlockState(_pos8),world,_pos,null);
        Block.dropStacks(world.getBlockState(_pos9),world,_pos,null);
        Block.dropStacks(world.getBlockState(_pos11),world,_pos,null);
        Block.dropStacks(world.getBlockState(_pos22),world,_pos,null);
        Block.dropStacks(world.getBlockState(_pos33),world,_pos,null);
        Block.dropStacks(world.getBlockState(_pos44),world,_pos,null);
        Block.dropStacks(world.getBlockState(_pos55),world,_pos,null);
        Block.dropStacks(world.getBlockState(_pos66),world,_pos,null);
        Block.dropStacks(world.getBlockState(_pos77),world,_pos,null);
        Block.dropStacks(world.getBlockState(_pos88),world,_pos,null);
        Block.dropStacks(world.getBlockState(_pos99),world,_pos,null);
        Block.dropStacks(world.getBlockState(_pos12),world,_pos,null);
        Block.dropStacks(world.getBlockState(_pos13),world,_pos,null);
        Block.dropStacks(world.getBlockState(_pos14),world,_pos,null);
        Block.dropStacks(world.getBlockState(_pos15),world,_pos,null);
        Block.dropStacks(world.getBlockState(_pos16),world,_pos,null);
        Block.dropStacks(world.getBlockState(_pos17),world,_pos,null);
        Block.cannotConnect(world.getBlockState(_pos));
        Block.cannotConnect(world.getBlockState(_pos1));
        Block.cannotConnect(world.getBlockState(_pos2));
        Block.cannotConnect(world.getBlockState(_pos3));
        Block.cannotConnect(world.getBlockState(_pos4));
        Block.cannotConnect(world.getBlockState(_pos5));
        Block.cannotConnect(world.getBlockState(_pos6));
        Block.cannotConnect(world.getBlockState(_pos7));
        Block.cannotConnect(world.getBlockState(_pos8));
        Block.cannotConnect(world.getBlockState(_pos9));
        Block.cannotConnect(world.getBlockState(_pos11));
        Block.cannotConnect(world.getBlockState(_pos22));
        Block.cannotConnect(world.getBlockState(_pos33));
        Block.cannotConnect(world.getBlockState(_pos44));
        Block.cannotConnect(world.getBlockState(_pos55));
        Block.cannotConnect(world.getBlockState(_pos66));
        Block.cannotConnect(world.getBlockState(_pos77));
        Block.cannotConnect(world.getBlockState(_pos88));
        Block.cannotConnect(world.getBlockState(_pos99));
        Block.cannotConnect(world.getBlockState(_pos12));
        Block.cannotConnect(world.getBlockState(_pos13));
        Block.cannotConnect(world.getBlockState(_pos14));
        Block.cannotConnect(world.getBlockState(_pos15));
        Block.cannotConnect(world.getBlockState(_pos16));
        Block.cannotConnect(world.getBlockState(_pos17));
        user.playSound(SoundEvents.BLOCK_WOOL_BREAK, 25.0F, 10.0F);
        user.sendMessage(Text.of("已进行给予"), true);
        return TypedActionResult.success(user.getStackInHand(hand));
    }

    @Override
    public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
        tooltip.add(Text.literal("十分nb的稿子"));
        //tooltip.add(Text.literal("第二行物品信息"));
        //tooltip.add(Text.literal("\u7b2c\u4e09\u884c\u7269\u54c1\u4fe1\u606f"));
    }
}
