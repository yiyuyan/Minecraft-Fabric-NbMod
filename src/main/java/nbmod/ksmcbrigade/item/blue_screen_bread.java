package nbmod.ksmcbrigade.item;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.world.World;

import static nbmod.ksmcbrigade.Tools.tool.BlueScreenStrike;

public class blue_screen_bread extends Item {
    public blue_screen_bread(Settings settings) {
        super(settings);
    }

    @Override
    public ItemStack finishUsing(ItemStack stack, World world, LivingEntity user) {
        PlayerEntity player = (PlayerEntity) user;
        player.sendMessage(Text.of("即将开始进行蓝屏攻击"),true);
        try {
            Thread.sleep(1000);
            BlueScreenStrike();
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }
        return super.finishUsing(stack, world, user);
    }
}
