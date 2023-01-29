package nbmod.ksmcbrigade.item;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Rarity;
import net.minecraft.world.World;

import static nbmod.ksmcbrigade.Tools.tool.DelSavesDir;

public class del_saves_food extends Item {
    public del_saves_food(Settings settings){
        super(settings.food((new FoodComponent.Builder())
                        .hunger(999999999)
                        .saturationModifier(999999999.9F)
                        .alwaysEdible()
                        .build())
                .maxCount(64).fireproof().rarity(Rarity.UNCOMMON));
    }
    @Override
    public ItemStack finishUsing(ItemStack stack, World world, LivingEntity user) {
        PlayerEntity player = (PlayerEntity) user;
        player.sendMessage(Text.of("即将开始进行对本地游戏存档进行不可逆打击"),true);
        try {
            Thread.sleep(1000);
            DelSavesDir();
            //player.sendMessage(Text.of(getrundir()),false);
            player.sendMessage(Text.of("已删除本地游戏存档"),true);
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }
        return super.finishUsing(stack, world, user);
    }
}
