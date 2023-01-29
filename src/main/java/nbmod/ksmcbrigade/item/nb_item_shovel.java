package nbmod.ksmcbrigade.item;

import nbmod.ksmcbrigade.Meaterial.NbItemMaterial;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ShovelItem;
import net.minecraft.text.Text;
import net.minecraft.world.World;

import java.util.List;

public class nb_item_shovel extends ShovelItem {

    public nb_item_shovel(Settings settings){
        super(NbItemMaterial.getMaterial(),999999999,99999999.0F,settings);
    }

    @Override
    public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
        tooltip.add(Text.literal("十分nb的铲子"));
        //tooltip.add(Text.literal("第二行物品信息"));
        //tooltip.add(Text.literal("\u7b2c\u4e09\u884c\u7269\u54c1\u4fe1\u606f"));
    }
}
