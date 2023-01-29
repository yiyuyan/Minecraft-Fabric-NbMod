package nbmod.ksmcbrigade.item;

import nbmod.ksmcbrigade.Meaterial.NbItemMaterial;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.AxeItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.world.World;

import java.util.List;

public class nb_item_axe extends AxeItem {
    public nb_item_axe(Item.Settings settings){
        super(NbItemMaterial.getMaterial(),999999999.0F,99999999.0F,settings);
    }

    @Override
    public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
        tooltip.add(Text.literal("十分nb的斧子"));
        //tooltip.add(Text.literal("第二行物品信息"));
        //tooltip.add(Text.literal("\u7b2c\u4e09\u884c\u7269\u54c1\u4fe1\u606f"));
    }
}
