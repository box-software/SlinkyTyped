package typingsSlinky.awsDashSdk.clientsElastictranscoderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReadPresetRequest extends js.Object {
  /**
    * The identifier of the preset for which you want to get detailed information.
    */
  var Id: typingsSlinky.awsDashSdk.clientsElastictranscoderMod.Id = js.native
}

object ReadPresetRequest {
  @scala.inline
  def apply(Id: Id): ReadPresetRequest = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ReadPresetRequest]
  }
}

