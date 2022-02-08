package net.lanternmc.bingdundun;

import com.sun.javafx.sg.prism.NodeEffectInput;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class StartupClientOnly
{
  /**
   * Tell the renderer this is a solid block
   * @param event
   */
  @SubscribeEvent
  public static void onClientSetupEvent(FMLClientSetupEvent event) {
    RenderTypeLookup.setRenderLayer(StartupCommon.blockSimple, NodeEffectInput.RenderType.getSolid());
  }
}