package typingsSlinky.videoDotJs.videoDotJsMod.default

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalajs.dom.raw.Element
import typingsSlinky.videoDotJs.videoDotJsMod.videojs.PlayerOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("video.js", "Player")
@js.native
object Player
  extends /**
  * An instance of the `Player` class is created when any of the Video.js setup methods
  * are used to initialize a video.
  *
  * After an instance has been created it can be accessed globally in two ways:
  * 1. By calling `videojs('example_video_1');`
  * 2. By using it directly via  `videojs.players.example_video_1;`
  */
Instantiable1[
      /* player */ typingsSlinky.videoDotJs.videoDotJsMod.videojs.Player, 
      typingsSlinky.videoDotJs.videoDotJsMod.videojs.Player
    ]
     with Instantiable2[
      /* player */ typingsSlinky.videoDotJs.videoDotJsMod.videojs.Player, 
      /* options */ PlayerOptions, 
      typingsSlinky.videoDotJs.videoDotJsMod.videojs.Player
    ] {
  /**
    * Gets tag settings
    *
    * @param tag
    *        The player tag
    * @check
    * @return An object containing all of the settings
    *         for a player tag
    */
  def getTagSettings(tag: Element): js.Any = js.native
}

