package typingsSlinky.videoDotJs.videoDotJsMod.default

import typingsSlinky.videoDotJs.videoDotJsMod.videojs.Middleware
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("video.js", "use")
@js.native
object use extends js.Object {
  /**
    * Register a middleware to a source type.
    *
    * @param type A string representing a MIME type.
    * @param middleware A middleware factory that takes a player.
    */
  def apply(
    `type`: String,
    middleware: js.Function1[/* player */ typingsSlinky.videoDotJs.videoDotJsMod.videojs.Player, Middleware]
  ): Unit = js.native
}

