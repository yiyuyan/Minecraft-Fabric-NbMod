package nbmod.ksmcbrigade.item;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import nbmod.ksmcbrigade.Tools.tool;
import net.minecraft.block.Block;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.MinecartItem;
import net.minecraft.sound.SoundEvents;
import net.minecraft.text.Text;
import net.minecraft.util.Hand;
import net.minecraft.util.Rarity;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;

import java.util.Map;
import java.util.Random;
import java.util.Set;

public class nb_item_random extends Item {
    public nb_item_random(Settings settings){
        super(settings.rarity(Rarity.UNCOMMON).maxCount(1).maxDamage(999999999).fireproof());
    }
    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        tool.isexistdirsandcreate("Random");
        Map<Block,Item> blockItemMap = MinecartItem.BLOCK_ITEMS;
        Set<Block> keySet = blockItemMap.keySet();
        if(!tool.isexistfile("Random\\RandomItem.json")){
            JsonObject jsonObject = new JsonObject();
            for(Block t: keySet){
                jsonObject.addProperty(blockItemMap.get(t).toString(),(int)(Math.random()*64) + 1);
                tool.writefile(String.valueOf(jsonObject),"Random\\RandomItem.json");
                user.playSound(SoundEvents.BLOCK_WOOL_BREAK, 25.0F, 10.0F);
            }
        }
        else{
            JsonParser Object = new JsonParser();
            JsonObject obj = (JsonObject)Object.parse(tool.getfilecontent("Random\\RandomItem.json"));
            Block[] BlockList = keySet.toArray(new Block[keySet.size()]);
            int[] BlockCountList = {};
            for(Block t: keySet){
                int[] newBlockCountList = new int[BlockCountList.length + 1];
                for (int i = 0; i < BlockCountList.length; i++) {
                    newBlockCountList[i]=BlockCountList[i];
                }
                newBlockCountList[BlockCountList.length]=obj.get(blockItemMap.get(t).toString()).getAsInt();
                BlockCountList = newBlockCountList;
                //user.sendMessage(Text.of( blockItemMap.get(t).toString() + " : " + obj.get(blockItemMap.get(t).toString())),false);
                user.playSound(SoundEvents.BLOCK_WOOL_BREAK, 25.0F, 10.0F);
            }
            //for(int i = 0; i < BlockList.length; i++){
            //    user.sendMessage(Text.of(BlockList[i].toString()));
            //}
            //user.sendMessage(Text.of(String.valueOf(keySet.size())));
            //user.sendMessage(Text.of(keySet.toString()));
            Random random = new Random();
            //user.sendMessage(Text.of(String.valueOf(random.nextInt(BlockCountList.length))));
            //user.sendMessage(Text.of(String.valueOf(BlockCountList[random.nextInt(BlockCountList.length)])));
            ItemStack itemStack = new ItemStack(BlockList[random.nextInt(BlockList.length)].asItem(),random.nextInt(BlockCountList[random.nextInt(BlockCountList.length)]));
            user.getInventory().addPickBlock(itemStack);
            //user.getInventory().addPickBlock((ItemStack) blockItemMap.get());
        }
        user.sendMessage(Text.of("随机完毕"),true);
        //user.playSound(SoundEvents.BLOCK_WOOL_BREAK, 25.0F, 10.0F);
        return TypedActionResult.success(user.getStackInHand(hand));
    }
}
