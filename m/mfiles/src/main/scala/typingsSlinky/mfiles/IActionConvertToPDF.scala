package typingsSlinky.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IActionConvertToPDF extends js.Object {
  var FailOnUnsupportedSourceFiles: Boolean
  var OverwriteExistingFile: Boolean
  var PDFA1b: Boolean
  var StoreAsSeparateFile: Boolean
  def Clone(): IActionConvertToPDF
}

object IActionConvertToPDF {
  @scala.inline
  def apply(
    Clone: () => IActionConvertToPDF,
    FailOnUnsupportedSourceFiles: Boolean,
    OverwriteExistingFile: Boolean,
    PDFA1b: Boolean,
    StoreAsSeparateFile: Boolean
  ): IActionConvertToPDF = {
    val __obj = js.Dynamic.literal(Clone = js.Any.fromFunction0(Clone), FailOnUnsupportedSourceFiles = FailOnUnsupportedSourceFiles.asInstanceOf[js.Any], OverwriteExistingFile = OverwriteExistingFile.asInstanceOf[js.Any], PDFA1b = PDFA1b.asInstanceOf[js.Any], StoreAsSeparateFile = StoreAsSeparateFile.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IActionConvertToPDF]
  }
}

