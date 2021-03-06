package typingsSlinky.tarDashFs.tarDashFsMod

import typingsSlinky.node.fsMod.ReadStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var dmode: js.UndefOr[Double] = js.undefined
  var filter: js.UndefOr[js.Function1[/* name */ String, Boolean]] = js.undefined
  var fmode: js.UndefOr[Double] = js.undefined
  var ignore: js.UndefOr[js.Function1[/* name */ String, Boolean]] = js.undefined
  var map: js.UndefOr[js.Function1[/* header */ Headers, Headers]] = js.undefined
  var mapStream: js.UndefOr[js.Function2[/* fileStream */ ReadStream, /* header */ Headers, ReadStream]] = js.undefined
  var readable: js.UndefOr[Boolean] = js.undefined
  var strict: js.UndefOr[Boolean] = js.undefined
  var writable: js.UndefOr[Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    dmode: Int | Double = null,
    filter: /* name */ String => Boolean = null,
    fmode: Int | Double = null,
    ignore: /* name */ String => Boolean = null,
    map: /* header */ Headers => Headers = null,
    mapStream: (/* fileStream */ ReadStream, /* header */ Headers) => ReadStream = null,
    readable: js.UndefOr[Boolean] = js.undefined,
    strict: js.UndefOr[Boolean] = js.undefined,
    writable: js.UndefOr[Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (dmode != null) __obj.updateDynamic("dmode")(dmode.asInstanceOf[js.Any])
    if (filter != null) __obj.updateDynamic("filter")(js.Any.fromFunction1(filter))
    if (fmode != null) __obj.updateDynamic("fmode")(fmode.asInstanceOf[js.Any])
    if (ignore != null) __obj.updateDynamic("ignore")(js.Any.fromFunction1(ignore))
    if (map != null) __obj.updateDynamic("map")(js.Any.fromFunction1(map))
    if (mapStream != null) __obj.updateDynamic("mapStream")(js.Any.fromFunction2(mapStream))
    if (!js.isUndefined(readable)) __obj.updateDynamic("readable")(readable.asInstanceOf[js.Any])
    if (!js.isUndefined(strict)) __obj.updateDynamic("strict")(strict.asInstanceOf[js.Any])
    if (!js.isUndefined(writable)) __obj.updateDynamic("writable")(writable.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

