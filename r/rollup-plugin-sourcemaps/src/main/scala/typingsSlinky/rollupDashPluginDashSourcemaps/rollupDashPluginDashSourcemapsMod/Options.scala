package typingsSlinky.rollupDashPluginDashSourcemaps.rollupDashPluginDashSourcemapsMod

import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var exclude: js.UndefOr[(js.Array[String | js.RegExp]) | String | js.RegExp | Null] = js.undefined
  var include: js.UndefOr[(js.Array[String | js.RegExp]) | String | js.RegExp | Null] = js.undefined
  var readFile: js.UndefOr[ReadFileFunction] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    exclude: (js.Array[String | js.RegExp]) | String | js.RegExp = null,
    include: (js.Array[String | js.RegExp]) | String | js.RegExp = null,
    readFile: (/* file */ String | Buffer | Double, /* encoding */ String, /* callback */ ReadFileCallback) => Unit = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (exclude != null) __obj.updateDynamic("exclude")(exclude.asInstanceOf[js.Any])
    if (include != null) __obj.updateDynamic("include")(include.asInstanceOf[js.Any])
    if (readFile != null) __obj.updateDynamic("readFile")(js.Any.fromFunction3(readFile))
    __obj.asInstanceOf[Options]
  }
}

