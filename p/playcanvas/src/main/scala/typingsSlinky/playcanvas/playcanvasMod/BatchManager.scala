package typingsSlinky.playcanvas.playcanvasMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @constructor
  * @name pc.BatchManager
  * @classdesc Glues many mesh instances into a single one for better performance.
  * @param {pc.GraphicsDevice} device The graphics device used by the batch manager.
  * @param {pc.Entity} root The entity under which batched models are added.
  * @param {pc.Scene} scene The scene that the batch manager affects.
  */
@JSImport("playcanvas", "BatchManager")
@js.native
class BatchManager protected ()
  extends typingsSlinky.playcanvas.pc.BatchManager {
  def this(
    device: typingsSlinky.playcanvas.pc.GraphicsDevice,
    root: typingsSlinky.playcanvas.pc.Entity,
    scene: typingsSlinky.playcanvas.pc.Scene
  ) = this()
}

