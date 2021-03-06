package typingsSlinky.atAwsDashSdkClientDashS3DashNode.typesUnderscoreAccessControlPolicyMod

import typingsSlinky.atAwsDashSdkClientDashS3DashNode.typesUnderscoreGrantMod._UnmarshalledGrant
import typingsSlinky.atAwsDashSdkClientDashS3DashNode.typesUnderscoreOwnerMod._UnmarshalledOwner
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _UnmarshalledAccessControlPolicy extends _AccessControlPolicy {
  /**
    * <p>A list of grants.</p>
    */
  @JSName("Grants")
  var Grants__UnmarshalledAccessControlPolicy: js.UndefOr[js.Array[_UnmarshalledGrant]] = js.undefined
  /**
    * _Owner shape
    */
  @JSName("Owner")
  var Owner__UnmarshalledAccessControlPolicy: js.UndefOr[_UnmarshalledOwner] = js.undefined
}

object _UnmarshalledAccessControlPolicy {
  @scala.inline
  def apply(Grants: js.Array[_UnmarshalledGrant] = null, Owner: _UnmarshalledOwner = null): _UnmarshalledAccessControlPolicy = {
    val __obj = js.Dynamic.literal()
    if (Grants != null) __obj.updateDynamic("Grants")(Grants.asInstanceOf[js.Any])
    if (Owner != null) __obj.updateDynamic("Owner")(Owner.asInstanceOf[js.Any])
    __obj.asInstanceOf[_UnmarshalledAccessControlPolicy]
  }
}

