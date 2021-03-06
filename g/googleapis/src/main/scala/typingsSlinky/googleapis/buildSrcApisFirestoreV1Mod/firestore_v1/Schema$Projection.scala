package typingsSlinky.googleapis.buildSrcApisFirestoreV1Mod.firestore_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The projection of document&#39;s fields to return.
  */
@js.native
trait Schema$Projection extends js.Object {
  /**
    * The fields to return.  If empty, all fields are returned. To only return
    * the name of the document, use `[&#39;__name__&#39;]`.
    */
  var fields: js.UndefOr[js.Array[Schema$FieldReference]] = js.native
}

object Schema$Projection {
  @scala.inline
  def apply(fields: js.Array[Schema$FieldReference] = null): Schema$Projection = {
    val __obj = js.Dynamic.literal()
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Projection]
  }
}

