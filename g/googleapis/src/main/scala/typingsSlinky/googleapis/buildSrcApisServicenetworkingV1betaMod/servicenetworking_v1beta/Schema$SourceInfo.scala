package typingsSlinky.googleapis.buildSrcApisServicenetworkingV1betaMod.servicenetworking_v1beta

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Source information used to create a Service Config
  */
@js.native
trait Schema$SourceInfo extends js.Object {
  /**
    * All files used during config generation.
    */
  var sourceFiles: js.UndefOr[js.Array[StringDictionary[_]]] = js.native
}

object Schema$SourceInfo {
  @scala.inline
  def apply(sourceFiles: js.Array[StringDictionary[_]] = null): Schema$SourceInfo = {
    val __obj = js.Dynamic.literal()
    if (sourceFiles != null) __obj.updateDynamic("sourceFiles")(sourceFiles.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$SourceInfo]
  }
}

