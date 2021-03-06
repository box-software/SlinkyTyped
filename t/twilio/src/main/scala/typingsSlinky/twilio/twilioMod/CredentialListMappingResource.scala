package typingsSlinky.twilio.twilioMod

import typingsSlinky.q.qMod.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.twilio.twilioMod.Resource because Already inherited
- typings.twilio.twilioMod.ListableResource because var conflicts: get_Original. Inlined list, list, list, list_Original */ @js.native
trait CredentialListMappingResource extends CreatableMappedResource[CredentialListMappingInstance] {
  @JSName("list")
  var list_Original: RestMethod = js.native
  def list(args: js.Any): Promise[_] = js.native
  def list(args: js.Any, callback: RequestCallback): Promise[_] = js.native
  def list(callback: RequestCallback): Promise[_] = js.native
}

