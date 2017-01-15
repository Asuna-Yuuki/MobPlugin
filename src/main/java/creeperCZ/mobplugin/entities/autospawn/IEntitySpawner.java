/**
 * EntitySpawner.java
 * <p>
 * Created on 10:38:53
 */
package creeperCZ.mobplugin.entities.autospawn;

import cn.nukkit.IPlayer;
import cn.nukkit.Player;
import cn.nukkit.level.Level;
import cn.nukkit.level.Position;

import java.util.Collection;

/**
 * @author <a href="mailto:kniffman@googlemail.com">Michael Gertz</a>
 */
public interface IEntitySpawner {

    void spawn(Collection<Player> onlinePlayers);

    SpawnResult spawn(IPlayer iPlayer, Position pos, Level level);

    int getEntityNetworkId();

    String getEntityName();

}