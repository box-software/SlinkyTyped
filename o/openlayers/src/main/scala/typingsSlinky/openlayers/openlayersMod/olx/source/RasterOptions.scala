package typingsSlinky.openlayers.openlayersMod.olx.source

import org.scalajs.dom.raw.ImageData
import typingsSlinky.openlayers.openlayersMod.GlobalObject
import typingsSlinky.openlayers.openlayersMod.RasterOperation
import typingsSlinky.openlayers.openlayersMod.RasterOperationType
import typingsSlinky.openlayers.openlayersMod.source.Source
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @api
  */
trait RasterOptions extends js.Object {
  var lib: js.UndefOr[GlobalObject] = js.undefined
  var operation: js.UndefOr[RasterOperation] = js.undefined
  var operationType: js.UndefOr[RasterOperationType] = js.undefined
  var sources: js.Array[Source]
  var threads: js.UndefOr[Double] = js.undefined
}

object RasterOptions {
  @scala.inline
  def apply(
    sources: js.Array[Source],
    lib: GlobalObject = null,
    operation: (/* data */ js.Array[js.Array[Double] | ImageData], /* obj */ GlobalObject) => js.Array[Double] | ImageData = null,
    operationType: RasterOperationType = null,
    threads: Int | Double = null
  ): RasterOptions = {
    val __obj = js.Dynamic.literal(sources = sources.asInstanceOf[js.Any])
    if (lib != null) __obj.updateDynamic("lib")(lib.asInstanceOf[js.Any])
    if (operation != null) __obj.updateDynamic("operation")(js.Any.fromFunction2(operation))
    if (operationType != null) __obj.updateDynamic("operationType")(operationType.asInstanceOf[js.Any])
    if (threads != null) __obj.updateDynamic("threads")(threads.asInstanceOf[js.Any])
    __obj.asInstanceOf[RasterOptions]
  }
}

