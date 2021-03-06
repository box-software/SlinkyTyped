package typingsSlinky.dogapi

import typingsSlinky.dogapi.dogapiStrings.low
import typingsSlinky.dogapi.dogapiStrings.normal
import typingsSlinky.std.BigInt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Datehappened extends js.Object {
  var date_happened: Double
  var handle: js.Any
  var id: BigInt
  var priority: normal | low
  var related_event_id: Double | Null
  var tags: js.Array[String]
  var text: String
  var title: String
  var url: String
}

object Anon_Datehappened {
  @scala.inline
  def apply(
    date_happened: Double,
    handle: js.Any,
    id: BigInt,
    priority: normal | low,
    tags: js.Array[String],
    text: String,
    title: String,
    url: String,
    related_event_id: Int | Double = null
  ): Anon_Datehappened = {
    val __obj = js.Dynamic.literal(date_happened = date_happened.asInstanceOf[js.Any], handle = handle.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], priority = priority.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    if (related_event_id != null) __obj.updateDynamic("related_event_id")(related_event_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Datehappened]
  }
}

