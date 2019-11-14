package divinerpg.items;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class FoodItem extends Item {

    private final boolean isInstant;

    /**
     * @param isInstant - instant consuming
     */
    public FoodItem(Properties properties, boolean isInstant) {
        super(properties);
        this.isInstant = isInstant;
    }

    @Override
    public int getUseDuration(ItemStack stack) {
        if (isInstant)
            return 0;

        return super.getUseDuration(stack);
    }
}