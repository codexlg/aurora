package code.aurora.base.modules.impl.misc;


import code.aurora.base.modules.api.Category;
import code.aurora.base.modules.api.Module;
import code.aurora.base.modules.api.ModuleReger;
import code.aurora.tools.events.EventUpdate;
import code.aurora.tools.utils.player.MovementUtil;
import com.google.common.eventbus.Subscribe;

@ModuleReger(name = "DragonFly", type = Category.Render)
public class DragonFly extends Module {
    @Subscribe
    public void onPlayerUpdate(EventUpdate e) {
        if (mc.player == null) return;
        if (MovementUtil.isMoving() && mc.player.abilities.isFlying) {
            MovementUtil.setSpeed(0.99f);
        }
    };
}
