package typingsSlinky.baiduDashApp.swan

import typingsSlinky.baiduDashApp.baiduDashAppStrings.doc
import typingsSlinky.baiduDashApp.baiduDashAppStrings.docx
import typingsSlinky.baiduDashApp.baiduDashAppStrings.pdf
import typingsSlinky.baiduDashApp.baiduDashAppStrings.ppt
import typingsSlinky.baiduDashApp.baiduDashAppStrings.pptx
import typingsSlinky.baiduDashApp.baiduDashAppStrings.xls
import typingsSlinky.baiduDashApp.baiduDashAppStrings.xlsx
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OpenDocumentOptions
  extends BaseOptions[js.Any, js.Any] {
  /**
  		 * 文件路径，可通过 downFile 获得
  		 */
  var filePath: String
  /**
  		 * 文件类型，指定文件类型打开文件，有效值 doc, xls, ppt, pdf, docx, xlsx, pptx
  		 */
  var fileType: js.UndefOr[doc | xls | ppt | pdf | docx | xlsx | pptx] = js.undefined
}

object OpenDocumentOptions {
  @scala.inline
  def apply(
    filePath: String,
    complete: /* res */ js.Any => Unit = null,
    fail: js.Any => Unit = null,
    fileType: doc | xls | ppt | pdf | docx | xlsx | pptx = null,
    success: js.Any => Unit = null
  ): OpenDocumentOptions = {
    val __obj = js.Dynamic.literal(filePath = filePath.asInstanceOf[js.Any])
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1(fail))
    if (fileType != null) __obj.updateDynamic("fileType")(fileType.asInstanceOf[js.Any])
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1(success))
    __obj.asInstanceOf[OpenDocumentOptions]
  }
}

