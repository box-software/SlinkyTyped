package typingsSlinky.mqtt

import typingsSlinky.mqttDashPacket.mqttDashPacketMod.QoS
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Payload extends js.Object {
  /**
    * the message to publish
    */
  var payload: String
  /*
    *  properies object of will
    * */
  var properties: js.UndefOr[Anon_ContentType] = js.undefined
  /**
    * the QoS
    */
  var qos: QoS
  /**
    * the retain flag
    */
  var retain: Boolean
  /**
    * the topic to publish
    */
  var topic: String
}

object Anon_Payload {
  @scala.inline
  def apply(payload: String, qos: QoS, retain: Boolean, topic: String, properties: Anon_ContentType = null): Anon_Payload = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any], qos = qos.asInstanceOf[js.Any], retain = retain.asInstanceOf[js.Any], topic = topic.asInstanceOf[js.Any])
    if (properties != null) __obj.updateDynamic("properties")(properties.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Payload]
  }
}

