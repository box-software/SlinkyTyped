package typingsSlinky.googleapis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_BidProtocol extends js.Object {
  var bidProtocol: js.UndefOr[String] = js.native
  var maximumQps: js.UndefOr[Double] = js.native
  var region: js.UndefOr[String] = js.native
  var url: js.UndefOr[String] = js.native
}

object Anon_BidProtocol {
  @scala.inline
  def apply(
    bidProtocol: String = null,
    maximumQps: Int | Double = null,
    region: String = null,
    url: String = null
  ): Anon_BidProtocol = {
    val __obj = js.Dynamic.literal()
    if (bidProtocol != null) __obj.updateDynamic("bidProtocol")(bidProtocol.asInstanceOf[js.Any])
    if (maximumQps != null) __obj.updateDynamic("maximumQps")(maximumQps.asInstanceOf[js.Any])
    if (region != null) __obj.updateDynamic("region")(region.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_BidProtocol]
  }
}

