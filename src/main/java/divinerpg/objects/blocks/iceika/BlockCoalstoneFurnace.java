package divinerpg.objects.blocks.iceika;

import divinerpg.objects.blocks.BlockModFurnace;
import divinerpg.objects.blocks.tile.entity.TileEntityCoalstoneFurnace;
import divinerpg.proxy.GUIHandler;
import divinerpg.registry.ModBlocks;
import net.minecraft.block.Block;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.state.IBlockState;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class BlockCoalstoneFurnace extends BlockModFurnace implements ITileEntityProvider {

    public BlockCoalstoneFurnace(String name, boolean isBurnging) {
        super(name, isBurnging);
    }

    public int getGuiID() {
        return GUIHandler.COALSTONE_FURNACE_GUI_ID;
    }

    public static void setState(boolean active, World worldIn, BlockPos pos) {
        IBlockState iblockstate = worldIn.getBlockState(pos);
        TileEntity tileentity = worldIn.getTileEntity(pos);
        Block block = iblockstate.getBlock();

        keepInventory = true;
        if (active) {
            worldIn.setBlockState(pos,
                    ModBlocks.coalstoneFurnaceOn.getDefaultState().withProperty(FACING, iblockstate.getValue(FACING)),
                    3);
        } else {
            worldIn.setBlockState(pos,
                    ModBlocks.coalstoneFurnace.getDefaultState().withProperty(FACING, iblockstate.getValue(FACING)), 3);
        }
        keepInventory = false;

        if (tileentity != null) {
            tileentity.validate();
            worldIn.setTileEntity(pos, tileentity);
        }
    }

    public TileEntity createNewTileEntity(World worldIn, int meta) {
        return new TileEntityCoalstoneFurnace();
    }
}
