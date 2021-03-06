package typingsSlinky.iobroker.iobrokerMod._Global_.ioBroker

import typingsSlinky.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in keyof std.Pick<iobroker.iobroker._Global_.ioBroker.StateObject, '_id' | 'native' | 'enums' | 'type'> ]:? std.Pick<iobroker.iobroker._Global_.ioBroker.StateObject, '_id' | 'native' | 'enums' | 'type'>[P]} */ trait PartialStateObject extends PartialObject {
  var acl: js.UndefOr[Partial[StateACL]] = js.undefined
  var common: js.UndefOr[Partial[StateCommon]] = js.undefined
}

object PartialStateObject {
  @scala.inline
  def apply(acl: Partial[StateACL] = null, common: Partial[StateCommon] = null): PartialStateObject = {
    val __obj = js.Dynamic.literal()
    if (acl != null) __obj.updateDynamic("acl")(acl.asInstanceOf[js.Any])
    if (common != null) __obj.updateDynamic("common")(common.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialStateObject]
  }
}

