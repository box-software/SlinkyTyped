package typingsSlinky.openlayers.openlayersMod.source

import typingsSlinky.openlayers.openlayersMod.Extent
import typingsSlinky.openlayers.openlayersMod.GlobalObject
import typingsSlinky.openlayers.openlayersMod.events.Event
import typingsSlinky.openlayers.openlayersMod.olx.FrameState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @classdesc
  * Events emitted by {@link ol.source.Raster} instances are instances of this
  * type.
  *
  * @param type Type.
  * @param frameState The frame state.
  * @param data An object made available to operations.
  */
@JSImport("openlayers", "source.RasterEvent")
@js.native
class RasterEvent protected () extends Event {
  /**
    * @classdesc
    * Events emitted by {@link ol.source.Raster} instances are instances of this
    * type.
    *
    * @param type Type.
    * @param frameState The frame state.
    * @param data An object made available to operations.
    */
  def this(`type`: String, frameState: FrameState, data: GlobalObject) = this()
  /**
    * An object made available to all operations.  This can be used by operations
    * as a storage object (e.g. for calculating statistics).
    * @api
    */
  var data: GlobalObject = js.native
  /**
    * The raster extent.
    * @api
    */
  var extent: Extent = js.native
  /**
    * The pixel resolution (map units per pixel).
    * @api
    */
  var resolution: Double = js.native
}

