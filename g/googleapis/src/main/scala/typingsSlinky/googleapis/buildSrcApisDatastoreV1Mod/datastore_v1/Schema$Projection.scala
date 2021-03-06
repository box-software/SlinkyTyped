package typingsSlinky.googleapis.buildSrcApisDatastoreV1Mod.datastore_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A representation of a property in a projection.
  */
@js.native
trait Schema$Projection extends js.Object {
  /**
    * The property to project.
    */
  var property: js.UndefOr[Schema$PropertyReference] = js.native
}

object Schema$Projection {
  @scala.inline
  def apply(property: Schema$PropertyReference = null): Schema$Projection = {
    val __obj = js.Dynamic.literal()
    if (property != null) __obj.updateDynamic("property")(property.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Projection]
  }
}

