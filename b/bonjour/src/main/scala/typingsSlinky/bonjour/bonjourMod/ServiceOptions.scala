package typingsSlinky.bonjour.bonjourMod

import typingsSlinky.bonjour.bonjourStrings.tcp
import typingsSlinky.bonjour.bonjourStrings.udp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServiceOptions extends js.Object {
  var host: js.UndefOr[String] = js.undefined
  var name: String
  var port: Double
  var protocol: js.UndefOr[udp | tcp] = js.undefined
  var subtypes: js.UndefOr[js.Array[String]] = js.undefined
  var txt: js.UndefOr[js.Object] = js.undefined
  var `type`: String
}

object ServiceOptions {
  @scala.inline
  def apply(
    name: String,
    port: Double,
    `type`: String,
    host: String = null,
    protocol: udp | tcp = null,
    subtypes: js.Array[String] = null,
    txt: js.Object = null
  ): ServiceOptions = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (host != null) __obj.updateDynamic("host")(host.asInstanceOf[js.Any])
    if (protocol != null) __obj.updateDynamic("protocol")(protocol.asInstanceOf[js.Any])
    if (subtypes != null) __obj.updateDynamic("subtypes")(subtypes.asInstanceOf[js.Any])
    if (txt != null) __obj.updateDynamic("txt")(txt.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServiceOptions]
  }
}

