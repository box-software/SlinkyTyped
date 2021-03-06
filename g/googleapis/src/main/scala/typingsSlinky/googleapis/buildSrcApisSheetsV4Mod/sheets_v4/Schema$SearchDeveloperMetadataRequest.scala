package typingsSlinky.googleapis.buildSrcApisSheetsV4Mod.sheets_v4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A request to retrieve all developer metadata matching the set of specified
  * criteria.
  */
@js.native
trait Schema$SearchDeveloperMetadataRequest extends js.Object {
  /**
    * The data filters describing the criteria used to determine which
    * DeveloperMetadata entries to return.  DeveloperMetadata matching any of
    * the specified filters will be included in the response.
    */
  var dataFilters: js.UndefOr[js.Array[Schema$DataFilter]] = js.native
}

object Schema$SearchDeveloperMetadataRequest {
  @scala.inline
  def apply(dataFilters: js.Array[Schema$DataFilter] = null): Schema$SearchDeveloperMetadataRequest = {
    val __obj = js.Dynamic.literal()
    if (dataFilters != null) __obj.updateDynamic("dataFilters")(dataFilters.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$SearchDeveloperMetadataRequest]
  }
}

