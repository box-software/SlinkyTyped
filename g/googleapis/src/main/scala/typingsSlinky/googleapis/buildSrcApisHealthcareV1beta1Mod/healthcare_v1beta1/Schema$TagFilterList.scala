package typingsSlinky.googleapis.buildSrcApisHealthcareV1beta1Mod.healthcare_v1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * List of tags to be filtered.
  */
@js.native
trait Schema$TagFilterList extends js.Object {
  /**
    * Tags to be filtered. Tags must be DICOM Data Elements, File Meta
    * Elements, or Directory Structuring Elements, as defined at:
    * http://dicom.nema.org/medical/dicom/current/output/html/part06.html#table_6-1,.
    * They may be provided by &quot;Keyword&quot; or &quot;Tag&quot;. For
    * example &quot;PatientID&quot;, &quot;0010,0010&quot;.
    */
  var tags: js.UndefOr[js.Array[String]] = js.native
}

object Schema$TagFilterList {
  @scala.inline
  def apply(tags: js.Array[String] = null): Schema$TagFilterList = {
    val __obj = js.Dynamic.literal()
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$TagFilterList]
  }
}

