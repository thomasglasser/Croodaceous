package coda.croodaceous.client;

import coda.croodaceous.CroodaceousMod;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.resources.ResourceLocation;

public class CEModelLayers {
    public static final ModelLayerLocation LIYOTE = create("liyote");
    public static final ModelLayerLocation FANG_FLY = create("fang_fly");

    private static ModelLayerLocation create(String name) {
        return new ModelLayerLocation(new ResourceLocation(CroodaceousMod.MOD_ID, name), "main");
    }
}
