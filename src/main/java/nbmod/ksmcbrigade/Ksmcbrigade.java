package nbmod.ksmcbrigade;

import nbmod.ksmcbrigade.ArmorItem.*;
import nbmod.ksmcbrigade.Meaterial.FlyArrorMaterial;
import nbmod.ksmcbrigade.Meaterial.NbArmorMaterial;
import nbmod.ksmcbrigade.Meaterial.WaterArrorMaterial;
import nbmod.ksmcbrigade.item.*;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Ksmcbrigade implements ModInitializer {

    public static final Logger LOGGER = LoggerFactory.getLogger("Ksmcbrigade");
    public static final Item test_item = new test_item(new Item.Settings().maxCount(16));
    public static final Item nb_item = new nb_item(new Item.Settings().maxCount(1).maxDamage(999999999).fireproof().rarity(Rarity.UNCOMMON));
    public static final Item nb_item_axe = new nb_item_axe(new Item.Settings().maxCount(1).maxDamage(999999999).fireproof().rarity(Rarity.UNCOMMON));
    public static final Item nb_item_pickaxe = new nb_item_pickaxe(new Item.Settings().maxCount(1).maxDamage(999999999).fireproof().rarity(Rarity.UNCOMMON));
    public static final Item nb_item_shovel = new nb_item_pickaxe(new Item.Settings().maxCount(1).maxDamage(999999999).fireproof().rarity(Rarity.UNCOMMON));
    public static final ArmorMaterial nb_heart_armor_material = new NbArmorMaterial.NbHeartMaterial();
    public static final ArmorMaterial fly_armor_material = new FlyArrorMaterial.FlyArmorMaterial();
    public static final ArmorMaterial water_armor_material = new WaterArrorMaterial.WaterArmorMaterial();
    public static final Item nb_heart_helmet = new nb_heart_helmet(nb_heart_armor_material,EquipmentSlot.HEAD,new Item.Settings().fireproof().maxCount(1).rarity(Rarity.UNCOMMON));
    public static final Item nb_heart_chest = new nb_heart_chest(nb_heart_armor_material,EquipmentSlot.CHEST,new Item.Settings().fireproof().maxCount(1).rarity(Rarity.UNCOMMON));
    public static final Item nb_heart_legs = new nb_heart_legs(nb_heart_armor_material,EquipmentSlot.LEGS,new Item.Settings().fireproof().maxCount(1).rarity(Rarity.UNCOMMON));
    public static final Item nb_heart_feet = new nb_heart_feet(nb_heart_armor_material,EquipmentSlot.FEET,new Item.Settings().fireproof().maxCount(1).rarity(Rarity.UNCOMMON));
    public static final Item fly_helmet = new fly_helmet(fly_armor_material,EquipmentSlot.HEAD,new Item.Settings());
    public static final Item fly_chest = new fly_chest(fly_armor_material,EquipmentSlot.CHEST,new Item.Settings());
    public static final Item fly_legs = new fly_legs(fly_armor_material,EquipmentSlot.LEGS,new Item.Settings());
    public static final Item fly_feet = new fly_feet(fly_armor_material,EquipmentSlot.FEET,new Item.Settings());
    public static final Item water_feet = new water_feet(water_armor_material,EquipmentSlot.FEET,new Item.Settings());
    public static final Item NB_FOOD = new Item(new Item.Settings()
            .food((new FoodComponent.Builder())
                    .hunger(999999999)
                    .saturationModifier(999999999.9F)
                    .snack()
                    .statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION,999999999,255,false,false),1.0F)
                    .statusEffect(new StatusEffectInstance(StatusEffects.SPEED,999999999,1,false,false),1.0F)
                    .statusEffect(new StatusEffectInstance(StatusEffects.JUMP_BOOST,999999999,3,false,false),1.0F)
                    .statusEffect(new StatusEffectInstance(StatusEffects.NIGHT_VISION,999999999,0,false,false),1.0F)
                    .statusEffect(new StatusEffectInstance(StatusEffects.INSTANT_HEALTH,999999999,255,false,false),1.0F)
                    .statusEffect(new StatusEffectInstance(StatusEffects.INVISIBILITY,999999999,255,false,false),1.0F)
                    .statusEffect(new StatusEffectInstance(StatusEffects.LUCK,999999999,255,false,false),1.0F)
                    .statusEffect(new StatusEffectInstance(StatusEffects.SLOW_FALLING,999999999,5,false,false),1.0F)
                    .statusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE,999999999,255,false,false),1.0F)
                    .statusEffect(new StatusEffectInstance(StatusEffects.WATER_BREATHING,999999999,255,false,false),1.0F)
                    .statusEffect(new StatusEffectInstance(StatusEffects.FIRE_RESISTANCE,999999999,255,false,false),1.0F)
                    .alwaysEdible()
                    .build())
            .maxCount(64).fireproof().rarity(Rarity.UNCOMMON));
    public static final Item blue_screen_bread = new blue_screen_bread(new Item.Settings()
            .food((new FoodComponent.Builder())
                    .hunger(999999999)
                    .saturationModifier(999999999.9F)
                    .alwaysEdible()
                    .build()).
            maxCount(64).fireproof().rarity(Rarity.UNCOMMON));
    public static final Item nb_item_random = new nb_item_random(new Item.Settings());

    public static final Item del_saves_food = new del_saves_food(new Item.Settings());
    private static final ItemGroup ITEM_GROUP = FabricItemGroup.builder(new Identifier("nbmod", "nb_group"))
            .icon(() -> new ItemStack(nb_item))
            .build();

    public static final Block TEST_BLOCK = new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool());

    public Ksmcbrigade() {
    }

    @Override
    public void onInitialize() {

        Registry.register(Registries.ITEM,new Identifier("nbmod","test_item"),test_item);
        Registry.register(Registries.ITEM,new Identifier("nbmod","nb_item"),nb_item);
        Registry.register(Registries.ITEM,new Identifier("nbmod","nb_item_axe"),nb_item_axe);
        Registry.register(Registries.ITEM,new Identifier("nbmod","nb_item_pickaxe"),nb_item_pickaxe);
        Registry.register(Registries.ITEM,new Identifier("nbmod","nb_item_shovel"),nb_item_shovel);
        Registry.register(Registries.ITEM,new Identifier("nbmod","nb_item_random"),nb_item_random);

        Registry.register(Registries.ITEM,new Identifier("nbmod","nb_food"), NB_FOOD);
        Registry.register(Registries.ITEM,new Identifier("nbmod","nb_blue_screen_food"),blue_screen_bread);
        Registry.register(Registries.ITEM,new Identifier("nbmod","nb_del_saves_food"),del_saves_food);

        Registry.register(Registries.ITEM,new Identifier("nbmod","nb_helmet"),nb_heart_helmet);
        Registry.register(Registries.ITEM,new Identifier("nbmod","nb_chest"),nb_heart_chest);
        Registry.register(Registries.ITEM,new Identifier("nbmod","nb_legs"),nb_heart_legs);
        Registry.register(Registries.ITEM,new Identifier("nbmod","nb_feet"),nb_heart_feet);

        Registry.register(Registries.ITEM,new Identifier("nbmod","fly_helmet"),fly_helmet);
        Registry.register(Registries.ITEM,new Identifier("nbmod","fly_chest"),fly_chest);
        Registry.register(Registries.ITEM,new Identifier("nbmod","fly_legs"),fly_legs);
        Registry.register(Registries.ITEM,new Identifier("nbmod","fly_feet"),fly_feet);

        Registry.register(Registries.ITEM,new Identifier("nbmod","water_feet"),water_feet);

        Registry.register(Registries.BLOCK,new Identifier("nbmod","test_block"),TEST_BLOCK);
        Registry.register(Registries.ITEM, new Identifier("nbmod", "test_block"), new BlockItem(TEST_BLOCK, new FabricItemSettings()));

        FuelRegistry.INSTANCE.add(test_item, 9999);

        ItemGroupEvents.modifyEntriesEvent(ITEM_GROUP).register(content -> {
            content.add(test_item);
            content.add(TEST_BLOCK);
            content.add(nb_item);
            content.add(nb_item_axe);
            content.add(nb_item_pickaxe);
            content.add(nb_item_shovel);
            content.add(NB_FOOD);
            content.add(nb_heart_helmet);
            content.add(nb_heart_chest);
            content.add(nb_heart_legs);
            content.add(nb_heart_feet);
            content.add(blue_screen_bread);
            content.add(del_saves_food);
            content.add(nb_item_random);
            content.add(fly_helmet);
            content.add(fly_chest);
            content.add(fly_legs);
            content.add(fly_feet);
            content.add(water_feet);
        });

        LOGGER.info("Hello Ksmcbrigade World!");
    }
}
